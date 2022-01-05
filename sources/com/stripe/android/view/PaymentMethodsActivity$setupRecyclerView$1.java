package com.stripe.android.view;

import com.stripe.android.model.PaymentMethod;
import com.stripe.android.view.PaymentMethodsAdapter;
import kotlin.Metadata;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"com/stripe/android/view/PaymentMethodsActivity$setupRecyclerView$1", "Lcom/stripe/android/view/PaymentMethodsAdapter$Listener;", "Lcom/stripe/android/model/PaymentMethod;", "paymentMethod", "Lm0/i;", "onPaymentMethodClick", "(Lcom/stripe/android/model/PaymentMethod;)V", "onGooglePayClick", "()V", "onDeletePaymentMethodAction", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: PaymentMethodsActivity.kt */
public final class PaymentMethodsActivity$setupRecyclerView$1 implements PaymentMethodsAdapter.Listener {
    public final /* synthetic */ DeletePaymentMethodDialogFactory $deletePaymentMethodDialogFactory;
    public final /* synthetic */ PaymentMethodsActivity this$0;

    public PaymentMethodsActivity$setupRecyclerView$1(PaymentMethodsActivity paymentMethodsActivity, DeletePaymentMethodDialogFactory deletePaymentMethodDialogFactory) {
        this.this$0 = paymentMethodsActivity;
        this.$deletePaymentMethodDialogFactory = deletePaymentMethodDialogFactory;
    }

    public void onDeletePaymentMethodAction(PaymentMethod paymentMethod) {
        i.e(paymentMethod, "paymentMethod");
        this.$deletePaymentMethodDialogFactory.create(paymentMethod).show();
    }

    public void onGooglePayClick() {
        this.this$0.finishWithGooglePay();
    }

    public void onPaymentMethodClick(PaymentMethod paymentMethod) {
        i.e(paymentMethod, "paymentMethod");
        this.this$0.getViewBinding$payments_core_release().recycler.setTappedPaymentMethod$payments_core_release(paymentMethod);
    }
}
