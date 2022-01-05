package i0.e.b.g3.u.y5;

import android.view.View;
import com.clubhouse.android.data.models.local.IncidentChannel;
import com.clubhouse.android.ui.profile.reports.ReportIncidentSelectChannelFragment;
import com.clubhouse.android.ui.profile.reports.ReportIncidentSelectChannelFragment$buildChannelsModels$1$2$2$1$1;
import h0.b0.v;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class k implements View.OnClickListener {
    public final /* synthetic */ ReportIncidentSelectChannelFragment c;
    public final /* synthetic */ IncidentChannel d;

    public /* synthetic */ k(ReportIncidentSelectChannelFragment reportIncidentSelectChannelFragment, IncidentChannel incidentChannel) {
        this.c = reportIncidentSelectChannelFragment;
        this.d = incidentChannel;
    }

    public final void onClick(View view) {
        ReportIncidentSelectChannelFragment reportIncidentSelectChannelFragment = this.c;
        IncidentChannel incidentChannel = this.d;
        i.e(reportIncidentSelectChannelFragment, "this$0");
        i.e(incidentChannel, "$incidentChannel");
        v.v2(reportIncidentSelectChannelFragment.O0(), new ReportIncidentSelectChannelFragment$buildChannelsModels$1$2$2$1$1(incidentChannel, reportIncidentSelectChannelFragment));
    }
}
