package s0.a.a.w2;

import java.math.BigInteger;
import java.util.Enumeration;
import s0.a.a.b1;
import s0.a.a.f;
import s0.a.a.k;
import s0.a.a.m;
import s0.a.a.r;

public class s extends m {
    public BigInteger Y1;
    public BigInteger Z1;
    public BigInteger a2;
    public BigInteger b2;
    public BigInteger c;
    public s0.a.a.s c2;
    public BigInteger d;
    public BigInteger q;
    public BigInteger x;
    public BigInteger y;

    public s(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger bigInteger5, BigInteger bigInteger6, BigInteger bigInteger7, BigInteger bigInteger8) {
        this.c2 = null;
        this.c = BigInteger.valueOf(0);
        this.d = bigInteger;
        this.q = bigInteger2;
        this.x = bigInteger3;
        this.y = bigInteger4;
        this.Y1 = bigInteger5;
        this.Z1 = bigInteger6;
        this.a2 = bigInteger7;
        this.b2 = bigInteger8;
    }

    public s(s0.a.a.s sVar) {
        this.c2 = null;
        Enumeration E = sVar.E();
        k kVar = (k) E.nextElement();
        int I = kVar.I();
        if (I < 0 || I > 1) {
            throw new IllegalArgumentException("wrong version for RSA private key");
        }
        this.c = kVar.E();
        this.d = ((k) E.nextElement()).E();
        this.q = ((k) E.nextElement()).E();
        this.x = ((k) E.nextElement()).E();
        this.y = ((k) E.nextElement()).E();
        this.Y1 = ((k) E.nextElement()).E();
        this.Z1 = ((k) E.nextElement()).E();
        this.a2 = ((k) E.nextElement()).E();
        this.b2 = ((k) E.nextElement()).E();
        if (E.hasMoreElements()) {
            this.c2 = (s0.a.a.s) E.nextElement();
        }
    }

    public static s s(Object obj) {
        if (obj instanceof s) {
            return (s) obj;
        }
        if (obj != null) {
            return new s(s0.a.a.s.B(obj));
        }
        return null;
    }

    public r c() {
        f fVar = new f(10);
        fVar.a(new k(this.c));
        fVar.a(new k(this.d));
        fVar.a(new k(this.q));
        fVar.a(new k(this.x));
        fVar.a(new k(this.y));
        fVar.a(new k(this.Y1));
        fVar.a(new k(this.Z1));
        fVar.a(new k(this.a2));
        fVar.a(new k(this.b2));
        s0.a.a.s sVar = this.c2;
        if (sVar != null) {
            fVar.a(sVar);
        }
        return new b1(fVar);
    }
}
