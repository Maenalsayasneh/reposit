package com.stripe.android.view;

import com.stripe.android.databinding.PaymentMethodsActivityBinding;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m0.n.a.a;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/stripe/android/databinding/PaymentMethodsActivityBinding;", "invoke", "()Lcom/stripe/android/databinding/PaymentMethodsActivityBinding;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: PaymentMethodsActivity.kt */
public final class PaymentMethodsActivity$viewBinding$2 extends Lambda implements a<PaymentMethodsActivityBinding> {
    public final /* synthetic */ PaymentMethodsActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PaymentMethodsActivity$viewBinding$2(PaymentMethodsActivity paymentMethodsActivity) {
        super(0);
        this.this$0 = paymentMethodsActivity;
    }

    public final PaymentMethodsActivityBinding invoke() {
        PaymentMethodsActivityBinding inflate = PaymentMethodsActivityBinding.inflate(this.this$0.getLayoutInflater());
        i.d(inflate, "PaymentMethodsActivityBi…g.inflate(layoutInflater)");
        return inflate;
    }
}
