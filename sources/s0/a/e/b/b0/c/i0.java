package s0.a.e.b.b0.c;

import java.math.BigInteger;
import java.security.SecureRandom;
import s0.a.e.b.a;
import s0.a.e.b.c;
import s0.a.e.b.e;
import s0.a.e.b.g;
import s0.a.e.b.h;
import s0.a.g.k.d;

public class i0 extends e.b {
    public static final BigInteger i = k0.g;
    public static final g[] j = {new k0(c.b)};
    public l0 k = new l0(this, (g) null, (g) null);

    public i0() {
        super(i);
        this.b = new k0(new BigInteger(1, d.b("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFE")));
        this.c = new k0(new BigInteger(1, d.b("B4050A850C04B3ABF54132565044B0B7D7BFD8BA270B39432355FFB4")));
        this.d = new BigInteger(1, d.b("FFFFFFFFFFFFFFFFFFFFFFFFFFFF16A2E0B8F03E13DD29455C5C2A3D"));
        this.e = BigInteger.valueOf(1);
        this.f = 2;
    }

    public e a() {
        return new i0();
    }

    public a c(h[] hVarArr, int i2, int i3) {
        int[] iArr = new int[(i3 * 7 * 2)];
        int i4 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            h hVar = hVarArr[i2 + i5];
            h3.f0(((k0) hVar.c).h, 0, iArr, i4);
            int i6 = i4 + 7;
            h3.f0(((k0) hVar.d).h, 0, iArr, i6);
            i4 = i6 + 7;
        }
        return new h0(this, i3, iArr);
    }

    public h f(g gVar, g gVar2) {
        return new l0(this, gVar, gVar2);
    }

    public h g(g gVar, g gVar2, g[] gVarArr) {
        return new l0(this, gVar, gVar2, gVarArr);
    }

    public g k(BigInteger bigInteger) {
        return new k0(bigInteger);
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
            } while (h3.f2(7, iArr, j0.a) == 0);
        } while (j0.d(iArr) != 0);
        return new k0(iArr);
    }

    public boolean t(int i2) {
        return i2 == 2;
    }
}
