package com.stripe.android;

import com.stripe.android.payments.Stripe3ds2CompletionStarter;
import com.stripe.android.view.AuthActivityStarter;
import h0.a.f.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m0.n.a.p;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/stripe/android/view/AuthActivityStarter$Host;", "host", "", "requestCode", "Lcom/stripe/android/payments/Stripe3ds2CompletionStarter;", "invoke", "(Lcom/stripe/android/view/AuthActivityStarter$Host;I)Lcom/stripe/android/payments/Stripe3ds2CompletionStarter;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: StripePaymentController.kt */
public final class StripePaymentController$stripe3ds2CompletionStarterFactory$1 extends Lambda implements p<AuthActivityStarter.Host, Integer, Stripe3ds2CompletionStarter> {
    public final /* synthetic */ StripePaymentController this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StripePaymentController$stripe3ds2CompletionStarterFactory$1(StripePaymentController stripePaymentController) {
        super(2);
        this.this$0 = stripePaymentController;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke((AuthActivityStarter.Host) obj, ((Number) obj2).intValue());
    }

    public final Stripe3ds2CompletionStarter invoke(AuthActivityStarter.Host host, int i) {
        i.e(host, "host");
        b access$getStripe3ds2ChallengeLauncher$p = this.this$0.stripe3ds2ChallengeLauncher;
        if (access$getStripe3ds2ChallengeLauncher$p != null) {
            return new Stripe3ds2CompletionStarter.Modern(access$getStripe3ds2ChallengeLauncher$p);
        }
        return new Stripe3ds2CompletionStarter.Legacy(host, i);
    }
}
