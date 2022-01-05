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
import com.pubnub.api.models.consumer.objects_api.membership.PNManageMembershipResult;
import com.pubnub.api.models.consumer.objects_api.membership.PNMembership;
import com.pubnub.api.models.server.objects_api.EntityArrayEnvelope;
import java.util.Collection;

public abstract class ManageMemberships extends UUIDEndpoint<ManageMemberships, EntityArrayEnvelope<PNMembership>, PNManageMembershipResult> implements Include.CustomIncludeAware<ManageMemberships>, Include.ChannelIncludeAware<ManageMemberships>, ListCapabilities.ListCapabilitiesAware<ManageMemberships> {

    public static class Builder implements ObjectsBuilderSteps.RemoveOrSetStep<ManageMemberships, PNChannelMembership> {
        /* access modifiers changed from: private */
        public final PubNub pubnubInstance;
        /* access modifiers changed from: private */
        public final RetrofitManager retrofitInstance;
        /* access modifiers changed from: private */
        public final TelemetryManager telemetry;
        /* access modifiers changed from: private */
        public final TokenManager tokenManager;

        public Builder(PubNub pubNub, TelemetryManager telemetryManager, RetrofitManager retrofitManager, TokenManager tokenManager2) {
            this.pubnubInstance = pubNub;
            this.telemetry = telemetryManager;
            this.retrofitInstance = retrofitManager;
            this.tokenManager = tokenManager2;
        }

        public ObjectsBuilderSteps.RemoveOrSetStep.SetStep<ManageMemberships, PNChannelMembership> remove(final Collection<PNChannelMembership> collection) {
            return new ObjectsBuilderSteps.RemoveOrSetStep.SetStep<ManageMemberships, PNChannelMembership>() {
                public ManageMemberships set(Collection<PNChannelMembership> collection) {
                    return new ManageMembershipsCommand(collection, collection, Builder.this.pubnubInstance, Builder.this.telemetry, Builder.this.retrofitInstance, CompositeParameterEnricher.createDefault(), Builder.this.tokenManager);
                }
            };
        }

        public ObjectsBuilderSteps.RemoveOrSetStep.RemoveStep<ManageMemberships, PNChannelMembership> set(final Collection<PNChannelMembership> collection) {
            return new ObjectsBuilderSteps.RemoveOrSetStep.RemoveStep<ManageMemberships, PNChannelMembership>() {
                public ManageMemberships remove(Collection<PNChannelMembership> collection) {
                    return new ManageMembershipsCommand(collection, collection, Builder.this.pubnubInstance, Builder.this.telemetry, Builder.this.retrofitInstance, CompositeParameterEnricher.createDefault(), Builder.this.tokenManager);
                }
            };
        }
    }

    public ManageMemberships(PubNub pubNub, TelemetryManager telemetryManager, RetrofitManager retrofitManager, CompositeParameterEnricher compositeParameterEnricher, TokenManager tokenManager) {
        super(pubNub, telemetryManager, retrofitManager, compositeParameterEnricher, tokenManager);
    }

    public static Builder builder(PubNub pubNub, TelemetryManager telemetryManager, RetrofitManager retrofitManager, TokenManager tokenManager) {
        return new Builder(pubNub, telemetryManager, retrofitManager, tokenManager);
    }
}
