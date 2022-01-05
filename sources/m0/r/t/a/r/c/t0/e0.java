package m0.r.t.a.r.c.t0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import m0.n.a.l;
import m0.n.b.i;
import m0.r.t.a.r.c.u;
import m0.r.t.a.r.c.y;
import m0.r.t.a.r.g.b;
import m0.r.t.a.r.g.d;
import m0.r.t.a.r.j.u.c;
import m0.r.t.a.r.j.u.d;
import m0.r.t.a.r.j.u.g;
import m0.r.t.a.r.m.a1.a;

/* compiled from: SubpackagesScope.kt */
public class e0 extends g {
    public final u b;
    public final b c;

    public e0(u uVar, b bVar) {
        i.e(uVar, "moduleDescriptor");
        i.e(bVar, "fqName");
        this.b = uVar;
        this.c = bVar;
    }

    public Set<d> e() {
        return EmptySet.c;
    }

    public Collection<m0.r.t.a.r.c.i> g(m0.r.t.a.r.j.u.d dVar, l<? super d, Boolean> lVar) {
        i.e(dVar, "kindFilter");
        i.e(lVar, "nameFilter");
        d.a aVar = m0.r.t.a.r.j.u.d.a;
        if (!dVar.a(m0.r.t.a.r.j.u.d.f)) {
            return EmptyList.c;
        }
        if (this.c.d() && dVar.t.contains(c.b.a)) {
            return EmptyList.c;
        }
        Collection<b> n = this.b.n(this.c, lVar);
        ArrayList arrayList = new ArrayList(n.size());
        for (b g : n) {
            m0.r.t.a.r.g.d g2 = g.g();
            i.d(g2, "subFqName.shortName()");
            if (lVar.invoke(g2).booleanValue()) {
                i.e(g2, "name");
                y yVar = null;
                if (!g2.d) {
                    u uVar = this.b;
                    b c2 = this.c.c(g2);
                    i.d(c2, "fqName.child(name)");
                    y M = uVar.M(c2);
                    if (!M.isEmpty()) {
                        yVar = M;
                    }
                }
                a.N(arrayList, yVar);
            }
        }
        return arrayList;
    }
}
