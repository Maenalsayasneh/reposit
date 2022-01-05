package com.stripe.android.networking;

import com.stripe.android.model.PaymentMethodCreateParams;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.a;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lm0/i;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: StripeApiRepository.kt */
public final class StripeApiRepository$createPaymentMethod$2 extends Lambda implements a<i> {
    public final /* synthetic */ PaymentMethodCreateParams $paymentMethodCreateParams;
    public final /* synthetic */ StripeApiRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StripeApiRepository$createPaymentMethod$2(StripeApiRepository stripeApiRepository, PaymentMethodCreateParams paymentMethodCreateParams) {
        super(0);
        this.this$0 = stripeApiRepository;
        this.$paymentMethodCreateParams = paymentMethodCreateParams;
    }

    public final void invoke() {
        StripeApiRepository stripeApiRepository = this.this$0;
        stripeApiRepository.fireAnalyticsRequest$payments_core_release(stripeApiRepository.analyticsRequestFactory.createPaymentMethodCreation$payments_core_release(this.$paymentMethodCreateParams.getType$payments_core_release(), this.$paymentMethodCreateParams.getAttribution$payments_core_release()));
    }
}
