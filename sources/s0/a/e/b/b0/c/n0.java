package s0.a.e.b.b0.c;

import java.math.BigInteger;
import java.security.SecureRandom;
import s0.a.e.b.a;
import s0.a.e.b.c;
import s0.a.e.b.e;
import s0.a.e.b.g;
import s0.a.e.b.h;
import s0.a.g.k.d;

public class n0 extends e.b {
    public static final BigInteger i = p0.g;
    public static final g[] j = {new p0(c.b)};
    public q0 k = new q0(this, (g) null, (g) null);

    public n0() {
        super(i);
        this.b = new p0(c.a);
        this.c = new p0(BigInteger.valueOf(7));
        this.d = new BigInteger(1, d.b("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEBAAEDCE6AF48A03BBFD25E8CD0364141"));
        this.e = BigInteger.valueOf(1);
        this.f = 2;
    }

    public e a() {
        return new n0();
    }

    public a c(h[] hVarArr, int i2, int i3) {
        int[] iArr = new int[(i3 * 8 * 2)];
        int i4 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            h hVar = hVarArr[i2 + i5];
            h3.g0(((p0) hVar.c).h, 0, iArr, i4);
            int i6 = i4 + 8;
            h3.g0(((p0) hVar.d).h, 0, iArr, i6);
            i4 = i6 + 8;
        }
        return new m0(this, i3, iArr);
    }

    public h f(g gVar, g gVar2) {
        return new q0(this, gVar, gVar2);
    }

    public h g(g gVar, g gVar2, g[] gVarArr) {
        return new q0(this, gVar, gVar2, gVarArr);
    }

    public g k(BigInteger bigInteger) {
        return new p0(bigInteger);
    }

    public int l() {
        return i.bitLength();
    }

    public h m() {
        return this.k;
    }

    public g s(SecureRandom secureRandom) {
        int[] iArr = new int[8];
        do {
            byte[] bArr = new byte[32];
            do {
                secureRandom.nextBytes(bArr);
                h3.h2(bArr, 0, iArr, 0, 8);
            } while (h3.f2(8, iArr, o0.a) == 0);
        } while (o0.a(iArr) != 0);
        return new p0(iArr);
    }

    public boolean t(int i2) {
        return i2 == 2;
    }
}
