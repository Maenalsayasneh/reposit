package com.stripe.android.paymentsheet;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m0.n.a.a;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel;", "invoke", "()Lcom/stripe/android/paymentsheet/PaymentOptionsViewModel;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: PaymentOptionsListFragment.kt */
public final class PaymentOptionsListFragment$sheetViewModel$2 extends Lambda implements a<PaymentOptionsViewModel> {
    public final /* synthetic */ PaymentOptionsListFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PaymentOptionsListFragment$sheetViewModel$2(PaymentOptionsListFragment paymentOptionsListFragment) {
        super(0);
        this.this$0 = paymentOptionsListFragment;
    }

    public final PaymentOptionsViewModel invoke() {
        return this.this$0.getActivityViewModel();
    }
}
