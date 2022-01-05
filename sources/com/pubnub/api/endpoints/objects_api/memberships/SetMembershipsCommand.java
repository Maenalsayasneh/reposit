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
import com.pubnub.api.models.consumer.objects_api.membership.PNMembership;
import com.pubnub.api.models.consumer.objects_api.membership.PNSetMembershipResult;
import com.pubnub.api.models.server.objects_api.EntityArrayEnvelope;
import com.pubnub.api.models.server.objects_api.PatchMembershipPayload;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import t0.d;
import t0.v;

/* compiled from: SetMemberships */
public final class SetMembershipsCommand extends SetMemberships implements Include.HavingCustomInclude<SetMemberships>, Include.HavingChannelInclude<SetMemberships>, ListCapabilities.HavingListCapabilites<SetMemberships> {
    private final Collection<PNChannelMembership> channelMemberships;

    public SetMembershipsCommand(Collection<PNChannelMembership> collection, PubNub pubNub, TelemetryManager telemetryManager, RetrofitManager retrofitManager, CompositeParameterEnricher compositeParameterEnricher, TokenManager tokenManager) {
        super(pubNub, telemetryManager, retrofitManager, compositeParameterEnricher, tokenManager);
        this.channelMemberships = collection;
    }

    public d<EntityArrayEnvelope<PNMembership>> executeCommand(Map<String, String> map) throws PubNubException {
        return getRetrofit().getUuidMetadataService().patchMembership(getPubnub().getConfiguration().getSubscribeKey(), effectiveUuid(), new PatchMembershipPayload(this.channelMemberships, Collections.emptyList()), map);
    }

    public CompositeParameterEnricher getCompositeParameterEnricher() {
        return super.getCompositeParameterEnricher();
    }

    public PNOperationType getOperationType() {
        return PNOperationType.PNSetMembershipsOperation;
    }

    public PNSetMembershipResult createResponse(v<EntityArrayEnvelope<PNMembership>> vVar) throws PubNubException {
        T t = vVar.b;
        if (t != null) {
            return new PNSetMembershipResult((EntityArrayEnvelope) t);
        }
        return new PNSetMembershipResult();
    }
}
