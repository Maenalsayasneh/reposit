package com.pubnub.api.models.consumer.objects_api.member;

import com.pubnub.api.models.server.objects_api.EntityArrayEnvelope;
import i0.d.a.a.a;

public class PNManageChannelMembersResult extends EntityArrayEnvelope<PNMembers> {
    public PNManageChannelMembersResult() {
    }

    public String toString() {
        return a.y0(a.P0("PNManageChannelMembersResult(super="), super.toString(), ")");
    }

    public PNManageChannelMembersResult(EntityArrayEnvelope<PNMembers> entityArrayEnvelope) {
        this.data = entityArrayEnvelope.getData();
        this.next = entityArrayEnvelope.getNext();
        this.prev = entityArrayEnvelope.getPrev();
        this.status = entityArrayEnvelope.getStatus();
        this.totalCount = entityArrayEnvelope.getTotalCount();
    }
}
