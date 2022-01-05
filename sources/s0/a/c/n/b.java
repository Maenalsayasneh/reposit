package s0.a.c.n;

import java.math.BigInteger;
import javax.crypto.spec.DHParameterSpec;
import s0.a.b.k0.h;
import s0.a.b.k0.l;

public class b extends DHParameterSpec {
    public final BigInteger a;
    public final BigInteger b;
    public final int c;
    public l d;

    public b(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, int i) {
        super(bigInteger, bigInteger3, i);
        this.a = bigInteger2;
        this.b = bigInteger4;
        this.c = 0;
    }

    public h a() {
        return new h(getP(), getG(), this.a, this.c, getL(), this.b, this.d);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b(s0.a.b.k0.h r7) {
        /*
            r6 = this;
            java.math.BigInteger r0 = r7.d
            java.math.BigInteger r1 = r7.q
            java.math.BigInteger r2 = r7.c
            java.math.BigInteger r3 = r7.x
            int r4 = r7.y
            int r5 = r7.Y1
            r6.<init>(r0, r2, r5)
            r6.a = r1
            r6.b = r3
            r6.c = r4
            s0.a.b.k0.l r7 = r7.Z1
            r6.d = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.a.c.n.b.<init>(s0.a.b.k0.h):void");
    }
}
