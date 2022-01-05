package androidx.lifecycle;

import h0.q.v;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import m0.l.c;
import m0.l.e;
import m0.n.b.i;
import m0.r.t.a.r.m.a1.a;
import n0.a.d0;
import n0.a.h2.o;
import n0.a.m0;

/* compiled from: CoroutineLiveData.kt */
public final class LiveDataScopeImpl<T> implements v<T> {
    public final e a;
    public CoroutineLiveData<T> b;

    public LiveDataScopeImpl(CoroutineLiveData<T> coroutineLiveData, e eVar) {
        i.e(coroutineLiveData, "target");
        i.e(eVar, "context");
        this.b = coroutineLiveData;
        d0 d0Var = m0.a;
        this.a = eVar.plus(o.c.T());
    }

    public Object emit(T t, c<? super m0.i> cVar) {
        Object k4 = a.k4(this.a, new LiveDataScopeImpl$emit$2(this, t, (c) null), cVar);
        if (k4 == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return k4;
        }
        return m0.i.a;
    }
}
