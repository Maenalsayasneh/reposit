package com.stripe.android.networking;

import com.stripe.android.model.ConfirmPaymentIntentParams;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.model.SourceParams;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.a;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lm0/i;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: StripeApiRepository.kt */
public final class StripeApiRepository$confirmPaymentIntent$2 extends Lambda implements a<i> {
    public final /* synthetic */ ConfirmPaymentIntentParams $confirmPaymentIntentParams;
    public final /* synthetic */ StripeApiRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StripeApiRepository$confirmPaymentIntent$2(StripeApiRepository stripeApiRepository, ConfirmPaymentIntentParams confirmPaymentIntentParams) {
        super(0);
        this.this$0 = stripeApiRepository;
        this.$confirmPaymentIntentParams = confirmPaymentIntentParams;
    }

    public final void invoke() {
        String str;
        PaymentMethodCreateParams paymentMethodCreateParams = this.$confirmPaymentIntentParams.getPaymentMethodCreateParams();
        if (paymentMethodCreateParams == null || (str = paymentMethodCreateParams.getTypeCode()) == null) {
            SourceParams sourceParams = this.$confirmPaymentIntentParams.getSourceParams();
            str = sourceParams != null ? sourceParams.getType() : null;
        }
        StripeApiRepository stripeApiRepository = this.this$0;
        stripeApiRepository.fireAnalyticsRequest$payments_core_release(stripeApiRepository.analyticsRequestFactory.createPaymentIntentConfirmation$payments_core_release(str));
    }
}
