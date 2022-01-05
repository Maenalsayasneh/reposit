package com.stripe.android.paymentsheet;

import com.stripe.android.paymentsheet.PaymentSheetContract;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m0.n.a.a;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheetContract$Args;", "invoke", "()Lcom/stripe/android/paymentsheet/PaymentSheetContract$Args;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: PaymentSheetActivity.kt */
public final class PaymentSheetActivity$viewModelFactory$2 extends Lambda implements a<PaymentSheetContract.Args> {
    public final /* synthetic */ PaymentSheetActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PaymentSheetActivity$viewModelFactory$2(PaymentSheetActivity paymentSheetActivity) {
        super(0);
        this.this$0 = paymentSheetActivity;
    }

    public final PaymentSheetContract.Args invoke() {
        PaymentSheetContract.Args access$getStarterArgs$p = this.this$0.getStarterArgs();
        if (access$getStarterArgs$p != null) {
            return access$getStarterArgs$p;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
