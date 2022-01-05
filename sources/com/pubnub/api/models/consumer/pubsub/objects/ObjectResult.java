package com.pubnub.api.models.consumer.pubsub.objects;

import com.pubnub.api.models.consumer.pubsub.BasePubSubResult;
import i0.d.a.a.a;

public abstract class ObjectResult<T> extends BasePubSubResult {
    public T data;
    public String event;

    public ObjectResult(BasePubSubResult basePubSubResult, String str, T t) {
        super(basePubSubResult);
        this.event = str;
        this.data = t;
    }

    public T getData() {
        return this.data;
    }

    public String getEvent() {
        return this.event;
    }

    public String toString() {
        StringBuilder P0 = a.P0("ObjectResult(super=");
        P0.append(super.toString());
        P0.append(", event=");
        P0.append(getEvent());
        P0.append(", data=");
        P0.append(getData());
        P0.append(")");
        return P0.toString();
    }
}
