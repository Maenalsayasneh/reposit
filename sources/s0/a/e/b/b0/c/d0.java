package s0.a.e.b.b0.c;

import java.math.BigInteger;
import java.security.SecureRandom;
import s0.a.e.b.a;
import s0.a.e.b.c;
import s0.a.e.b.e;
import s0.a.e.b.g;
import s0.a.e.b.h;
import s0.a.g.k.d;

public class d0 extends e.b {
    public static final BigInteger i = f0.g;
    public static final g[] j = {new f0(c.b)};
    public g0 k = new g0(this, (g) null, (g) null);

    public d0() {
        super(i);
        this.b = new f0(c.a);
        this.c = new f0(BigInteger.valueOf(5));
        this.d = new BigInteger(1, d.b("010000000000000000000000000001DCE8D2EC6184CAF0A971769FB1F7"));
        this.e = BigInteger.valueOf(1);
        this.f = 2;
    }

    public e a() {
        return new d0();
    }

    public a c(h[] hVarArr, int i2, int i3) {
        int[] iArr = new int[(i3 * 7 * 2)];
        int i4 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            h hVar = hVarArr[i2 + i5];
            h3.f0(((f0) hVar.c).i, 0, iArr, i4);
            int i6 = i4 + 7;
            h3.f0(((f0) hVar.d).i, 0, iArr, i6);
            i4 = i6 + 7;
        }
        return new c0(this, i3, iArr);
    }

    public h f(g gVar, g gVar2) {
        return new g0(this, gVar, gVar2);
    }

    public h g(g gVar, g gVar2, g[] gVarArr) {
        return new g0(this, gVar, gVar2, gVarArr);
    }

    public g k(BigInteger bigInteger) {
        return new f0(bigInteger);
    }

    public int l() {
        return i.bitLength();
    }

    public h m() {
        return this.k;
    }

    public g s(SecureRandom secureRandom) {
        int[] iArr = new int[7];
        do {
            byte[] bArr = new byte[28];
            do {
                secureRandom.nextBytes(bArr);
                h3.h2(bArr, 0, iArr, 0, 7);
            } while (h3.f2(7, iArr, e0.a) == 0);
        } while (e0.a(iArr) != 0);
        return new f0(iArr);
    }

    public boolean t(int i2) {
        return i2 == 2;
    }
}
