package com.stripe.android;

import com.stripe.android.CustomerSession;
import com.stripe.android.EphemeralKeyManager;
import kotlin.Metadata;
import kotlinx.coroutines.CoroutineStart;
import m0.l.c;
import m0.l.e;
import m0.n.b.i;
import m0.r.t.a.r.m.a1.a;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"com/stripe/android/CustomerSession$ephemeralKeyManager$1", "Lcom/stripe/android/EphemeralKeyManager$KeyManagerListener;", "Lcom/stripe/android/EphemeralKey;", "ephemeralKey", "Lcom/stripe/android/EphemeralOperation;", "operation", "Lm0/i;", "onKeyUpdate", "(Lcom/stripe/android/EphemeralKey;Lcom/stripe/android/EphemeralOperation;)V", "", "operationId", "", "errorCode", "errorMessage", "onKeyError", "(Ljava/lang/String;ILjava/lang/String;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: CustomerSession.kt */
public final class CustomerSession$ephemeralKeyManager$1 implements EphemeralKeyManager.KeyManagerListener {
    public final /* synthetic */ CustomerSession this$0;

    public CustomerSession$ephemeralKeyManager$1(CustomerSession customerSession) {
        this.this$0 = customerSession;
    }

    public void onKeyError(String str, int i, String str2) {
        i.e(str, "operationId");
        i.e(str2, "errorMessage");
        CustomerSession.RetrievalListener retrievalListener = (CustomerSession.RetrievalListener) this.this$0.listeners.remove(str);
        if (retrievalListener != null) {
            retrievalListener.onError(i, str2, (StripeError) null);
        }
    }

    public void onKeyUpdate(EphemeralKey ephemeralKey, EphemeralOperation ephemeralOperation) {
        i.e(ephemeralKey, "ephemeralKey");
        i.e(ephemeralOperation, "operation");
        a.E2(a.h(this.this$0.workContext), (e) null, (CoroutineStart) null, new CustomerSession$ephemeralKeyManager$1$onKeyUpdate$1(this, ephemeralKey, ephemeralOperation, (c) null), 3, (Object) null);
    }
}
