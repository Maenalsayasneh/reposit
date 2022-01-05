package com.pubnub.api.endpoints.remoteaction;

import com.pubnub.api.PubNubException;
import com.pubnub.api.builder.PubNubErrorBuilder;
import com.pubnub.api.callbacks.PNCallback;
import com.pubnub.api.enums.PNOperationType;
import com.pubnub.api.enums.PNStatusCategory;
import com.pubnub.api.models.consumer.PNErrorData;
import com.pubnub.api.models.consumer.PNStatus;
import i0.d.a.a.a;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;

public class RetryingRemoteAction<T> implements RemoteAction<T> {
    private PNCallback<T> cachedCallback;
    private final ExecutorService executorService;
    /* access modifiers changed from: private */
    public final int maxNumberOfAutomaticRetries;
    /* access modifiers changed from: private */
    public final PNOperationType operationType;
    private final RemoteAction<T> remoteAction;

    public static class ResultAndStatus<T> {
        /* access modifiers changed from: private */
        public final T result;
        /* access modifiers changed from: private */
        public final PNStatus status;

        public ResultAndStatus(T t, PNStatus pNStatus) {
            this.result = t;
            this.status = pNStatus;
        }

        public boolean canEqual(Object obj) {
            return obj instanceof ResultAndStatus;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ResultAndStatus)) {
                return false;
            }
            ResultAndStatus resultAndStatus = (ResultAndStatus) obj;
            if (!resultAndStatus.canEqual(this)) {
                return false;
            }
            Object result2 = getResult();
            Object result3 = resultAndStatus.getResult();
            if (result2 != null ? !result2.equals(result3) : result3 != null) {
                return false;
            }
            PNStatus status2 = getStatus();
            PNStatus status3 = resultAndStatus.getStatus();
            return status2 != null ? status2.equals(status3) : status3 == null;
        }

        public T getResult() {
            return this.result;
        }

        public PNStatus getStatus() {
            return this.status;
        }

        public int hashCode() {
            Object result2 = getResult();
            int i = 43;
            int hashCode = result2 == null ? 43 : result2.hashCode();
            PNStatus status2 = getStatus();
            int i2 = (hashCode + 59) * 59;
            if (status2 != null) {
                i = status2.hashCode();
            }
            return i2 + i;
        }

        public String toString() {
            StringBuilder P0 = a.P0("RetryingRemoteAction.ResultAndStatus(result=");
            P0.append(getResult());
            P0.append(", status=");
            P0.append(getStatus());
            P0.append(")");
            return P0.toString();
        }
    }

    public RetryingRemoteAction(RemoteAction<T> remoteAction2, int i, PNOperationType pNOperationType, ExecutorService executorService2) {
        this.remoteAction = remoteAction2;
        this.maxNumberOfAutomaticRetries = i;
        this.operationType = pNOperationType;
        this.executorService = executorService2;
    }

    public static <T> RetryingRemoteAction<T> autoRetry(RemoteAction<T> remoteAction2, int i, PNOperationType pNOperationType, ExecutorService executorService2) {
        return new RetryingRemoteAction<>(remoteAction2, i, pNOperationType, executorService2);
    }

    /* access modifiers changed from: private */
    public ResultAndStatus<T> syncAsync() {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final AtomicReference atomicReference = new AtomicReference();
        this.remoteAction.async(new PNCallback<T>() {
            public void onResponse(T t, PNStatus pNStatus) {
                atomicReference.set(new ResultAndStatus(t, pNStatus.toBuilder().executedEndpoint(RetryingRemoteAction.this).build()));
                countDownLatch.countDown();
            }
        });
        try {
            countDownLatch.await();
            return (ResultAndStatus) atomicReference.get();
        } catch (InterruptedException e) {
            this.remoteAction.silentCancel();
            return new ResultAndStatus<>(null, PNStatus.builder().category(PNStatusCategory.PNUnknownCategory).operation(this.operationType).errorData(new PNErrorData(e.getMessage(), e)).error(true).executedEndpoint(this).build());
        }
    }

    /* access modifiers changed from: private */
    public void validate() throws PubNubException {
        if (this.maxNumberOfAutomaticRetries < 1) {
            throw PubNubException.builder().pubnubError(PubNubErrorBuilder.PNERROBJ_INVALID_ARGUMENTS).errormsg("Number of retries cannot be less than 1").build();
        }
    }

    public void async(final PNCallback<T> pNCallback) {
        this.cachedCallback = pNCallback;
        this.executorService.execute(new Runnable() {
            public void run() {
                ResultAndStatus resultAndStatus = null;
                try {
                    RetryingRemoteAction.this.validate();
                    for (int i = 0; i < RetryingRemoteAction.this.maxNumberOfAutomaticRetries; i++) {
                        resultAndStatus = RetryingRemoteAction.this.syncAsync();
                        if (!resultAndStatus.status.isError()) {
                            pNCallback.onResponse(resultAndStatus.result, resultAndStatus.status);
                            return;
                        }
                    }
                    pNCallback.onResponse(resultAndStatus.result, resultAndStatus.status);
                } catch (PubNubException e) {
                    pNCallback.onResponse(null, PNStatus.builder().executedEndpoint(RetryingRemoteAction.this).operation(RetryingRemoteAction.this.operationType).error(true).errorData(new PNErrorData(e.getErrormsg(), e)).build());
                }
            }
        });
    }

    public void retry() {
        async(this.cachedCallback);
    }

    public void silentCancel() {
        this.remoteAction.silentCancel();
    }

    public T sync() throws PubNubException {
        validate();
        PubNubException e = null;
        int i = 0;
        while (i < this.maxNumberOfAutomaticRetries) {
            try {
                return this.remoteAction.sync();
            } catch (PubNubException e2) {
                e = e2;
                i++;
            }
        }
        throw e;
    }
}
