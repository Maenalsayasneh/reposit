package com.clubhouse.android.ui.profile.reports;

import com.clubhouse.android.data.models.local.IncidentChannel;
import i0.b.a.o;
import i0.e.b.g3.u.y5.h1.e;
import i0.e.b.g3.u.y5.h1.h;
import i0.e.b.g3.u.y5.k;
import i0.e.b.g3.u.y5.t0;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: ReportIncidentSelectChannelFragment.kt */
public final class ReportIncidentSelectChannelFragment$buildChannelsModels$1 extends Lambda implements l<t0, i> {
    public final /* synthetic */ o c;
    public final /* synthetic */ ReportIncidentSelectChannelFragment d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReportIncidentSelectChannelFragment$buildChannelsModels$1(o oVar, ReportIncidentSelectChannelFragment reportIncidentSelectChannelFragment) {
        super(1);
        this.c = oVar;
        this.d = reportIncidentSelectChannelFragment;
    }

    public Object invoke(Object obj) {
        t0 t0Var = (t0) obj;
        m0.n.b.i.e(t0Var, "state");
        if (t0Var.b.isEmpty()) {
            o oVar = this.c;
            h hVar = new h();
            hVar.I("reportReasonLoading");
            oVar.add(hVar);
        } else {
            boolean z = true;
            List<IncidentChannel> list = t0Var.b;
            o oVar2 = this.c;
            ReportIncidentSelectChannelFragment reportIncidentSelectChannelFragment = this.d;
            for (IncidentChannel incidentChannel : list) {
                if (!z) {
                    e eVar = new e();
                    eVar.I(m0.n.b.i.k("divider", incidentChannel.d));
                    oVar2.add(eVar);
                }
                i0.e.b.g3.u.y5.h1.i iVar = new i0.e.b.g3.u.y5.h1.i();
                iVar.J(incidentChannel.d);
                iVar.K(incidentChannel.c);
                iVar.L(new k(reportIncidentSelectChannelFragment, incidentChannel));
                oVar2.add(iVar);
                z = false;
            }
        }
        return i.a;
    }
}
