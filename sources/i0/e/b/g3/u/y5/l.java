package i0.e.b.g3.u.y5;

import android.view.View;
import com.clubhouse.android.data.models.local.IncidentCategory;
import com.clubhouse.android.ui.profile.reports.ReportIncidentSelectSubCategoryFragment;
import com.clubhouse.android.ui.profile.reports.ReportIncidentSelectSubCategoryFragment$buildReportReasonsModels$1$2$2$1$1;
import h0.b0.v;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class l implements View.OnClickListener {
    public final /* synthetic */ ReportIncidentSelectSubCategoryFragment c;
    public final /* synthetic */ IncidentCategory d;

    public /* synthetic */ l(ReportIncidentSelectSubCategoryFragment reportIncidentSelectSubCategoryFragment, IncidentCategory incidentCategory) {
        this.c = reportIncidentSelectSubCategoryFragment;
        this.d = incidentCategory;
    }

    public final void onClick(View view) {
        ReportIncidentSelectSubCategoryFragment reportIncidentSelectSubCategoryFragment = this.c;
        IncidentCategory incidentCategory = this.d;
        i.e(reportIncidentSelectSubCategoryFragment, "this$0");
        i.e(incidentCategory, "$incidentCategory");
        v.v2(reportIncidentSelectSubCategoryFragment.O0(), new ReportIncidentSelectSubCategoryFragment$buildReportReasonsModels$1$2$2$1$1(reportIncidentSelectSubCategoryFragment, incidentCategory));
    }
}
