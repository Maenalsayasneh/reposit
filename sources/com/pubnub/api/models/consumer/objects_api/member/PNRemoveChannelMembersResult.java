package com.pubnub.api.models.consumer.objects_api.member;

import com.pubnub.api.models.server.objects_api.EntityArrayEnvelope;

public class PNRemoveChannelMembersResult extends EntityArrayEnvelope<PNMembers> {
    public PNRemoveChannelMembersResult() {
    }

    public String toString() {
        return "PNRemoveChannelMembersResult()";
    }

    public PNRemoveChannelMembersResult(EntityArrayEnvelope<PNMembers> entityArrayEnvelope) {
        this.data = entityArrayEnvelope.getData();
        this.next = entityArrayEnvelope.getNext();
        this.prev = entityArrayEnvelope.getPrev();
        this.status = entityArrayEnvelope.getStatus();
        this.totalCount = entityArrayEnvelope.getTotalCount();
    }
}
