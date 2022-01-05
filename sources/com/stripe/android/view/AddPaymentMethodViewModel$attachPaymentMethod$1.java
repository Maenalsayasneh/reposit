package com.stripe.android.view;

import com.stripe.android.CustomerSession;
import com.stripe.android.StripeError;
import com.stripe.android.model.PaymentMethod;
import h0.q.y;
import i0.j.f.p.h;
import kotlin.Metadata;
import kotlin.Result;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J)\u0010\r\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"com/stripe/android/view/AddPaymentMethodViewModel$attachPaymentMethod$1", "Lcom/stripe/android/CustomerSession$PaymentMethodRetrievalListener;", "Lcom/stripe/android/model/PaymentMethod;", "paymentMethod", "Lm0/i;", "onPaymentMethodRetrieved", "(Lcom/stripe/android/model/PaymentMethod;)V", "", "errorCode", "", "errorMessage", "Lcom/stripe/android/StripeError;", "stripeError", "onError", "(ILjava/lang/String;Lcom/stripe/android/StripeError;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: AddPaymentMethodViewModel.kt */
public final class AddPaymentMethodViewModel$attachPaymentMethod$1 implements CustomerSession.PaymentMethodRetrievalListener {
    public final /* synthetic */ y $resultData;
    public final /* synthetic */ AddPaymentMethodViewModel this$0;

    public AddPaymentMethodViewModel$attachPaymentMethod$1(AddPaymentMethodViewModel addPaymentMethodViewModel, y yVar) {
        this.this$0 = addPaymentMethodViewModel;
        this.$resultData = yVar;
    }

    public void onError(int i, String str, StripeError stripeError) {
        i.e(str, "errorMessage");
        this.$resultData.setValue(new Result(h.l0(new RuntimeException(this.this$0.errorMessageTranslator.translate(i, str, stripeError)))));
    }

    public void onPaymentMethodRetrieved(PaymentMethod paymentMethod) {
        i.e(paymentMethod, "paymentMethod");
        this.$resultData.setValue(new Result(paymentMethod));
    }
}
