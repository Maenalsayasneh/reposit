package com.stripe.android.paymentsheet.flowcontroller;

import com.stripe.android.paymentsheet.PaymentOptionResult;
import h0.a.f.a;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentOptionResult;", "paymentOptionResult", "Lm0/i;", "onActivityResult", "(Lcom/stripe/android/paymentsheet/PaymentOptionResult;)V", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: DefaultFlowController.kt */
public final class DefaultFlowController$paymentOptionActivityLauncher$1<O> implements a<PaymentOptionResult> {
    public final /* synthetic */ DefaultFlowController this$0;

    public DefaultFlowController$paymentOptionActivityLauncher$1(DefaultFlowController defaultFlowController) {
        this.this$0 = defaultFlowController;
    }

    public final void onActivityResult(PaymentOptionResult paymentOptionResult) {
        this.this$0.onPaymentOptionResult$payments_core_release(paymentOptionResult);
    }
}
