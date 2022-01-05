package com.stripe.android.paymentsheet.flowcontroller;

import com.stripe.android.PaymentAuthConfig;
import com.stripe.android.PaymentController;
import com.stripe.android.PaymentRelayStarter;
import com.stripe.android.StripePaymentController;
import com.stripe.android.auth.PaymentBrowserAuthContract;
import com.stripe.android.networking.AlipayRepository;
import com.stripe.android.networking.AnalyticsRequestExecutor;
import com.stripe.android.networking.AnalyticsRequestFactory;
import com.stripe.android.networking.StripeRepository;
import com.stripe.android.payments.PaymentFlowResult;
import com.stripe.android.stripe3ds2.service.StripeThreeDs2Service;
import com.stripe.android.stripe3ds2.transaction.MessageVersionRegistry;
import h0.a.f.b;
import kotlin.Metadata;
import m0.l.e;
import m0.n.b.f;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0004H\n¢\u0006\u0004\b\f\u0010\r"}, d2 = {"", "publishableKey", "Lcom/stripe/android/networking/StripeRepository;", "stripeRepository", "Lh0/a/f/b;", "Lcom/stripe/android/PaymentRelayStarter$Args;", "paymentRelayLauncher", "Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;", "paymentBrowserAuthLauncher", "Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;", "stripe3ds2ChallengeLauncher", "Lcom/stripe/android/PaymentController;", "create", "(Ljava/lang/String;Lcom/stripe/android/networking/StripeRepository;Lh0/a/f/b;Lh0/a/f/b;Lh0/a/f/b;)Lcom/stripe/android/PaymentController;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: FlowControllerFactory.kt */
public final class FlowControllerFactory$create$paymentControllerFactory$1 implements PaymentControllerFactory {
    public final /* synthetic */ FlowControllerFactory this$0;

    public FlowControllerFactory$create$paymentControllerFactory$1(FlowControllerFactory flowControllerFactory) {
        this.this$0 = flowControllerFactory;
    }

    public final PaymentController create(String str, StripeRepository stripeRepository, b<PaymentRelayStarter.Args> bVar, b<PaymentBrowserAuthContract.Args> bVar2, b<PaymentFlowResult.Unvalidated> bVar3) {
        i.e(str, "publishableKey");
        i.e(stripeRepository, "stripeRepository");
        i.e(bVar, "paymentRelayLauncher");
        i.e(bVar2, "paymentBrowserAuthLauncher");
        i.e(bVar3, "stripe3ds2ChallengeLauncher");
        return new StripePaymentController(this.this$0.appContext, str, stripeRepository, true, (MessageVersionRegistry) null, (PaymentAuthConfig) null, (StripeThreeDs2Service) null, (AnalyticsRequestExecutor) null, (AnalyticsRequestFactory) null, (StripePaymentController.ChallengeProgressActivityStarter) null, (AlipayRepository) null, bVar, bVar2, bVar3, (e) null, (e) null, 51184, (f) null);
    }
}
