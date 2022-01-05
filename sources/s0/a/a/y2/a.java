package s0.a.a.y2;

import java.math.BigInteger;
import java.util.Enumeration;
import java.util.Objects;
import s0.a.a.b1;
import s0.a.a.e;
import s0.a.a.e1;
import s0.a.a.f;
import s0.a.a.k;
import s0.a.a.m;
import s0.a.a.o;
import s0.a.a.o0;
import s0.a.a.r;
import s0.a.a.s;
import s0.a.a.x0;
import s0.a.a.z;
import s0.a.g.b;

public class a extends m {
    public s c;

    public a(int i, BigInteger bigInteger, o0 o0Var, e eVar) {
        byte[] b = b.b((i + 7) / 8, bigInteger);
        f fVar = new f(4);
        fVar.a(new k(1));
        fVar.a(new x0(b));
        if (eVar != null) {
            fVar.a(new e1(true, 0, eVar));
        }
        if (o0Var != null) {
            fVar.a(new e1(true, 1, o0Var));
        }
        this.c = new b1(fVar);
    }

    public a(s sVar) {
        this.c = sVar;
    }

    public static a s(Object obj) {
        if (obj instanceof a) {
            return (a) obj;
        }
        if (obj != null) {
            return new a(s.B(obj));
        }
        return null;
    }

    public r c() {
        return this.c;
    }

    public BigInteger t() {
        return new BigInteger(1, ((o) this.c.D(1)).c);
    }

    public final r u(int i) {
        Enumeration E = this.c.E();
        while (E.hasMoreElements()) {
            e eVar = (e) E.nextElement();
            if (eVar instanceof z) {
                z zVar = (z) eVar;
                if (zVar.c == i) {
                    r C = zVar.C();
                    Objects.requireNonNull(C);
                    return C;
                }
            }
        }
        return null;
    }

    public o0 v() {
        return (o0) u(1);
    }
}
