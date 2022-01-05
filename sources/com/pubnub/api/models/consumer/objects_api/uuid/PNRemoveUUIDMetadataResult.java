package com.pubnub.api.models.consumer.objects_api.uuid;

import com.google.gson.JsonElement;
import com.pubnub.api.models.server.objects_api.EntityEnvelope;
import i0.d.a.a.a;

public class PNRemoveUUIDMetadataResult extends EntityEnvelope<JsonElement> {
    public PNRemoveUUIDMetadataResult(EntityEnvelope<JsonElement> entityEnvelope) {
        this.status = entityEnvelope.getStatus();
        this.data = entityEnvelope.getData();
    }

    public String toString() {
        return a.y0(a.P0("PNRemoveUUIDMetadataResult(super="), super.toString(), ")");
    }
}
