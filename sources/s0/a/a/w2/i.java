package s0.a.a.w2;

import java.math.BigInteger;
import s0.a.a.b1;
import s0.a.a.c3.r;
import s0.a.a.e;
import s0.a.a.f;
import s0.a.a.k;
import s0.a.a.m;
import s0.a.a.o;
import s0.a.a.s;
import s0.a.a.x0;
import s0.a.e.b.b0.c.h3;

public class i extends m {
    public static final BigInteger c = BigInteger.valueOf(1);
    public r d;
    public byte[] q;
    public BigInteger x;

    public i(r rVar, byte[] bArr, int i) {
        this.d = rVar;
        this.q = h3.I(bArr);
        this.x = BigInteger.valueOf((long) i);
    }

    public i(s sVar) {
        e D = sVar.D(0);
        this.d = D instanceof r ? (r) D : D != null ? new r(s.B(D)) : null;
        this.q = h3.I(o.B(sVar.D(1)).c);
        this.x = sVar.size() == 3 ? k.B(sVar.D(2)).E() : c;
    }

    public s0.a.a.r c() {
        f fVar = new f(3);
        fVar.a(this.d);
        fVar.a(new x0(this.q));
        if (!this.x.equals(c)) {
            fVar.a(new k(this.x));
        }
        return new b1(fVar);
    }
}
