package com.pubnub.api.endpoints.objects_api.memberships;

import com.pubnub.api.PubNub;
import com.pubnub.api.endpoints.objects_api.CompositeParameterEnricher;
import com.pubnub.api.endpoints.objects_api.UUIDEndpoint;
import com.pubnub.api.endpoints.objects_api.utils.Include;
import com.pubnub.api.endpoints.objects_api.utils.ListCapabilities;
import com.pubnub.api.managers.RetrofitManager;
import com.pubnub.api.managers.TelemetryManager;
import com.pubnub.api.managers.token_manager.TokenManager;
import com.pubnub.api.models.consumer.objects_api.membership.PNGetMembershipsResult;
import com.pubnub.api.models.consumer.objects_api.membership.PNMembership;
import com.pubnub.api.models.server.objects_api.EntityArrayEnvelope;

public abstract class GetMemberships extends UUIDEndpoint<GetMemberships, EntityArrayEnvelope<PNMembership>, PNGetMembershipsResult> implements Include.CustomIncludeAware<GetMemberships>, Include.ChannelIncludeAware<GetMemberships>, ListCapabilities.ListCapabilitiesAware<GetMemberships> {
    public GetMemberships(PubNub pubNub, TelemetryManager telemetryManager, RetrofitManager retrofitManager, CompositeParameterEnricher compositeParameterEnricher, TokenManager tokenManager) {
        super(pubNub, telemetryManager, retrofitManager, compositeParameterEnricher, tokenManager);
    }

    public static GetMemberships create(PubNub pubNub, TelemetryManager telemetryManager, RetrofitManager retrofitManager, TokenManager tokenManager) {
        return new GetMembershipsCommand(pubNub, telemetryManager, retrofitManager, CompositeParameterEnricher.createDefault(), tokenManager);
    }
}
