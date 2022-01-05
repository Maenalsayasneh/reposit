package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.internal.ThreadContextKt;
import m0.i;
import m0.l.c;
import m0.n.a.p;
import m0.r.t.a.r.m.a1.a;
import n0.a.g2.e;

/* compiled from: ChannelFlow.kt */
public final class UndispatchedContextCollector<T> implements e<T> {
    public final m0.l.e c;
    public final Object d;
    public final p<T, c<? super i>, Object> q;

    public UndispatchedContextCollector(e<? super T> eVar, m0.l.e eVar2) {
        this.c = eVar2;
        this.d = ThreadContextKt.b(eVar2);
        this.q = new UndispatchedContextCollector$emitRef$1(eVar, (c<? super UndispatchedContextCollector$emitRef$1>) null);
    }

    public Object emit(T t, c<? super i> cVar) {
        Object l4 = a.l4(this.c, t, this.d, this.q, cVar);
        if (l4 == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return l4;
        }
        return i.a;
    }
}
