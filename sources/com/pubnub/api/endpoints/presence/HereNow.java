package com.pubnub.api.endpoints.presence;

import com.google.gson.JsonElement;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.pubnub.api.PubNub;
import com.pubnub.api.PubNubException;
import com.pubnub.api.PubNubUtil;
import com.pubnub.api.builder.PubNubErrorBuilder;
import com.pubnub.api.endpoints.Endpoint;
import com.pubnub.api.enums.PNOperationType;
import com.pubnub.api.managers.MapperManager;
import com.pubnub.api.managers.RetrofitManager;
import com.pubnub.api.managers.TelemetryManager;
import com.pubnub.api.managers.token_manager.TokenManager;
import com.pubnub.api.models.consumer.presence.PNHereNowChannelData;
import com.pubnub.api.models.consumer.presence.PNHereNowOccupantData;
import com.pubnub.api.models.consumer.presence.PNHereNowResult;
import com.pubnub.api.models.server.Envelope;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import t0.d;
import t0.v;

public class HereNow extends Endpoint<Envelope<JsonElement>, PNHereNowResult> {
    private List<String> channelGroups = new ArrayList();
    private List<String> channels = new ArrayList();
    private Boolean includeState;
    private Boolean includeUUIDs;

    public HereNow(PubNub pubNub, TelemetryManager telemetryManager, RetrofitManager retrofitManager, TokenManager tokenManager) {
        super(pubNub, telemetryManager, retrofitManager, tokenManager);
    }

    private PNHereNowResult parseMultipleChannelResponse(JsonElement jsonElement) {
        MapperManager mapper = getPubnub().getMapper();
        PNHereNowResult build = PNHereNowResult.builder().channels(new HashMap()).totalChannels(mapper.elementToInt(jsonElement, "total_channels")).totalOccupancy(mapper.elementToInt(jsonElement, "total_occupancy")).build();
        Iterator<Map.Entry<String, JsonElement>> objectIterator = mapper.getObjectIterator(jsonElement, "channels");
        while (objectIterator.hasNext()) {
            Map.Entry next = objectIterator.next();
            PNHereNowChannelData.PNHereNowChannelDataBuilder occupancy = PNHereNowChannelData.builder().channelName((String) next.getKey()).occupancy(mapper.elementToInt((JsonElement) next.getValue(), "occupancy"));
            if (this.includeUUIDs.booleanValue()) {
                occupancy.occupants(prepareOccupantData(mapper.getField((JsonElement) next.getValue(), "uuids")));
            } else {
                occupancy.occupants((List<PNHereNowOccupantData>) null);
            }
            build.getChannels().put(next.getKey(), occupancy.build());
        }
        return build;
    }

    private PNHereNowResult parseSingleChannelResponse(Envelope<JsonElement> envelope) {
        PNHereNowResult build = PNHereNowResult.builder().totalChannels(1).channels(new HashMap()).totalOccupancy(envelope.getOccupancy()).build();
        PNHereNowChannelData.PNHereNowChannelDataBuilder occupancy = PNHereNowChannelData.builder().channelName(this.channels.get(0)).occupancy(envelope.getOccupancy());
        if (this.includeUUIDs.booleanValue()) {
            occupancy.occupants(prepareOccupantData(envelope.getUuids()));
            build.getChannels().put(this.channels.get(0), occupancy.build());
        }
        return build;
    }

    private List<PNHereNowOccupantData> prepareOccupantData(JsonElement jsonElement) {
        ArrayList arrayList = new ArrayList();
        MapperManager mapper = getPubnub().getMapper();
        Boolean bool = this.includeState;
        if (bool == null || !bool.booleanValue()) {
            Iterator<JsonElement> arrayIterator = mapper.getArrayIterator(jsonElement);
            while (arrayIterator.hasNext()) {
                PNHereNowOccupantData.PNHereNowOccupantDataBuilder builder = PNHereNowOccupantData.builder();
                builder.uuid(mapper.elementToString(arrayIterator.next()));
                builder.state((JsonElement) null);
                arrayList.add(builder.build());
            }
        } else {
            Iterator<JsonElement> arrayIterator2 = mapper.getArrayIterator(jsonElement);
            while (arrayIterator2.hasNext()) {
                JsonElement next = arrayIterator2.next();
                PNHereNowOccupantData.PNHereNowOccupantDataBuilder builder2 = PNHereNowOccupantData.builder();
                builder2.uuid(mapper.elementToString(next, "uuid"));
                builder2.state(mapper.getField(next, "state"));
                arrayList.add(builder2.build());
            }
        }
        return arrayList;
    }

    public HereNow channelGroups(List<String> list) {
        this.channelGroups = list;
        return this;
    }

    public HereNow channels(List<String> list) {
        this.channels = list;
        return this;
    }

    public d<Envelope<JsonElement>> doWork(Map<String, String> map) {
        if (this.includeState == null) {
            this.includeState = Boolean.FALSE;
        }
        if (this.includeUUIDs == null) {
            this.includeUUIDs = Boolean.TRUE;
        }
        if (this.includeState.booleanValue()) {
            map.put("state", "1");
        }
        if (!this.includeUUIDs.booleanValue()) {
            map.put("disable_uuids", "1");
        }
        int size = this.channelGroups.size();
        String str = InstabugDbContract.COMMA_SEP;
        if (size > 0) {
            map.put("channel-group", PubNubUtil.joinString(this.channelGroups, str));
        }
        if (this.channels.size() > 0) {
            str = PubNubUtil.joinString(this.channels, str);
        }
        if (this.channels.size() > 0 || this.channelGroups.size() > 0) {
            return getRetrofit().getPresenceService().hereNow(getPubnub().getConfiguration().getSubscribeKey(), str, map);
        }
        return getRetrofit().getPresenceService().globalHereNow(getPubnub().getConfiguration().getSubscribeKey(), map);
    }

    public List<String> getAffectedChannelGroups() {
        return this.channelGroups;
    }

    public List<String> getAffectedChannels() {
        return this.channels;
    }

    public PNOperationType getOperationType() {
        return PNOperationType.PNHereNowOperation;
    }

    public HereNow includeState(Boolean bool) {
        this.includeState = bool;
        return this;
    }

    public HereNow includeUUIDs(Boolean bool) {
        this.includeUUIDs = bool;
        return this;
    }

    public boolean isAuthRequired() {
        return true;
    }

    public void validateParams() throws PubNubException {
        if (getPubnub().getConfiguration().getSubscribeKey() == null || getPubnub().getConfiguration().getSubscribeKey().isEmpty()) {
            throw PubNubException.builder().pubnubError(PubNubErrorBuilder.PNERROBJ_SUBSCRIBE_KEY_MISSING).build();
        }
    }

    public PNHereNowResult createResponse(v<Envelope<JsonElement>> vVar) {
        if (this.channels.isEmpty() && this.channelGroups.isEmpty()) {
            return parseMultipleChannelResponse((JsonElement) ((Envelope) vVar.b).getPayload());
        }
        if (this.channels.size() > 1 || this.channelGroups.size() > 0) {
            return parseMultipleChannelResponse((JsonElement) ((Envelope) vVar.b).getPayload());
        }
        return parseSingleChannelResponse((Envelope) vVar.b);
    }
}
