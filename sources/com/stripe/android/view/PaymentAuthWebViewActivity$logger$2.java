package com.stripe.android.view;

import com.stripe.android.Logger;
import com.stripe.android.auth.PaymentBrowserAuthContract;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m0.n.a.a;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/stripe/android/Logger;", "invoke", "()Lcom/stripe/android/Logger;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: PaymentAuthWebViewActivity.kt */
public final class PaymentAuthWebViewActivity$logger$2 extends Lambda implements a<Logger> {
    public final /* synthetic */ PaymentAuthWebViewActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PaymentAuthWebViewActivity$logger$2(PaymentAuthWebViewActivity paymentAuthWebViewActivity) {
        super(0);
        this.this$0 = paymentAuthWebViewActivity;
    }

    public final Logger invoke() {
        Logger.Companion companion = Logger.Companion;
        PaymentBrowserAuthContract.Args access$get_args$p = this.this$0.get_args();
        boolean z = true;
        if (access$get_args$p == null || !access$get_args$p.getEnableLogging()) {
            z = false;
        }
        return companion.getInstance$payments_core_release(z);
    }
}
