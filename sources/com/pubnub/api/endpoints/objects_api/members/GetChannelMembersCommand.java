package com.pubnub.api.endpoints.objects_api.members;

import com.pubnub.api.PubNub;
import com.pubnub.api.PubNubException;
import com.pubnub.api.endpoints.objects_api.CompositeParameterEnricher;
import com.pubnub.api.endpoints.objects_api.utils.Include;
import com.pubnub.api.endpoints.objects_api.utils.ListCapabilities;
import com.pubnub.api.enums.PNOperationType;
import com.pubnub.api.managers.RetrofitManager;
import com.pubnub.api.managers.TelemetryManager;
import com.pubnub.api.managers.token_manager.TokenManager;
import com.pubnub.api.models.consumer.objects_api.member.PNGetChannelMembersResult;
import com.pubnub.api.models.consumer.objects_api.member.PNMembers;
import com.pubnub.api.models.server.objects_api.EntityArrayEnvelope;
import java.util.Map;
import t0.d;
import t0.v;

/* compiled from: GetChannelMembers */
public final class GetChannelMembersCommand extends GetChannelMembers implements Include.HavingCustomInclude<GetChannelMembers>, Include.HavingUUIDInclude<GetChannelMembers>, ListCapabilities.HavingListCapabilites<GetChannelMembers> {
    public GetChannelMembersCommand(String str, PubNub pubNub, TelemetryManager telemetryManager, RetrofitManager retrofitManager, CompositeParameterEnricher compositeParameterEnricher, TokenManager tokenManager) {
        super(str, pubNub, telemetryManager, retrofitManager, compositeParameterEnricher, tokenManager);
    }

    public d<EntityArrayEnvelope<PNMembers>> executeCommand(Map<String, String> map) throws PubNubException {
        return getRetrofit().getChannelMetadataService().getMembers(getPubnub().getConfiguration().getSubscribeKey(), this.channel, map);
    }

    public CompositeParameterEnricher getCompositeParameterEnricher() {
        return super.getCompositeParameterEnricher();
    }

    public PNOperationType getOperationType() {
        return PNOperationType.PNGetChannelMembersOperation;
    }

    public PNGetChannelMembersResult createResponse(v<EntityArrayEnvelope<PNMembers>> vVar) throws PubNubException {
        T t = vVar.b;
        if (t != null) {
            return new PNGetChannelMembersResult((EntityArrayEnvelope) t);
        }
        return new PNGetChannelMembersResult();
    }
}
