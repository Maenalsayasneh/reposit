package com.pubnub.api.models.consumer.objects_api.uuid;

import com.pubnub.api.models.server.objects_api.EntityEnvelope;
import i0.d.a.a.a;

public class PNSetUUIDMetadataResult extends EntityEnvelope<PNUUIDMetadata> {
    public PNSetUUIDMetadataResult() {
    }

    public String toString() {
        return a.y0(a.P0("PNSetUUIDMetadataResult(super="), super.toString(), ")");
    }

    public PNSetUUIDMetadataResult(EntityEnvelope<PNUUIDMetadata> entityEnvelope) {
        this.status = entityEnvelope.getStatus();
        this.data = entityEnvelope.getData();
    }
}
