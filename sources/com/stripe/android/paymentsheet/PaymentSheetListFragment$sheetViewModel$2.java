package com.stripe.android.paymentsheet;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m0.n.a.a;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;", "invoke", "()Lcom/stripe/android/paymentsheet/PaymentSheetViewModel;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: PaymentSheetListFragment.kt */
public final class PaymentSheetListFragment$sheetViewModel$2 extends Lambda implements a<PaymentSheetViewModel> {
    public final /* synthetic */ PaymentSheetListFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PaymentSheetListFragment$sheetViewModel$2(PaymentSheetListFragment paymentSheetListFragment) {
        super(0);
        this.this$0 = paymentSheetListFragment;
    }

    public final PaymentSheetViewModel invoke() {
        return this.this$0.getActivityViewModel();
    }
}
