package com.stripe.android.view;

import com.stripe.android.ApiResultCallback;
import com.stripe.android.model.PaymentMethod;
import h0.q.y;
import i0.j.f.p.h;
import kotlin.Metadata;
import kotlin.Result;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\n\u001a\u00020\u00042\n\u0010\t\u001a\u00060\u0007j\u0002`\bH\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"com/stripe/android/view/AddPaymentMethodViewModel$createPaymentMethod$1", "Lcom/stripe/android/ApiResultCallback;", "Lcom/stripe/android/model/PaymentMethod;", "result", "Lm0/i;", "onSuccess", "(Lcom/stripe/android/model/PaymentMethod;)V", "Ljava/lang/Exception;", "Lkotlin/Exception;", "e", "onError", "(Ljava/lang/Exception;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: AddPaymentMethodViewModel.kt */
public final class AddPaymentMethodViewModel$createPaymentMethod$1 implements ApiResultCallback<PaymentMethod> {
    public final /* synthetic */ y $resultData;

    public AddPaymentMethodViewModel$createPaymentMethod$1(y yVar) {
        this.$resultData = yVar;
    }

    public void onError(Exception exc) {
        i.e(exc, "e");
        this.$resultData.setValue(new Result(h.l0(exc)));
    }

    public void onSuccess(PaymentMethod paymentMethod) {
        i.e(paymentMethod, "result");
        this.$resultData.setValue(new Result(paymentMethod));
    }
}
