package com.stripe.android.paymentsheet;

import com.stripe.android.paymentsheet.model.PaymentSelection;
import com.stripe.android.paymentsheet.ui.GooglePayButton;
import com.stripe.android.paymentsheet.ui.PrimaryButton;
import h0.q.z;
import kotlin.Metadata;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "paymentSelection", "Lm0/i;", "onChanged", "(Lcom/stripe/android/paymentsheet/model/PaymentSelection;)V", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: PaymentSheetActivity.kt */
public final class PaymentSheetActivity$setupBuyButton$2<T> implements z<PaymentSelection> {
    public final /* synthetic */ PaymentSheetActivity this$0;

    public PaymentSheetActivity$setupBuyButton$2(PaymentSheetActivity paymentSheetActivity) {
        this.this$0 = paymentSheetActivity;
    }

    public final void onChanged(PaymentSelection paymentSelection) {
        if (i.a(paymentSelection, PaymentSelection.GooglePay.INSTANCE) && (this.this$0.getSupportFragmentManager().I(this.this$0.getFragmentContainerId()) instanceof PaymentSheetListFragment)) {
            this.this$0.getViewBinding$payments_core_release().googlePayButton.bringToFront();
            GooglePayButton googlePayButton = this.this$0.getViewBinding$payments_core_release().googlePayButton;
            i.d(googlePayButton, "viewBinding.googlePayButton");
            googlePayButton.setVisibility(0);
            PrimaryButton primaryButton = this.this$0.getViewBinding$payments_core_release().buyButton;
            i.d(primaryButton, "viewBinding.buyButton");
            primaryButton.setVisibility(8);
            return;
        }
        this.this$0.getViewBinding$payments_core_release().buyButton.bringToFront();
        PrimaryButton primaryButton2 = this.this$0.getViewBinding$payments_core_release().buyButton;
        i.d(primaryButton2, "viewBinding.buyButton");
        primaryButton2.setVisibility(0);
        GooglePayButton googlePayButton2 = this.this$0.getViewBinding$payments_core_release().googlePayButton;
        i.d(googlePayButton2, "viewBinding.googlePayButton");
        googlePayButton2.setVisibility(8);
    }
}
