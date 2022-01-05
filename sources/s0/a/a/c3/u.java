package s0.a.a.c3;

import i0.d.a.a.a;
import java.io.IOException;
import s0.a.a.b1;
import s0.a.a.c;
import s0.a.a.e;
import s0.a.a.f;
import s0.a.a.m;
import s0.a.a.n;
import s0.a.a.o;
import s0.a.a.r;
import s0.a.a.s;
import s0.a.a.x0;

public class u extends m {
    public static final n Y1 = a.q1("2.5.29.21");
    public static final n Z1 = new n("2.5.29.27").E();
    public static final n a2 = a.q1("2.5.29.28");
    public static final n b2 = a.q1("2.5.29.29");
    public static final n c = new n("2.5.29.15").E();
    public static final n c2 = a.q1("2.5.29.30");
    public static final n d = new n("2.5.29.17").E();
    public static final n d2 = a.q1("2.5.29.31");
    public static final n e2 = a.q1("2.5.29.32");
    public static final n f2 = a.q1("2.5.29.33");
    public static final n g2 = a.q1("2.5.29.35");
    public static final n h2 = a.q1("2.5.29.36");
    public static final n i2 = a.q1("2.5.29.37");
    public static final n j2 = a.q1("2.5.29.46");
    public static final n k2 = a.q1("2.5.29.54");
    public static final n l2 = a.q1("1.3.6.1.5.5.7.1.1");
    public static final n m2 = a.q1("2.5.29.56");
    public static final n n2 = a.q1("2.5.29.55");
    public static final n q = a.q1("2.5.29.18");
    public static final n x = a.q1("2.5.29.19");
    public static final n y = a.q1("2.5.29.20");
    public n o2;
    public boolean p2;
    public o q2;

    static {
        new n("2.5.29.9").E();
        new n("2.5.29.14").E();
        new n("2.5.29.16").E();
        new n("2.5.29.23").E();
        new n("2.5.29.24").E();
        new n("1.3.6.1.5.5.7.1.11").E();
        new n("1.3.6.1.5.5.7.1.12").E();
        new n("1.3.6.1.5.5.7.1.2").E();
        new n("1.3.6.1.5.5.7.1.3").E();
        new n("1.3.6.1.5.5.7.1.4").E();
        new n("2.5.29.60").E();
    }

    public u(n nVar, boolean z, byte[] bArr) {
        x0 x0Var = new x0(bArr);
        this.o2 = nVar;
        this.p2 = z;
        this.q2 = x0Var;
    }

    public u(s sVar) {
        e eVar;
        if (sVar.size() == 2) {
            this.o2 = n.D(sVar.D(0));
            this.p2 = false;
            eVar = sVar.D(1);
        } else if (sVar.size() == 3) {
            this.o2 = n.D(sVar.D(0));
            this.p2 = c.C(sVar.D(1)).E();
            eVar = sVar.D(2);
        } else {
            throw new IllegalArgumentException(a.K0(sVar, a.P0("Bad sequence size: ")));
        }
        this.q2 = o.B(eVar);
    }

    public r c() {
        f fVar = new f(3);
        fVar.a(this.o2);
        if (this.p2) {
            fVar.a(c.d);
        }
        fVar.a(this.q2);
        return new b1(fVar);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        if (!uVar.o2.w(this.o2) || !uVar.q2.w(this.q2) || uVar.p2 != this.p2) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        if (this.p2) {
            return this.q2.hashCode() ^ this.o2.hashCode();
        }
        return ~(this.q2.hashCode() ^ this.o2.hashCode());
    }

    public e s() {
        try {
            return r.x(this.q2.c);
        } catch (IOException e) {
            throw new IllegalArgumentException("can't convert extension: " + e);
        }
    }
}
