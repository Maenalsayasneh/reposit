package com.pubnub.api.endpoints.objects_api.channel;

import com.pubnub.api.PubNub;
import com.pubnub.api.endpoints.BuilderSteps;
import com.pubnub.api.endpoints.objects_api.ChannelEnpoint;
import com.pubnub.api.endpoints.objects_api.CompositeParameterEnricher;
import com.pubnub.api.endpoints.objects_api.utils.Include;
import com.pubnub.api.managers.RetrofitManager;
import com.pubnub.api.managers.TelemetryManager;
import com.pubnub.api.managers.token_manager.TokenManager;
import com.pubnub.api.models.consumer.objects_api.channel.PNChannelMetadata;
import com.pubnub.api.models.consumer.objects_api.channel.PNGetChannelMetadataResult;
import com.pubnub.api.models.server.objects_api.EntityEnvelope;

public abstract class GetChannelMetadata extends ChannelEnpoint<EntityEnvelope<PNChannelMetadata>, PNGetChannelMetadataResult> implements Include.CustomIncludeAware<GetChannelMetadata> {

    public static class Builder implements BuilderSteps.ChannelStep<GetChannelMetadata> {
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

        public GetChannelMetadata channel(String str) {
            return new GetChannelMetadataCommand(str, this.pubnubInstance, this.telemetry, this.retrofitInstance, CompositeParameterEnricher.createDefault(), this.tokenManager);
        }
    }

    public GetChannelMetadata(String str, PubNub pubNub, TelemetryManager telemetryManager, RetrofitManager retrofitManager, CompositeParameterEnricher compositeParameterEnricher, TokenManager tokenManager) {
        super(str, pubNub, telemetryManager, retrofitManager, compositeParameterEnricher, tokenManager);
    }

    public static Builder builder(PubNub pubNub, TelemetryManager telemetryManager, RetrofitManager retrofitManager, TokenManager tokenManager) {
        return new Builder(pubNub, telemetryManager, retrofitManager, tokenManager);
    }
}
