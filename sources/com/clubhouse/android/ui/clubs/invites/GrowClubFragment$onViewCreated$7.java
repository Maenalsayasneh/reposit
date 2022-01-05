package com.clubhouse.android.ui.clubs.invites;

import i0.j.f.p.h;
import java.util.Set;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;

@c(c = "com.clubhouse.android.ui.clubs.invites.GrowClubFragment$onViewCreated$7", f = "GrowClubFragment.kt", l = {}, m = "invokeSuspend")
/* compiled from: GrowClubFragment.kt */
public final class GrowClubFragment$onViewCreated$7 extends SuspendLambda implements p<Set<? extends Integer>, m0.l.c<? super i>, Object> {
    public final /* synthetic */ GrowClubFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GrowClubFragment$onViewCreated$7(GrowClubFragment growClubFragment, m0.l.c<? super GrowClubFragment$onViewCreated$7> cVar) {
        super(2, cVar);
        this.c = growClubFragment;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        return new GrowClubFragment$onViewCreated$7(this.c, cVar);
    }

    public Object invoke(Object obj, Object obj2) {
        Set set = (Set) obj;
        GrowClubFragment growClubFragment = this.c;
        new GrowClubFragment$onViewCreated$7(growClubFragment, (m0.l.c) obj2);
        i iVar = i.a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(iVar);
        growClubFragment.d2.requestForcedModelBuild();
        growClubFragment.e2.requestForcedModelBuild();
        return iVar;
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        this.c.d2.requestForcedModelBuild();
        this.c.e2.requestForcedModelBuild();
        return i.a;
    }
}
