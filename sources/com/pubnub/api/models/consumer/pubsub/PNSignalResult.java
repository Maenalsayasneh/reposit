package com.pubnub.api.models.consumer.pubsub;

import com.google.gson.JsonElement;
import i0.d.a.a.a;

public class PNSignalResult extends MessageResult {
    public PNSignalResult(BasePubSubResult basePubSubResult, JsonElement jsonElement) {
        super(basePubSubResult, jsonElement);
    }

    public String toString() {
        return a.y0(a.P0("PNSignalResult(super="), super.toString(), ")");
    }
}
