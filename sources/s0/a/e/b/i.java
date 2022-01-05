package s0.a.e.b;

import java.math.BigInteger;
import m0.r.t.a.r.m.a1.a;
import s0.a.e.b.b0.c.h3;

public class i extends b {
    public h b(h hVar, BigInteger bigInteger) {
        e eVar = hVar.b;
        int J1 = a.J1(eVar);
        if (bigInteger.bitLength() <= J1) {
            j V2 = a.V2(hVar);
            a aVar = V2.b;
            int i = V2.c;
            int i2 = ((J1 + i) - 1) / i;
            h m = eVar.m();
            int i3 = i * i2;
            int[] P0 = h3.P0(i3, bigInteger);
            int i4 = i3 - 1;
            for (int i5 = 0; i5 < i2; i5++) {
                int i6 = 0;
                for (int i7 = i4 - i5; i7 >= 0; i7 -= i2) {
                    int i8 = P0[i7 >>> 5] >>> (i7 & 31);
                    i6 = ((i6 ^ (i8 >>> 1)) << 1) ^ i8;
                }
                m = m.A(aVar.b(i6));
            }
            return m.a(V2.a);
        }
        throw new IllegalStateException("fixed-point comb doesn't support scalars larger than the curve order");
    }
}
