package i0.e.b.g3.u.y5;

import android.net.Uri;
import com.clubhouse.android.ui.profile.reports.ReportIncidentAddDetailsFragment;
import h0.a.f.a;
import m0.n.b.i;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class c implements a {
    public final /* synthetic */ ReportIncidentAddDetailsFragment a;

    public /* synthetic */ c(ReportIncidentAddDetailsFragment reportIncidentAddDetailsFragment) {
        this.a = reportIncidentAddDetailsFragment;
    }

    public final void onActivityResult(Object obj) {
        ReportIncidentAddDetailsFragment reportIncidentAddDetailsFragment = this.a;
        Uri uri = (Uri) obj;
        k<Object>[] kVarArr = ReportIncidentAddDetailsFragment.Z1;
        i.e(reportIncidentAddDetailsFragment, "this$0");
        if (uri != null) {
            reportIncidentAddDetailsFragment.P0(uri);
            reportIncidentAddDetailsFragment.O0().p(new d0(uri));
        }
    }
}
