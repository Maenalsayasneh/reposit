package com.pubnub.api.models.consumer.pubsub;

import com.google.gson.JsonElement;
import i0.d.a.a.a;

public class MessageResult extends BasePubSubResult {
    private JsonElement message;

    public MessageResult(BasePubSubResult basePubSubResult, JsonElement jsonElement) {
        super(basePubSubResult);
        this.message = jsonElement;
    }

    public JsonElement getMessage() {
        return this.message;
    }

    public String toString() {
        StringBuilder P0 = a.P0("MessageResult(super=");
        P0.append(super.toString());
        P0.append(", message=");
        P0.append(getMessage());
        P0.append(")");
        return P0.toString();
    }
}
