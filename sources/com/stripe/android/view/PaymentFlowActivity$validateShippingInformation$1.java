package com.stripe.android.view;

import com.stripe.android.model.ShippingMethod;
import h0.q.z;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052&\u0010\u0004\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001 \u0003*\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlin/Result;", "", "Lcom/stripe/android/model/ShippingMethod;", "kotlin.jvm.PlatformType", "result", "Lm0/i;", "onChanged", "(Lkotlin/Result;)V", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: PaymentFlowActivity.kt */
public final class PaymentFlowActivity$validateShippingInformation$1<T> implements z<Result<? extends List<? extends ShippingMethod>>> {
    public final /* synthetic */ PaymentFlowActivity this$0;

    public PaymentFlowActivity$validateShippingInformation$1(PaymentFlowActivity paymentFlowActivity) {
        this.this$0 = paymentFlowActivity;
    }

    public final void onChanged(Result<? extends List<? extends ShippingMethod>> result) {
        Object obj = result.c;
        PaymentFlowActivity paymentFlowActivity = this.this$0;
        Throwable a = Result.a(obj);
        if (a == null) {
            paymentFlowActivity.onShippingInfoValidated((List) obj);
        } else {
            paymentFlowActivity.onShippingInfoError(a);
        }
    }
}
