package com.pubnub.api.endpoints.message_actions;

import com.pubnub.api.PubNub;
import com.pubnub.api.PubNubException;
import com.pubnub.api.builder.PubNubErrorBuilder;
import com.pubnub.api.endpoints.Endpoint;
import com.pubnub.api.endpoints.objects_api.utils.Limiter;
import com.pubnub.api.endpoints.objects_api.utils.Pager;
import com.pubnub.api.enums.PNOperationType;
import com.pubnub.api.managers.RetrofitManager;
import com.pubnub.api.managers.TelemetryManager;
import com.pubnub.api.managers.token_manager.TokenManager;
import com.pubnub.api.models.consumer.message_actions.PNGetMessageActionsResult;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import t0.d;
import t0.v;

public class GetMessageActions extends Endpoint<PNGetMessageActionsResult, PNGetMessageActionsResult> {
    private String channel;
    private Long end;
    private Integer limit;
    private Long start;

    public GetMessageActions(PubNub pubNub, TelemetryManager telemetryManager, RetrofitManager retrofitManager, TokenManager tokenManager) {
        super(pubNub, telemetryManager, retrofitManager, tokenManager);
    }

    public GetMessageActions channel(String str) {
        this.channel = str;
        return this;
    }

    public d<PNGetMessageActionsResult> doWork(Map<String, String> map) {
        Long l = this.start;
        if (l != null) {
            map.put(Pager.START_PARAM_NAME, Long.toString(l.longValue()).toLowerCase());
        }
        Long l2 = this.end;
        if (l2 != null) {
            map.put(Pager.END_PARAM_NAME, Long.toString(l2.longValue()).toLowerCase());
        }
        Integer num = this.limit;
        if (num != null) {
            map.put(Limiter.LIMIT_PARAM_NAME, String.valueOf(num));
        }
        map.putAll(encodeParams(map));
        return getRetrofit().getMessageActionService().getMessageActions(getPubnub().getConfiguration().getSubscribeKey(), this.channel, map);
    }

    public GetMessageActions end(Long l) {
        this.end = l;
        return this;
    }

    public List<String> getAffectedChannelGroups() {
        return null;
    }

    public List<String> getAffectedChannels() {
        return Collections.singletonList(this.channel);
    }

    public PNOperationType getOperationType() {
        return PNOperationType.PNGetMessageActions;
    }

    public boolean isAuthRequired() {
        return true;
    }

    public GetMessageActions limit(Integer num) {
        this.limit = num;
        return this;
    }

    public GetMessageActions start(Long l) {
        this.start = l;
        return this;
    }

    public void validateParams() throws PubNubException {
        String str = this.channel;
        if (str == null || str.isEmpty()) {
            throw PubNubException.builder().pubnubError(PubNubErrorBuilder.PNERROBJ_CHANNEL_MISSING).build();
        } else if (getPubnub().getConfiguration().getSubscribeKey() == null || getPubnub().getConfiguration().getSubscribeKey().isEmpty()) {
            throw PubNubException.builder().pubnubError(PubNubErrorBuilder.PNERROBJ_SUBSCRIBE_KEY_MISSING).build();
        }
    }

    public PNGetMessageActionsResult createResponse(v<PNGetMessageActionsResult> vVar) throws PubNubException {
        return (PNGetMessageActionsResult) vVar.b;
    }
}
