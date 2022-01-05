package com.stripe.android.view;

import com.stripe.android.model.Customer;
import h0.q.z;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/Result;", "Lcom/stripe/android/model/Customer;", "kotlin.jvm.PlatformType", "result", "Lm0/i;", "onChanged", "(Lkotlin/Result;)V", "com/stripe/android/view/PaymentFlowActivity$onShippingInfoValidated$1$1", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: PaymentFlowActivity.kt */
public final class PaymentFlowActivity$onShippingInfoValidated$$inlined$let$lambda$1<T> implements z<Result<? extends Customer>> {
    public final /* synthetic */ List $shippingMethods$inlined;
    public final /* synthetic */ PaymentFlowActivity this$0;

    public PaymentFlowActivity$onShippingInfoValidated$$inlined$let$lambda$1(PaymentFlowActivity paymentFlowActivity, List list) {
        this.this$0 = paymentFlowActivity;
        this.$shippingMethods$inlined = list;
    }

    public final void onChanged(Result<? extends Customer> result) {
        Object obj = result.c;
        Throwable a = Result.a(obj);
        if (a == null) {
            this.this$0.onShippingInfoSaved$payments_core_release(((Customer) obj).getShippingInformation(), this.$shippingMethods$inlined);
            return;
        }
        PaymentFlowActivity paymentFlowActivity = this.this$0;
        String message = a.getMessage();
        if (message == null) {
            message = "";
        }
        paymentFlowActivity.showError(message);
    }
}
