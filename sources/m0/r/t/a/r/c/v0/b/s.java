package m0.r.t.a.r.c.v0.b;

import java.util.Collection;
import kotlin.collections.EmptyList;
import m0.n.a.l;
import m0.n.b.i;
import m0.r.t.a.r.e.a.w.a;
import m0.r.t.a.r.e.a.w.g;
import m0.r.t.a.r.e.a.w.t;
import m0.r.t.a.r.g.b;
import m0.r.t.a.r.g.d;

/* compiled from: ReflectJavaPackage.kt */
public final class s extends l implements t {
    public final b a;

    public s(b bVar) {
        i.e(bVar, "fqName");
        this.a = bVar;
    }

    public b d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof s) && i.a(this.a, ((s) obj).a);
    }

    public a f(b bVar) {
        i.e(bVar, "fqName");
        return null;
    }

    public Collection getAnnotations() {
        return EmptyList.c;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public boolean m() {
        return false;
    }

    public Collection<g> p(l<? super d, Boolean> lVar) {
        i.e(lVar, "nameFilter");
        return EmptyList.c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        i0.d.a.a.a.p(s.class, sb, ": ");
        sb.append(this.a);
        return sb.toString();
    }

    public Collection<t> y() {
        return EmptyList.c;
    }
}
