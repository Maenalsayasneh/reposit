package com.pubnub.api.endpoints.pubsub;

import com.pubnub.api.PubNub;
import com.pubnub.api.PubNubException;
import com.pubnub.api.PubNubUtil;
import com.pubnub.api.builder.PubNubErrorBuilder;
import com.pubnub.api.endpoints.Endpoint;
import com.pubnub.api.enums.PNOperationType;
import com.pubnub.api.managers.RetrofitManager;
import com.pubnub.api.managers.TelemetryManager;
import com.pubnub.api.managers.token_manager.TokenManager;
import com.pubnub.api.models.consumer.PNPublishResult;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import t0.d;
import t0.v;

public class Signal extends Endpoint<List<Object>, PNPublishResult> {
    private String channel;
    private Object message;

    public Signal(PubNub pubNub, TelemetryManager telemetryManager, RetrofitManager retrofitManager, TokenManager tokenManager) {
        super(pubNub, telemetryManager, retrofitManager, tokenManager);
    }

    public Signal channel(String str) {
        this.channel = str;
        return this;
    }

    public d<List<Object>> doWork(Map<String, String> map) throws PubNubException {
        String json = getPubnub().getMapper().toJson(this.message);
        map.putAll(encodeParams(map));
        return getRetrofit().getSignalService().signal(getPubnub().getConfiguration().getPublishKey(), getPubnub().getConfiguration().getSubscribeKey(), this.channel, PubNubUtil.urlEncode(json), map);
    }

    public List<String> getAffectedChannelGroups() {
        return null;
    }

    public List<String> getAffectedChannels() {
        return Collections.singletonList(this.channel);
    }

    public PNOperationType getOperationType() {
        return PNOperationType.PNSignalOperation;
    }

    public boolean isAuthRequired() {
        return true;
    }

    public Signal message(Object obj) {
        this.message = obj;
        return this;
    }

    public void validateParams() throws PubNubException {
        if (this.message != null) {
            String str = this.channel;
            if (str == null || str.isEmpty()) {
                throw PubNubException.builder().pubnubError(PubNubErrorBuilder.PNERROBJ_CHANNEL_MISSING).build();
            } else if (getPubnub().getConfiguration().getSubscribeKey() == null || getPubnub().getConfiguration().getSubscribeKey().isEmpty()) {
                throw PubNubException.builder().pubnubError(PubNubErrorBuilder.PNERROBJ_SUBSCRIBE_KEY_MISSING).build();
            } else if (getPubnub().getConfiguration().getPublishKey() == null || getPubnub().getConfiguration().getPublishKey().isEmpty()) {
                throw PubNubException.builder().pubnubError(PubNubErrorBuilder.PNERROBJ_PUBLISH_KEY_MISSING).build();
            }
        } else {
            throw PubNubException.builder().pubnubError(PubNubErrorBuilder.PNERROBJ_MESSAGE_MISSING).build();
        }
    }

    public PNPublishResult createResponse(v<List<Object>> vVar) throws PubNubException {
        PNPublishResult.PNPublishResultBuilder builder = PNPublishResult.builder();
        builder.timetoken(Long.valueOf(((List) vVar.b).get(2).toString()));
        return builder.build();
    }
}
