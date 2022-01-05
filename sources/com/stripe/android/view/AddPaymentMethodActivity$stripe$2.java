package com.stripe.android.view;

import android.content.Context;
import com.stripe.android.PaymentConfiguration;
import com.stripe.android.Stripe;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m0.n.a.a;
import m0.n.b.f;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/stripe/android/Stripe;", "invoke", "()Lcom/stripe/android/Stripe;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: AddPaymentMethodActivity.kt */
public final class AddPaymentMethodActivity$stripe$2 extends Lambda implements a<Stripe> {
    public final /* synthetic */ AddPaymentMethodActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddPaymentMethodActivity$stripe$2(AddPaymentMethodActivity addPaymentMethodActivity) {
        super(0);
        this.this$0 = addPaymentMethodActivity;
    }

    public final Stripe invoke() {
        PaymentConfiguration paymentConfiguration$payments_core_release = this.this$0.getArgs().getPaymentConfiguration$payments_core_release();
        if (paymentConfiguration$payments_core_release == null) {
            paymentConfiguration$payments_core_release = PaymentConfiguration.Companion.getInstance(this.this$0);
        }
        Context applicationContext = this.this$0.getApplicationContext();
        i.d(applicationContext, "applicationContext");
        return new Stripe(applicationContext, paymentConfiguration$payments_core_release.getPublishableKey(), paymentConfiguration$payments_core_release.getStripeAccountId(), false, (Set) null, 24, (f) null);
    }
}
