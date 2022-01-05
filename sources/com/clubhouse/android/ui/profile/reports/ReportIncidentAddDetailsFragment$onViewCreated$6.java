package com.clubhouse.android.ui.profile.reports;

import android.net.Uri;
import i0.e.b.g3.u.y5.k0;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;
import m0.r.k;

/* compiled from: ReportIncidentAddDetailsFragment.kt */
public final class ReportIncidentAddDetailsFragment$onViewCreated$6 extends Lambda implements l<k0, i> {
    public final /* synthetic */ ReportIncidentAddDetailsFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ReportIncidentAddDetailsFragment$onViewCreated$6(ReportIncidentAddDetailsFragment reportIncidentAddDetailsFragment) {
        super(1);
        this.c = reportIncidentAddDetailsFragment;
    }

    public Object invoke(Object obj) {
        k0 k0Var = (k0) obj;
        m0.n.b.i.e(k0Var, "state");
        ReportIncidentAddDetailsFragment reportIncidentAddDetailsFragment = this.c;
        Uri uri = k0Var.g;
        k<Object>[] kVarArr = ReportIncidentAddDetailsFragment.Z1;
        reportIncidentAddDetailsFragment.P0(uri);
        return i.a;
    }
}
