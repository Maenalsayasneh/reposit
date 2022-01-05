package com.pubnub.api.endpoints.objects_api.channel;

import com.google.gson.JsonElement;
import com.pubnub.api.PubNub;
import com.pubnub.api.PubNubException;
import com.pubnub.api.endpoints.BuilderSteps;
import com.pubnub.api.endpoints.objects_api.ChannelEnpoint;
import com.pubnub.api.endpoints.objects_api.CompositeParameterEnricher;
import com.pubnub.api.enums.PNOperationType;
import com.pubnub.api.managers.RetrofitManager;
import com.pubnub.api.managers.TelemetryManager;
import com.pubnub.api.managers.token_manager.TokenManager;
import com.pubnub.api.models.consumer.objects_api.channel.PNRemoveChannelMetadataResult;
import com.pubnub.api.models.server.objects_api.EntityEnvelope;
import java.util.Map;
import t0.d;
import t0.v;

public class RemoveChannelMetadata extends ChannelEnpoint<EntityEnvelope<JsonElement>, PNRemoveChannelMetadataResult> {

    public static class Builder implements BuilderSteps.ChannelStep<RemoveChannelMetadata> {
        private final PubNub pubnubInstance;
        private final RetrofitManager retrofitInstance;
        private final TelemetryManager telemetry;
        private final TokenManager tokenManager;

        public Builder(PubNub pubNub, TelemetryManager telemetryManager, RetrofitManager retrofitManager, TokenManager tokenManager2) {
            this.pubnubInstance = pubNub;
            this.telemetry = telemetryManager;
            this.retrofitInstance = retrofitManager;
            this.tokenManager = tokenManager2;
        }

        public RemoveChannelMetadata channel(String str) {
            return new RemoveChannelMetadata(str, this.pubnubInstance, this.telemetry, this.retrofitInstance, this.tokenManager);
        }
    }

    public RemoveChannelMetadata(String str, PubNub pubNub, TelemetryManager telemetryManager, RetrofitManager retrofitManager, TokenManager tokenManager) {
        super(str, pubNub, telemetryManager, retrofitManager, CompositeParameterEnricher.createDefault(), tokenManager);
    }

    public static Builder builder(PubNub pubNub, TelemetryManager telemetryManager, RetrofitManager retrofitManager, TokenManager tokenManager) {
        return new Builder(pubNub, telemetryManager, retrofitManager, tokenManager);
    }

    public d<EntityEnvelope<JsonElement>> executeCommand(Map<String, String> map) throws PubNubException {
        return getRetrofit().getChannelMetadataService().deleteChannelMetadata(getPubnub().getConfiguration().getSubscribeKey(), this.channel, map);
    }

    public PNOperationType getOperationType() {
        return PNOperationType.PNRemoveChannelMetadataOperation;
    }

    public PNRemoveChannelMetadataResult createResponse(v<EntityEnvelope<JsonElement>> vVar) throws PubNubException {
        return new PNRemoveChannelMetadataResult((EntityEnvelope) vVar.b);
    }
}
