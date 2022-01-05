package com.stripe.android.googlepay;

import com.stripe.android.PaymentConfiguration;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m0.n.a.a;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: StripeGooglePayActivity.kt */
public final class StripeGooglePayActivity$stripeAccountId$2 extends Lambda implements a<String> {
    public final /* synthetic */ StripeGooglePayActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StripeGooglePayActivity$stripeAccountId$2(StripeGooglePayActivity stripeGooglePayActivity) {
        super(0);
        this.this$0 = stripeGooglePayActivity;
    }

    public final String invoke() {
        return PaymentConfiguration.Companion.getInstance(this.this$0).getStripeAccountId();
    }
}
