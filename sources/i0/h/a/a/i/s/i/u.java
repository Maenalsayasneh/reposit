package i0.h.a.a.i.s.i;

import l0.a.a;

/* compiled from: SQLiteEventStore_Factory */
public final class u implements a {
    public final a<i0.h.a.a.i.u.a> a;
    public final a<i0.h.a.a.i.u.a> b;
    public final a<d> c;
    public final a<z> d;

    public u(a<i0.h.a.a.i.u.a> aVar, a<i0.h.a.a.i.u.a> aVar2, a<d> aVar3, a<z> aVar4) {
        this.a = aVar;
        this.b = aVar2;
        this.c = aVar3;
        this.d = aVar4;
    }

    public Object get() {
        return new t(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
