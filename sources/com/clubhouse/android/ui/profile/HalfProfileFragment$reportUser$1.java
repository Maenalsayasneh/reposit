package com.clubhouse.android.ui.profile;

import com.clubhouse.android.ui.profile.reports.ReportProfileArgs;
import com.clubhouse.android.ui.profile.reports.ReportProfileLegacyArgs;
import h0.b0.v;
import h0.t.q;
import i0.e.b.g3.u.o4;
import i0.e.b.g3.u.q4;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: HalfProfileFragment.kt */
public final class HalfProfileFragment$reportUser$1 extends Lambda implements l<q4, i> {
    public final /* synthetic */ HalfProfileFragment c;
    public final /* synthetic */ ReportProfileArgs d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HalfProfileFragment$reportUser$1(HalfProfileFragment halfProfileFragment, ReportProfileArgs reportProfileArgs) {
        super(1);
        this.c = halfProfileFragment;
        this.d = reportProfileArgs;
    }

    public Object invoke(Object obj) {
        q4 q4Var = (q4) obj;
        m0.n.b.i.e(q4Var, "state");
        if (q4Var.u) {
            HalfProfileFragment halfProfileFragment = this.c;
            ReportProfileArgs reportProfileArgs = this.d;
            m0.n.b.i.e(reportProfileArgs, "mavericksArg");
            v.a1(halfProfileFragment, new o4.j(reportProfileArgs), (q) null, 2);
        } else {
            HalfProfileFragment halfProfileFragment2 = this.c;
            ReportProfileLegacyArgs reportProfileLegacyArgs = new ReportProfileLegacyArgs(this.d.c, (String) null, false, false, 14);
            m0.n.b.i.e(reportProfileLegacyArgs, "mavericksArg");
            v.a1(halfProfileFragment2, new o4.k(reportProfileLegacyArgs), (q) null, 2);
        }
        return i.a;
    }
}
