package com.stripe.android.paymentsheet.ui;

import android.view.View;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\t\u001a\u00020\u00052\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroid/view/View;", "kotlin.jvm.PlatformType", "<anonymous parameter 0>", "", "hasFocus", "Lm0/i;", "onFocusChange", "(Landroid/view/View;Z)V", "com/stripe/android/paymentsheet/ui/BillingAddressView$2$2", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: BillingAddressView.kt */
public final class BillingAddressView$$special$$inlined$forEach$lambda$2 implements View.OnFocusChangeListener {
    public final /* synthetic */ BillingAddressView this$0;

    public BillingAddressView$$special$$inlined$forEach$lambda$2(BillingAddressView billingAddressView) {
        this.this$0 = billingAddressView;
    }

    public final void onFocusChange(View view, boolean z) {
        if (z) {
            this.this$0.getOnFocus$payments_core_release().invoke();
        }
    }
}
