package com.pubnub.api.endpoints.objects_api.members;

import com.pubnub.api.PubNub;
import com.pubnub.api.endpoints.BuilderSteps;
import com.pubnub.api.endpoints.objects_api.ChannelEnpoint;
import com.pubnub.api.endpoints.objects_api.CompositeParameterEnricher;
import com.pubnub.api.endpoints.objects_api.utils.Include;
import com.pubnub.api.endpoints.objects_api.utils.ListCapabilities;
import com.pubnub.api.endpoints.objects_api.utils.ObjectsBuilderSteps;
import com.pubnub.api.managers.RetrofitManager;
import com.pubnub.api.managers.TelemetryManager;
import com.pubnub.api.managers.token_manager.TokenManager;
import com.pubnub.api.models.consumer.objects_api.member.PNMembers;
import com.pubnub.api.models.consumer.objects_api.member.PNRemoveChannelMembersResult;
import com.pubnub.api.models.consumer.objects_api.member.PNUUID;
import com.pubnub.api.models.server.objects_api.EntityArrayEnvelope;
import java.util.Collection;

public abstract class RemoveChannelMembers extends ChannelEnpoint<EntityArrayEnvelope<PNMembers>, PNRemoveChannelMembersResult> implements Include.CustomIncludeAware<RemoveChannelMembers>, Include.UUIDIncludeAware<RemoveChannelMembers>, ListCapabilities.ListCapabilitiesAware<RemoveChannelMembers> {

    public static class Builder implements BuilderSteps.ChannelStep<ObjectsBuilderSteps.UUIDsStep<RemoveChannelMembers>> {
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

        public ObjectsBuilderSteps.UUIDsStep<RemoveChannelMembers> channel(final String str) {
            return new ObjectsBuilderSteps.UUIDsStep<RemoveChannelMembers>() {
                public RemoveChannelMembers uuids(Collection<PNUUID> collection) {
                    return new RemoveChannelMembersCommand(str, collection, Builder.this.pubnubInstance, Builder.this.telemetry, Builder.this.retrofitInstance, CompositeParameterEnricher.createDefault(), Builder.this.tokenManager);
                }
            };
        }
    }

    public RemoveChannelMembers(String str, PubNub pubNub, TelemetryManager telemetryManager, RetrofitManager retrofitManager, CompositeParameterEnricher compositeParameterEnricher, TokenManager tokenManager) {
        super(str, pubNub, telemetryManager, retrofitManager, compositeParameterEnricher, tokenManager);
    }

    public static Builder builder(PubNub pubNub, TelemetryManager telemetryManager, RetrofitManager retrofitManager, TokenManager tokenManager) {
        return new Builder(pubNub, telemetryManager, retrofitManager, tokenManager);
    }
}
