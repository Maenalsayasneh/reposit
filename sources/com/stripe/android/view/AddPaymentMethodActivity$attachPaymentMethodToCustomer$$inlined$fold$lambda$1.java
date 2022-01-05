package com.stripe.android.view;

import com.stripe.android.model.PaymentMethod;
import h0.q.z;
import kotlin.Metadata;
import kotlin.Result;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/Result;", "Lcom/stripe/android/model/PaymentMethod;", "kotlin.jvm.PlatformType", "result", "Lm0/i;", "onChanged", "(Lkotlin/Result;)V", "com/stripe/android/view/AddPaymentMethodActivity$attachPaymentMethodToCustomer$2$1", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: AddPaymentMethodActivity.kt */
public final class AddPaymentMethodActivity$attachPaymentMethodToCustomer$$inlined$fold$lambda$1<T> implements z<Result<? extends PaymentMethod>> {
    public final /* synthetic */ PaymentMethod $paymentMethod$inlined;
    public final /* synthetic */ AddPaymentMethodActivity this$0;

    public AddPaymentMethodActivity$attachPaymentMethodToCustomer$$inlined$fold$lambda$1(AddPaymentMethodActivity addPaymentMethodActivity, PaymentMethod paymentMethod) {
        this.this$0 = addPaymentMethodActivity;
        this.$paymentMethod$inlined = paymentMethod;
    }

    public final void onChanged(Result<? extends PaymentMethod> result) {
        Object obj = result.c;
        AddPaymentMethodActivity addPaymentMethodActivity = this.this$0;
        Throwable a = Result.a(obj);
        if (a == null) {
            addPaymentMethodActivity.finishWithPaymentMethod((PaymentMethod) obj);
            return;
        }
        this.this$0.setProgressBarVisible(false);
        AddPaymentMethodActivity addPaymentMethodActivity2 = this.this$0;
        String message = a.getMessage();
        if (message == null) {
            message = "";
        }
        addPaymentMethodActivity2.showError(message);
    }
}
