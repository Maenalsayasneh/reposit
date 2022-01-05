package com.pubnub.api.endpoints;

import com.pubnub.api.PubNub;
import com.pubnub.api.PubNubException;
import com.pubnub.api.builder.PubNubErrorBuilder;
import com.pubnub.api.enums.PNOperationType;
import com.pubnub.api.managers.RetrofitManager;
import com.pubnub.api.managers.TelemetryManager;
import com.pubnub.api.managers.token_manager.TokenManager;
import com.pubnub.api.models.consumer.PNTimeResult;
import java.util.List;
import java.util.Map;
import t0.d;
import t0.v;

public class Time extends Endpoint<List<Long>, PNTimeResult> {
    public Time(PubNub pubNub, TelemetryManager telemetryManager, RetrofitManager retrofitManager, TokenManager tokenManager) {
        super(pubNub, telemetryManager, retrofitManager, tokenManager);
    }

    public d<List<Long>> doWork(Map<String, String> map) {
        return getRetrofit().getTimeService().fetchTime(map);
    }

    public List<String> getAffectedChannelGroups() {
        return null;
    }

    public List<String> getAffectedChannels() {
        return null;
    }

    public PNOperationType getOperationType() {
        return PNOperationType.PNTimeOperation;
    }

    public boolean isAuthRequired() {
        return false;
    }

    public void validateParams() throws PubNubException {
    }

    public PNTimeResult createResponse(v<List<Long>> vVar) throws PubNubException {
        PNTimeResult.PNTimeResultBuilder builder = PNTimeResult.builder();
        T t = vVar.b;
        if (t == null || ((List) t).size() == 0) {
            throw PubNubException.builder().pubnubError(PubNubErrorBuilder.PNERROBJ_PARSING_ERROR).build();
        }
        builder.timetoken((Long) ((List) vVar.b).get(0));
        return builder.build();
    }
}
