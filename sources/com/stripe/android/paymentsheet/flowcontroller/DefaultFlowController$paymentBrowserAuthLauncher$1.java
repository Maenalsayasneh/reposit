package com.stripe.android.paymentsheet.flowcontroller;

import com.stripe.android.payments.PaymentFlowResult;
import h0.a.f.a;
import kotlin.Metadata;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;", "kotlin.jvm.PlatformType", "result", "Lm0/i;", "onActivityResult", "(Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;)V", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: DefaultFlowController.kt */
public final class DefaultFlowController$paymentBrowserAuthLauncher$1<O> implements a<PaymentFlowResult.Unvalidated> {
    public final /* synthetic */ DefaultFlowController this$0;

    public DefaultFlowController$paymentBrowserAuthLauncher$1(DefaultFlowController defaultFlowController) {
        this.this$0 = defaultFlowController;
    }

    public final void onActivityResult(PaymentFlowResult.Unvalidated unvalidated) {
        DefaultFlowController defaultFlowController = this.this$0;
        i.d(unvalidated, "result");
        defaultFlowController.onPaymentFlowResult$payments_core_release(unvalidated);
    }
}
