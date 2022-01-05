package com.clubhouse.android.ui.profile.reports;

import com.clubhouse.android.data.models.local.IncidentCategory;
import com.clubhouse.android.data.models.local.channel.Channel;
import com.clubhouse.android.user.model.User;
import i0.e.b.g3.u.y5.f0;
import i0.e.b.g3.u.y5.k0;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.j.g;
import m0.n.a.l;

/* compiled from: ReportIncidentAddDetailsFragment.kt */
public final class ReportIncidentAddDetailsFragment$onViewCreated$3$1 extends Lambda implements l<k0, i> {
    public final /* synthetic */ ReportIncidentAddDetailsFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReportIncidentAddDetailsFragment$onViewCreated$3$1(ReportIncidentAddDetailsFragment reportIncidentAddDetailsFragment) {
        super(1);
        this.c = reportIncidentAddDetailsFragment;
    }

    public Object invoke(Object obj) {
        Integer num;
        k0 k0Var = (k0) obj;
        m0.n.b.i.e(k0Var, "state");
        ReportIncidentAddDetailsViewModel O0 = this.c.O0();
        String str = ((IncidentCategory) g.G(k0Var.b)).d;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        String obj2 = this.c.N0().a.getText().toString();
        String str3 = k0Var.c;
        Channel channel = k0Var.d;
        String str4 = k0Var.e;
        Integer num2 = k0Var.f;
        User user = k0Var.a;
        if (user == null) {
            num = null;
        } else {
            num = user.getId();
        }
        O0.p(new f0(str2, obj2, str3, channel, (Integer) null, str4, num2, num, k0Var.h.getTarget()));
        return i.a;
    }
}
