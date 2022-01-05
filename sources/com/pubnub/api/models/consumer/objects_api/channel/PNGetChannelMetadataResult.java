package com.pubnub.api.models.consumer.objects_api.channel;

import com.pubnub.api.models.server.objects_api.EntityEnvelope;

public class PNGetChannelMetadataResult extends EntityEnvelope<PNChannelMetadata> {
    public PNGetChannelMetadataResult() {
    }

    public String toString() {
        return "PNGetChannelMetadataResult()";
    }

    public PNGetChannelMetadataResult(EntityEnvelope<PNChannelMetadata> entityEnvelope) {
        this.status = entityEnvelope.getStatus();
        this.data = entityEnvelope.getData();
    }
}
