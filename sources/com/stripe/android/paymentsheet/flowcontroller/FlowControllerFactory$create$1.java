package com.stripe.android.paymentsheet.flowcontroller;

import com.stripe.android.StripeIntentResult;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.networking.StripeApiRepository;
import com.stripe.android.payments.PaymentFlowResultProcessor;
import com.stripe.android.payments.PaymentIntentFlowResultProcessor;
import com.stripe.android.payments.SetupIntentFlowResultProcessor;
import com.stripe.android.paymentsheet.model.ClientSecret;
import com.stripe.android.paymentsheet.model.PaymentIntentClientSecret;
import com.stripe.android.paymentsheet.model.SetupIntentClientSecret;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Lambda;
import m0.n.a.q;
import m0.n.b.i;
import n0.a.m0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u000b\u001a\u0016\u0012\u0006\b\u0001\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\b0\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/stripe/android/paymentsheet/model/ClientSecret;", "clientSecret", "", "publishableKey", "Lcom/stripe/android/networking/StripeApiRepository;", "stripeApiRepository", "Lcom/stripe/android/payments/PaymentFlowResultProcessor;", "Lcom/stripe/android/model/StripeIntent;", "Lcom/stripe/android/StripeIntentResult;", "invoke", "(Lcom/stripe/android/paymentsheet/model/ClientSecret;Ljava/lang/String;Lcom/stripe/android/networking/StripeApiRepository;)Lcom/stripe/android/payments/PaymentFlowResultProcessor;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: FlowControllerFactory.kt */
public final class FlowControllerFactory$create$1 extends Lambda implements q<ClientSecret, String, StripeApiRepository, PaymentFlowResultProcessor<? extends StripeIntent, ? extends StripeIntentResult<? extends StripeIntent>>> {
    public final /* synthetic */ FlowControllerFactory this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowControllerFactory$create$1(FlowControllerFactory flowControllerFactory) {
        super(3);
        this.this$0 = flowControllerFactory;
    }

    public final PaymentFlowResultProcessor<? extends StripeIntent, StripeIntentResult<StripeIntent>> invoke(ClientSecret clientSecret, String str, StripeApiRepository stripeApiRepository) {
        i.e(clientSecret, "clientSecret");
        i.e(str, "publishableKey");
        i.e(stripeApiRepository, "stripeApiRepository");
        if (clientSecret instanceof PaymentIntentClientSecret) {
            return new PaymentIntentFlowResultProcessor(this.this$0.appContext, str, stripeApiRepository, false, m0.c);
        } else if (clientSecret instanceof SetupIntentClientSecret) {
            return new SetupIntentFlowResultProcessor(this.this$0.appContext, str, stripeApiRepository, false, m0.c);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }
}
