package com.stripe.android.paymentsheet;

import com.stripe.android.paymentsheet.ui.PrimaryButton;
import h0.q.z;
import kotlin.Metadata;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "kotlin.jvm.PlatformType", "isEnabled", "Lm0/i;", "onChanged", "(Ljava/lang/Boolean;)V", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: PaymentSheetActivity.kt */
public final class PaymentSheetActivity$setupBuyButton$6<T> implements z<Boolean> {
    public final /* synthetic */ PaymentSheetActivity this$0;

    public PaymentSheetActivity$setupBuyButton$6(PaymentSheetActivity paymentSheetActivity) {
        this.this$0 = paymentSheetActivity;
    }

    public final void onChanged(Boolean bool) {
        PrimaryButton primaryButton = this.this$0.getViewBinding$payments_core_release().buyButton;
        i.d(primaryButton, "viewBinding.buyButton");
        i.d(bool, "isEnabled");
        primaryButton.setEnabled(bool.booleanValue());
    }
}
