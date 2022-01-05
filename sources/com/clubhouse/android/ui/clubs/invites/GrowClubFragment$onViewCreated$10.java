package com.clubhouse.android.ui.clubs.invites;

import android.widget.ProgressBar;
import android.widget.TextView;
import h0.b0.v;
import i0.e.b.g3.l.x2.t;
import i0.e.b.g3.m.f.d;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.text.StringsKt__IndentKt;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;
import m0.n.a.p;
import m0.r.k;

@c(c = "com.clubhouse.android.ui.clubs.invites.GrowClubFragment$onViewCreated$10", f = "GrowClubFragment.kt", l = {}, m = "invokeSuspend")
/* compiled from: GrowClubFragment.kt */
public final class GrowClubFragment$onViewCreated$10 extends SuspendLambda implements p<d, m0.l.c<? super i>, Object> {
    public /* synthetic */ Object c;
    public final /* synthetic */ GrowClubFragment d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GrowClubFragment$onViewCreated$10(GrowClubFragment growClubFragment, m0.l.c<? super GrowClubFragment$onViewCreated$10> cVar) {
        super(2, cVar);
        this.d = growClubFragment;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        GrowClubFragment$onViewCreated$10 growClubFragment$onViewCreated$10 = new GrowClubFragment$onViewCreated$10(this.d, cVar);
        growClubFragment$onViewCreated$10.c = obj;
        return growClubFragment$onViewCreated$10;
    }

    public Object invoke(Object obj, Object obj2) {
        GrowClubFragment$onViewCreated$10 growClubFragment$onViewCreated$10 = new GrowClubFragment$onViewCreated$10(this.d, (m0.l.c) obj2);
        growClubFragment$onViewCreated$10.c = (d) obj;
        i iVar = i.a;
        growClubFragment$onViewCreated$10.invokeSuspend(iVar);
        return iVar;
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        final d dVar = (d) this.c;
        GrowClubFragment growClubFragment = this.d;
        k<Object>[] kVarArr = GrowClubFragment.Z1;
        GrowClubViewModel R0 = growClubFragment.R0();
        final GrowClubFragment growClubFragment2 = this.d;
        v.v2(R0, new l<t, i>() {
            public Object invoke(Object obj) {
                t tVar = (t) obj;
                m0.n.b.i.e(tVar, "it");
                GrowClubFragment growClubFragment = growClubFragment2;
                k<Object>[] kVarArr = GrowClubFragment.Z1;
                TextView textView = growClubFragment.P0().c;
                m0.n.b.i.d(textView, "binding.empty");
                boolean z = true;
                if (!(dVar instanceof d.a) || !(!StringsKt__IndentKt.o(tVar.g))) {
                    z = false;
                }
                i0.e.b.d3.k.L(textView, Boolean.valueOf(z));
                ProgressBar progressBar = growClubFragment2.P0().e;
                m0.n.b.i.d(progressBar, "binding.loading");
                i0.e.b.d3.k.L(progressBar, Boolean.valueOf(dVar instanceof d.C0203d));
                return i.a;
            }
        });
        return i.a;
    }
}
