package com.airbnb.mvrx;

import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import m0.r.t.a.r.m.a1.a;
import n0.a.f0;

@c(c = "com.airbnb.mvrx.CoroutinesStateStore$setupTriggerFlushQueues$1", f = "CoroutinesStateStore.kt", l = {59}, m = "invokeSuspend")
/* compiled from: CoroutinesStateStore.kt */
public final class CoroutinesStateStore$setupTriggerFlushQueues$1 extends SuspendLambda implements p<f0, m0.l.c<? super i>, Object> {
    public /* synthetic */ Object c;
    public int d;
    public final /* synthetic */ CoroutinesStateStore q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CoroutinesStateStore$setupTriggerFlushQueues$1(CoroutinesStateStore coroutinesStateStore, m0.l.c cVar) {
        super(2, cVar);
        this.q = coroutinesStateStore;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        m0.n.b.i.e(cVar, "completion");
        CoroutinesStateStore$setupTriggerFlushQueues$1 coroutinesStateStore$setupTriggerFlushQueues$1 = new CoroutinesStateStore$setupTriggerFlushQueues$1(this.q, cVar);
        coroutinesStateStore$setupTriggerFlushQueues$1.c = obj;
        return coroutinesStateStore$setupTriggerFlushQueues$1;
    }

    public final Object invoke(Object obj, Object obj2) {
        m0.l.c cVar = (m0.l.c) obj2;
        m0.n.b.i.e(cVar, "completion");
        CoroutinesStateStore$setupTriggerFlushQueues$1 coroutinesStateStore$setupTriggerFlushQueues$1 = new CoroutinesStateStore$setupTriggerFlushQueues$1(this.q, cVar);
        coroutinesStateStore$setupTriggerFlushQueues$1.c = obj;
        return coroutinesStateStore$setupTriggerFlushQueues$1.invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        f0 f0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.d;
        if (i == 0) {
            h.d4(obj);
            f0Var = (f0) this.c;
        } else if (i == 1) {
            f0Var = (f0) this.c;
            h.d4(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        while (a.r2(f0Var)) {
            CoroutinesStateStore coroutinesStateStore = this.q;
            this.c = f0Var;
            this.d = 1;
            if (coroutinesStateStore.d(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return i.a;
    }
}
