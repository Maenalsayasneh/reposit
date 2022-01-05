package com.clubhouse.android.ui.clubs.invites;

import i0.e.b.a3.d.b;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import m0.r.k;

@c(c = "com.clubhouse.android.ui.clubs.invites.GrowClubFragment$onViewCreated$4", f = "GrowClubFragment.kt", l = {}, m = "invokeSuspend")
/* compiled from: GrowClubFragment.kt */
public final class GrowClubFragment$onViewCreated$4 extends SuspendLambda implements p<String, m0.l.c<? super i>, Object> {
    public /* synthetic */ Object c;
    public final /* synthetic */ GrowClubFragment d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GrowClubFragment$onViewCreated$4(GrowClubFragment growClubFragment, m0.l.c<? super GrowClubFragment$onViewCreated$4> cVar) {
        super(2, cVar);
        this.d = growClubFragment;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        GrowClubFragment$onViewCreated$4 growClubFragment$onViewCreated$4 = new GrowClubFragment$onViewCreated$4(this.d, cVar);
        growClubFragment$onViewCreated$4.c = obj;
        return growClubFragment$onViewCreated$4;
    }

    public Object invoke(Object obj, Object obj2) {
        GrowClubFragment$onViewCreated$4 growClubFragment$onViewCreated$4 = new GrowClubFragment$onViewCreated$4(this.d, (m0.l.c) obj2);
        growClubFragment$onViewCreated$4.c = (String) obj;
        i iVar = i.a;
        growClubFragment$onViewCreated$4.invokeSuspend(iVar);
        return iVar;
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        GrowClubFragment growClubFragment = this.d;
        k<Object>[] kVarArr = GrowClubFragment.Z1;
        growClubFragment.R0().p(new b((String) this.c));
        return i.a;
    }
}
