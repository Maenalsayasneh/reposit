package i0.h.a.a.i.s;

import i0.h.a.a.i.p.e;
import i0.h.a.a.i.s.h.q;
import i0.h.a.a.i.s.i.c;
import java.util.concurrent.Executor;
import l0.a.a;

/* compiled from: DefaultScheduler_Factory */
public final class d implements a {
    public final a<Executor> a;
    public final a<e> b;
    public final a<q> c;
    public final a<c> d;
    public final a<i0.h.a.a.i.t.a> e;

    public d(a<Executor> aVar, a<e> aVar2, a<q> aVar3, a<c> aVar4, a<i0.h.a.a.i.t.a> aVar5) {
        this.a = aVar;
        this.b = aVar2;
        this.c = aVar3;
        this.d = aVar4;
        this.e = aVar5;
    }

    public Object get() {
        return new c(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
