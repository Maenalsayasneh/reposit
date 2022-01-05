package com.clubhouse.android.ui.onboarding;

import h0.b0.v;
import h0.t.l;
import h0.t.q;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;

@c(c = "com.clubhouse.android.ui.onboarding.WelcomeRoomFragment$onViewCreated$2", f = "WelcomeRoomFragment.kt", l = {}, m = "invokeSuspend")
/* compiled from: WelcomeRoomFragment.kt */
public final class WelcomeRoomFragment$onViewCreated$2 extends SuspendLambda implements p<l, m0.l.c<? super i>, Object> {
    public /* synthetic */ Object c;
    public final /* synthetic */ WelcomeRoomFragment d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WelcomeRoomFragment$onViewCreated$2(WelcomeRoomFragment welcomeRoomFragment, m0.l.c<? super WelcomeRoomFragment$onViewCreated$2> cVar) {
        super(2, cVar);
        this.d = welcomeRoomFragment;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        WelcomeRoomFragment$onViewCreated$2 welcomeRoomFragment$onViewCreated$2 = new WelcomeRoomFragment$onViewCreated$2(this.d, cVar);
        welcomeRoomFragment$onViewCreated$2.c = obj;
        return welcomeRoomFragment$onViewCreated$2;
    }

    public Object invoke(Object obj, Object obj2) {
        WelcomeRoomFragment welcomeRoomFragment = this.d;
        WelcomeRoomFragment$onViewCreated$2 welcomeRoomFragment$onViewCreated$2 = new WelcomeRoomFragment$onViewCreated$2(welcomeRoomFragment, (m0.l.c) obj2);
        welcomeRoomFragment$onViewCreated$2.c = (l) obj;
        i iVar = i.a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(iVar);
        v.a1(welcomeRoomFragment, (l) welcomeRoomFragment$onViewCreated$2.c, (q) null, 2);
        return iVar;
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        v.a1(this.d, (l) this.c, (q) null, 2);
        return i.a;
    }
}
