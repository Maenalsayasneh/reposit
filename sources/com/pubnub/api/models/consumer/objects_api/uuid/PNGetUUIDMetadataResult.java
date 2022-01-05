package com.pubnub.api.models.consumer.objects_api.uuid;

import com.pubnub.api.models.server.objects_api.EntityEnvelope;
import i0.d.a.a.a;

public class PNGetUUIDMetadataResult extends EntityEnvelope<PNUUIDMetadata> {
    public PNGetUUIDMetadataResult() {
    }

    public String toString() {
        return a.y0(a.P0("PNGetUUIDMetadataResult(super="), super.toString(), ")");
    }

    public PNGetUUIDMetadataResult(EntityEnvelope<PNUUIDMetadata> entityEnvelope) {
        this.status = entityEnvelope.getStatus();
        this.data = entityEnvelope.getData();
    }
}
