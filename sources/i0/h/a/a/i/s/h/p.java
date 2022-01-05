package i0.h.a.a.i.s.h;

import i0.h.a.a.i.s.i.c;
import java.util.concurrent.Executor;
import l0.a.a;

/* compiled from: WorkInitializer_Factory */
public final class p implements a {
    public final a<Executor> a;
    public final a<c> b;
    public final a<q> c;
    public final a<i0.h.a.a.i.t.a> d;

    public p(a<Executor> aVar, a<c> aVar2, a<q> aVar3, a<i0.h.a.a.i.t.a> aVar4) {
        this.a = aVar;
        this.b = aVar2;
        this.c = aVar3;
        this.d = aVar4;
    }

    public Object get() {
        return new o(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
