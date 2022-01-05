package com.airbnb.mvrx;

import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import m0.r.t.a.r.m.a1.a;
import n0.a.f0;
import n0.a.g2.d;

@c(c = "com.airbnb.mvrx.MavericksViewModel$resolveSubscription$1", f = "MavericksViewModel.kt", l = {438, 439}, m = "invokeSuspend")
/* compiled from: MavericksViewModel.kt */
public final class MavericksViewModel$resolveSubscription$1 extends SuspendLambda implements p<f0, m0.l.c<? super i>, Object> {
    public int c;
    public final /* synthetic */ d d;
    public final /* synthetic */ p q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MavericksViewModel$resolveSubscription$1(d dVar, p pVar, m0.l.c cVar) {
        super(2, cVar);
        this.d = dVar;
        this.q = pVar;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        m0.n.b.i.e(cVar, "completion");
        return new MavericksViewModel$resolveSubscription$1(this.d, this.q, cVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        m0.l.c cVar = (m0.l.c) obj2;
        m0.n.b.i.e(cVar, "completion");
        return new MavericksViewModel$resolveSubscription$1(this.d, this.q, cVar).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            this.c = 1;
            if (n0.a.i.c(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            h.d4(obj);
        } else if (i == 2) {
            h.d4(obj);
            return i.a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        d dVar = this.d;
        p pVar = this.q;
        this.c = 2;
        if (a.E0(dVar, pVar, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return i.a;
    }
}
