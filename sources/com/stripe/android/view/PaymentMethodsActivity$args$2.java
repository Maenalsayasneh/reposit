package com.stripe.android.view;

import android.content.Intent;
import com.stripe.android.view.PaymentMethodsActivityStarter;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m0.n.a.a;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/stripe/android/view/PaymentMethodsActivityStarter$Args;", "invoke", "()Lcom/stripe/android/view/PaymentMethodsActivityStarter$Args;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: PaymentMethodsActivity.kt */
public final class PaymentMethodsActivity$args$2 extends Lambda implements a<PaymentMethodsActivityStarter.Args> {
    public final /* synthetic */ PaymentMethodsActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PaymentMethodsActivity$args$2(PaymentMethodsActivity paymentMethodsActivity) {
        super(0);
        this.this$0 = paymentMethodsActivity;
    }

    public final PaymentMethodsActivityStarter.Args invoke() {
        PaymentMethodsActivityStarter.Args.Companion companion = PaymentMethodsActivityStarter.Args.Companion;
        Intent intent = this.this$0.getIntent();
        i.d(intent, "intent");
        return companion.create$payments_core_release(intent);
    }
}
