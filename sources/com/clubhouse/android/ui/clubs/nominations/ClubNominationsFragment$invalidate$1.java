package com.clubhouse.android.ui.clubs.nominations;

import android.widget.Button;
import android.widget.ProgressBar;
import i0.e.b.g3.l.a3.q;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;
import m0.r.k;

/* compiled from: ClubNominationsFragment.kt */
public final class ClubNominationsFragment$invalidate$1 extends Lambda implements l<q, i> {
    public final /* synthetic */ ClubNominationsFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClubNominationsFragment$invalidate$1(ClubNominationsFragment clubNominationsFragment) {
        super(1);
        this.c = clubNominationsFragment;
    }

    public Object invoke(Object obj) {
        q qVar = (q) obj;
        m0.n.b.i.e(qVar, "state");
        ClubNominationsFragment clubNominationsFragment = this.c;
        k<Object>[] kVarArr = ClubNominationsFragment.Z1;
        clubNominationsFragment.N0().e.g();
        ProgressBar progressBar = this.c.N0().d;
        m0.n.b.i.d(progressBar, "binding.loading");
        i0.e.b.d3.k.L(progressBar, Boolean.valueOf(qVar.e));
        Button button = this.c.N0().a;
        m0.n.b.i.d(button, "binding.approveAll");
        i0.e.b.d3.k.L(button, Boolean.valueOf(!qVar.b.isEmpty()));
        Button button2 = this.c.N0().f;
        m0.n.b.i.d(button2, "binding.rejectAll");
        i0.e.b.d3.k.L(button2, Boolean.valueOf(!qVar.b.isEmpty()));
        return i.a;
    }
}
