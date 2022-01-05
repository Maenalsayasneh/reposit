package com.pubnub.api.models.consumer.objects_api.membership;

import com.pubnub.api.models.server.objects_api.EntityArrayEnvelope;

public class PNGetMembershipsResult extends EntityArrayEnvelope<PNMembership> {
    public PNGetMembershipsResult() {
    }

    public String toString() {
        return "PNGetMembershipsResult()";
    }

    public PNGetMembershipsResult(EntityArrayEnvelope<PNMembership> entityArrayEnvelope) {
        this.data = entityArrayEnvelope.getData();
        this.next = entityArrayEnvelope.getNext();
        this.prev = entityArrayEnvelope.getPrev();
        this.status = entityArrayEnvelope.getStatus();
        this.totalCount = entityArrayEnvelope.getTotalCount();
    }
}
