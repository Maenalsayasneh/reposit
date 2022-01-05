package com.stripe.android.view;

import android.content.Intent;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import m0.i;
import m0.n.a.l;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroid/content/Intent;", "kotlin.jvm.PlatformType", "p1", "Lm0/i;", "invoke", "(Landroid/content/Intent;)V", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: PaymentAuthWebViewActivity.kt */
public final /* synthetic */ class PaymentAuthWebViewActivity$onCreate$webViewClient$1 extends FunctionReferenceImpl implements l<Intent, i> {
    public PaymentAuthWebViewActivity$onCreate$webViewClient$1(PaymentAuthWebViewActivity paymentAuthWebViewActivity) {
        super(1, paymentAuthWebViewActivity, PaymentAuthWebViewActivity.class, "startActivity", "startActivity(Landroid/content/Intent;)V", 0);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Intent) obj);
        return i.a;
    }

    public final void invoke(Intent intent) {
        ((PaymentAuthWebViewActivity) this.receiver).startActivity(intent);
    }
}
