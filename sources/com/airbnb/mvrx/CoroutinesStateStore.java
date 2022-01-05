package com.airbnb.mvrx;

import i0.b.b.j;
import i0.b.b.l;
import i0.b.b.m;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import m0.i;
import m0.l.c;
import m0.l.e;
import m0.r.t.a.r.m.a1.a;
import n0.a.f0;
import n0.a.f1;
import n0.a.f2.d;
import n0.a.g2.p;
import n0.a.g2.r;
import n0.a.g2.u;
import n0.a.w0;
import n0.a.x0;

/* compiled from: CoroutinesStateStore.kt */
public final class CoroutinesStateStore<S extends j> implements l<S> {
    public static final w0 a;
    public final d<m0.n.a.l<S, S>> b = a.d(Integer.MAX_VALUE, (BufferOverflow) null, (m0.n.a.l) null, 6);
    public final d<m0.n.a.l<S, i>> c = a.d(Integer.MAX_VALUE, (BufferOverflow) null, (m0.n.a.l) null, 6);
    public final p<S> d;
    public volatile S e;
    public final n0.a.g2.d<S> f;
    public final f0 g;
    public final e h;

    static {
        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
        m0.n.b.i.d(newCachedThreadPool, "Executors.newCachedThreadPool()");
        a = new x0(newCachedThreadPool);
    }

    public CoroutinesStateStore(S s, f0 f0Var, e eVar) {
        m0.n.b.i.e(s, "initialState");
        m0.n.b.i.e(f0Var, "scope");
        m0.n.b.i.e(eVar, "contextOverride");
        this.g = f0Var;
        this.h = eVar;
        p<S> a2 = u.a(1, 63, BufferOverflow.SUSPEND);
        ((SharedFlowImpl) a2).d(s);
        this.d = a2;
        this.e = s;
        this.f = new r(a2, (f1) null);
        int i = m.a;
        a.E2(f0Var, a.plus(eVar), (CoroutineStart) null, new CoroutinesStateStore$setupTriggerFlushQueues$1(this, (c) null), 2, (Object) null);
    }

    public n0.a.g2.d<S> a() {
        return this.f;
    }

    public void b(m0.n.a.l<? super S, i> lVar) {
        m0.n.b.i.e(lVar, "block");
        this.c.offer(lVar);
        int i = m.a;
    }

    public void c(m0.n.a.l<? super S, ? extends S> lVar) {
        m0.n.b.i.e(lVar, "stateReducer");
        this.b.offer(lVar);
        int i = m.a;
    }

    public final Object d(c<? super i> cVar) {
        n0.a.j2.a aVar = new n0.a.j2.a(cVar);
        try {
            this.b.g().d(aVar, new CoroutinesStateStore$flushQueuesOnce$$inlined$select$lambda$1((c) null, this));
            this.c.g().d(aVar, new CoroutinesStateStore$flushQueuesOnce$$inlined$select$lambda$2((c) null, this));
        } catch (Throwable th) {
            aVar.K(th);
        }
        Object J = aVar.J();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (J == coroutineSingletons) {
            m0.n.b.i.e(cVar, "frame");
        }
        if (J == coroutineSingletons) {
            return J;
        }
        return i.a;
    }

    public Object getState() {
        return this.e;
    }
}
