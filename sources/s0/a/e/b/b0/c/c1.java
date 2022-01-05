package s0.a.e.b.b0.c;

import androidx.core.app.FrameMetricsAggregator;
import java.math.BigInteger;
import java.security.SecureRandom;
import s0.a.e.b.a;
import s0.a.e.b.c;
import s0.a.e.b.e;
import s0.a.e.b.g;
import s0.a.e.b.h;
import s0.a.g.k.d;

public class c1 extends e.b {
    public static final BigInteger i = e1.g;
    public static final g[] j = {new e1(c.b)};
    public f1 k = new f1(this, (g) null, (g) null);

    public c1() {
        super(i);
        this.b = new e1(new BigInteger(1, d.b("01FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFC")));
        this.c = new e1(new BigInteger(1, d.b("0051953EB9618E1C9A1F929A21A0B68540EEA2DA725B99B315F3B8B489918EF109E156193951EC7E937B1652C0BD3BB1BF073573DF883D2C34F1EF451FD46B503F00")));
        this.d = new BigInteger(1, d.b("01FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFA51868783BF2F966B7FCC0148F709A5D03BB5C9B8899C47AEBB6FB71E91386409"));
        this.e = BigInteger.valueOf(1);
        this.f = 2;
    }

    public e a() {
        return new c1();
    }

    public a c(h[] hVarArr, int i2, int i3) {
        int[] iArr = new int[(i3 * 17 * 2)];
        int i4 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            h hVar = hVarArr[i2 + i5];
            System.arraycopy(((e1) hVar.c).h, 0, iArr, i4, 17);
            int i6 = i4 + 17;
            System.arraycopy(((e1) hVar.d).h, 0, iArr, i6, 17);
            i4 = i6 + 17;
        }
        return new b1(this, i3, iArr);
    }

    public h f(g gVar, g gVar2) {
        return new f1(this, gVar, gVar2);
    }

    public h g(g gVar, g gVar2, g[] gVarArr) {
        return new f1(this, gVar, gVar2, gVarArr);
    }

    public g k(BigInteger bigInteger) {
        return new e1(bigInteger);
    }

    public int l() {
        return i.bitLength();
    }

    public h m() {
        return this.k;
    }

    public g s(SecureRandom secureRandom) {
        int[] iArr = new int[17];
        do {
            byte[] bArr = new byte[68];
            do {
                secureRandom.nextBytes(bArr);
                h3.h2(bArr, 0, iArr, 0, 17);
                iArr[16] = iArr[16] & FrameMetricsAggregator.EVERY_DURATION;
            } while (h3.f2(17, iArr, d1.a) == 0);
        } while (d1.c(iArr) != 0);
        return new e1(iArr);
    }

    public boolean t(int i2) {
        return i2 == 2;
    }
}
