package s0.a.a.c3;

import i0.d.a.a.a;
import java.util.Enumeration;
import s0.a.a.b1;
import s0.a.a.e1;
import s0.a.a.f;
import s0.a.a.k;
import s0.a.a.m;
import s0.a.a.o;
import s0.a.a.r;
import s0.a.a.s;
import s0.a.a.z;
import s0.a.g.k.d;

public class i extends m {
    public o c = null;
    public x d = null;
    public k q = null;

    public i(s sVar) {
        Enumeration E = sVar.E();
        while (E.hasMoreElements()) {
            z B = z.B(E.nextElement());
            int i = B.c;
            if (i == 0) {
                this.c = o.C(B, false);
            } else if (i == 1) {
                this.d = new x(s.C(B, false));
            } else if (i == 2) {
                this.q = k.C(B, false);
            } else {
                throw new IllegalArgumentException("illegal tag");
            }
        }
    }

    public static i s(Object obj) {
        if (obj instanceof i) {
            return (i) obj;
        }
        if (obj != null) {
            return new i(s.B(obj));
        }
        return null;
    }

    public r c() {
        f fVar = new f(3);
        o oVar = this.c;
        if (oVar != null) {
            fVar.a(new e1(false, 0, oVar));
        }
        x xVar = this.d;
        if (xVar != null) {
            fVar.a(new e1(false, 1, xVar));
        }
        k kVar = this.q;
        if (kVar != null) {
            fVar.a(new e1(false, 2, kVar));
        }
        return new b1(fVar);
    }

    public String toString() {
        o oVar = this.c;
        return a.o0("AuthorityKeyIdentifier: KeyID(", oVar != null ? d.f(oVar.c) : "null", ")");
    }
}
