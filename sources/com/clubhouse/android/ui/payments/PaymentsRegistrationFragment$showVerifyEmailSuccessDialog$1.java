package com.clubhouse.android.ui.payments;

import com.clubhouse.app.R;
import h0.b.a.d;
import i0.e.b.g3.s.k;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: PaymentsRegistrationFragment.kt */
public final class PaymentsRegistrationFragment$showVerifyEmailSuccessDialog$1 extends Lambda implements l<d.a, i> {
    public final /* synthetic */ PaymentsRegistrationFragment c;
    public final /* synthetic */ String d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PaymentsRegistrationFragment$showVerifyEmailSuccessDialog$1(PaymentsRegistrationFragment paymentsRegistrationFragment, String str) {
        super(1);
        this.c = paymentsRegistrationFragment;
        this.d = str;
    }

    public Object invoke(Object obj) {
        d.a aVar = (d.a) obj;
        m0.n.b.i.e(aVar, "$this$alertDialog");
        aVar.e(R.string.email_verify_success_title);
        aVar.a.f = this.c.getString(R.string.email_verify_success_body, this.d);
        aVar.d(R.string.ok, k.c);
        return i.a;
    }
}
