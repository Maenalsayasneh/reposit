package com.pubnub.api.endpoints.presence;

import com.pubnub.api.PubNub;
import com.pubnub.api.PubNubException;
import com.pubnub.api.builder.PubNubErrorBuilder;
import com.pubnub.api.endpoints.Endpoint;
import com.pubnub.api.enums.PNOperationType;
import com.pubnub.api.managers.RetrofitManager;
import com.pubnub.api.managers.TelemetryManager;
import com.pubnub.api.managers.token_manager.TokenManager;
import com.pubnub.api.models.consumer.presence.PNWhereNowResult;
import com.pubnub.api.models.server.Envelope;
import com.pubnub.api.models.server.presence.WhereNowPayload;
import com.pubnub.api.services.PresenceService;
import java.util.List;
import java.util.Map;
import t0.d;
import t0.v;

public class WhereNow extends Endpoint<Envelope<WhereNowPayload>, PNWhereNowResult> {
    private String uuid;

    public WhereNow(PubNub pubNub, TelemetryManager telemetryManager, RetrofitManager retrofitManager, TokenManager tokenManager) {
        super(pubNub, telemetryManager, retrofitManager, tokenManager);
    }

    public d<Envelope<WhereNowPayload>> doWork(Map<String, String> map) {
        PresenceService presenceService = getRetrofit().getPresenceService();
        String subscribeKey = getPubnub().getConfiguration().getSubscribeKey();
        String str = this.uuid;
        if (str == null) {
            str = getPubnub().getConfiguration().getUuid();
        }
        return presenceService.whereNow(subscribeKey, str, map);
    }

    public List<String> getAffectedChannelGroups() {
        return null;
    }

    public List<String> getAffectedChannels() {
        return null;
    }

    public PNOperationType getOperationType() {
        return PNOperationType.PNWhereNowOperation;
    }

    public boolean isAuthRequired() {
        return true;
    }

    public WhereNow uuid(String str) {
        this.uuid = str;
        return this;
    }

    public void validateParams() throws PubNubException {
        if (getPubnub().getConfiguration().getSubscribeKey() == null || getPubnub().getConfiguration().getSubscribeKey().isEmpty()) {
            throw PubNubException.builder().pubnubError(PubNubErrorBuilder.PNERROBJ_SUBSCRIBE_KEY_MISSING).build();
        }
    }

    public PNWhereNowResult createResponse(v<Envelope<WhereNowPayload>> vVar) throws PubNubException {
        T t = vVar.b;
        if (t != null && ((Envelope) t).getPayload() != null) {
            return PNWhereNowResult.builder().channels(((WhereNowPayload) ((Envelope) vVar.b).getPayload()).getChannels()).build();
        }
        throw PubNubException.builder().pubnubError(PubNubErrorBuilder.PNERROBJ_PARSING_ERROR).build();
    }
}
