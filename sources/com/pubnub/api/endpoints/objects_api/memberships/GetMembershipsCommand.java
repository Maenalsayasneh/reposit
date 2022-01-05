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
import com.pubnub.api.models.consumer.objects_api.membership.PNGetMembershipsResult;
import com.pubnub.api.models.consumer.objects_api.membership.PNMembership;
import com.pubnub.api.models.server.objects_api.EntityArrayEnvelope;
import java.util.Map;
import t0.d;
import t0.v;

/* compiled from: GetMemberships */
public final class GetMembershipsCommand extends GetMemberships implements Include.HavingCustomInclude<GetMemberships>, Include.HavingChannelInclude<GetMemberships>, ListCapabilities.HavingListCapabilites<GetMemberships> {
    public GetMembershipsCommand(PubNub pubNub, TelemetryManager telemetryManager, RetrofitManager retrofitManager, CompositeParameterEnricher compositeParameterEnricher, TokenManager tokenManager) {
        super(pubNub, telemetryManager, retrofitManager, compositeParameterEnricher, tokenManager);
    }

    public d<EntityArrayEnvelope<PNMembership>> executeCommand(Map<String, String> map) throws PubNubException {
        return getRetrofit().getUuidMetadataService().getMemberships(getPubnub().getConfiguration().getSubscribeKey(), effectiveUuid(), map);
    }

    public CompositeParameterEnricher getCompositeParameterEnricher() {
        return super.getCompositeParameterEnricher();
    }

    public PNOperationType getOperationType() {
        return PNOperationType.PNGetMembershipsOperation;
    }

    public PNGetMembershipsResult createResponse(v<EntityArrayEnvelope<PNMembership>> vVar) throws PubNubException {
        T t = vVar.b;
        if (t != null) {
            return new PNGetMembershipsResult((EntityArrayEnvelope) t);
        }
        return new PNGetMembershipsResult();
    }
}
