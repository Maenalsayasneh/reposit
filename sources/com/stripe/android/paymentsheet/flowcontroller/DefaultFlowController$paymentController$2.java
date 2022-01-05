package com.stripe.android.paymentsheet.flowcontroller;

import com.stripe.android.PaymentController;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m0.n.a.a;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/stripe/android/PaymentController;", "invoke", "()Lcom/stripe/android/PaymentController;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: DefaultFlowController.kt */
public final class DefaultFlowController$paymentController$2 extends Lambda implements a<PaymentController> {
    public final /* synthetic */ PaymentControllerFactory $paymentControllerFactory;
    public final /* synthetic */ DefaultFlowController this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DefaultFlowController$paymentController$2(DefaultFlowController defaultFlowController, PaymentControllerFactory paymentControllerFactory) {
        super(0);
        this.this$0 = defaultFlowController;
        this.$paymentControllerFactory = paymentControllerFactory;
    }

    public final PaymentController invoke() {
        return this.$paymentControllerFactory.create(this.this$0.getPaymentConfiguration().getPublishableKey(), this.this$0.getStripeApiRepository(), this.this$0.paymentRelayLauncher, this.this$0.paymentBrowserAuthLauncher, this.this$0.stripe3ds2ChallengeLauncher);
    }
}
