package com.pubnub.api.models.consumer.objects_api.uuid;

import com.pubnub.api.models.server.objects_api.EntityArrayEnvelope;
import i0.d.a.a.a;

public class PNGetAllUUIDMetadataResult extends EntityArrayEnvelope<PNUUIDMetadata> {
    public PNGetAllUUIDMetadataResult() {
    }

    public String toString() {
        return a.y0(a.P0("PNGetAllUUIDMetadataResult(super="), super.toString(), ")");
    }

    public PNGetAllUUIDMetadataResult(EntityArrayEnvelope<PNUUIDMetadata> entityArrayEnvelope) {
        this.status = entityArrayEnvelope.getStatus();
        this.totalCount = entityArrayEnvelope.getTotalCount();
        this.prev = entityArrayEnvelope.getPrev();
        this.next = entityArrayEnvelope.getNext();
        this.data = entityArrayEnvelope.getData();
    }
}
