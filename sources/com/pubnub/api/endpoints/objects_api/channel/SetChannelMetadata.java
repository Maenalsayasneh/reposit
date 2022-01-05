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
import com.pubnub.api.models.consumer.objects_api.channel.PNSetChannelMetadataResult;
import com.pubnub.api.models.server.objects_api.EntityEnvelope;
import java.util.Map;

public abstract class SetChannelMetadata extends ChannelEnpoint<EntityEnvelope<PNChannelMetadata>, PNSetChannelMetadataResult> implements Include.CustomIncludeAware<SetChannelMetadata> {

    public static class Builder implements BuilderSteps.ChannelStep<SetChannelMetadata> {
        private final CompositeParameterEnricher compositeParameterEnricher;
        private final PubNub pubnubInstance;
        private final RetrofitManager retrofitInstance;
        private final TelemetryManager telemetry;
        private final TokenManager tokenManager;

        public Builder(PubNub pubNub, TelemetryManager telemetryManager, RetrofitManager retrofitManager, CompositeParameterEnricher compositeParameterEnricher2, TokenManager tokenManager2) {
            this.pubnubInstance = pubNub;
            this.telemetry = telemetryManager;
            this.retrofitInstance = retrofitManager;
            this.compositeParameterEnricher = compositeParameterEnricher2;
            this.tokenManager = tokenManager2;
        }

        public SetChannelMetadata channel(String str) {
            return new SetChannelMetadataCommand(str, this.pubnubInstance, this.telemetry, this.retrofitInstance, this.compositeParameterEnricher, this.tokenManager);
        }
    }

    public SetChannelMetadata(String str, PubNub pubNub, TelemetryManager telemetryManager, RetrofitManager retrofitManager, CompositeParameterEnricher compositeParameterEnricher, TokenManager tokenManager) {
        super(str, pubNub, telemetryManager, retrofitManager, compositeParameterEnricher, tokenManager);
    }

    public static Builder builder(PubNub pubNub, TelemetryManager telemetryManager, RetrofitManager retrofitManager, TokenManager tokenManager) {
        return new Builder(pubNub, telemetryManager, retrofitManager, CompositeParameterEnricher.createDefault(), tokenManager);
    }

    public abstract SetChannelMetadata custom(Map<String, Object> map);

    public abstract SetChannelMetadata description(String str);

    public abstract SetChannelMetadata name(String str);
}
