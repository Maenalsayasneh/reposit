package m0.r.t.a.r.j.p;

import i0.j.f.p.h;
import kotlin.Pair;
import m0.r.t.a.r.c.u;
import m0.r.t.a.r.g.a;
import m0.r.t.a.r.g.d;
import m0.r.t.a.r.m.a0;
import m0.r.t.a.r.m.p;
import m0.r.t.a.r.m.v;

/* compiled from: constantValues.kt */
public final class i extends g<Pair<? extends a, ? extends d>> {
    public final a b;
    public final d c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(a aVar, d dVar) {
        super(new Pair(aVar, dVar));
        m0.n.b.i.e(aVar, "enumClassId");
        m0.n.b.i.e(dVar, "enumEntryName");
        this.b = aVar;
        this.c = dVar;
    }

    public v a(u uVar) {
        m0.n.b.i.e(uVar, "module");
        m0.r.t.a.r.c.d D0 = h.D0(uVar, this.b);
        a0 a0Var = null;
        if (D0 != null) {
            if (!m0.r.t.a.r.j.d.q(D0)) {
                D0 = null;
            }
            if (D0 != null) {
                a0Var = D0.q();
            }
        }
        if (a0Var != null) {
            return a0Var;
        }
        StringBuilder P0 = i0.d.a.a.a.P0("Containing class for error-class based enum entry ");
        P0.append(this.b);
        P0.append('.');
        P0.append(this.c);
        a0 d = p.d(P0.toString());
        m0.n.b.i.d(d, "createErrorType(\"Containing class for error-class based enum entry $enumClassId.$enumEntryName\")");
        return d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.b.j());
        sb.append('.');
        sb.append(this.c);
        return sb.toString();
    }
}
