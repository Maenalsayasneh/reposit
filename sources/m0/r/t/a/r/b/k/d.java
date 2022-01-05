package m0.r.t.a.r.b.k;

import java.util.HashMap;
import java.util.Objects;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import m0.n.b.i;
import m0.r.t.a.r.b.f;
import m0.r.t.a.r.g.a;
import m0.r.t.a.r.g.b;
import m0.r.t.a.r.g.c;

/* compiled from: JavaToKotlinClassMapper.kt */
public final class d {
    public static final d a = new d();

    public static m0.r.t.a.r.c.d d(d dVar, b bVar, f fVar, Integer num, int i) {
        int i2 = i & 4;
        Objects.requireNonNull(dVar);
        i.e(bVar, "fqName");
        i.e(fVar, "builtIns");
        a g = c.a.g(bVar);
        if (g != null) {
            return fVar.j(g.b());
        }
        return null;
    }

    public final m0.r.t.a.r.c.d a(m0.r.t.a.r.c.d dVar) {
        i.e(dVar, "readOnly");
        c g = m0.r.t.a.r.j.d.g(dVar);
        c cVar = c.a;
        b bVar = c.l.get(g);
        if (bVar != null) {
            m0.r.t.a.r.c.d j = DescriptorUtilsKt.f(dVar).j(bVar);
            i.d(j, "descriptor.builtIns.getBuiltInClassByFqName(oppositeClassFqName)");
            return j;
        }
        throw new IllegalArgumentException("Given class " + dVar + " is not a " + "read-only" + " collection");
    }

    public final boolean b(m0.r.t.a.r.c.d dVar) {
        i.e(dVar, "mutable");
        c cVar = c.a;
        c g = m0.r.t.a.r.j.d.g(dVar);
        HashMap<c, b> hashMap = c.k;
        Objects.requireNonNull(hashMap, "null cannot be cast to non-null type kotlin.collections.Map<K, *>");
        return hashMap.containsKey(g);
    }

    public final boolean c(m0.r.t.a.r.c.d dVar) {
        i.e(dVar, "readOnly");
        c cVar = c.a;
        c g = m0.r.t.a.r.j.d.g(dVar);
        HashMap<c, b> hashMap = c.l;
        Objects.requireNonNull(hashMap, "null cannot be cast to non-null type kotlin.collections.Map<K, *>");
        return hashMap.containsKey(g);
    }
}
