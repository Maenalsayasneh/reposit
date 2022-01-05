package com.pubnub.api.models.consumer.objects_api.channel;

import com.pubnub.api.models.consumer.pubsub.BasePubSubResult;
import com.pubnub.api.models.consumer.pubsub.objects.ObjectResult;
import i0.d.a.a.a;

public class PNChannelMetadataResult extends ObjectResult<PNChannelMetadata> {
    public PNChannelMetadataResult(BasePubSubResult basePubSubResult, String str, PNChannelMetadata pNChannelMetadata) {
        super(basePubSubResult, str, pNChannelMetadata);
    }

    public String toString() {
        return a.y0(a.P0("PNChannelMetadataResult(super="), super.toString(), ")");
    }
}
