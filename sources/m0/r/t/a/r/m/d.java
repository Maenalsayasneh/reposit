package m0.r.t.a.r.m;

import m0.r.t.a.r.m.z0.f;
import m0.r.t.a.r.m.z0.g;
import m0.r.t.a.r.m.z0.i;
import m0.r.t.a.r.m.z0.l;

/* compiled from: AbstractStrictEqualityTypeChecker.kt */
public final class d {
    public static final boolean a(l lVar, g gVar, g gVar2) {
        int b;
        if (lVar.b(gVar) == lVar.b(gVar2) && lVar.i(gVar) == lVar.i(gVar2)) {
            if ((lVar.s(gVar) == null) == (lVar.s(gVar2) == null) && lVar.v(lVar.h(gVar), lVar.h(gVar2))) {
                if (!lVar.t(gVar, gVar2) && (b = lVar.b(gVar)) > 0) {
                    int i = 0;
                    while (true) {
                        int i2 = i + 1;
                        i n = lVar.n(gVar, i);
                        i n2 = lVar.n(gVar2, i);
                        if (lVar.f(n) != lVar.f(n2)) {
                            return false;
                        }
                        if (!lVar.f(n) && (lVar.p(n) != lVar.p(n2) || !b(lVar, lVar.u(n), lVar.u(n2)))) {
                            return false;
                        }
                        if (i2 >= b) {
                            break;
                        }
                        i = i2;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static final boolean b(l lVar, f fVar, f fVar2) {
        if (fVar == fVar2) {
            return true;
        }
        g a = lVar.a(fVar);
        g a2 = lVar.a(fVar2);
        if (a != null && a2 != null) {
            return a(lVar, a, a2);
        }
        m0.r.t.a.r.m.z0.d g = lVar.g(fVar);
        m0.r.t.a.r.m.z0.d g2 = lVar.g(fVar2);
        if (g == null || g2 == null) {
            return false;
        }
        if (!a(lVar, lVar.x(g), lVar.x(g2)) || !a(lVar, lVar.m(g), lVar.m(g2))) {
            return false;
        }
        return true;
    }
}
