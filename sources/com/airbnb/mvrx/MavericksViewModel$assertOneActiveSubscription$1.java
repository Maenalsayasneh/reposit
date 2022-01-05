package com.airbnb.mvrx;

import h0.q.p;
import i0.b.b.i0;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.q;
import n0.a.g2.e;

@c(c = "com.airbnb.mvrx.MavericksViewModel$assertOneActiveSubscription$1", f = "MavericksViewModel.kt", l = {}, m = "invokeSuspend")
/* compiled from: MavericksViewModel.kt */
public final class MavericksViewModel$assertOneActiveSubscription$1 extends SuspendLambda implements q<e<? super T>, Throwable, m0.l.c<? super i>, Object> {
    public final /* synthetic */ MavericksViewModel c;
    public final /* synthetic */ i0 d;
    public final /* synthetic */ p q;
    public final /* synthetic */ MavericksViewModel$assertOneActiveSubscription$observer$1 x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MavericksViewModel$assertOneActiveSubscription$1(MavericksViewModel mavericksViewModel, i0 i0Var, p pVar, MavericksViewModel$assertOneActiveSubscription$observer$1 mavericksViewModel$assertOneActiveSubscription$observer$1, m0.l.c cVar) {
        super(3, cVar);
        this.c = mavericksViewModel;
        this.d = i0Var;
        this.q = pVar;
        this.x = mavericksViewModel$assertOneActiveSubscription$observer$1;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Throwable th = (Throwable) obj2;
        m0.l.c cVar = (m0.l.c) obj3;
        m0.n.b.i.e((e) obj, "$this$create");
        m0.n.b.i.e(cVar, "continuation");
        MavericksViewModel$assertOneActiveSubscription$1 mavericksViewModel$assertOneActiveSubscription$1 = new MavericksViewModel$assertOneActiveSubscription$1(this.c, this.d, this.q, this.x, cVar);
        i iVar = i.a;
        mavericksViewModel$assertOneActiveSubscription$1.invokeSuspend(iVar);
        return iVar;
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        this.c.f.remove(this.d.a);
        this.q.getLifecycle().b(this.x);
        return i.a;
    }
}
