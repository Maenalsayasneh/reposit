package com.clubhouse.android.ui.profile.reports;

import com.clubhouse.android.data.models.local.IncidentChannel;
import com.clubhouse.android.data.models.local.ReportTarget;
import com.clubhouse.android.data.models.local.channel.Channel;
import h0.b0.v;
import h0.t.q;
import i0.e.b.g3.u.y5.r0;
import i0.e.b.g3.u.y5.t0;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: ReportIncidentSelectChannelFragment.kt */
public final class ReportIncidentSelectChannelFragment$buildChannelsModels$1$2$2$1$1 extends Lambda implements l<t0, i> {
    public final /* synthetic */ IncidentChannel c;
    public final /* synthetic */ ReportIncidentSelectChannelFragment d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReportIncidentSelectChannelFragment$buildChannelsModels$1$2$2$1$1(IncidentChannel incidentChannel, ReportIncidentSelectChannelFragment reportIncidentSelectChannelFragment) {
        super(1);
        this.c = incidentChannel;
        this.d = reportIncidentSelectChannelFragment;
    }

    public Object invoke(Object obj) {
        ReportTarget reportTarget;
        t0 t0Var = (t0) obj;
        m0.n.b.i.e(t0Var, "state");
        String str = this.c.d;
        if (str == null) {
            reportTarget = ReportTarget.UNKNOWN;
        } else {
            reportTarget = ReportTarget.USER_SPOKEN;
        }
        ReportTarget reportTarget2 = reportTarget;
        ReportIncidentSelectChannelFragment reportIncidentSelectChannelFragment = this.d;
        ReportIncidentSelectCategoryArgs reportIncidentSelectCategoryArgs = new ReportIncidentSelectCategoryArgs(t0Var.a, str, (Channel) null, (String) null, (Integer) null, t0Var.d, reportTarget2, 28);
        m0.n.b.i.e(reportIncidentSelectCategoryArgs, "mavericksArg");
        v.a1(reportIncidentSelectChannelFragment, new r0(reportIncidentSelectCategoryArgs), (q) null, 2);
        return i.a;
    }
}
