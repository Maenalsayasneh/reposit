package com.stripe.android.paymentsheet;

import com.stripe.android.paymentsheet.PaymentSheetViewModel;
import com.stripe.android.paymentsheet.model.FragmentConfig;
import h0.q.z;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/stripe/android/paymentsheet/model/FragmentConfig;", "config", "Lm0/i;", "onChanged", "(Lcom/stripe/android/paymentsheet/model/FragmentConfig;)V", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: PaymentSheetActivity.kt */
public final class PaymentSheetActivity$fetchConfig$1<T> implements z<FragmentConfig> {
    public final /* synthetic */ PaymentSheetActivity this$0;

    public PaymentSheetActivity$fetchConfig$1(PaymentSheetActivity paymentSheetActivity) {
        this.this$0 = paymentSheetActivity;
    }

    public final void onChanged(FragmentConfig fragmentConfig) {
        Object obj;
        if (fragmentConfig != null) {
            if (fragmentConfig.getPaymentMethods().isEmpty()) {
                obj = new PaymentSheetViewModel.TransitionTarget.AddPaymentMethodSheet(fragmentConfig);
            } else {
                obj = new PaymentSheetViewModel.TransitionTarget.SelectSavedPaymentMethod(fragmentConfig);
            }
            this.this$0.getViewModel().transitionTo(obj);
        }
    }
}
