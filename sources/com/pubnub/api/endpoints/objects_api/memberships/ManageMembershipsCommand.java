package com.pubnub.api.endpoints.objects_api.memberships;

import com.pubnub.api.PubNub;
import com.pubnub.api.PubNubException;
import com.pubnub.api.endpoints.objects_api.CompositeParameterEnricher;
import com.pubnub.api.endpoints.objects_api.utils.Include;
import com.pubnub.api.endpoints.objects_api.utils.ListCapabilities;
import com.pubnub.api.enums.PNOperationType;
import com.pubnub.api.managers.RetrofitManager;
import com.pubnub.api.managers.TelemetryManager;
import com.pubnub.api.managers.token_manager.TokenManager;
import com.pubnub.api.models.consumer.objects_api.membership.PNChannelMembership;
import com.pubnub.api.models.consumer.objects_api.membership.PNManageMembershipResult;
import com.pubnub.api.models.consumer.objects_api.membership.PNMembership;
import com.pubnub.api.models.server.objects_api.EntityArrayEnvelope;
import com.pubnub.api.models.server.objects_api.PatchMembershipPayload;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import t0.d;
import t0.v;

/* compiled from: ManageMemberships */
public final class ManageMembershipsCommand extends ManageMemberships implements Include.HavingCustomInclude<ManageMemberships>, Include.HavingChannelInclude<ManageMemberships>, ListCapabilities.HavingListCapabilites<ManageMemberships> {
    private final Collection<PNChannelMembership> channelsToRemove;
    private final Collection<PNChannelMembership> channelsToSet;

    public ManageMembershipsCommand(Collection<PNChannelMembership> collection, Collection<PNChannelMembership> collection2, PubNub pubNub, TelemetryManager telemetryManager, RetrofitManager retrofitManager, CompositeParameterEnricher compositeParameterEnricher, TokenManager tokenManager) {
        super(pubNub, telemetryManager, retrofitManager, compositeParameterEnricher, tokenManager);
        this.channelsToSet = collection;
        this.channelsToRemove = collection2;
    }

    public d<EntityArrayEnvelope<PNMembership>> executeCommand(Map<String, String> map) throws PubNubException {
        Collection collection = this.channelsToSet;
        if (collection == null) {
            collection = Collections.emptyList();
        }
        Collection collection2 = this.channelsToRemove;
        if (collection2 == null) {
            collection2 = Collections.emptyList();
        }
        return getRetrofit().getUuidMetadataService().patchMembership(getPubnub().getConfiguration().getSubscribeKey(), effectiveUuid(), new PatchMembershipPayload(collection, collection2), map);
    }

    public CompositeParameterEnricher getCompositeParameterEnricher() {
        return super.getCompositeParameterEnricher();
    }

    public PNOperationType getOperationType() {
        return PNOperationType.PNManageMembershipsOperation;
    }

    public PNManageMembershipResult createResponse(v<EntityArrayEnvelope<PNMembership>> vVar) throws PubNubException {
        T t = vVar.b;
        if (t != null) {
            return new PNManageMembershipResult((EntityArrayEnvelope) t);
        }
        return new PNManageMembershipResult();
    }
}
