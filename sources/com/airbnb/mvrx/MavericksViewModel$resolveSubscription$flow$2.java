package com.airbnb.mvrx;

import i0.b.b.i0;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;

@c(c = "com.airbnb.mvrx.MavericksViewModel$resolveSubscription$flow$2", f = "MavericksViewModel.kt", l = {}, m = "invokeSuspend")
/* compiled from: MavericksViewModel.kt */
public final class MavericksViewModel$resolveSubscription$flow$2 extends SuspendLambda implements p<T, m0.l.c<? super i>, Object> {
    public /* synthetic */ Object c;
    public final /* synthetic */ MavericksViewModel d;
    public final /* synthetic */ DeliveryMode q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MavericksViewModel$resolveSubscription$flow$2(MavericksViewModel mavericksViewModel, DeliveryMode deliveryMode, m0.l.c cVar) {
        super(2, cVar);
        this.d = mavericksViewModel;
        this.q = deliveryMode;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        m0.n.b.i.e(cVar, "completion");
        MavericksViewModel$resolveSubscription$flow$2 mavericksViewModel$resolveSubscription$flow$2 = new MavericksViewModel$resolveSubscription$flow$2(this.d, this.q, cVar);
        mavericksViewModel$resolveSubscription$flow$2.c = obj;
        return mavericksViewModel$resolveSubscription$flow$2;
    }

    public final Object invoke(Object obj, Object obj2) {
        m0.l.c cVar = (m0.l.c) obj2;
        m0.n.b.i.e(cVar, "completion");
        MavericksViewModel$resolveSubscription$flow$2 mavericksViewModel$resolveSubscription$flow$2 = new MavericksViewModel$resolveSubscription$flow$2(this.d, this.q, cVar);
        mavericksViewModel$resolveSubscription$flow$2.c = obj;
        i iVar = i.a;
        mavericksViewModel$resolveSubscription$flow$2.invokeSuspend(iVar);
        return iVar;
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        this.d.e.put(((i0) this.q).a, this.c);
        return i.a;
    }
}
