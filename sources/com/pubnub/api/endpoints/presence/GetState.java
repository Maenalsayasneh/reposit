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
import com.pubnub.api.models.consumer.presence.PNGetStateResult;
import com.pubnub.api.models.server.Envelope;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import t0.d;
import t0.v;

public class GetState extends Endpoint<Envelope<JsonElement>, PNGetStateResult> {
    private List<String> channelGroups = new ArrayList();
    private List<String> channels = new ArrayList();
    private String uuid;

    public GetState(PubNub pubNub, TelemetryManager telemetryManager, RetrofitManager retrofitManager, TokenManager tokenManager) {
        super(pubNub, telemetryManager, retrofitManager, tokenManager);
    }

    public GetState channelGroups(List<String> list) {
        this.channelGroups = list;
        return this;
    }

    public GetState channels(List<String> list) {
        this.channels = list;
        return this;
    }

    public d<Envelope<JsonElement>> doWork(Map<String, String> map) {
        int size = this.channelGroups.size();
        String str = InstabugDbContract.COMMA_SEP;
        if (size > 0) {
            map.put("channel-group", PubNubUtil.joinString(this.channelGroups, str));
        }
        if (this.channels.size() > 0) {
            str = PubNubUtil.joinString(this.channels, str);
        }
        String str2 = this.uuid;
        if (str2 == null) {
            str2 = getPubnub().getConfiguration().getUuid();
        }
        return getRetrofit().getPresenceService().getState(getPubnub().getConfiguration().getSubscribeKey(), str, str2, map);
    }

    public List<String> getAffectedChannelGroups() {
        return this.channelGroups;
    }

    public List<String> getAffectedChannels() {
        return this.channels;
    }

    public PNOperationType getOperationType() {
        return PNOperationType.PNGetState;
    }

    public boolean isAuthRequired() {
        return true;
    }

    public GetState uuid(String str) {
        this.uuid = str;
        return this;
    }

    public void validateParams() throws PubNubException {
        if (getPubnub().getConfiguration().getSubscribeKey() == null || getPubnub().getConfiguration().getSubscribeKey().isEmpty()) {
            throw PubNubException.builder().pubnubError(PubNubErrorBuilder.PNERROBJ_SUBSCRIBE_KEY_MISSING).build();
        } else if (this.channels.size() == 0 && this.channelGroups.size() == 0) {
            throw PubNubException.builder().pubnubError(PubNubErrorBuilder.PNERROBJ_CHANNEL_AND_GROUP_MISSING).build();
        }
    }

    public PNGetStateResult createResponse(v<Envelope<JsonElement>> vVar) throws PubNubException {
        HashMap hashMap = new HashMap();
        MapperManager mapper = getPubnub().getMapper();
        if (this.channels.size() == 1 && this.channelGroups.size() == 0) {
            hashMap.put(this.channels.get(0), ((Envelope) vVar.b).getPayload());
        } else {
            Iterator<Map.Entry<String, JsonElement>> objectIterator = mapper.getObjectIterator((JsonElement) ((Envelope) vVar.b).getPayload());
            while (objectIterator.hasNext()) {
                Map.Entry next = objectIterator.next();
                hashMap.put(next.getKey(), next.getValue());
            }
        }
        return PNGetStateResult.builder().stateByUUID(hashMap).build();
    }
}
