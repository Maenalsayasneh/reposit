package com.stripe.android.paymentsheet.flowcontroller;

import com.stripe.android.StripeIntentResult;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.payments.PaymentFlowResultProcessor;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m0.n.a.a;
import m0.n.a.q;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0016\u0012\u0006\b\u0001\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/stripe/android/payments/PaymentFlowResultProcessor;", "Lcom/stripe/android/model/StripeIntent;", "Lcom/stripe/android/StripeIntentResult;", "invoke", "()Lcom/stripe/android/payments/PaymentFlowResultProcessor;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: DefaultFlowController.kt */
public final class DefaultFlowController$paymentFlowResultProcessor$2 extends Lambda implements a<PaymentFlowResultProcessor<? extends StripeIntent, ? extends StripeIntentResult<? extends StripeIntent>>> {
    public final /* synthetic */ q $paymentFlowResultProcessorFactory;
    public final /* synthetic */ DefaultFlowController this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DefaultFlowController$paymentFlowResultProcessor$2(DefaultFlowController defaultFlowController, q qVar) {
        super(0);
        this.this$0 = defaultFlowController;
        this.$paymentFlowResultProcessorFactory = qVar;
    }

    public final PaymentFlowResultProcessor<? extends StripeIntent, StripeIntentResult<StripeIntent>> invoke() {
        return (PaymentFlowResultProcessor) this.$paymentFlowResultProcessorFactory.invoke(this.this$0.viewModel.getInitData().getClientSecret(), this.this$0.getPaymentConfiguration().getPublishableKey(), this.this$0.getStripeApiRepository());
    }
}
