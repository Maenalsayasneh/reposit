package com.stripe.android.view;

import android.content.Intent;
import com.stripe.android.auth.PaymentBrowserAuthContract;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m0.n.a.a;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;", "invoke", "()Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: PaymentAuthWebViewActivity.kt */
public final class PaymentAuthWebViewActivity$_args$2 extends Lambda implements a<PaymentBrowserAuthContract.Args> {
    public final /* synthetic */ PaymentAuthWebViewActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PaymentAuthWebViewActivity$_args$2(PaymentAuthWebViewActivity paymentAuthWebViewActivity) {
        super(0);
        this.this$0 = paymentAuthWebViewActivity;
    }

    public final PaymentBrowserAuthContract.Args invoke() {
        PaymentBrowserAuthContract.Companion companion = PaymentBrowserAuthContract.Companion;
        Intent intent = this.this$0.getIntent();
        i.d(intent, "intent");
        return companion.parseArgs$payments_core_release(intent);
    }
}
