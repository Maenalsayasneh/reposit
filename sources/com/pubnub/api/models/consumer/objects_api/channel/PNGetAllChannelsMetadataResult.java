package com.pubnub.api.models.consumer.objects_api.channel;

import com.pubnub.api.models.server.objects_api.EntityArrayEnvelope;
import i0.d.a.a.a;

public class PNGetAllChannelsMetadataResult extends EntityArrayEnvelope<PNChannelMetadata> {
    public PNGetAllChannelsMetadataResult() {
    }

    public String toString() {
        return a.y0(a.P0("PNGetAllChannelsMetadataResult(super="), super.toString(), ")");
    }

    public PNGetAllChannelsMetadataResult(EntityArrayEnvelope<PNChannelMetadata> entityArrayEnvelope) {
        this.status = entityArrayEnvelope.getStatus();
        this.totalCount = entityArrayEnvelope.getTotalCount();
        this.prev = entityArrayEnvelope.getPrev();
        this.next = entityArrayEnvelope.getNext();
        this.data = entityArrayEnvelope.getData();
    }
}
