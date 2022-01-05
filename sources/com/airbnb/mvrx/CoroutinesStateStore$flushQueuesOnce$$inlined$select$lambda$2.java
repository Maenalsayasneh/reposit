package com.airbnb.mvrx;

import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;
import m0.n.a.p;

@c(c = "com.airbnb.mvrx.CoroutinesStateStore$flushQueuesOnce$2$2", f = "CoroutinesStateStore.kt", l = {}, m = "invokeSuspend")
/* compiled from: CoroutinesStateStore.kt */
public final class CoroutinesStateStore$flushQueuesOnce$$inlined$select$lambda$2 extends SuspendLambda implements p<l<? super S, ? extends i>, m0.l.c<? super i>, Object> {
    public /* synthetic */ Object c;
    public final /* synthetic */ CoroutinesStateStore d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CoroutinesStateStore$flushQueuesOnce$$inlined$select$lambda$2(m0.l.c cVar, CoroutinesStateStore coroutinesStateStore) {
        super(2, cVar);
        this.d = coroutinesStateStore;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        m0.n.b.i.e(cVar, "completion");
        CoroutinesStateStore$flushQueuesOnce$$inlined$select$lambda$2 coroutinesStateStore$flushQueuesOnce$$inlined$select$lambda$2 = new CoroutinesStateStore$flushQueuesOnce$$inlined$select$lambda$2(cVar, this.d);
        coroutinesStateStore$flushQueuesOnce$$inlined$select$lambda$2.c = obj;
        return coroutinesStateStore$flushQueuesOnce$$inlined$select$lambda$2;
    }

    public final Object invoke(Object obj, Object obj2) {
        m0.l.c cVar = (m0.l.c) obj2;
        m0.n.b.i.e(cVar, "completion");
        CoroutinesStateStore coroutinesStateStore = this.d;
        CoroutinesStateStore$flushQueuesOnce$$inlined$select$lambda$2 coroutinesStateStore$flushQueuesOnce$$inlined$select$lambda$2 = new CoroutinesStateStore$flushQueuesOnce$$inlined$select$lambda$2(cVar, coroutinesStateStore);
        coroutinesStateStore$flushQueuesOnce$$inlined$select$lambda$2.c = obj;
        i iVar = i.a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(iVar);
        ((l) coroutinesStateStore$flushQueuesOnce$$inlined$select$lambda$2.c).invoke(coroutinesStateStore.e);
        return iVar;
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        ((l) this.c).invoke(this.d.e);
        return i.a;
    }
}
