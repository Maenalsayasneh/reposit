package com.stripe.android.paymentsheet;

import android.widget.TextView;
import com.stripe.android.databinding.FragmentPaymentsheetPaymentMethodsListBinding;
import com.stripe.android.paymentsheet.PaymentSheetViewModel;
import h0.q.z;
import kotlin.Metadata;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$Amount;", "kotlin.jvm.PlatformType", "it", "Lm0/i;", "onChanged", "(Lcom/stripe/android/paymentsheet/PaymentSheetViewModel$Amount;)V", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: PaymentSheetListFragment.kt */
public final class PaymentSheetListFragment$onViewCreated$1<T> implements z<PaymentSheetViewModel.Amount> {
    public final /* synthetic */ FragmentPaymentsheetPaymentMethodsListBinding $viewBinding;
    public final /* synthetic */ PaymentSheetListFragment this$0;

    public PaymentSheetListFragment$onViewCreated$1(PaymentSheetListFragment paymentSheetListFragment, FragmentPaymentsheetPaymentMethodsListBinding fragmentPaymentsheetPaymentMethodsListBinding) {
        this.this$0 = paymentSheetListFragment;
        this.$viewBinding = fragmentPaymentsheetPaymentMethodsListBinding;
    }

    public final void onChanged(PaymentSheetViewModel.Amount amount) {
        TextView textView = this.$viewBinding.total;
        i.d(textView, "viewBinding.total");
        PaymentSheetListFragment paymentSheetListFragment = this.this$0;
        i.d(amount, "it");
        textView.setText(paymentSheetListFragment.getTotalText(amount));
    }
}
