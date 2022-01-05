package com.stripe.android.view;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m0.n.a.a;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/stripe/android/view/PaymentFlowViewPager;", "invoke", "()Lcom/stripe/android/view/PaymentFlowViewPager;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: PaymentFlowActivity.kt */
public final class PaymentFlowActivity$viewPager$2 extends Lambda implements a<PaymentFlowViewPager> {
    public final /* synthetic */ PaymentFlowActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PaymentFlowActivity$viewPager$2(PaymentFlowActivity paymentFlowActivity) {
        super(0);
        this.this$0 = paymentFlowActivity;
    }

    public final PaymentFlowViewPager invoke() {
        PaymentFlowViewPager paymentFlowViewPager = this.this$0.getViewBinding().shippingFlowViewpager;
        i.d(paymentFlowViewPager, "viewBinding.shippingFlowViewpager");
        return paymentFlowViewPager;
    }
}
