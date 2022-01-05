package m0.r.t.a.r.e.a.u.h;

import i0.j.f.p.h;
import java.util.List;
import java.util.Objects;
import kotlin.reflect.jvm.internal.impl.load.java.components.TypeUsage;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeFlexibility;
import kotlin.reflect.jvm.internal.impl.types.StarProjectionImpl;
import m0.j.g;
import m0.n.a.a;
import m0.n.b.i;
import m0.r.t.a.r.c.d;
import m0.r.t.a.r.c.f;
import m0.r.t.a.r.c.m0;
import m0.r.t.a.r.g.b;
import m0.r.t.a.r.m.o0;
import m0.r.t.a.r.m.v;

/* compiled from: JavaTypeResolver.kt */
public final class c {
    public static final b a = new b("java.lang.Class");

    public static final v a(m0 m0Var, m0 m0Var2, a<? extends v> aVar) {
        i.e(m0Var, "<this>");
        i.e(aVar, "defaultValue");
        if (m0Var == m0Var2) {
            return (v) aVar.invoke();
        }
        List<v> upperBounds = m0Var.getUpperBounds();
        i.d(upperBounds, "upperBounds");
        v vVar = (v) g.u(upperBounds);
        if (vVar.I0().c() instanceof d) {
            i.d(vVar, "firstUpperBound");
            return m0.r.t.a.r.m.a1.a.h3(vVar);
        }
        if (m0Var2 != null) {
            m0Var = m0Var2;
        }
        f c = vVar.I0().c();
        Objects.requireNonNull(c, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeParameterDescriptor");
        while (true) {
            m0 m0Var3 = (m0) c;
            if (i.a(m0Var3, m0Var)) {
                return (v) aVar.invoke();
            }
            List<v> upperBounds2 = m0Var3.getUpperBounds();
            i.d(upperBounds2, "current.upperBounds");
            v vVar2 = (v) g.u(upperBounds2);
            if (vVar2.I0().c() instanceof d) {
                i.d(vVar2, "nextUpperBound");
                return m0.r.t.a.r.m.a1.a.h3(vVar2);
            }
            c = vVar2.I0().c();
            Objects.requireNonNull(c, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeParameterDescriptor");
        }
    }

    public static final m0.r.t.a.r.m.m0 b(m0 m0Var, a aVar) {
        i.e(m0Var, "typeParameter");
        i.e(aVar, "attr");
        if (aVar.a == TypeUsage.SUPERTYPE) {
            return new o0(h.W3(m0Var));
        }
        return new StarProjectionImpl(m0Var);
    }

    public static a c(TypeUsage typeUsage, boolean z, m0 m0Var, int i) {
        if ((i & 1) != 0) {
            z = false;
        }
        boolean z2 = z;
        if ((i & 2) != 0) {
            m0Var = null;
        }
        i.e(typeUsage, "<this>");
        return new a(typeUsage, (JavaTypeFlexibility) null, z2, m0Var, 2);
    }
}
