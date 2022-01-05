package com.stripe.android.paymentsheet;

import com.stripe.android.paymentsheet.PaymentSheetViewModel;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import h0.q.z;
import kotlin.Metadata;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "paymentSelection", "Lm0/i;", "onChanged", "(Lcom/stripe/android/paymentsheet/model/PaymentSelection;)V", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: PaymentSheetAddCardFragment.kt */
public final class PaymentSheetAddCardFragment$onViewCreated$2<T> implements z<PaymentSelection> {
    public final /* synthetic */ PaymentSheetAddCardFragment this$0;

    public PaymentSheetAddCardFragment$onViewCreated$2(PaymentSheetAddCardFragment paymentSheetAddCardFragment) {
        this.this$0 = paymentSheetAddCardFragment;
    }

    public final void onChanged(PaymentSelection paymentSelection) {
        if (i.a(paymentSelection, PaymentSelection.GooglePay.INSTANCE)) {
            this.this$0.getSheetViewModel().checkout(PaymentSheetViewModel.CheckoutIdentifier.AddFragmentTopGooglePay);
        }
    }
}
