package i0.e.b.g3.u.y5;

import android.view.View;
import com.clubhouse.android.ui.profile.reports.ReportIncidentSelectCategoryContainerViewModel;
import com.clubhouse.android.ui.profile.reports.ReportIncidentSelectCategoryFragment;
import h0.b0.v;
import m0.n.b.i;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class h implements View.OnClickListener {
    public final /* synthetic */ ReportIncidentSelectCategoryFragment c;

    public /* synthetic */ h(ReportIncidentSelectCategoryFragment reportIncidentSelectCategoryFragment) {
        this.c = reportIncidentSelectCategoryFragment;
    }

    public final void onClick(View view) {
        ReportIncidentSelectCategoryFragment reportIncidentSelectCategoryFragment = this.c;
        k<Object>[] kVarArr = ReportIncidentSelectCategoryFragment.Z1;
        i.e(reportIncidentSelectCategoryFragment, "this$0");
        v.c1(reportIncidentSelectCategoryFragment);
        ((ReportIncidentSelectCategoryContainerViewModel) reportIncidentSelectCategoryFragment.c2.getValue()).p(e0.a);
    }
}
