package com.clubhouse.android.ui.profile.reports;

import com.clubhouse.app.R;
import h0.b.f.m0;
import i0.e.b.g3.u.y5.b0;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: ReportProfileLegacyFragment.kt */
public final class ReportProfileLegacyFragment$onViewCreated$5$1 extends Lambda implements l<m0, i> {
    public final /* synthetic */ ReportProfileLegacyFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReportProfileLegacyFragment$onViewCreated$5$1(ReportProfileLegacyFragment reportProfileLegacyFragment) {
        super(1);
        this.c = reportProfileLegacyFragment;
    }

    public Object invoke(Object obj) {
        m0 m0Var = (m0) obj;
        m0.n.b.i.e(m0Var, "$this$popUpMenu");
        m0Var.b.add((int) R.string.remove);
        m0Var.e = new b0(this.c);
        return i.a;
    }
}
