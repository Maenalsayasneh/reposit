package com.clubhouse.android.ui.profile;

import com.clubhouse.app.R;
import h0.b.a.d;
import i0.e.b.g3.u.a2;
import i0.e.b.g3.u.q4;
import i0.e.b.g3.u.z1;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: HalfProfileUtil.kt */
public final class HalfProfileUtil$showReportConfirmationDialog$1 extends Lambda implements l<q4, i> {
    public final /* synthetic */ HalfProfileFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HalfProfileUtil$showReportConfirmationDialog$1(HalfProfileFragment halfProfileFragment) {
        super(1);
        this.c = halfProfileFragment;
    }

    public Object invoke(Object obj) {
        final q4 q4Var = (q4) obj;
        m0.n.b.i.e(q4Var, "state");
        final HalfProfileFragment halfProfileFragment = this.c;
        AnonymousClass1 r1 = new l<d.a, i>() {
            public Object invoke(Object obj) {
                d.a aVar = (d.a) obj;
                m0.n.b.i.e(aVar, "$this$alertDialog");
                aVar.a.d = HalfProfileFragment.this.getString(R.string.report_confirmation_title, q4Var.a.getName());
                aVar.a.f = HalfProfileFragment.this.getString(R.string.report_confirmation_body);
                aVar.d(R.string.report, new a2(HalfProfileFragment.this, q4Var));
                aVar.c(R.string.cancel, z1.c);
                return i.a;
            }
        };
        m0.n.b.i.e(halfProfileFragment, "<this>");
        m0.n.b.i.e(r1, "f");
        d.a aVar = new d.a(halfProfileFragment.requireContext(), com.clubhouse.core.ui.R.style.Clubhouse_AlertDialog_Rounded);
        r1.invoke(aVar);
        aVar.g();
        return i.a;
    }
}
