package com.clubhouse.android.ui.profile.reports;

import com.clubhouse.android.data.models.local.IncidentCategory;
import i0.b.a.o;
import i0.e.b.g3.u.y5.h1.e;
import i0.e.b.g3.u.y5.h1.h;
import i0.e.b.g3.u.y5.p0;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: ReportIncidentSelectCategoryFragment.kt */
public final class ReportIncidentSelectCategoryFragment$buildReportReasonsModels$1 extends Lambda implements l<p0, i> {
    public final /* synthetic */ o c;
    public final /* synthetic */ ReportIncidentSelectCategoryFragment d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReportIncidentSelectCategoryFragment$buildReportReasonsModels$1(o oVar, ReportIncidentSelectCategoryFragment reportIncidentSelectCategoryFragment) {
        super(1);
        this.c = oVar;
        this.d = reportIncidentSelectCategoryFragment;
    }

    public Object invoke(Object obj) {
        p0 p0Var = (p0) obj;
        m0.n.b.i.e(p0Var, "state");
        if (p0Var.b.isEmpty()) {
            o oVar = this.c;
            h hVar = new h();
            hVar.I("reportReasonLoading");
            oVar.add(hVar);
        } else {
            boolean z = true;
            List<IncidentCategory> list = p0Var.b;
            o oVar2 = this.c;
            ReportIncidentSelectCategoryFragment reportIncidentSelectCategoryFragment = this.d;
            for (IncidentCategory incidentCategory : list) {
                if (!z) {
                    e eVar = new e();
                    eVar.I(m0.n.b.i.k("divider", incidentCategory.d));
                    oVar2.add(eVar);
                }
                i0.e.b.g3.u.y5.h1.i iVar = new i0.e.b.g3.u.y5.h1.i();
                iVar.J(incidentCategory.d);
                iVar.K(incidentCategory.c);
                iVar.L(new i0.e.b.g3.u.y5.i(reportIncidentSelectCategoryFragment, incidentCategory));
                oVar2.add(iVar);
                z = false;
            }
        }
        return i.a;
    }
}
