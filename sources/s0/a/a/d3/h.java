package s0.a.a.d3;

import java.math.BigInteger;
import m0.r.t.a.r.m.a1.a;
import s0.a.a.b1;
import s0.a.a.f;
import s0.a.a.k;
import s0.a.a.m;
import s0.a.a.o;
import s0.a.a.r;
import s0.a.a.s;
import s0.a.e.b.b0.c.h3;
import s0.a.e.b.e;

public class h extends m implements m {
    public static final BigInteger c = BigInteger.valueOf(1);
    public BigInteger Y1;
    public byte[] Z1;
    public k d;
    public e q;
    public j x;
    public BigInteger y;

    public h(s sVar) {
        if (!(sVar.D(0) instanceof k) || !((k) sVar.D(0)).F(c)) {
            throw new IllegalArgumentException("bad version in X9ECParameters");
        }
        this.y = ((k) sVar.D(4)).E();
        if (sVar.size() == 6) {
            this.Y1 = ((k) sVar.D(5)).E();
        }
        s0.a.a.e D = sVar.D(1);
        g gVar = new g(D instanceof k ? (k) D : D != null ? new k(s.B(D)) : null, this.y, this.Y1, s.B(sVar.D(2)));
        this.q = gVar.c;
        s0.a.a.e D2 = sVar.D(3);
        if (D2 instanceof j) {
            this.x = (j) D2;
        } else {
            this.x = new j(this.q, ((o) D2).c);
        }
        this.Z1 = h3.I(gVar.d);
    }

    public h(e eVar, j jVar, BigInteger bigInteger, BigInteger bigInteger2) {
        this(eVar, jVar, bigInteger, bigInteger2, (byte[]) null);
    }

    public static h t(Object obj) {
        if (obj instanceof h) {
            return (h) obj;
        }
        if (obj != null) {
            return new h(s.B(obj));
        }
        return null;
    }

    public r c() {
        f fVar = new f(6);
        fVar.a(new k(c));
        fVar.a(this.d);
        fVar.a(new g(this.q, this.Z1));
        fVar.a(this.x);
        fVar.a(new k(this.y));
        BigInteger bigInteger = this.Y1;
        if (bigInteger != null) {
            fVar.a(new k(bigInteger));
        }
        return new b1(fVar);
    }

    public s0.a.e.b.h s() {
        return this.x.s();
    }

    public byte[] u() {
        return h3.I(this.Z1);
    }

    public h(e eVar, j jVar, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        k kVar;
        this.q = eVar;
        this.x = jVar;
        this.y = bigInteger;
        this.Y1 = bigInteger2;
        this.Z1 = h3.I(bArr);
        if (a.w2(eVar.a)) {
            kVar = new k(eVar.a.c());
        } else if (a.u2(eVar)) {
            int[] b = ((s0.a.e.c.e) eVar.a).a().b();
            if (b.length == 3) {
                kVar = new k(b[2], b[1], 0, 0);
            } else if (b.length == 5) {
                kVar = new k(b[4], b[1], b[2], b[3]);
            } else {
                throw new IllegalArgumentException("Only trinomial and pentomial curves are supported");
            }
        } else {
            throw new IllegalArgumentException("'curve' is of an unsupported type");
        }
        this.d = kVar;
    }
}
