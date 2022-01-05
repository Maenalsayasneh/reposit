package i0.e.b.g3.u.y5;

import android.view.View;
import com.clubhouse.android.ui.profile.reports.ReportProfileFragment;
import com.clubhouse.app.R;
import i0.e.b.a3.f.e;
import m0.n.b.i;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class u implements View.OnClickListener {
    public final /* synthetic */ ReportProfileFragment c;

    public /* synthetic */ u(ReportProfileFragment reportProfileFragment) {
        this.c = reportProfileFragment;
    }

    public final void onClick(View view) {
        ReportProfileFragment reportProfileFragment = this.c;
        k<Object>[] kVarArr = ReportProfileFragment.Z1;
        i.e(reportProfileFragment, "this$0");
        e.b(reportProfileFragment, reportProfileFragment.getString(R.string.clubhouse_contact));
    }
}
