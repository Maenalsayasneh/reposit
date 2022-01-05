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
import com.pubnub.api.models.consumer.objects_api.member.PNManageChannelMembersResult;
import com.pubnub.api.models.consumer.objects_api.member.PNMembers;
import com.pubnub.api.models.consumer.objects_api.member.PNUUID;
import com.pubnub.api.models.server.objects_api.EntityArrayEnvelope;
import com.pubnub.api.models.server.objects_api.PatchMemberPayload;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import t0.d;
import t0.v;

/* compiled from: ManageChannelMembers */
public final class ManageChannelMembersCommand extends ManageChannelMembers implements Include.HavingCustomInclude<ManageChannelMembers>, Include.HavingUUIDInclude<ManageChannelMembers>, ListCapabilities.HavingListCapabilites<ManageChannelMembers> {
    private final Collection<PNUUID> uuidsToRemove;
    private final Collection<PNUUID> uuidsToSet;

    public ManageChannelMembersCommand(String str, Collection<PNUUID> collection, Collection<PNUUID> collection2, PubNub pubNub, TelemetryManager telemetryManager, RetrofitManager retrofitManager, CompositeParameterEnricher compositeParameterEnricher, TokenManager tokenManager) {
        super(str, pubNub, telemetryManager, retrofitManager, compositeParameterEnricher, tokenManager);
        this.uuidsToSet = collection;
        this.uuidsToRemove = collection2;
    }

    public d<EntityArrayEnvelope<PNMembers>> executeCommand(Map<String, String> map) throws PubNubException {
        Collection collection = this.uuidsToSet;
        if (collection == null) {
            collection = Collections.emptyList();
        }
        Collection collection2 = this.uuidsToRemove;
        if (collection2 == null) {
            collection2 = Collections.emptyList();
        }
        return getRetrofit().getChannelMetadataService().patchMembers(getPubnub().getConfiguration().getSubscribeKey(), this.channel, new PatchMemberPayload(collection, collection2), map);
    }

    public CompositeParameterEnricher getCompositeParameterEnricher() {
        return super.getCompositeParameterEnricher();
    }

    public PNOperationType getOperationType() {
        return PNOperationType.PNManageChannelMembersOperation;
    }

    public PNManageChannelMembersResult createResponse(v<EntityArrayEnvelope<PNMembers>> vVar) throws PubNubException {
        T t = vVar.b;
        if (t != null) {
            return new PNManageChannelMembersResult((EntityArrayEnvelope) t);
        }
        return new PNManageChannelMembersResult();
    }
}
