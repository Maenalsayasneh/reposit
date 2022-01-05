package com.stripe.android;

import com.stripe.android.PaymentBrowserAuthStarter;
import com.stripe.android.view.AuthActivityStarter;
import h0.a.f.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m0.n.a.l;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/stripe/android/view/AuthActivityStarter$Host;", "host", "Lcom/stripe/android/PaymentBrowserAuthStarter;", "invoke", "(Lcom/stripe/android/view/AuthActivityStarter$Host;)Lcom/stripe/android/PaymentBrowserAuthStarter;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: StripePaymentController.kt */
public final class StripePaymentController$paymentBrowserAuthStarterFactory$1 extends Lambda implements l<AuthActivityStarter.Host, PaymentBrowserAuthStarter> {
    public final /* synthetic */ StripePaymentController this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StripePaymentController$paymentBrowserAuthStarterFactory$1(StripePaymentController stripePaymentController) {
        super(1);
        this.this$0 = stripePaymentController;
    }

    public final PaymentBrowserAuthStarter invoke(AuthActivityStarter.Host host) {
        i.e(host, "host");
        b access$getPaymentBrowserAuthLauncher$p = this.this$0.paymentBrowserAuthLauncher;
        if (access$getPaymentBrowserAuthLauncher$p != null) {
            return new PaymentBrowserAuthStarter.Modern(access$getPaymentBrowserAuthLauncher$p);
        }
        return new PaymentBrowserAuthStarter.Legacy(host, this.this$0.getHasCompatibleBrowser(), this.this$0.defaultReturnUrl);
    }
}
