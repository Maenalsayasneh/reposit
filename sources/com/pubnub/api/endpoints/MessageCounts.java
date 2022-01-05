package com.pubnub.api.endpoints;

import com.google.gson.JsonElement;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.pubnub.api.PubNub;
import com.pubnub.api.PubNubException;
import com.pubnub.api.PubNubUtil;
import com.pubnub.api.builder.PubNubErrorBuilder;
import com.pubnub.api.enums.PNOperationType;
import com.pubnub.api.managers.MapperManager;
import com.pubnub.api.managers.RetrofitManager;
import com.pubnub.api.managers.TelemetryManager;
import com.pubnub.api.managers.token_manager.TokenManager;
import com.pubnub.api.models.consumer.history.PNMessageCountResult;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import t0.d;
import t0.v;

public class MessageCounts extends Endpoint<JsonElement, PNMessageCountResult> {
    private List<String> channels;
    private List<Long> channelsTimetoken;

    public MessageCounts(PubNub pubNub, TelemetryManager telemetryManager, RetrofitManager retrofitManager, TokenManager tokenManager) {
        super(pubNub, telemetryManager, retrofitManager, tokenManager);
    }

    public MessageCounts channels(List<String> list) {
        this.channels = list;
        return this;
    }

    public MessageCounts channelsTimetoken(List<Long> list) {
        this.channelsTimetoken = list;
        return this;
    }

    public d<JsonElement> doWork(Map<String, String> map) {
        if (this.channelsTimetoken.size() == 1) {
            map.put("timetoken", PubNubUtil.joinLong(this.channelsTimetoken, InstabugDbContract.COMMA_SEP));
        } else {
            map.put("channelsTimetoken", PubNubUtil.joinLong(this.channelsTimetoken, InstabugDbContract.COMMA_SEP));
        }
        return getRetrofit().getHistoryService().fetchCount(getPubnub().getConfiguration().getSubscribeKey(), PubNubUtil.joinString(this.channels, InstabugDbContract.COMMA_SEP), map);
    }

    public List<String> getAffectedChannelGroups() {
        return null;
    }

    public List<String> getAffectedChannels() {
        return this.channels;
    }

    public PNOperationType getOperationType() {
        return PNOperationType.PNMessageCountOperation;
    }

    public boolean isAuthRequired() {
        return true;
    }

    public void validateParams() throws PubNubException {
        List<String> list = this.channels;
        if (list == null || list.isEmpty()) {
            throw PubNubException.builder().pubnubError(PubNubErrorBuilder.PNERROBJ_CHANNEL_MISSING).build();
        }
        List<Long> list2 = this.channelsTimetoken;
        if (list2 == null || list2.isEmpty() || this.channelsTimetoken.contains((Object) null)) {
            throw PubNubException.builder().pubnubError(PubNubErrorBuilder.PNERROBJ_TIMETOKEN_MISSING).build();
        } else if (this.channelsTimetoken.size() != this.channels.size() && this.channelsTimetoken.size() > 1) {
            throw PubNubException.builder().pubnubError(PubNubErrorBuilder.PNERROBJ_CHANNELS_TIMETOKEN_MISMATCH).build();
        }
    }

    public PNMessageCountResult createResponse(v<JsonElement> vVar) throws PubNubException {
        PNMessageCountResult.PNMessageCountResultBuilder builder = PNMessageCountResult.builder();
        HashMap hashMap = new HashMap();
        MapperManager mapper = getPubnub().getMapper();
        T t = vVar.b;
        if (t != null) {
            if (!mapper.isJsonObject((JsonElement) t) || !mapper.hasField((JsonElement) vVar.b, "channels")) {
                throw PubNubException.builder().pubnubError(PubNubErrorBuilder.PNERROBJ_HTTP_ERROR).errormsg("History is disabled").jso((JsonElement) vVar.b).build();
            }
            Iterator<Map.Entry<String, JsonElement>> objectIterator = mapper.getObjectIterator((JsonElement) vVar.b, "channels");
            while (objectIterator.hasNext()) {
                Map.Entry next = objectIterator.next();
                hashMap.put(next.getKey(), Long.valueOf(((JsonElement) next.getValue()).getAsLong()));
            }
            builder.channels(hashMap);
        }
        return builder.build();
    }
}
