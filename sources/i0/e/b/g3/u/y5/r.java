package i0.e.b.g3.u.y5;

import android.view.View;
import com.clubhouse.android.ui.profile.reports.ReportIncidentSelectChannelArgs;
import com.clubhouse.android.ui.profile.reports.ReportProfileFragment;
import h0.b0.v;
import h0.t.q;
import m0.n.b.i;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class r implements View.OnClickListener {
    public final /* synthetic */ ReportProfileFragment c;

    public /* synthetic */ r(ReportProfileFragment reportProfileFragment) {
        this.c = reportProfileFragment;
    }

    public final void onClick(View view) {
        ReportProfileFragment reportProfileFragment = this.c;
        k<Object>[] kVarArr = ReportProfileFragment.Z1;
        i.e(reportProfileFragment, "this$0");
        ReportIncidentSelectChannelArgs reportIncidentSelectChannelArgs = new ReportIncidentSelectChannelArgs(reportProfileFragment.N0().c, reportProfileFragment.N0().y);
        i.e(reportIncidentSelectChannelArgs, "mavericksArg");
        v.a1(reportProfileFragment, new b1(reportIncidentSelectChannelArgs), (q) null, 2);
    }
}
