package com.clubhouse.android.ui.profile.reports;

import com.clubhouse.app.R;
import h0.b.f.m0;
import i0.e.b.g3.u.y5.e;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: ReportIncidentAddDetailsFragment.kt */
public final class ReportIncidentAddDetailsFragment$onViewCreated$4$1 extends Lambda implements l<m0, i> {
    public final /* synthetic */ ReportIncidentAddDetailsFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReportIncidentAddDetailsFragment$onViewCreated$4$1(ReportIncidentAddDetailsFragment reportIncidentAddDetailsFragment) {
        super(1);
        this.c = reportIncidentAddDetailsFragment;
    }

    public Object invoke(Object obj) {
        m0 m0Var = (m0) obj;
        m0.n.b.i.e(m0Var, "$this$popUpMenu");
        m0Var.b.add((int) R.string.remove);
        m0Var.e = new e(this.c);
        return i.a;
    }
}
