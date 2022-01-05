package com.airbnb.mvrx;

import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;

@c(c = "com.airbnb.mvrx.MavericksViewModel$resolveSubscription$flow$1", f = "MavericksViewModel.kt", l = {}, m = "invokeSuspend")
/* compiled from: MavericksViewModel.kt */
public final class MavericksViewModel$resolveSubscription$flow$1 extends SuspendLambda implements p<T, m0.l.c<? super Boolean>, Object> {
    public /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MavericksViewModel$resolveSubscription$flow$1(Object obj, m0.l.c cVar) {
        super(2, cVar);
        this.d = obj;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        m0.n.b.i.e(cVar, "completion");
        MavericksViewModel$resolveSubscription$flow$1 mavericksViewModel$resolveSubscription$flow$1 = new MavericksViewModel$resolveSubscription$flow$1(this.d, cVar);
        mavericksViewModel$resolveSubscription$flow$1.c = obj;
        return mavericksViewModel$resolveSubscription$flow$1;
    }

    public final Object invoke(Object obj, Object obj2) {
        m0.l.c cVar = (m0.l.c) obj2;
        m0.n.b.i.e(cVar, "completion");
        Object obj3 = this.d;
        MavericksViewModel$resolveSubscription$flow$1 mavericksViewModel$resolveSubscription$flow$1 = new MavericksViewModel$resolveSubscription$flow$1(obj3, cVar);
        mavericksViewModel$resolveSubscription$flow$1.c = obj;
        i iVar = i.a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(iVar);
        return Boolean.valueOf(m0.n.b.i.a(mavericksViewModel$resolveSubscription$flow$1.c, obj3));
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        return Boolean.valueOf(m0.n.b.i.a(this.c, this.d));
    }
}
