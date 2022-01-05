package i0.e.b.g3.u.y5;

import android.view.View;
import com.clubhouse.android.data.models.local.IncidentCategory;
import com.clubhouse.android.ui.profile.reports.ReportIncidentSelectCategoryFragment;
import com.clubhouse.android.ui.profile.reports.ReportIncidentSelectCategoryFragment$buildReportReasonsModels$1$2$2$1$1;
import h0.b0.v;

/* compiled from: lambda */
public final /* synthetic */ class i implements View.OnClickListener {
    public final /* synthetic */ ReportIncidentSelectCategoryFragment c;
    public final /* synthetic */ IncidentCategory d;

    public /* synthetic */ i(ReportIncidentSelectCategoryFragment reportIncidentSelectCategoryFragment, IncidentCategory incidentCategory) {
        this.c = reportIncidentSelectCategoryFragment;
        this.d = incidentCategory;
    }

    public final void onClick(View view) {
        ReportIncidentSelectCategoryFragment reportIncidentSelectCategoryFragment = this.c;
        IncidentCategory incidentCategory = this.d;
        m0.n.b.i.e(reportIncidentSelectCategoryFragment, "this$0");
        m0.n.b.i.e(incidentCategory, "$incidentCategory");
        v.v2(reportIncidentSelectCategoryFragment.O0(), new ReportIncidentSelectCategoryFragment$buildReportReasonsModels$1$2$2$1$1(reportIncidentSelectCategoryFragment, incidentCategory));
    }
}
