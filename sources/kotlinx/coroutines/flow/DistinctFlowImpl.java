package kotlinx.coroutines.flow;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$ObjectRef;
import m0.i;
import m0.l.c;
import m0.n.a.l;
import m0.n.a.p;
import n0.a.g2.d;
import n0.a.g2.d0.n;
import n0.a.g2.e;

/* compiled from: Distinct.kt */
public final class DistinctFlowImpl<T> implements d<T> {
    public final d<T> c;
    public final l<T, Object> d;
    public final p<Object, Object, Boolean> q;

    public DistinctFlowImpl(d<? extends T> dVar, l<? super T, ? extends Object> lVar, p<Object, Object, Boolean> pVar) {
        this.c = dVar;
        this.d = lVar;
        this.q = pVar;
    }

    public Object collect(e<? super T> eVar, c<? super i> cVar) {
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.c = n.a;
        Object collect = this.c.collect(new DistinctFlowImpl$collect$$inlined$collect$1(this, ref$ObjectRef, eVar), cVar);
        if (collect == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return collect;
        }
        return i.a;
    }
}
