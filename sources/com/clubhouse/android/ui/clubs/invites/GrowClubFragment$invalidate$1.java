package com.clubhouse.android.ui.clubs.invites;

import android.widget.ProgressBar;
import h0.q.q;
import h0.u.w;
import i0.b.b.f;
import i0.e.b.b3.b.e.j;
import i0.e.b.d3.k;
import i0.e.b.g3.l.v1;
import i0.e.b.g3.l.x2.t;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineStart;
import m0.l.c;
import m0.l.e;
import m0.n.a.p;
import m0.n.b.i;
import m0.r.t.a.r.m.a1.a;
import n0.a.f1;

/* compiled from: GrowClubFragment.kt */
public final class GrowClubFragment$invalidate$1 extends Lambda implements p<v1, t, f1> {
    public final /* synthetic */ GrowClubFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GrowClubFragment$invalidate$1(GrowClubFragment growClubFragment) {
        super(2);
        this.c = growClubFragment;
    }

    public Object invoke(Object obj, Object obj2) {
        v1 v1Var = (v1) obj;
        t tVar = (t) obj2;
        i.e(v1Var, "clubState");
        i.e(tVar, "state");
        this.c.d2.requestModelBuild();
        ProgressBar progressBar = this.c.P0().e;
        i.d(progressBar, "binding.loading");
        k.L(progressBar, Boolean.valueOf((v1Var.c instanceof f) || (v1Var.d instanceof f) || (tVar.h instanceof f)));
        if (v1Var.d.a() != null) {
            GrowClubFragment growClubFragment = this.c;
            w<j> wVar = tVar.c;
            if (wVar != null) {
                h0.q.p viewLifecycleOwner = growClubFragment.getViewLifecycleOwner();
                i.d(viewLifecycleOwner, "viewLifecycleOwner");
                a.E2(q.a(viewLifecycleOwner), (e) null, (CoroutineStart) null, new GrowClubFragment$invalidate$1$1$1$1(growClubFragment, wVar, v1Var, tVar, (c<? super GrowClubFragment$invalidate$1$1$1$1>) null), 3, (Object) null);
            }
        }
        w<j> wVar2 = tVar.d;
        if (wVar2 == null) {
            return null;
        }
        GrowClubFragment growClubFragment2 = this.c;
        h0.q.p viewLifecycleOwner2 = growClubFragment2.getViewLifecycleOwner();
        i.d(viewLifecycleOwner2, "viewLifecycleOwner");
        return a.E2(q.a(viewLifecycleOwner2), (e) null, (CoroutineStart) null, new GrowClubFragment$invalidate$1$2$1(growClubFragment2, wVar2, v1Var, tVar, (c<? super GrowClubFragment$invalidate$1$2$1>) null), 3, (Object) null);
    }
}
