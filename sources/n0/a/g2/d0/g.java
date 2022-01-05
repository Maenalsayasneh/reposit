package n0.a.g2.d0;

import m0.l.e;
import m0.n.a.p;
import m0.n.b.f;

/* compiled from: SafeCollector.kt */
public final class g implements e.a {
    public static final a c = new a((f) null);
    public final Throwable d;

    /* compiled from: SafeCollector.kt */
    public static final class a implements e.b<g> {
        public a(f fVar) {
        }
    }

    public g(Throwable th) {
        this.d = th;
    }

    public <R> R fold(R r, p<? super R, ? super e.a, ? extends R> pVar) {
        return e.a.C0242a.a(this, r, pVar);
    }

    public <E extends e.a> E get(e.b<E> bVar) {
        return e.a.C0242a.b(this, bVar);
    }

    public e.b<?> getKey() {
        return c;
    }

    public e minusKey(e.b<?> bVar) {
        return e.a.C0242a.c(this, bVar);
    }

    public e plus(e eVar) {
        return e.a.C0242a.d(this, eVar);
    }
}
