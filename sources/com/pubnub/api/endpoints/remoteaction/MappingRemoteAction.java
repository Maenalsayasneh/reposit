package com.pubnub.api.endpoints.remoteaction;

import com.pubnub.api.PubNubException;
import com.pubnub.api.callbacks.PNCallback;
import com.pubnub.api.models.consumer.PNStatus;

public class MappingRemoteAction<T, U> implements RemoteAction<U> {
    private PNCallback<U> cachedCallback;
    private final PNFunction<T, U> function;
    private final T result;

    private MappingRemoteAction(T t, PNFunction<T, U> pNFunction) {
        this.result = t;
        this.function = pNFunction;
    }

    public static <T, U> RemoteAction<U> map(T t, PNFunction<T, U> pNFunction) {
        return new MappingRemoteAction(t, pNFunction);
    }

    public void async(PNCallback<U> pNCallback) {
        this.cachedCallback = pNCallback;
        pNCallback.onResponse(this.function.invoke(this.result), PNStatus.builder().statusCode(200).build());
    }

    public void retry() {
        async(this.cachedCallback);
    }

    public void silentCancel() {
    }

    public U sync() throws PubNubException {
        return this.function.invoke(this.result);
    }
}
