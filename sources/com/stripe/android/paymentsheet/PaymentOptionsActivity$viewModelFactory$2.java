package com.stripe.android.paymentsheet;

import com.stripe.android.paymentsheet.PaymentOptionContract;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m0.n.a.a;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentOptionContract$Args;", "invoke", "()Lcom/stripe/android/paymentsheet/PaymentOptionContract$Args;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: PaymentOptionsActivity.kt */
public final class PaymentOptionsActivity$viewModelFactory$2 extends Lambda implements a<PaymentOptionContract.Args> {
    public final /* synthetic */ PaymentOptionsActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PaymentOptionsActivity$viewModelFactory$2(PaymentOptionsActivity paymentOptionsActivity) {
        super(0);
        this.this$0 = paymentOptionsActivity;
    }

    public final PaymentOptionContract.Args invoke() {
        PaymentOptionContract.Args access$getStarterArgs$p = this.this$0.getStarterArgs();
        if (access$getStarterArgs$p != null) {
            return access$getStarterArgs$p;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
