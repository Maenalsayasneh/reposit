package com.pubnub.api.models.consumer.objects_api.uuid;

import com.pubnub.api.models.consumer.pubsub.BasePubSubResult;
import com.pubnub.api.models.consumer.pubsub.objects.ObjectResult;
import i0.d.a.a.a;

public class PNUUIDMetadataResult extends ObjectResult<PNUUIDMetadata> {
    public PNUUIDMetadataResult(BasePubSubResult basePubSubResult, String str, PNUUIDMetadata pNUUIDMetadata) {
        super(basePubSubResult, str, pNUUIDMetadata);
    }

    public String toString() {
        return a.y0(a.P0("PNUUIDMetadataResult(super="), super.toString(), ")");
    }
}
