package com.clubhouse.android.ui.clubs.invites;

import h0.b0.v;
import i0.e.b.a3.b.b;
import i0.e.b.a3.b.d;
import i0.e.b.a3.f.j;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;
import m0.n.a.p;

@c(c = "com.clubhouse.android.ui.clubs.invites.GrowClubFragment$onViewCreated$5", f = "GrowClubFragment.kt", l = {}, m = "invokeSuspend")
/* compiled from: GrowClubFragment.kt */
public final class GrowClubFragment$onViewCreated$5 extends SuspendLambda implements p<b, m0.l.c<? super i>, Object> {
    public /* synthetic */ Object c;
    public final /* synthetic */ GrowClubFragment d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GrowClubFragment$onViewCreated$5(GrowClubFragment growClubFragment, m0.l.c<? super GrowClubFragment$onViewCreated$5> cVar) {
        super(2, cVar);
        this.d = growClubFragment;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        GrowClubFragment$onViewCreated$5 growClubFragment$onViewCreated$5 = new GrowClubFragment$onViewCreated$5(this.d, cVar);
        growClubFragment$onViewCreated$5.c = obj;
        return growClubFragment$onViewCreated$5;
    }

    public Object invoke(Object obj, Object obj2) {
        GrowClubFragment$onViewCreated$5 growClubFragment$onViewCreated$5 = new GrowClubFragment$onViewCreated$5(this.d, (m0.l.c) obj2);
        growClubFragment$onViewCreated$5.c = (b) obj;
        i iVar = i.a;
        growClubFragment$onViewCreated$5.invokeSuspend(iVar);
        return iVar;
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        final b bVar = (b) this.c;
        if (bVar instanceof d) {
            v.f2(this.d, new l<j, i>() {
                public Object invoke(Object obj) {
                    j jVar = (j) obj;
                    m0.n.b.i.e(jVar, "$this$showNegativeBanner");
                    jVar.e(((d) bVar).a);
                    return i.a;
                }
            });
        }
        return i.a;
    }
}
