package m0.r.t.a.r.b;

import i0.j.f.p.h;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.Pair;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.BuiltInAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import m0.n.b.i;
import m0.r.t.a.r.b.g;
import m0.r.t.a.r.c.r0.c;
import m0.r.t.a.r.c.r0.f;
import m0.r.t.a.r.g.b;
import m0.r.t.a.r.g.d;
import m0.r.t.a.r.j.p.s;
import m0.r.t.a.r.m.a0;
import m0.r.t.a.r.m.a1.a;
import m0.r.t.a.r.m.m0;
import m0.r.t.a.r.m.v;

/* compiled from: functionTypes.kt */
public final class e {
    public static final a0 a(f fVar, f fVar2, v vVar, List<? extends v> list, List<d> list2, v vVar2, boolean z) {
        m0 m0Var;
        m0.r.t.a.r.c.d dVar;
        f fVar3;
        d dVar2;
        f fVar4 = fVar;
        f fVar5 = fVar2;
        List<? extends v> list3 = list;
        List<d> list4 = list2;
        v vVar3 = vVar2;
        i.e(fVar4, "builtIns");
        i.e(fVar5, "annotations");
        i.e(list3, "parameterTypes");
        i.e(vVar3, "returnType");
        i.e(list3, "parameterTypes");
        i.e(vVar3, "returnType");
        i.e(fVar4, "builtIns");
        int i = 0;
        ArrayList arrayList = new ArrayList(list.size() + (vVar != null ? 1 : 0) + 1);
        if (vVar == null) {
            m0Var = null;
        } else {
            m0Var = a.Y(vVar);
        }
        a.N(arrayList, m0Var);
        for (T next : list) {
            int i2 = i + 1;
            if (i >= 0) {
                v vVar4 = (v) next;
                if (list4 == null || (dVar2 = list4.get(i)) == null || dVar2.d) {
                    dVar2 = null;
                }
                if (dVar2 != null) {
                    b bVar = g.a.y;
                    d g = d.g("name");
                    String b = dVar2.b();
                    i.d(b, "name.asString()");
                    vVar4 = a.g3(vVar4, f.i.a(m0.j.g.Y(vVar4.getAnnotations(), new BuiltInAnnotationDescriptor(fVar4, bVar, h.S2(new Pair(g, new s(b)))))));
                }
                arrayList.add(a.Y(vVar4));
                i = i2;
            } else {
                m0.j.g.r0();
                throw null;
            }
        }
        arrayList.add(a.Y(vVar2));
        int size = list.size();
        if (vVar != null) {
            size++;
        }
        i.e(fVar4, "builtIns");
        if (z) {
            dVar = fVar4.w(size);
        } else {
            g gVar = g.a;
            dVar = fVar4.k(i.k("Function", Integer.valueOf(size)));
        }
        i.d(dVar, "if (isSuspendFunction) builtIns.getSuspendFunction(parameterCount) else builtIns.getFunction(parameterCount)");
        if (vVar != null) {
            i.e(fVar5, "<this>");
            i.e(fVar4, "builtIns");
            b bVar2 = g.a.x;
            if (!fVar5.n(bVar2)) {
                fVar3 = f.i.a(m0.j.g.Y(fVar5, new BuiltInAnnotationDescriptor(fVar4, bVar2, m0.j.g.o())));
                KotlinTypeFactory kotlinTypeFactory = KotlinTypeFactory.a;
                return KotlinTypeFactory.e(fVar3, dVar, arrayList);
            }
        }
        fVar3 = fVar5;
        KotlinTypeFactory kotlinTypeFactory2 = KotlinTypeFactory.a;
        return KotlinTypeFactory.e(fVar3, dVar, arrayList);
    }

    public static final d b(v vVar) {
        String str;
        i.e(vVar, "<this>");
        c f = vVar.getAnnotations().f(g.a.y);
        if (f == null) {
            return null;
        }
        Object k02 = m0.j.g.k0(f.a().values());
        s sVar = k02 instanceof s ? (s) k02 : null;
        if (sVar == null || (str = (String) sVar.a) == null || !d.i(str)) {
            str = null;
        }
        if (str == null) {
            return null;
        }
        return d.g(str);
    }

    public static final FunctionClassKind c(m0.r.t.a.r.c.i iVar) {
        i.e(iVar, "<this>");
        if (!(iVar instanceof m0.r.t.a.r.c.d) || !f.M(iVar)) {
            return null;
        }
        m0.r.t.a.r.g.c i = DescriptorUtilsKt.i(iVar);
        if (!i.f() || i.e()) {
            return null;
        }
        FunctionClassKind.a aVar = FunctionClassKind.Companion;
        String b = i.h().b();
        i.d(b, "shortName().asString()");
        b e = i.i().e();
        i.d(e, "toSafe().parent()");
        Objects.requireNonNull(aVar);
        i.e(b, "className");
        i.e(e, "packageFqName");
        FunctionClassKind.a.C0236a a = aVar.a(b, e);
        if (a == null) {
            return null;
        }
        return a.a;
    }

    public static final v d(v vVar) {
        i.e(vVar, "<this>");
        g(vVar);
        if (vVar.getAnnotations().f(g.a.x) != null) {
            return ((m0) m0.j.g.u(vVar.H0())).getType();
        }
        return null;
    }

    public static final v e(v vVar) {
        i.e(vVar, "<this>");
        g(vVar);
        v type = ((m0) m0.j.g.G(vVar.H0())).getType();
        i.d(type, "arguments.last().type");
        return type;
    }

    public static final List<m0> f(v vVar) {
        i.e(vVar, "<this>");
        g(vVar);
        List<m0> H0 = vVar.H0();
        i.e(vVar, "<this>");
        int i = 0;
        if (g(vVar)) {
            if (vVar.getAnnotations().f(g.a.x) != null) {
                i = 1;
            }
        }
        return H0.subList(i, H0.size() - 1);
    }

    public static final boolean g(v vVar) {
        Boolean bool;
        i.e(vVar, "<this>");
        m0.r.t.a.r.c.f c = vVar.I0().c();
        if (c == null) {
            bool = null;
        } else {
            i.e(c, "<this>");
            FunctionClassKind c2 = c(c);
            bool = Boolean.valueOf(c2 == FunctionClassKind.Function || c2 == FunctionClassKind.SuspendFunction);
        }
        return i.a(bool, Boolean.TRUE);
    }

    public static final boolean h(v vVar) {
        i.e(vVar, "<this>");
        m0.r.t.a.r.c.f c = vVar.I0().c();
        return (c == null ? null : c(c)) == FunctionClassKind.SuspendFunction;
    }
}
