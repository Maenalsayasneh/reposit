package i0.e.b.g3.u.y5;

import android.view.View;
import com.clubhouse.android.data.models.local.ReportTarget;
import com.clubhouse.android.data.models.local.channel.Channel;
import com.clubhouse.android.ui.profile.reports.ReportIncidentSelectCategoryArgs;
import com.clubhouse.android.ui.profile.reports.ReportProfileFragment;
import h0.b0.v;
import h0.t.q;
import m0.n.b.i;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class s implements View.OnClickListener {
    public final /* synthetic */ ReportProfileFragment c;

    public /* synthetic */ s(ReportProfileFragment reportProfileFragment) {
        this.c = reportProfileFragment;
    }

    public final void onClick(View view) {
        ReportProfileFragment reportProfileFragment = this.c;
        k<Object>[] kVarArr = ReportProfileFragment.Z1;
        i.e(reportProfileFragment, "this$0");
        ReportIncidentSelectCategoryArgs reportIncidentSelectCategoryArgs = new ReportIncidentSelectCategoryArgs(reportProfileFragment.N0().c, reportProfileFragment.N0().d, (Channel) null, (String) null, (Integer) null, reportProfileFragment.N0().y, ReportTarget.USER_PROFILE, 28);
        i.e(reportIncidentSelectCategoryArgs, "mavericksArg");
        v.a1(reportProfileFragment, new a1(reportIncidentSelectCategoryArgs), (q) null, 2);
    }
}
