package com.clubhouse.android.ui.profile.reports;

import com.clubhouse.android.data.models.local.IncidentCategory;
import com.clubhouse.android.user.model.User;
import h0.b0.v;
import h0.t.q;
import i0.e.b.g3.u.y5.m0;
import i0.e.b.g3.u.y5.n0;
import i0.e.b.g3.u.y5.p0;
import i0.j.f.p.h;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: ReportIncidentSelectCategoryFragment.kt */
public final class ReportIncidentSelectCategoryFragment$buildReportReasonsModels$1$2$2$1$1 extends Lambda implements l<p0, i> {
    public final /* synthetic */ ReportIncidentSelectCategoryFragment c;
    public final /* synthetic */ IncidentCategory d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReportIncidentSelectCategoryFragment$buildReportReasonsModels$1$2$2$1$1(ReportIncidentSelectCategoryFragment reportIncidentSelectCategoryFragment, IncidentCategory incidentCategory) {
        super(1);
        this.c = reportIncidentSelectCategoryFragment;
        this.d = incidentCategory;
    }

    public Object invoke(Object obj) {
        h0.t.l lVar;
        p0 p0Var = (p0) obj;
        m0.n.b.i.e(p0Var, "state");
        User user = p0Var.a;
        ReportIncidentSelectCategoryFragment reportIncidentSelectCategoryFragment = this.c;
        IncidentCategory incidentCategory = this.d;
        if (incidentCategory.q) {
            ReportIncidentSelectSubCategoryArgs reportIncidentSelectSubCategoryArgs = new ReportIncidentSelectSubCategoryArgs(user, incidentCategory, p0Var.c, p0Var.d, p0Var.e, p0Var.f, p0Var.g, p0Var.h);
            m0.n.b.i.e(reportIncidentSelectSubCategoryArgs, "mavericksArg");
            lVar = new n0(reportIncidentSelectSubCategoryArgs);
        } else {
            ReportIncidentAddDetailsArgs reportIncidentAddDetailsArgs = new ReportIncidentAddDetailsArgs(user, h.L2(incidentCategory), p0Var.c, p0Var.d, p0Var.e, p0Var.f, p0Var.g, p0Var.h);
            m0.n.b.i.e(reportIncidentAddDetailsArgs, "mavericksArg");
            lVar = new m0(reportIncidentAddDetailsArgs);
        }
        v.a1(reportIncidentSelectCategoryFragment, lVar, (q) null, 2);
        return i.a;
    }
}
