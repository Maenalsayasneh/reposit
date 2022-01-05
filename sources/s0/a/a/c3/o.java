package s0.a.a.c3;

import java.util.Enumeration;
import s0.a.a.b1;
import s0.a.a.c3.n0;
import s0.a.a.e;
import s0.a.a.f;
import s0.a.a.m;
import s0.a.a.o0;
import s0.a.a.r;
import s0.a.a.s;

public class o extends m {
    public n0 c;
    public b d;
    public o0 q;
    public boolean x = false;
    public int y;

    public o(s sVar) {
        if (sVar.size() == 3) {
            e D = sVar.D(0);
            this.c = D instanceof n0 ? (n0) D : D != null ? new n0(s.B(D)) : null;
            this.d = b.s(sVar.D(1));
            this.q = o0.D(sVar.D(2));
            return;
        }
        throw new IllegalArgumentException("sequence wrong size for CertificateList");
    }

    public static o s(Object obj) {
        if (obj instanceof o) {
            return (o) obj;
        }
        if (obj != null) {
            return new o(s.B(obj));
        }
        return null;
    }

    public r c() {
        f fVar = new f(3);
        fVar.a(this.c);
        fVar.a(this.d);
        fVar.a(this.q);
        return new b1(fVar);
    }

    public int hashCode() {
        if (!this.x) {
            this.y = super.hashCode();
            this.x = true;
        }
        return this.y;
    }

    public Enumeration t() {
        n0 n0Var = this.c;
        s sVar = n0Var.Y1;
        return sVar == null ? new n0.c(n0Var, (n0.a) null) : new n0.d(n0Var, sVar.E());
    }
}
