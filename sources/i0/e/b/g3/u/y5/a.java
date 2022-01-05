package i0.e.b.g3.u.y5;

import android.view.View;
import android.widget.FrameLayout;
import com.clubhouse.android.ui.profile.reports.ReportIncidentAddDetailsFragment;
import com.clubhouse.android.ui.profile.reports.ReportIncidentAddDetailsFragment$onViewCreated$4$1;
import h0.b.f.m0;
import m0.n.b.i;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class a implements View.OnClickListener {
    public final /* synthetic */ ReportIncidentAddDetailsFragment c;

    public /* synthetic */ a(ReportIncidentAddDetailsFragment reportIncidentAddDetailsFragment) {
        this.c = reportIncidentAddDetailsFragment;
    }

    public final void onClick(View view) {
        ReportIncidentAddDetailsFragment reportIncidentAddDetailsFragment = this.c;
        k<Object>[] kVarArr = ReportIncidentAddDetailsFragment.Z1;
        i.e(reportIncidentAddDetailsFragment, "this$0");
        FrameLayout frameLayout = reportIncidentAddDetailsFragment.N0().k;
        i.d(frameLayout, "binding.screenshotContainer");
        ReportIncidentAddDetailsFragment$onViewCreated$4$1 reportIncidentAddDetailsFragment$onViewCreated$4$1 = new ReportIncidentAddDetailsFragment$onViewCreated$4$1(reportIncidentAddDetailsFragment);
        i.e(reportIncidentAddDetailsFragment, "<this>");
        i.e(frameLayout, "anchor");
        i.e(reportIncidentAddDetailsFragment$onViewCreated$4$1, "f");
        m0 m0Var = new m0(reportIncidentAddDetailsFragment.requireContext(), frameLayout);
        reportIncidentAddDetailsFragment$onViewCreated$4$1.invoke(m0Var);
        if (!m0Var.d.f()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }
}
