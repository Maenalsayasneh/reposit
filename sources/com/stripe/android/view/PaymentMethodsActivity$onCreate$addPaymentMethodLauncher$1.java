package com.stripe.android.view;

import com.stripe.android.view.AddPaymentMethodActivityStarter;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import m0.i;
import m0.n.a.l;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Result;", "p1", "Lm0/i;", "invoke", "(Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Result;)V", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: PaymentMethodsActivity.kt */
public final /* synthetic */ class PaymentMethodsActivity$onCreate$addPaymentMethodLauncher$1 extends FunctionReferenceImpl implements l<AddPaymentMethodActivityStarter.Result, i> {
    public PaymentMethodsActivity$onCreate$addPaymentMethodLauncher$1(PaymentMethodsActivity paymentMethodsActivity) {
        super(1, paymentMethodsActivity, PaymentMethodsActivity.class, "onAddPaymentMethodResult", "onAddPaymentMethodResult$payments_core_release(Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Result;)V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((AddPaymentMethodActivityStarter.Result) obj);
        return i.a;
    }

    public final void invoke(AddPaymentMethodActivityStarter.Result result) {
        m0.n.b.i.e(result, "p1");
        ((PaymentMethodsActivity) this.receiver).onAddPaymentMethodResult$payments_core_release(result);
    }
}
