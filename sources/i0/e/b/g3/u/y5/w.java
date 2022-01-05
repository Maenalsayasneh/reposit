package i0.e.b.g3.u.y5;

import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.FrameLayout;
import com.clubhouse.android.data.models.local.user.ReportReason;
import com.clubhouse.android.ui.profile.reports.ReportProfileLegacyFragment;
import h0.b0.v;
import i0.e.b.d3.k;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class w implements View.OnClickListener {
    public final /* synthetic */ ReportProfileLegacyFragment c;
    public final /* synthetic */ ArrayAdapter d;

    public /* synthetic */ w(ReportProfileLegacyFragment reportProfileLegacyFragment, ArrayAdapter arrayAdapter) {
        this.c = reportProfileLegacyFragment;
        this.d = arrayAdapter;
    }

    public final void onClick(View view) {
        ReportReason reportReason;
        ReportProfileLegacyFragment reportProfileLegacyFragment = this.c;
        ArrayAdapter arrayAdapter = this.d;
        ReportProfileLegacyFragment.a aVar = ReportProfileLegacyFragment.Z1;
        i.e(reportProfileLegacyFragment, "this$0");
        i.e(arrayAdapter, "$spinnerAdapter");
        FrameLayout frameLayout = reportProfileLegacyFragment.N0().j;
        i.d(frameLayout, "binding.loading");
        k.K(frameLayout);
        String str = (String) arrayAdapter.getItem(reportProfileLegacyFragment.N0().l.getSelectedItemPosition());
        ReportReason[] values = ReportReason.values();
        int i = 0;
        while (true) {
            if (i >= 19) {
                reportReason = null;
                break;
            }
            reportReason = values[i];
            if (i.a(reportProfileLegacyFragment.getString(reportReason.getDisplayName()), str)) {
                break;
            }
            i++;
        }
        v.V1(reportProfileLegacyFragment, ReportProfileLegacyFragment.b2, Boolean.TRUE);
        reportProfileLegacyFragment.O0().p(new h0(reportReason, reportProfileLegacyFragment.N0().i.getText().toString(), reportProfileLegacyFragment.N0().h.getText().toString()));
    }
}
