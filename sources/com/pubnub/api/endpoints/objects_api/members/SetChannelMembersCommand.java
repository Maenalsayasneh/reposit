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
import com.pubnub.api.models.consumer.objects_api.member.PNMembers;
import com.pubnub.api.models.consumer.objects_api.member.PNSetChannelMembersResult;
import com.pubnub.api.models.consumer.objects_api.member.PNUUID;
import com.pubnub.api.models.server.objects_api.EntityArrayEnvelope;
import com.pubnub.api.models.server.objects_api.PatchMemberPayload;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import t0.d;
import t0.v;

/* compiled from: SetChannelMembers */
public final class SetChannelMembersCommand extends SetChannelMembers implements Include.HavingCustomInclude<SetChannelMembers>, Include.HavingUUIDInclude<SetChannelMembers>, ListCapabilities.HavingListCapabilites<SetChannelMembers> {
    private final Collection<PNUUID> uuids;

    public SetChannelMembersCommand(String str, Collection<PNUUID> collection, PubNub pubNub, TelemetryManager telemetryManager, RetrofitManager retrofitManager, CompositeParameterEnricher compositeParameterEnricher, TokenManager tokenManager) {
        super(str, pubNub, telemetryManager, retrofitManager, compositeParameterEnricher, tokenManager);
        this.uuids = collection;
    }

    public d<EntityArrayEnvelope<PNMembers>> executeCommand(Map<String, String> map) throws PubNubException {
        return getRetrofit().getChannelMetadataService().patchMembers(getPubnub().getConfiguration().getSubscribeKey(), this.channel, new PatchMemberPayload(this.uuids, Collections.emptyList()), map);
    }

    public CompositeParameterEnricher getCompositeParameterEnricher() {
        return super.getCompositeParameterEnricher();
    }

    public PNOperationType getOperationType() {
        return PNOperationType.PNSetChannelMembersOperation;
    }

    public PNSetChannelMembersResult createResponse(v<EntityArrayEnvelope<PNMembers>> vVar) throws PubNubException {
        T t = vVar.b;
        if (t != null) {
            return new PNSetChannelMembersResult((EntityArrayEnvelope) t);
        }
        return new PNSetChannelMembersResult();
    }
}
