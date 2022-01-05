package com.clubhouse.android.ui.payments;

import com.stripe.android.model.PaymentMethod;
import i0.e.b.g3.s.b1;
import i0.e.b.g3.s.c1;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;
import m0.r.k;

/* compiled from: SendDirectPaymentFragment.kt */
public final class SendDirectPaymentFragment$setUpStripe$1$onPaymentSessionDataChanged$1 extends Lambda implements l<b1, i> {
    public final /* synthetic */ PaymentMethod c;
    public final /* synthetic */ SendDirectPaymentFragment d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SendDirectPaymentFragment$setUpStripe$1$onPaymentSessionDataChanged$1(PaymentMethod paymentMethod, SendDirectPaymentFragment sendDirectPaymentFragment) {
        super(1);
        this.c = paymentMethod;
        this.d = sendDirectPaymentFragment;
    }

    public Object invoke(Object obj) {
        b1 b1Var = (b1) obj;
        m0.n.b.i.e(b1Var, "state");
        PaymentMethod paymentMethod = this.c;
        if (paymentMethod != null && !m0.n.b.i.a(paymentMethod, b1Var.e)) {
            SendDirectPaymentFragment sendDirectPaymentFragment = this.d;
            k<Object>[] kVarArr = SendDirectPaymentFragment.p2;
            sendDirectPaymentFragment.V0().p(new c1(this.c));
        }
        return i.a;
    }
}
