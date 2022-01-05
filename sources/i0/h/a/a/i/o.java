package i0.h.a.a.i;

import i0.h.a.a.i.s.e;
import i0.h.a.a.i.s.h.k;
import l0.a.a;

/* compiled from: TransportRuntime_Factory */
public final class o implements a {
    public final a<i0.h.a.a.i.u.a> a;
    public final a<i0.h.a.a.i.u.a> b;
    public final a<e> c;
    public final a<k> d;
    public final a<i0.h.a.a.i.s.h.o> e;

    public o(a<i0.h.a.a.i.u.a> aVar, a<i0.h.a.a.i.u.a> aVar2, a<e> aVar3, a<k> aVar4, a<i0.h.a.a.i.s.h.o> aVar5) {
        this.a = aVar;
        this.b = aVar2;
        this.c = aVar3;
        this.d = aVar4;
        this.e = aVar5;
    }

    public Object get() {
        return new m(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
