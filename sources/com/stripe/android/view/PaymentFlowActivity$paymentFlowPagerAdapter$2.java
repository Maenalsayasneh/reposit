package com.stripe.android.view;

import com.stripe.android.model.ShippingMethod;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.a;
import m0.n.a.l;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/stripe/android/view/PaymentFlowPagerAdapter;", "invoke", "()Lcom/stripe/android/view/PaymentFlowPagerAdapter;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: PaymentFlowActivity.kt */
public final class PaymentFlowActivity$paymentFlowPagerAdapter$2 extends Lambda implements a<PaymentFlowPagerAdapter> {
    public final /* synthetic */ PaymentFlowActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PaymentFlowActivity$paymentFlowPagerAdapter$2(PaymentFlowActivity paymentFlowActivity) {
        super(0);
        this.this$0 = paymentFlowActivity;
    }

    public final PaymentFlowPagerAdapter invoke() {
        PaymentFlowActivity paymentFlowActivity = this.this$0;
        return new PaymentFlowPagerAdapter(paymentFlowActivity, paymentFlowActivity.getPaymentSessionConfig(), this.this$0.getPaymentSessionConfig().getAllowedShippingCountryCodes(), new l<ShippingMethod, i>(this) {
            public final /* synthetic */ PaymentFlowActivity$paymentFlowPagerAdapter$2 this$0;

            {
                this.this$0 = r1;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((ShippingMethod) obj);
                return i.a;
            }

            public final void invoke(ShippingMethod shippingMethod) {
                m0.n.b.i.e(shippingMethod, "it");
                this.this$0.this$0.getViewModel().setSelectedShippingMethod$payments_core_release(shippingMethod);
            }
        });
    }
}
