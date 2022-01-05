package i0.h.a.a.i.s.i;

import android.content.Context;
import l0.a.a;

/* compiled from: SchemaManager_Factory */
public final class a0 implements a {
    public final a<Context> a;
    public final a<String> b;
    public final a<Integer> c;

    public a0(a<Context> aVar, a<String> aVar2, a<Integer> aVar3) {
        this.a = aVar;
        this.b = aVar2;
        this.c = aVar3;
    }

    public Object get() {
        return new z(this.a.get(), this.b.get(), this.c.get().intValue());
    }
}
