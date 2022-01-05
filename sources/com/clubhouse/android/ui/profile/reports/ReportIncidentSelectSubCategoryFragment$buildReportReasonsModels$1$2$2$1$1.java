package com.clubhouse.android.ui.profile.reports;

import com.clubhouse.android.data.models.local.IncidentCategory;
import h0.b0.v;
import h0.t.q;
import i0.e.b.g3.u.y5.v0;
import i0.e.b.g3.u.y5.x0;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.j.g;
import m0.n.a.l;

/* compiled from: ReportIncidentSelectSubCategoryFragment.kt */
public final class ReportIncidentSelectSubCategoryFragment$buildReportReasonsModels$1$2$2$1$1 extends Lambda implements l<x0, i> {
    public final /* synthetic */ ReportIncidentSelectSubCategoryFragment c;
    public final /* synthetic */ IncidentCategory d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReportIncidentSelectSubCategoryFragment$buildReportReasonsModels$1$2$2$1$1(ReportIncidentSelectSubCategoryFragment reportIncidentSelectSubCategoryFragment, IncidentCategory incidentCategory) {
        super(1);
        this.c = reportIncidentSelectSubCategoryFragment;
        this.d = incidentCategory;
    }

    public Object invoke(Object obj) {
        x0 x0Var = (x0) obj;
        m0.n.b.i.e(x0Var, "state");
        ReportIncidentSelectSubCategoryFragment reportIncidentSelectSubCategoryFragment = this.c;
        ReportIncidentAddDetailsArgs reportIncidentAddDetailsArgs = new ReportIncidentAddDetailsArgs(x0Var.a, g.K(x0Var.b, this.d), x0Var.d, x0Var.e, x0Var.f, x0Var.g, x0Var.h, x0Var.i);
        m0.n.b.i.e(reportIncidentAddDetailsArgs, "mavericksArg");
        v.a1(reportIncidentSelectSubCategoryFragment, new v0(reportIncidentAddDetailsArgs), (q) null, 2);
        return i.a;
    }
}
