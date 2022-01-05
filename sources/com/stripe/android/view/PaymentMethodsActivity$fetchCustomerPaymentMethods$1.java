package com.stripe.android.view;

import com.stripe.android.exception.StripeException;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.view.i18n.TranslatorManager;
import h0.q.z;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052&\u0010\u0004\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001 \u0003*\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlin/Result;", "", "Lcom/stripe/android/model/PaymentMethod;", "kotlin.jvm.PlatformType", "result", "Lm0/i;", "onChanged", "(Lkotlin/Result;)V", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: PaymentMethodsActivity.kt */
public final class PaymentMethodsActivity$fetchCustomerPaymentMethods$1<T> implements z<Result<? extends List<? extends PaymentMethod>>> {
    public final /* synthetic */ PaymentMethodsActivity this$0;

    public PaymentMethodsActivity$fetchCustomerPaymentMethods$1(PaymentMethodsActivity paymentMethodsActivity) {
        this.this$0 = paymentMethodsActivity;
    }

    public final void onChanged(Result<? extends List<? extends PaymentMethod>> result) {
        String str;
        Object obj = result.c;
        Throwable a = Result.a(obj);
        if (a == null) {
            this.this$0.getAdapter().setPaymentMethods$payments_core_release((List) obj);
            return;
        }
        AlertDisplayer access$getAlertDisplayer$p = this.this$0.getAlertDisplayer();
        if (a instanceof StripeException) {
            StripeException stripeException = (StripeException) a;
            str = TranslatorManager.INSTANCE.getErrorMessageTranslator().translate(stripeException.getStatusCode(), a.getMessage(), stripeException.getStripeError());
        } else {
            str = a.getMessage();
            if (str == null) {
                str = "";
            }
        }
        access$getAlertDisplayer$p.show(str);
    }
}
