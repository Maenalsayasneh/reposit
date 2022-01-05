package i0.e.b.g3.u.y5;

import android.view.KeyEvent;
import android.view.View;
import com.clubhouse.android.ui.profile.reports.ReportIncidentThanksFragment;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class p implements View.OnKeyListener {
    public final /* synthetic */ ReportIncidentThanksFragment c;

    public /* synthetic */ p(ReportIncidentThanksFragment reportIncidentThanksFragment) {
        this.c = reportIncidentThanksFragment;
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        ReportIncidentThanksFragment reportIncidentThanksFragment = this.c;
        ReportIncidentThanksFragment.a aVar = ReportIncidentThanksFragment.Z1;
        i.e(reportIncidentThanksFragment, "this$0");
        if (i != 4 || keyEvent.getAction() != 1) {
            return false;
        }
        reportIncidentThanksFragment.P0();
        return true;
    }
}
