package com.pubnub.api.endpoints.objects_api.members;

import com.pubnub.api.PubNub;
import com.pubnub.api.endpoints.BuilderSteps;
import com.pubnub.api.endpoints.objects_api.ChannelEnpoint;
import com.pubnub.api.endpoints.objects_api.CompositeParameterEnricher;
import com.pubnub.api.endpoints.objects_api.utils.Include;
import com.pubnub.api.endpoints.objects_api.utils.ListCapabilities;
import com.pubnub.api.managers.RetrofitManager;
import com.pubnub.api.managers.TelemetryManager;
import com.pubnub.api.managers.token_manager.TokenManager;
import com.pubnub.api.models.consumer.objects_api.member.PNGetChannelMembersResult;
import com.pubnub.api.models.consumer.objects_api.member.PNMembers;
import com.pubnub.api.models.server.objects_api.EntityArrayEnvelope;

public abstract class GetChannelMembers extends ChannelEnpoint<EntityArrayEnvelope<PNMembers>, PNGetChannelMembersResult> implements Include.CustomIncludeAware<GetChannelMembers>, Include.UUIDIncludeAware<GetChannelMembers>, ListCapabilities.ListCapabilitiesAware<GetChannelMembers> {

    public static class Builder implements BuilderSteps.ChannelStep<GetChannelMembers> {
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

        public GetChannelMembers channel(String str) {
            return new GetChannelMembersCommand(str, this.pubnubInstance, this.telemetry, this.retrofitInstance, this.compositeParameterEnricher, this.tokenManager);
        }
    }

    public GetChannelMembers(String str, PubNub pubNub, TelemetryManager telemetryManager, RetrofitManager retrofitManager, CompositeParameterEnricher compositeParameterEnricher, TokenManager tokenManager) {
        super(str, pubNub, telemetryManager, retrofitManager, compositeParameterEnricher, tokenManager);
    }

    public static Builder builder(PubNub pubNub, TelemetryManager telemetryManager, RetrofitManager retrofitManager, TokenManager tokenManager) {
        return new Builder(pubNub, telemetryManager, retrofitManager, CompositeParameterEnricher.createDefault(), tokenManager);
    }
}
