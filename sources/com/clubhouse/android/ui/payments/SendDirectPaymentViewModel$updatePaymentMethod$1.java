package com.clubhouse.android.ui.payments;

import com.clubhouse.analytics.AmplitudeAnalytics;
import i0.e.a.a;
import i0.e.b.g3.s.b1;
import i0.e.b.g3.s.j0;
import kotlin.Pair;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.j.g;
import m0.n.a.l;

/* compiled from: SendDirectPaymentViewModel.kt */
public final class SendDirectPaymentViewModel$updatePaymentMethod$1 extends Lambda implements l<b1, i> {
    public final /* synthetic */ SendDirectPaymentViewModel c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SendDirectPaymentViewModel$updatePaymentMethod$1(SendDirectPaymentViewModel sendDirectPaymentViewModel) {
        super(1);
        this.c = sendDirectPaymentViewModel;
    }

    public Object invoke(Object obj) {
        b1 b1Var = (b1) obj;
        m0.n.b.i.e(b1Var, "state");
        a aVar = this.c.o;
        Pair[] pairArr = new Pair[2];
        int i = 0;
        pairArr[0] = new Pair("recipient", b1Var.a);
        j0 j0Var = b1Var.d;
        if (j0Var != null) {
            i = j0Var.b();
        }
        pairArr[1] = new Pair("amount", Integer.valueOf(i));
        ((AmplitudeAnalytics) aVar).b("DirectPayments-SendPayment-ChangePaymentOption", g.N(pairArr));
        return i.a;
    }
}
