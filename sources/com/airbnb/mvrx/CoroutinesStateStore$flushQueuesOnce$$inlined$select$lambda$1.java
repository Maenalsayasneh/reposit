package com.airbnb.mvrx;

import i0.b.b.j;
import i0.j.f.p.h;
import java.util.Objects;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;
import m0.n.a.p;

@c(c = "com.airbnb.mvrx.CoroutinesStateStore$flushQueuesOnce$2$1", f = "CoroutinesStateStore.kt", l = {87}, m = "invokeSuspend")
/* compiled from: CoroutinesStateStore.kt */
public final class CoroutinesStateStore$flushQueuesOnce$$inlined$select$lambda$1 extends SuspendLambda implements p<l<? super S, ? extends S>, m0.l.c<? super i>, Object> {
    public /* synthetic */ Object c;
    public int d;
    public final /* synthetic */ CoroutinesStateStore q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CoroutinesStateStore$flushQueuesOnce$$inlined$select$lambda$1(m0.l.c cVar, CoroutinesStateStore coroutinesStateStore) {
        super(2, cVar);
        this.q = coroutinesStateStore;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        m0.n.b.i.e(cVar, "completion");
        CoroutinesStateStore$flushQueuesOnce$$inlined$select$lambda$1 coroutinesStateStore$flushQueuesOnce$$inlined$select$lambda$1 = new CoroutinesStateStore$flushQueuesOnce$$inlined$select$lambda$1(cVar, this.q);
        coroutinesStateStore$flushQueuesOnce$$inlined$select$lambda$1.c = obj;
        return coroutinesStateStore$flushQueuesOnce$$inlined$select$lambda$1;
    }

    public final Object invoke(Object obj, Object obj2) {
        m0.l.c cVar = (m0.l.c) obj2;
        m0.n.b.i.e(cVar, "completion");
        CoroutinesStateStore$flushQueuesOnce$$inlined$select$lambda$1 coroutinesStateStore$flushQueuesOnce$$inlined$select$lambda$1 = new CoroutinesStateStore$flushQueuesOnce$$inlined$select$lambda$1(cVar, this.q);
        coroutinesStateStore$flushQueuesOnce$$inlined$select$lambda$1.c = obj;
        return coroutinesStateStore$flushQueuesOnce$$inlined$select$lambda$1.invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.d;
        if (i == 0) {
            h.d4(obj);
            S s = (j) ((l) this.c).invoke(this.q.e);
            if (!m0.n.b.i.a(s, this.q.e)) {
                CoroutinesStateStore coroutinesStateStore = this.q;
                Objects.requireNonNull(coroutinesStateStore);
                m0.n.b.i.e(s, "<set-?>");
                coroutinesStateStore.e = s;
                n0.a.g2.p<S> pVar = this.q.d;
                this.d = 1;
                if (pVar.emit(s, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else if (i == 1) {
            h.d4(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return i.a;
    }
}
