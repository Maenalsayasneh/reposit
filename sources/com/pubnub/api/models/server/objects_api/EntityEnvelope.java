package com.pubnub.api.models.server.objects_api;

public class EntityEnvelope<T> {
    public T data;
    public int status;

    public T getData() {
        return this.data;
    }

    public int getStatus() {
        return this.status;
    }
}
