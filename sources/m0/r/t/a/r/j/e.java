package m0.r.t.a.r.j;

import java.util.List;
import m0.j.g;
import m0.n.b.i;
import m0.r.t.a.r.c.a;
import m0.r.t.a.r.c.c;
import m0.r.t.a.r.c.c0;
import m0.r.t.a.r.c.d;
import m0.r.t.a.r.c.d0;
import m0.r.t.a.r.c.f;
import m0.r.t.a.r.c.o0;
import m0.r.t.a.r.c.p0;
import m0.r.t.a.r.g.b;
import m0.r.t.a.r.m.v;

/* compiled from: inlineClassesUtils.kt */
public final class e {
    public static final /* synthetic */ int a = 0;

    static {
        new b("kotlin.jvm.JvmInline");
    }

    public static final boolean a(a aVar) {
        i.e(aVar, "<this>");
        if (aVar instanceof d0) {
            c0 x0 = ((d0) aVar).x0();
            i.d(x0, "correspondingProperty");
            if (d(x0)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean b(m0.r.t.a.r.c.i iVar) {
        i.e(iVar, "<this>");
        if (iVar instanceof d) {
            d dVar = (d) iVar;
            if (dVar.isInline() || dVar.H()) {
                return true;
            }
        }
        return false;
    }

    public static final boolean c(v vVar) {
        i.e(vVar, "<this>");
        f c = vVar.I0().c();
        if (c == null) {
            return false;
        }
        return b(c);
    }

    public static final boolean d(p0 p0Var) {
        i.e(p0Var, "<this>");
        if (p0Var.l0() != null) {
            return false;
        }
        m0.r.t.a.r.c.i b = p0Var.b();
        i.d(b, "this.containingDeclaration");
        if (!b(b)) {
            return false;
        }
        o0 e = e((d) b);
        return i.a(e == null ? null : e.getName(), p0Var.getName());
    }

    public static final o0 e(d dVar) {
        c P;
        List<o0> h;
        i.e(dVar, "<this>");
        if (!b(dVar) || (P = dVar.P()) == null || (h = P.h()) == null) {
            return null;
        }
        return (o0) g.l0(h);
    }
}
