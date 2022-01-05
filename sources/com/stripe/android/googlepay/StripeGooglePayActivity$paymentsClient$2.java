package com.stripe.android.googlepay;

import i0.h.a.b.n.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m0.n.a.a;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Li0/h/a/b/n/c;", "invoke", "()Li0/h/a/b/n/c;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: StripeGooglePayActivity.kt */
public final class StripeGooglePayActivity$paymentsClient$2 extends Lambda implements a<c> {
    public final /* synthetic */ StripeGooglePayActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StripeGooglePayActivity$paymentsClient$2(StripeGooglePayActivity stripeGooglePayActivity) {
        super(0);
        this.this$0 = stripeGooglePayActivity;
    }

    public final c invoke() {
        return new PaymentsClientFactory(this.this$0).create(StripeGooglePayActivity.access$getArgs$p(this.this$0).getConfig().getEnvironment());
    }
}
