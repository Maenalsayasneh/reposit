package m0.r.t.a.r.m;

import i0.j.f.p.h;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor;
import m0.n.b.i;

/* compiled from: SpecialTypes.kt */
public final class d0 {
    public static final v0 a(v0 v0Var, boolean z) {
        i.e(v0Var, "<this>");
        i U0 = i.U0(v0Var, z);
        if (U0 != null) {
            return U0;
        }
        a0 c = c(v0Var);
        return c == null ? v0Var.M0(false) : c;
    }

    public static /* synthetic */ v0 b(v0 v0Var, boolean z, int i) {
        if ((i & 1) != 0) {
            z = false;
        }
        return a(v0Var, z);
    }

    public static final a0 c(v vVar) {
        IntersectionTypeConstructor intersectionTypeConstructor;
        j0 I0 = vVar.I0();
        IntersectionTypeConstructor intersectionTypeConstructor2 = I0 instanceof IntersectionTypeConstructor ? (IntersectionTypeConstructor) I0 : null;
        if (intersectionTypeConstructor2 == null) {
            return null;
        }
        LinkedHashSet<v> linkedHashSet = intersectionTypeConstructor2.b;
        ArrayList arrayList = new ArrayList(h.K(linkedHashSet, 10));
        boolean z = false;
        for (v next : linkedHashSet) {
            if (s0.g(next)) {
                next = b(next.L0(), false, 1);
                z = true;
            }
            arrayList.add(next);
        }
        if (!z) {
            intersectionTypeConstructor = null;
        } else {
            v vVar2 = intersectionTypeConstructor2.a;
            if (vVar2 == null) {
                vVar2 = null;
            } else if (s0.g(vVar2)) {
                vVar2 = b(vVar2.L0(), false, 1);
            }
            i.e(arrayList, "typesToIntersect");
            arrayList.isEmpty();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet(arrayList);
            linkedHashSet2.hashCode();
            intersectionTypeConstructor = new IntersectionTypeConstructor(linkedHashSet2);
            intersectionTypeConstructor.a = vVar2;
        }
        if (intersectionTypeConstructor == null) {
            return null;
        }
        return intersectionTypeConstructor.f();
    }

    public static final a0 d(a0 a0Var, boolean z) {
        i.e(a0Var, "<this>");
        i U0 = i.U0(a0Var, z);
        if (U0 != null) {
            return U0;
        }
        a0 c = c(a0Var);
        return c == null ? a0Var.M0(false) : c;
    }

    public static final a0 e(a0 a0Var, a0 a0Var2) {
        i.e(a0Var, "<this>");
        i.e(a0Var2, "abbreviatedType");
        if (h.h2(a0Var)) {
            return a0Var;
        }
        return new a(a0Var, a0Var2);
    }
}
