package com.stripe.android.paymentsheet;

import com.stripe.android.paymentsheet.PaymentSheetViewModel;
import com.stripe.android.paymentsheet.model.PaymentSheetViewState;
import h0.q.w;
import h0.q.z;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/stripe/android/paymentsheet/model/PaymentSheetViewState;", "kotlin.jvm.PlatformType", "currentValue", "Lm0/i;", "onChanged", "(Lcom/stripe/android/paymentsheet/model/PaymentSheetViewState;)V", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: PaymentSheetViewModel.kt */
public final class PaymentSheetViewModel$getButtonStateObservable$1<T> implements z<PaymentSheetViewState> {
    public final /* synthetic */ PaymentSheetViewModel.CheckoutIdentifier $checkoutIdentifier;
    public final /* synthetic */ w $outputLiveData;
    public final /* synthetic */ PaymentSheetViewModel this$0;

    public PaymentSheetViewModel$getButtonStateObservable$1(PaymentSheetViewModel paymentSheetViewModel, PaymentSheetViewModel.CheckoutIdentifier checkoutIdentifier, w wVar) {
        this.this$0 = paymentSheetViewModel;
        this.$checkoutIdentifier = checkoutIdentifier;
        this.$outputLiveData = wVar;
    }

    public final void onChanged(PaymentSheetViewState paymentSheetViewState) {
        if (this.this$0.getCheckoutIdentifier$payments_core_release() == this.$checkoutIdentifier) {
            this.$outputLiveData.setValue(paymentSheetViewState);
        }
    }
}
