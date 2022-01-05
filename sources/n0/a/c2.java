package n0.a;

import m0.l.e;
import m0.n.a.p;

/* compiled from: CoroutineContext.kt */
public final class c2 implements e.a, e.b<c2> {
    public static final c2 c = new c2();

    public <R> R fold(R r, p<? super R, ? super e.a, ? extends R> pVar) {
        return e.a.C0242a.a(this, r, pVar);
    }

    public <E extends e.a> E get(e.b<E> bVar) {
        return e.a.C0242a.b(this, bVar);
    }

    public e.b<?> getKey() {
        return this;
    }

    public e minusKey(e.b<?> bVar) {
        return e.a.C0242a.c(this, bVar);
    }

    public e plus(e eVar) {
        return e.a.C0242a.d(this, eVar);
    }
}
