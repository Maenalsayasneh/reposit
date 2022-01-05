package i0.h.a.a.i.s.h;

import android.content.Context;
import i0.h.a.a.i.p.e;
import i0.h.a.a.i.s.i.c;
import java.util.concurrent.Executor;
import l0.a.a;

/* compiled from: Uploader_Factory */
public final class l implements a {
    public final a<Context> a;
    public final a<e> b;
    public final a<c> c;
    public final a<q> d;
    public final a<Executor> e;
    public final a<i0.h.a.a.i.t.a> f;
    public final a<i0.h.a.a.i.u.a> g;

    public l(a<Context> aVar, a<e> aVar2, a<c> aVar3, a<q> aVar4, a<Executor> aVar5, a<i0.h.a.a.i.t.a> aVar6, a<i0.h.a.a.i.u.a> aVar7) {
        this.a = aVar;
        this.b = aVar2;
        this.c = aVar3;
        this.d = aVar4;
        this.e = aVar5;
        this.f = aVar6;
        this.g = aVar7;
    }

    public Object get() {
        return new k(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get());
    }
}
