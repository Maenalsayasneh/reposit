package com.stripe.android;

import com.stripe.android.CustomerSession;
import com.stripe.android.model.PaymentMethod;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import m0.n.a.l;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\u000e\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"com/stripe/android/PaymentSessionViewModel$fetchCustomerPaymentMethod$1", "Lcom/stripe/android/CustomerSession$PaymentMethodsRetrievalListener;", "", "Lcom/stripe/android/model/PaymentMethod;", "paymentMethods", "Lm0/i;", "onPaymentMethodsRetrieved", "(Ljava/util/List;)V", "", "errorCode", "", "errorMessage", "Lcom/stripe/android/StripeError;", "stripeError", "onError", "(ILjava/lang/String;Lcom/stripe/android/StripeError;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: PaymentSessionViewModel.kt */
public final class PaymentSessionViewModel$fetchCustomerPaymentMethod$1 implements CustomerSession.PaymentMethodsRetrievalListener {
    public final /* synthetic */ l $onComplete;
    public final /* synthetic */ String $paymentMethodId;

    public PaymentSessionViewModel$fetchCustomerPaymentMethod$1(l lVar, String str) {
        this.$onComplete = lVar;
        this.$paymentMethodId = str;
    }

    public void onError(int i, String str, StripeError stripeError) {
        i.e(str, "errorMessage");
        this.$onComplete.invoke(null);
    }

    public void onPaymentMethodsRetrieved(List<PaymentMethod> list) {
        T t;
        i.e(list, "paymentMethods");
        l lVar = this.$onComplete;
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (i.a(((PaymentMethod) t).id, this.$paymentMethodId)) {
                break;
            }
        }
        lVar.invoke(t);
    }
}
