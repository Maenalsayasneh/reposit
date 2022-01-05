package com.clubhouse.backchannel.archive;

import android.widget.ProgressBar;
import android.widget.TextView;
import i0.e.c.b.f;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;
import m0.r.k;

/* compiled from: BackchannelArchiveFragment.kt */
public final class BackchannelArchiveFragment$invalidate$1 extends Lambda implements l<f, i> {
    public final /* synthetic */ BackchannelArchiveFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BackchannelArchiveFragment$invalidate$1(BackchannelArchiveFragment backchannelArchiveFragment) {
        super(1);
        this.c = backchannelArchiveFragment;
    }

    public Object invoke(Object obj) {
        f fVar = (f) obj;
        m0.n.b.i.e(fVar, "state");
        BackchannelArchiveFragment backchannelArchiveFragment = this.c;
        k<Object>[] kVarArr = BackchannelArchiveFragment.Z1;
        ProgressBar progressBar = backchannelArchiveFragment.N0().d;
        m0.n.b.i.d(progressBar, "binding.loading");
        i0.e.b.d3.k.L(progressBar, Boolean.valueOf(fVar.b));
        TextView textView = this.c.N0().c;
        m0.n.b.i.d(textView, "binding.emptyView");
        i0.e.b.d3.k.L(textView, Boolean.valueOf(!fVar.b && fVar.a.isEmpty()));
        this.c.N0().b.g();
        return i.a;
    }
}
