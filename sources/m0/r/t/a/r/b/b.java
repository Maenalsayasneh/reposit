package m0.r.t.a.r.b;

import i0.j.f.p.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import m0.n.b.i;
import m0.r.t.a.r.b.g;
import m0.r.t.a.r.g.a;

/* compiled from: CompanionObjectMapping.kt */
public final class b {
    public static final b a = new b();
    public static final Set<a> b;

    static {
        Set<PrimitiveType> set = PrimitiveType.NUMBER_TYPES;
        g gVar = g.a;
        ArrayList arrayList = new ArrayList(h.K(set, 10));
        for (PrimitiveType primitiveType : set) {
            i.e(primitiveType, "primitiveType");
            m0.r.t.a.r.g.b c = g.l.c(primitiveType.getTypeName());
            i.d(c, "BUILT_INS_PACKAGE_FQ_NAME.child(primitiveType.typeName)");
            arrayList.add(c);
        }
        m0.r.t.a.r.g.b i = g.a.g.i();
        i.d(i, "string.toSafe()");
        List a0 = m0.j.g.a0(arrayList, i);
        m0.r.t.a.r.g.b i2 = g.a.i.i();
        i.d(i2, "_boolean.toSafe()");
        List a02 = m0.j.g.a0(a0, i2);
        m0.r.t.a.r.g.b i3 = g.a.r.i();
        i.d(i3, "_enum.toSafe()");
        List a03 = m0.j.g.a0(a02, i3);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = ((ArrayList) a03).iterator();
        while (it.hasNext()) {
            linkedHashSet.add(a.l((m0.r.t.a.r.g.b) it.next()));
        }
        b = linkedHashSet;
    }
}
