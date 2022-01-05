package com.pubnub.api.models.consumer.objects_api.membership;

import com.pubnub.api.models.server.objects_api.EntityArrayEnvelope;
import i0.d.a.a.a;

public class PNManageMembershipResult extends EntityArrayEnvelope<PNMembership> {
    public PNManageMembershipResult() {
    }

    public String toString() {
        return a.y0(a.P0("PNManageMembershipResult(super="), super.toString(), ")");
    }

    public PNManageMembershipResult(EntityArrayEnvelope<PNMembership> entityArrayEnvelope) {
        this.data = entityArrayEnvelope.getData();
        this.next = entityArrayEnvelope.getNext();
        this.prev = entityArrayEnvelope.getPrev();
        this.status = entityArrayEnvelope.getStatus();
        this.totalCount = entityArrayEnvelope.getTotalCount();
    }
}
