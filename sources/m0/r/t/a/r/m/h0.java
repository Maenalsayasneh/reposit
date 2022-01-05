package m0.r.t.a.r.m;

import i0.j.f.p.h;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import m0.j.g;
import m0.n.b.f;
import m0.n.b.i;
import m0.r.t.a.r.c.l0;
import m0.r.t.a.r.c.m0;

/* compiled from: TypeAliasExpansion.kt */
public final class h0 {
    public final h0 a;
    public final l0 b;
    public final List<m0> c;
    public final Map<m0, m0> d;

    public h0(h0 h0Var, l0 l0Var, List list, Map map, f fVar) {
        this.a = h0Var;
        this.b = l0Var;
        this.c = list;
        this.d = map;
    }

    public static final h0 a(h0 h0Var, l0 l0Var, List<? extends m0> list) {
        i.e(l0Var, "typeAliasDescriptor");
        i.e(list, "arguments");
        List<m0> parameters = l0Var.i().getParameters();
        i.d(parameters, "typeAliasDescriptor.typeConstructor.parameters");
        ArrayList arrayList = new ArrayList(h.K(parameters, 10));
        for (m0 a2 : parameters) {
            arrayList.add(a2.a());
        }
        return new h0(h0Var, l0Var, list, g.w0(g.F0(arrayList, list)), (f) null);
    }

    public final boolean b(l0 l0Var) {
        i.e(l0Var, "descriptor");
        if (!i.a(this.b, l0Var)) {
            h0 h0Var = this.a;
            return h0Var == null ? false : h0Var.b(l0Var);
        }
    }
}
