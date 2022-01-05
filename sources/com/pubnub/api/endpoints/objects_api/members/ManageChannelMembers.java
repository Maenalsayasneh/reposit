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
import com.pubnub.api.models.consumer.objects_api.member.PNManageChannelMembersResult;
import com.pubnub.api.models.consumer.objects_api.member.PNMembers;
import com.pubnub.api.models.consumer.objects_api.member.PNUUID;
import com.pubnub.api.models.server.objects_api.EntityArrayEnvelope;
import java.util.Collection;

public abstract class ManageChannelMembers extends ChannelEnpoint<EntityArrayEnvelope<PNMembers>, PNManageChannelMembersResult> implements Include.CustomIncludeAware<ManageChannelMembers>, Include.UUIDIncludeAware<ManageChannelMembers>, ListCapabilities.ListCapabilitiesAware<ManageChannelMembers> {

    public static class Builder implements BuilderSteps.ChannelStep<ObjectsBuilderSteps.RemoveOrSetStep<ManageChannelMembers, PNUUID>> {
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

        public ObjectsBuilderSteps.RemoveOrSetStep<ManageChannelMembers, PNUUID> channel(final String str) {
            return new ObjectsBuilderSteps.RemoveOrSetStep<ManageChannelMembers, PNUUID>() {
                public ObjectsBuilderSteps.RemoveOrSetStep.SetStep<ManageChannelMembers, PNUUID> remove(final Collection<PNUUID> collection) {
                    return new ObjectsBuilderSteps.RemoveOrSetStep.SetStep<ManageChannelMembers, PNUUID>() {
                        public ManageChannelMembers set(Collection<PNUUID> collection) {
                            CompositeParameterEnricher createDefault = CompositeParameterEnricher.createDefault();
                            AnonymousClass1 r02 = AnonymousClass1.this;
                            return new ManageChannelMembersCommand(str, collection, collection, Builder.this.pubnubInstance, Builder.this.telemetry, Builder.this.retrofitInstance, createDefault, Builder.this.tokenManager);
                        }
                    };
                }

                public ObjectsBuilderSteps.RemoveOrSetStep.RemoveStep<ManageChannelMembers, PNUUID> set(final Collection<PNUUID> collection) {
                    return new ObjectsBuilderSteps.RemoveOrSetStep.RemoveStep<ManageChannelMembers, PNUUID>() {
                        public ManageChannelMembers remove(Collection<PNUUID> collection) {
                            CompositeParameterEnricher createDefault = CompositeParameterEnricher.createDefault();
                            AnonymousClass1 r02 = AnonymousClass1.this;
                            return new ManageChannelMembersCommand(str, collection, collection, Builder.this.pubnubInstance, Builder.this.telemetry, Builder.this.retrofitInstance, createDefault, Builder.this.tokenManager);
                        }
                    };
                }
            };
        }
    }

    public ManageChannelMembers(String str, PubNub pubNub, TelemetryManager telemetryManager, RetrofitManager retrofitManager, CompositeParameterEnricher compositeParameterEnricher, TokenManager tokenManager) {
        super(str, pubNub, telemetryManager, retrofitManager, compositeParameterEnricher, tokenManager);
    }

    public static Builder builder(PubNub pubNub, TelemetryManager telemetryManager, RetrofitManager retrofitManager, TokenManager tokenManager) {
        return new Builder(pubNub, telemetryManager, retrofitManager, tokenManager);
    }
}
