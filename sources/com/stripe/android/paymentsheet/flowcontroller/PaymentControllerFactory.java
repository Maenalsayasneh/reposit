package com.stripe.android.paymentsheet.flowcontroller;

import com.stripe.android.PaymentController;
import com.stripe.android.PaymentRelayStarter;
import com.stripe.android.auth.PaymentBrowserAuthContract;
import com.stripe.android.networking.StripeRepository;
import com.stripe.android.payments.PaymentFlowResult;
import h0.a.f.b;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bà\u0001\u0018\u00002\u00020\u0001JI\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006H&¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/stripe/android/paymentsheet/flowcontroller/PaymentControllerFactory;", "", "", "publishableKey", "Lcom/stripe/android/networking/StripeRepository;", "stripeRepository", "Lh0/a/f/b;", "Lcom/stripe/android/PaymentRelayStarter$Args;", "paymentRelayLauncher", "Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;", "paymentBrowserAuthLauncher", "Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;", "stripe3ds2ChallengeLauncher", "Lcom/stripe/android/PaymentController;", "create", "(Ljava/lang/String;Lcom/stripe/android/networking/StripeRepository;Lh0/a/f/b;Lh0/a/f/b;Lh0/a/f/b;)Lcom/stripe/android/PaymentController;", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: PaymentControllerFactory.kt */
public interface PaymentControllerFactory {
    PaymentController create(String str, StripeRepository stripeRepository, b<PaymentRelayStarter.Args> bVar, b<PaymentBrowserAuthContract.Args> bVar2, b<PaymentFlowResult.Unvalidated> bVar3);
}
