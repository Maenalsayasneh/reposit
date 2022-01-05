package i0.h.a.a.i.p;

import android.content.Context;
import l0.a.a;

/* compiled from: MetadataBackendRegistry_Factory */
public final class k implements a {
    public final a<Context> a;
    public final a<h> b;

    public k(a<Context> aVar, a<h> aVar2) {
        this.a = aVar;
        this.b = aVar2;
    }

    public Object get() {
        return new j(this.a.get(), this.b.get());
    }
}
