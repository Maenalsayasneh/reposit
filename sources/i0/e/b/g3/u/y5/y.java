package i0.e.b.g3.u.y5;

import android.view.View;
import android.widget.ImageView;
import com.clubhouse.android.ui.profile.reports.ReportProfileLegacyFragment;
import com.clubhouse.android.ui.profile.reports.ReportProfileLegacyFragment$onViewCreated$5$1;
import h0.b.f.m0;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class y implements View.OnClickListener {
    public final /* synthetic */ ReportProfileLegacyFragment c;

    public /* synthetic */ y(ReportProfileLegacyFragment reportProfileLegacyFragment) {
        this.c = reportProfileLegacyFragment;
    }

    public final void onClick(View view) {
        ReportProfileLegacyFragment reportProfileLegacyFragment = this.c;
        ReportProfileLegacyFragment.a aVar = ReportProfileLegacyFragment.Z1;
        i.e(reportProfileLegacyFragment, "this$0");
        ImageView imageView = reportProfileLegacyFragment.N0().b;
        i.d(imageView, "binding.attachedImage");
        ReportProfileLegacyFragment$onViewCreated$5$1 reportProfileLegacyFragment$onViewCreated$5$1 = new ReportProfileLegacyFragment$onViewCreated$5$1(reportProfileLegacyFragment);
        i.e(reportProfileLegacyFragment, "<this>");
        i.e(imageView, "anchor");
        i.e(reportProfileLegacyFragment$onViewCreated$5$1, "f");
        m0 m0Var = new m0(reportProfileLegacyFragment.requireContext(), imageView);
        reportProfileLegacyFragment$onViewCreated$5$1.invoke(m0Var);
        if (!m0Var.d.f()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }
}
