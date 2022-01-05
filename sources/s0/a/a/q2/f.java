package s0.a.a.q2;

import i0.d.a.a.a;
import java.math.BigInteger;
import s0.a.a.b1;
import s0.a.a.k;
import s0.a.a.m;
import s0.a.a.o;
import s0.a.a.r;
import s0.a.a.s;
import s0.a.a.x0;
import s0.a.e.b.b0.c.h3;

public class f extends m {
    public final byte[] c;
    public final BigInteger d;
    public final BigInteger q;
    public final BigInteger x;
    public final BigInteger y;

    public f(s sVar) {
        if (sVar.size() == 4 || sVar.size() == 5) {
            this.c = h3.I(o.B(sVar.D(0)).c);
            this.d = k.B(sVar.D(1)).E();
            this.q = k.B(sVar.D(2)).E();
            this.x = k.B(sVar.D(3)).E();
            this.y = sVar.size() == 5 ? k.B(sVar.D(4)).E() : null;
            return;
        }
        throw new IllegalArgumentException(a.K0(sVar, a.P0("invalid sequence: size = ")));
    }

    public f(byte[] bArr, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
        this.c = h3.I(bArr);
        this.d = bigInteger;
        this.q = bigInteger2;
        this.x = bigInteger3;
        this.y = bigInteger4;
    }

    public static f s(Object obj) {
        if (obj instanceof f) {
            return (f) obj;
        }
        if (obj != null) {
            return new f(s.B(obj));
        }
        return null;
    }

    public r c() {
        s0.a.a.f fVar = new s0.a.a.f(5);
        fVar.a(new x0(this.c));
        fVar.a(new k(this.d));
        fVar.a(new k(this.q));
        fVar.a(new k(this.x));
        BigInteger bigInteger = this.y;
        if (bigInteger != null) {
            fVar.a(new k(bigInteger));
        }
        return new b1(fVar);
    }

    public byte[] t() {
        return h3.I(this.c);
    }

    public f(byte[] bArr, int i, int i2, int i3, int i4) {
        BigInteger valueOf = BigInteger.valueOf((long) i);
        BigInteger valueOf2 = BigInteger.valueOf((long) i2);
        BigInteger valueOf3 = BigInteger.valueOf((long) i3);
        BigInteger valueOf4 = BigInteger.valueOf((long) i4);
        this.c = h3.I(bArr);
        this.d = valueOf;
        this.q = valueOf2;
        this.x = valueOf3;
        this.y = valueOf4;
    }
}
