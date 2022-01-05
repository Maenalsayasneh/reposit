package com.stripe.android.view;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m0.n.a.a;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/stripe/android/view/PaymentMethodsAdapter;", "invoke", "()Lcom/stripe/android/view/PaymentMethodsAdapter;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: PaymentMethodsActivity.kt */
public final class PaymentMethodsActivity$adapter$2 extends Lambda implements a<PaymentMethodsAdapter> {
    public final /* synthetic */ PaymentMethodsActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PaymentMethodsActivity$adapter$2(PaymentMethodsActivity paymentMethodsActivity) {
        super(0);
        this.this$0 = paymentMethodsActivity;
    }

    public final PaymentMethodsAdapter invoke() {
        return new PaymentMethodsAdapter(this.this$0.getArgs(), this.this$0.getArgs().getPaymentMethodTypes$payments_core_release(), this.this$0.getViewModel().getSelectedPaymentMethodId$payments_core_release(), this.this$0.getArgs().getShouldShowGooglePay$payments_core_release(), this.this$0.getArgs().getUseGooglePay$payments_core_release(), this.this$0.getArgs().getCanDeletePaymentMethods$payments_core_release());
    }
}
