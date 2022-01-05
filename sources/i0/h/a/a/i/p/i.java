package i0.h.a.a.i.p;

import android.content.Context;
import l0.a.a;

/* compiled from: CreationContextFactory_Factory */
public final class i implements a {
    public final a<Context> a;
    public final a<i0.h.a.a.i.u.a> b;
    public final a<i0.h.a.a.i.u.a> c;

    public i(a<Context> aVar, a<i0.h.a.a.i.u.a> aVar2, a<i0.h.a.a.i.u.a> aVar3) {
        this.a = aVar;
        this.b = aVar2;
        this.c = aVar3;
    }

    public Object get() {
        return new h(this.a.get(), this.b.get(), this.c.get());
    }
}
