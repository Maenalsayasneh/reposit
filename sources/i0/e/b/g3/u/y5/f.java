package i0.e.b.g3.u.y5;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import com.clubhouse.android.ui.profile.reports.ReportIncidentAddDetailsFragment;
import com.clubhouse.android.ui.profile.reports.ReportIncidentAddDetailsFragment$onViewCreated$3$1;
import h0.b0.v;
import m0.n.b.i;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class f implements View.OnClickListener {
    public final /* synthetic */ ReportIncidentAddDetailsFragment c;

    public /* synthetic */ f(ReportIncidentAddDetailsFragment reportIncidentAddDetailsFragment) {
        this.c = reportIncidentAddDetailsFragment;
    }

    public final void onClick(View view) {
        ReportIncidentAddDetailsFragment reportIncidentAddDetailsFragment = this.c;
        k<Object>[] kVarArr = ReportIncidentAddDetailsFragment.Z1;
        i.e(reportIncidentAddDetailsFragment, "this$0");
        ScrollView scrollView = reportIncidentAddDetailsFragment.N0().e;
        i.d(scrollView, "binding.contentContainer");
        i0.e.b.d3.k.p(scrollView);
        FrameLayout frameLayout = reportIncidentAddDetailsFragment.N0().f;
        i.d(frameLayout, "binding.loading");
        i0.e.b.d3.k.K(frameLayout);
        v.x0(reportIncidentAddDetailsFragment);
        v.v2(reportIncidentAddDetailsFragment.O0(), new ReportIncidentAddDetailsFragment$onViewCreated$3$1(reportIncidentAddDetailsFragment));
    }
}
