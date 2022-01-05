package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import i0.j.f.p.h;
import java.util.ArrayList;
import java.util.Collection;
import m0.j.g;
import m0.n.a.l;
import m0.n.b.f;
import m0.n.b.i;
import m0.r.t.a.r.c.c0;
import m0.r.t.a.r.c.g0;
import m0.r.t.a.r.g.d;
import m0.r.t.a.r.j.u.b;
import m0.r.t.a.r.m.v;

/* compiled from: TypeIntersectionScope.kt */
public final class TypeIntersectionScope extends m0.r.t.a.r.j.u.a {
    public final MemberScope b;

    /* compiled from: TypeIntersectionScope.kt */
    public static final class a {
        public static final MemberScope a(String str, Collection<? extends v> collection) {
            i.e(str, InstabugDbContract.BugEntry.COLUMN_MESSAGE);
            i.e(collection, "types");
            ArrayList arrayList = new ArrayList(h.K(collection, 10));
            for (v o : collection) {
                arrayList.add(o.o());
            }
            m0.r.t.a.r.o.i<MemberScope> G2 = m0.r.t.a.r.m.a1.a.G2(arrayList);
            MemberScope i = b.i(str, G2);
            if (G2.c <= 1) {
                return i;
            }
            return new TypeIntersectionScope(str, i, (f) null);
        }
    }

    public TypeIntersectionScope(String str, MemberScope memberScope, f fVar) {
        this.b = memberScope;
    }

    public Collection<g0> a(d dVar, m0.r.t.a.r.d.a.b bVar) {
        i.e(dVar, "name");
        i.e(bVar, "location");
        return h.M3(super.a(dVar, bVar), TypeIntersectionScope$getContributedFunctions$1.c);
    }

    public Collection<c0> c(d dVar, m0.r.t.a.r.d.a.b bVar) {
        i.e(dVar, "name");
        i.e(bVar, "location");
        return h.M3(super.c(dVar, bVar), TypeIntersectionScope$getContributedVariables$1.c);
    }

    public Collection<m0.r.t.a.r.c.i> g(m0.r.t.a.r.j.u.d dVar, l<? super d, Boolean> lVar) {
        i.e(dVar, "kindFilter");
        i.e(lVar, "nameFilter");
        Collection<m0.r.t.a.r.c.i> g = super.g(dVar, lVar);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (T next : g) {
            if (((m0.r.t.a.r.c.i) next) instanceof m0.r.t.a.r.c.a) {
                arrayList.add(next);
            } else {
                arrayList2.add(next);
            }
        }
        return g.Z(h.M3(arrayList, TypeIntersectionScope$getContributedDescriptors$2.c), arrayList2);
    }

    public MemberScope i() {
        return this.b;
    }
}
