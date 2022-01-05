package m0.r.t.a.r.j.p;

import i0.j.f.p.h;
import m0.n.b.i;
import m0.r.t.a.r.b.g;
import m0.r.t.a.r.c.d;
import m0.r.t.a.r.c.u;
import m0.r.t.a.r.m.a0;
import m0.r.t.a.r.m.p;
import m0.r.t.a.r.m.v;

/* compiled from: constantValues.kt */
public final class t extends x<Byte> {
    public t(byte b) {
        super(Byte.valueOf(b));
    }

    public v a(u uVar) {
        i.e(uVar, "module");
        d D0 = h.D0(uVar, g.a.e0);
        a0 q = D0 == null ? null : D0.q();
        if (q != null) {
            return q;
        }
        a0 d = p.d("Unsigned type UByte not found");
        i.d(d, "createErrorType(\"Unsigned type UByte not found\")");
        return d;
    }

    public String toString() {
        return ((Number) this.a).intValue() + ".toUByte()";
    }
}
