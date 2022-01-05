package com.pubnub.api.endpoints.message_actions;

import com.pubnub.api.PubNub;
import com.pubnub.api.PubNubException;
import com.pubnub.api.builder.PubNubErrorBuilder;
import com.pubnub.api.endpoints.Endpoint;
import com.pubnub.api.enums.PNOperationType;
import com.pubnub.api.managers.RetrofitManager;
import com.pubnub.api.managers.TelemetryManager;
import com.pubnub.api.managers.token_manager.TokenManager;
import com.pubnub.api.models.consumer.message_actions.PNRemoveMessageActionResult;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import t0.d;
import t0.v;

public class RemoveMessageAction extends Endpoint<Object, PNRemoveMessageActionResult> {
    private Long actionTimetoken;
    private String channel;
    private Long messageTimetoken;

    public RemoveMessageAction(PubNub pubNub, TelemetryManager telemetryManager, RetrofitManager retrofitManager, TokenManager tokenManager) {
        super(pubNub, telemetryManager, retrofitManager, tokenManager);
    }

    public RemoveMessageAction actionTimetoken(Long l) {
        this.actionTimetoken = l;
        return this;
    }

    public RemoveMessageAction channel(String str) {
        this.channel = str;
        return this;
    }

    public d<Object> doWork(Map<String, String> map) throws PubNubException {
        map.putAll(encodeParams(map));
        return getRetrofit().getMessageActionService().deleteMessageAction(getPubnub().getConfiguration().getSubscribeKey(), this.channel, Long.toString(this.messageTimetoken.longValue()).toLowerCase(), Long.toString(this.actionTimetoken.longValue()).toLowerCase(), map);
    }

    public List<String> getAffectedChannelGroups() {
        return null;
    }

    public List<String> getAffectedChannels() {
        return Collections.singletonList(this.channel);
    }

    public PNOperationType getOperationType() {
        return PNOperationType.PNDeleteMessageAction;
    }

    public boolean isAuthRequired() {
        return true;
    }

    public RemoveMessageAction messageTimetoken(Long l) {
        this.messageTimetoken = l;
        return this;
    }

    public void validateParams() throws PubNubException {
        String str = this.channel;
        if (str == null || str.isEmpty()) {
            throw PubNubException.builder().pubnubError(PubNubErrorBuilder.PNERROBJ_CHANNEL_MISSING).build();
        } else if (this.messageTimetoken == null) {
            throw PubNubException.builder().pubnubError(PubNubErrorBuilder.PNERROBJ_MESSAGE_TIMETOKEN_MISSING).build();
        } else if (this.actionTimetoken == null) {
            throw PubNubException.builder().pubnubError(PubNubErrorBuilder.PNERROBJ_MESSAGE_ACTION_TIMETOKEN_MISSING).build();
        } else if (getPubnub().getConfiguration().getSubscribeKey() == null || getPubnub().getConfiguration().getSubscribeKey().isEmpty()) {
            throw PubNubException.builder().pubnubError(PubNubErrorBuilder.PNERROBJ_SUBSCRIBE_KEY_MISSING).build();
        }
    }

    public PNRemoveMessageActionResult createResponse(v<Object> vVar) throws PubNubException {
        return new PNRemoveMessageActionResult();
    }
}
