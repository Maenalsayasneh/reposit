package kotlin.reflect.jvm.internal.impl.types;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.TypeIntersectionScope;
import m0.j.g;
import m0.n.a.l;
import m0.n.b.i;
import m0.r.t.a.r.c.f;
import m0.r.t.a.r.c.m0;
import m0.r.t.a.r.c.r0.f;
import m0.r.t.a.r.m.a0;
import m0.r.t.a.r.m.j0;
import m0.r.t.a.r.m.u;
import m0.r.t.a.r.m.v;
import m0.r.t.a.r.m.z0.e;

/* compiled from: IntersectionTypeConstructor.kt */
public final class IntersectionTypeConstructor implements j0, e {
    public v a;
    public final LinkedHashSet<v> b;
    public final int c;

    public IntersectionTypeConstructor(Collection<? extends v> collection) {
        i.e(collection, "typesToIntersect");
        collection.isEmpty();
        LinkedHashSet<v> linkedHashSet = new LinkedHashSet<>(collection);
        this.b = linkedHashSet;
        this.c = linkedHashSet.hashCode();
    }

    public Collection<v> b() {
        return this.b;
    }

    public f c() {
        return null;
    }

    public boolean d() {
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IntersectionTypeConstructor)) {
            return false;
        }
        return i.a(this.b, ((IntersectionTypeConstructor) obj).b);
    }

    public final a0 f() {
        KotlinTypeFactory kotlinTypeFactory = KotlinTypeFactory.a;
        Objects.requireNonNull(m0.r.t.a.r.c.r0.f.i);
        return KotlinTypeFactory.i(f.a.b, this, EmptyList.c, false, TypeIntersectionScope.a.a("member scope for intersection type", this.b), new IntersectionTypeConstructor$createType$1(this));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor} */
    /* JADX WARNING: type inference failed for: r0v3 */
    /* JADX WARNING: type inference failed for: r0v6, types: [m0.r.t.a.r.m.v] */
    /* JADX WARNING: type inference failed for: r0v7 */
    /* JADX WARNING: type inference failed for: r0v9 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor a(m0.r.t.a.r.m.x0.e r5) {
        /*
            r4 = this;
            java.lang.String r0 = "kotlinTypeRefiner"
            m0.n.b.i.e(r5, r0)
            java.util.LinkedHashSet<m0.r.t.a.r.m.v> r0 = r4.b
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = i0.j.f.p.h.K(r0, r2)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
            r2 = 0
        L_0x0017:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x002d
            java.lang.Object r2 = r0.next()
            m0.r.t.a.r.m.v r2 = (m0.r.t.a.r.m.v) r2
            m0.r.t.a.r.m.v r2 = r2.K0(r5)
            r3 = 1
            r1.add(r2)
            r2 = r3
            goto L_0x0017
        L_0x002d:
            r0 = 0
            if (r2 != 0) goto L_0x0031
            goto L_0x0052
        L_0x0031:
            m0.r.t.a.r.m.v r2 = r4.a
            if (r2 != 0) goto L_0x0036
            goto L_0x003a
        L_0x0036:
            m0.r.t.a.r.m.v r0 = r2.K0(r5)
        L_0x003a:
            java.lang.String r5 = "typesToIntersect"
            m0.n.b.i.e(r1, r5)
            r1.isEmpty()
            java.util.LinkedHashSet r5 = new java.util.LinkedHashSet
            r5.<init>(r1)
            r5.hashCode()
            kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor r1 = new kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor
            r1.<init>(r5)
            r1.a = r0
            r0 = r1
        L_0x0052:
            if (r0 != 0) goto L_0x0055
            r0 = r4
        L_0x0055:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor.a(m0.r.t.a.r.m.x0.e):kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor");
    }

    public List<m0> getParameters() {
        return EmptyList.c;
    }

    public int hashCode() {
        return this.c;
    }

    public m0.r.t.a.r.b.f m() {
        m0.r.t.a.r.b.f m = ((v) this.b.iterator().next()).I0().m();
        i.d(m, "intersectedTypes.iterator().next().constructor.builtIns");
        return m;
    }

    public String toString() {
        return g.E(g.n0(this.b, new u()), " & ", "{", "}", 0, (CharSequence) null, (l) null, 56);
    }
}
