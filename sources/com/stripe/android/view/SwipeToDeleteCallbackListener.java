package com.stripe.android.view;

import com.stripe.android.model.PaymentMethod;
import com.stripe.android.view.PaymentMethodSwipeCallback;
import kotlin.Metadata;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/stripe/android/view/SwipeToDeleteCallbackListener;", "Lcom/stripe/android/view/PaymentMethodSwipeCallback$Listener;", "Lcom/stripe/android/model/PaymentMethod;", "paymentMethod", "Lm0/i;", "onSwiped", "(Lcom/stripe/android/model/PaymentMethod;)V", "Lcom/stripe/android/view/DeletePaymentMethodDialogFactory;", "deletePaymentMethodDialogFactory", "Lcom/stripe/android/view/DeletePaymentMethodDialogFactory;", "<init>", "(Lcom/stripe/android/view/DeletePaymentMethodDialogFactory;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: SwipeToDeleteCallbackListener.kt */
public final class SwipeToDeleteCallbackListener implements PaymentMethodSwipeCallback.Listener {
    private final DeletePaymentMethodDialogFactory deletePaymentMethodDialogFactory;

    public SwipeToDeleteCallbackListener(DeletePaymentMethodDialogFactory deletePaymentMethodDialogFactory2) {
        i.e(deletePaymentMethodDialogFactory2, "deletePaymentMethodDialogFactory");
        this.deletePaymentMethodDialogFactory = deletePaymentMethodDialogFactory2;
    }

    public void onSwiped(PaymentMethod paymentMethod) {
        i.e(paymentMethod, "paymentMethod");
        this.deletePaymentMethodDialogFactory.create(paymentMethod).show();
    }
}
