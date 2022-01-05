package com.stripe.android.view;

import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import m0.i;
import m0.n.a.l;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "p1", "Lm0/i;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: PaymentAuthWebViewActivity.kt */
public final /* synthetic */ class PaymentAuthWebViewActivity$onCreate$webViewClient$2 extends FunctionReferenceImpl implements l<Throwable, i> {
    public PaymentAuthWebViewActivity$onCreate$webViewClient$2(PaymentAuthWebViewActivity paymentAuthWebViewActivity) {
        super(1, paymentAuthWebViewActivity, PaymentAuthWebViewActivity.class, "onAuthComplete", "onAuthComplete$payments_core_release(Ljava/lang/Throwable;)V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return i.a;
    }

    public final void invoke(Throwable th) {
        ((PaymentAuthWebViewActivity) this.receiver).onAuthComplete$payments_core_release(th);
    }
}
