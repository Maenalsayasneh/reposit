package m0.r.t.a.r.e.a.u;

import m0.n.b.i;
import m0.r.t.a.r.e.a.o;
import m0.r.t.a.r.e.a.u.h.b;

/* compiled from: context.kt */
public final class c {
    public final a a;
    public final f b;
    public final m0.c<o> c;
    public final m0.c d;
    public final b e;

    public c(a aVar, f fVar, m0.c<o> cVar) {
        i.e(aVar, "components");
        i.e(fVar, "typeParameterResolver");
        i.e(cVar, "delegateForDefaultTypeQualifiers");
        this.a = aVar;
        this.b = fVar;
        this.c = cVar;
        this.d = cVar;
        this.e = new b(this, fVar);
    }

    public final o a() {
        return (o) this.d.getValue();
    }
}
