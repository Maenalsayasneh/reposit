package com.stripe.android.view;

import com.stripe.android.CustomerSession;
import com.stripe.android.StripeError;
import com.stripe.android.exception.APIException;
import com.stripe.android.model.PaymentMethod;
import h0.q.y;
import i0.j.f.p.h;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import m0.n.b.f;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\u000e\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010¸\u0006\u0000"}, d2 = {"com/stripe/android/view/PaymentMethodsViewModel$getPaymentMethods$1$1", "Lcom/stripe/android/CustomerSession$PaymentMethodsRetrievalListener;", "", "Lcom/stripe/android/model/PaymentMethod;", "paymentMethods", "Lm0/i;", "onPaymentMethodsRetrieved", "(Ljava/util/List;)V", "", "errorCode", "", "errorMessage", "Lcom/stripe/android/StripeError;", "stripeError", "onError", "(ILjava/lang/String;Lcom/stripe/android/StripeError;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: PaymentMethodsViewModel.kt */
public final class PaymentMethodsViewModel$getPaymentMethods$$inlined$fold$lambda$1 implements CustomerSession.PaymentMethodsRetrievalListener {
    public final /* synthetic */ y $resultData$inlined;
    public final /* synthetic */ PaymentMethodsViewModel this$0;

    public PaymentMethodsViewModel$getPaymentMethods$$inlined$fold$lambda$1(PaymentMethodsViewModel paymentMethodsViewModel, y yVar) {
        this.this$0 = paymentMethodsViewModel;
        this.$resultData$inlined = yVar;
    }

    public void onError(int i, String str, StripeError stripeError) {
        i.e(str, "errorMessage");
        this.$resultData$inlined.setValue(new Result(h.l0(new APIException(stripeError, (String) null, i, str, (Throwable) null, 18, (f) null))));
        this.this$0.getProgressData$payments_core_release().setValue(Boolean.FALSE);
    }

    public void onPaymentMethodsRetrieved(List<PaymentMethod> list) {
        i.e(list, "paymentMethods");
        this.$resultData$inlined.setValue(new Result(list));
        this.this$0.getProgressData$payments_core_release().setValue(Boolean.FALSE);
    }
}
