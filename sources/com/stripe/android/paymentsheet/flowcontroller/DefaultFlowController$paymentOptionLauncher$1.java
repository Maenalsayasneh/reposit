package com.stripe.android.paymentsheet.flowcontroller;

import androidx.core.app.ActivityOptionsCompat;
import com.stripe.android.paymentsheet.PaymentOptionContract;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentOptionContract$Args;", "args", "Lm0/i;", "invoke", "(Lcom/stripe/android/paymentsheet/PaymentOptionContract$Args;)V", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: DefaultFlowController.kt */
public final class DefaultFlowController$paymentOptionLauncher$1 extends Lambda implements l<PaymentOptionContract.Args, i> {
    public final /* synthetic */ DefaultFlowController this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DefaultFlowController$paymentOptionLauncher$1(DefaultFlowController defaultFlowController) {
        super(1);
        this.this$0 = defaultFlowController;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((PaymentOptionContract.Args) obj);
        return i.a;
    }

    public final void invoke(PaymentOptionContract.Args args) {
        m0.n.b.i.e(args, "args");
        this.this$0.paymentOptionActivityLauncher.a(args, (ActivityOptionsCompat) null);
    }
}
