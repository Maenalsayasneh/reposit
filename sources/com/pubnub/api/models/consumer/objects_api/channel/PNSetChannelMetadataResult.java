package com.pubnub.api.models.consumer.objects_api.channel;

import com.pubnub.api.models.server.objects_api.EntityEnvelope;

public class PNSetChannelMetadataResult extends EntityEnvelope<PNChannelMetadata> {
    public PNSetChannelMetadataResult() {
    }

    public String toString() {
        return "PNSetChannelMetadataResult()";
    }

    public PNSetChannelMetadataResult(EntityEnvelope<PNChannelMetadata> entityEnvelope) {
        this.status = entityEnvelope.getStatus();
        this.data = entityEnvelope.getData();
    }
}
