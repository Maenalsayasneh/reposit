package m0.r.t.a.r.k.b.w;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.PropertyReference1Impl;
import m0.n.b.i;
import m0.n.b.m;
import m0.r.k;
import m0.r.t.a.r.c.r0.c;
import m0.r.t.a.r.c.r0.f;
import m0.r.t.a.r.g.b;
import m0.r.t.a.r.l.h;
import m0.r.t.a.r.l.l;

/* compiled from: DeserializedAnnotations.kt */
public class a implements f {
    public static final /* synthetic */ k<Object>[] c = {m.c(new PropertyReference1Impl(m.a(a.class), "annotations", "getAnnotations()Ljava/util/List;"))};
    public final h d;

    public a(l lVar, m0.n.a.a<? extends List<? extends c>> aVar) {
        i.e(lVar, "storageManager");
        i.e(aVar, "compute");
        this.d = lVar.d(aVar);
    }

    public c f(b bVar) {
        return i0.j.f.p.h.A0(this, bVar);
    }

    public boolean isEmpty() {
        return ((List) i0.j.f.p.h.K1(this.d, c[0])).isEmpty();
    }

    public Iterator<c> iterator() {
        return ((List) i0.j.f.p.h.K1(this.d, c[0])).iterator();
    }

    public boolean n(b bVar) {
        return i0.j.f.p.h.O1(this, bVar);
    }
}
