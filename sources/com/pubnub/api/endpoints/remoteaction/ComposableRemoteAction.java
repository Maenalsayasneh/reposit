package com.pubnub.api.endpoints.remoteaction;

import com.pubnub.api.PubNubException;
import com.pubnub.api.callbacks.PNCallback;
import com.pubnub.api.enums.PNStatusCategory;
import com.pubnub.api.models.consumer.PNStatus;
import i0.m.a.a.b.a;
import i0.m.a.a.b.b;

public class ComposableRemoteAction<T, U> implements RemoteAction<U> {
    private Boolean checkpoint;
    private Boolean isCancelled = Boolean.FALSE;
    private RemoteAction<U> nextRemoteAction = null;
    private final RemoteActionFactory<T, U> nextRemoteActionFactory;
    private final RemoteAction<T> remoteAction;

    public static class ComposableBuilder<T> {
        private boolean checkpoint;
        private final RemoteAction<T> remoteAction;

        public ComposableBuilder(RemoteAction<T> remoteAction2) {
            this.remoteAction = remoteAction2;
        }

        public ComposableBuilder<T> checkpoint() {
            this.checkpoint = true;
            return this;
        }

        public <U> ComposableRemoteAction<T, U> then(RemoteActionFactory<T, U> remoteActionFactory) {
            return new ComposableRemoteAction<>(this.remoteAction, remoteActionFactory, Boolean.valueOf(this.checkpoint));
        }
    }

    public ComposableRemoteAction(RemoteAction<T> remoteAction2, RemoteActionFactory<T, U> remoteActionFactory, Boolean bool) {
        this.remoteAction = remoteAction2;
        this.nextRemoteActionFactory = remoteActionFactory;
        this.checkpoint = bool;
    }

    public static <T> ComposableBuilder<T> firstDo(RemoteAction<T> remoteAction2) {
        return new ComposableBuilder<>(remoteAction2);
    }

    private PNStatus switchRetryReceiver(PNStatus pNStatus) {
        return pNStatus.toBuilder().executedEndpoint(this).build();
    }

    public /* synthetic */ void a(PNCallback pNCallback, Object obj, PNStatus pNStatus) {
        if (pNStatus.isError()) {
            pNCallback.onResponse(null, switchRetryReceiver(pNStatus));
            return;
        }
        try {
            synchronized (this) {
                if (!this.isCancelled.booleanValue()) {
                    RemoteAction<U> create = this.nextRemoteActionFactory.create(obj);
                    this.nextRemoteAction = create;
                    create.async(new b(this, pNCallback));
                }
            }
        } catch (PubNubException unused) {
            pNCallback.onResponse(null, PNStatus.builder().category(PNStatusCategory.PNBadRequestCategory).error(true).build());
        }
    }

    public void async(PNCallback<U> pNCallback) {
        this.remoteAction.async(new a(this, pNCallback));
    }

    public /* synthetic */ void b(PNCallback pNCallback, Object obj, PNStatus pNStatus) {
        if (pNStatus.isError()) {
            pNCallback.onResponse(null, switchRetryReceiver(pNStatus));
        } else {
            pNCallback.onResponse(obj, switchRetryReceiver(pNStatus));
        }
    }

    public synchronized ComposableRemoteAction<T, U> checkpoint() {
        this.checkpoint = Boolean.TRUE;
        return this;
    }

    public synchronized void retry() {
        RemoteAction<U> remoteAction2;
        if (!this.checkpoint.booleanValue() || (remoteAction2 = this.nextRemoteAction) == null) {
            this.remoteAction.retry();
        } else {
            remoteAction2.retry();
        }
    }

    public synchronized void silentCancel() {
        this.isCancelled = Boolean.TRUE;
        this.remoteAction.silentCancel();
        RemoteAction<U> remoteAction2 = this.nextRemoteAction;
        if (remoteAction2 != null) {
            remoteAction2.silentCancel();
        }
    }

    public U sync() throws PubNubException {
        return this.nextRemoteActionFactory.create(this.remoteAction.sync()).sync();
    }

    public <Y> ComposableRemoteAction<U, Y> then(RemoteActionFactory<U, Y> remoteActionFactory) {
        return new ComposableRemoteAction<>(this, remoteActionFactory, Boolean.FALSE);
    }
}
