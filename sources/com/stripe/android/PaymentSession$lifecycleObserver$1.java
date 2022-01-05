package com.stripe.android;

import androidx.lifecycle.Lifecycle;
import com.stripe.android.PaymentSession;
import h0.q.a0;
import h0.q.o;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/stripe/android/PaymentSession$lifecycleObserver$1", "Lh0/q/o;", "Lm0/i;", "onDestroy", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: PaymentSession.kt */
public final class PaymentSession$lifecycleObserver$1 implements o {
    public final /* synthetic */ PaymentSession this$0;

    public PaymentSession$lifecycleObserver$1(PaymentSession paymentSession) {
        this.this$0 = paymentSession;
    }

    @a0(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        this.this$0.setListener$payments_core_release((PaymentSession.PaymentSessionListener) null);
    }
}
