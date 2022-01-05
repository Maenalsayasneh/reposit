package m0.l;

import m0.l.e;
import m0.l.e.a;
import m0.n.a.l;
import m0.n.b.i;

/* compiled from: CoroutineContextImpl.kt */
public abstract class b<B extends e.a, E extends B> implements e.b<E> {
    public final e.b<?> c;
    public final l<e.a, E> d;

    public b(e.b<B> bVar, l<? super e.a, ? extends E> lVar) {
        i.e(bVar, "baseKey");
        i.e(lVar, "safeCast");
        this.d = lVar;
        this.c = bVar instanceof b ? ((b) bVar).c : bVar;
    }
}
