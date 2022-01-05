package i0.e.b.g3.u.y5;

import android.view.View;
import com.clubhouse.android.ui.profile.reports.ReportIncidentThanksFragment;
import com.clubhouse.app.R;
import i0.e.b.a3.f.e;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class q implements View.OnClickListener {
    public final /* synthetic */ ReportIncidentThanksFragment c;

    public /* synthetic */ q(ReportIncidentThanksFragment reportIncidentThanksFragment) {
        this.c = reportIncidentThanksFragment;
    }

    public final void onClick(View view) {
        ReportIncidentThanksFragment reportIncidentThanksFragment = this.c;
        ReportIncidentThanksFragment.a aVar = ReportIncidentThanksFragment.Z1;
        i.e(reportIncidentThanksFragment, "this$0");
        e.b(reportIncidentThanksFragment, reportIncidentThanksFragment.getString(R.string.clubhouse_contact));
    }
}
