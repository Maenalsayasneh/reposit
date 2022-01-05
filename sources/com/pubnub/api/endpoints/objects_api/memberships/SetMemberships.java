package com.pubnub.api.endpoints.objects_api.memberships;

import com.pubnub.api.PubNub;
import com.pubnub.api.endpoints.objects_api.CompositeParameterEnricher;
import com.pubnub.api.endpoints.objects_api.UUIDEndpoint;
import com.pubnub.api.endpoints.objects_api.utils.Include;
import com.pubnub.api.endpoints.objects_api.utils.ListCapabilities;
import com.pubnub.api.endpoints.objects_api.utils.ObjectsBuilderSteps;
import com.pubnub.api.managers.RetrofitManager;
import com.pubnub.api.managers.TelemetryManager;
import com.pubnub.api.managers.token_manager.TokenManager;
import com.pubnub.api.models.consumer.objects_api.membership.PNChannelMembership;
import com.pubnub.api.models.consumer.objects_api.membership.PNMembership;
import com.pubnub.api.models.consumer.objects_api.membership.PNSetMembershipResult;
import com.pubnub.api.models.server.objects_api.EntityArrayEnvelope;
import java.util.Collection;

public abstract class SetMemberships extends UUIDEndpoint<SetMemberships, EntityArrayEnvelope<PNMembership>, PNSetMembershipResult> implements Include.CustomIncludeAware<SetMemberships>, Include.ChannelIncludeAware<SetMemberships>, ListCapabilities.ListCapabilitiesAware<SetMemberships> {

    public static class Builder implements ObjectsBuilderSteps.ChannelMembershipsStep<SetMemberships> {
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

        public SetMemberships channelMemberships(Collection<PNChannelMembership> collection) {
            return new SetMembershipsCommand(collection, this.pubnubInstance, this.telemetry, this.retrofitInstance, CompositeParameterEnricher.createDefault(), this.tokenManager);
        }
    }

    public SetMemberships(PubNub pubNub, TelemetryManager telemetryManager, RetrofitManager retrofitManager, CompositeParameterEnricher compositeParameterEnricher, TokenManager tokenManager) {
        super(pubNub, telemetryManager, retrofitManager, compositeParameterEnricher, tokenManager);
    }

    public static Builder builder(PubNub pubNub, TelemetryManager telemetryManager, RetrofitManager retrofitManager, TokenManager tokenManager) {
        return new Builder(pubNub, telemetryManager, retrofitManager, tokenManager);
    }
}
