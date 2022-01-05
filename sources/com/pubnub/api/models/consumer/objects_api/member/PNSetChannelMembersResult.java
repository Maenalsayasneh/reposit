package com.pubnub.api.models.consumer.objects_api.member;

import com.pubnub.api.models.server.objects_api.EntityArrayEnvelope;

public class PNSetChannelMembersResult extends EntityArrayEnvelope<PNMembers> {
    public PNSetChannelMembersResult() {
    }

    public String toString() {
        return "PNSetChannelMembersResult()";
    }

    public PNSetChannelMembersResult(EntityArrayEnvelope<PNMembers> entityArrayEnvelope) {
        this.data = entityArrayEnvelope.getData();
        this.next = entityArrayEnvelope.getNext();
        this.prev = entityArrayEnvelope.getPrev();
        this.status = entityArrayEnvelope.getStatus();
        this.totalCount = entityArrayEnvelope.getTotalCount();
    }
}
