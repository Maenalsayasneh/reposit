package s0.a.e.b.b0.c;

import java.math.BigInteger;
import java.security.SecureRandom;
import s0.a.e.b.a;
import s0.a.e.b.c;
import s0.a.e.b.e;
import s0.a.e.b.g;
import s0.a.e.b.h;
import s0.a.g.k.d;

public class s0 extends e.b {
    public static final BigInteger i = u0.g;
    public static final g[] j = {new u0(c.b)};
    public v0 k = new v0(this, (g) null, (g) null);

    public s0() {
        super(i);
        this.b = new u0(new BigInteger(1, d.b("FFFFFFFF00000001000000000000000000000000FFFFFFFFFFFFFFFFFFFFFFFC")));
        this.c = new u0(new BigInteger(1, d.b("5AC635D8AA3A93E7B3EBBD55769886BC651D06B0CC53B0F63BCE3C3E27D2604B")));
        this.d = new BigInteger(1, d.b("FFFFFFFF00000000FFFFFFFFFFFFFFFFBCE6FAADA7179E84F3B9CAC2FC632551"));
        this.e = BigInteger.valueOf(1);
        this.f = 2;
    }

    public e a() {
        return new s0();
    }

    public a c(h[] hVarArr, int i2, int i3) {
        int[] iArr = new int[(i3 * 8 * 2)];
        int i4 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            h hVar = hVarArr[i2 + i5];
            h3.g0(((u0) hVar.c).h, 0, iArr, i4);
            int i6 = i4 + 8;
            h3.g0(((u0) hVar.d).h, 0, iArr, i6);
            i4 = i6 + 8;
        }
        return new r0(this, i3, iArr);
    }

    public h f(g gVar, g gVar2) {
        return new v0(this, gVar, gVar2);
    }

    public h g(g gVar, g gVar2, g[] gVarArr) {
        return new v0(this, gVar, gVar2, gVarArr);
    }

    public g k(BigInteger bigInteger) {
        return new u0(bigInteger);
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
            } while (h3.f2(8, iArr, t0.a) == 0);
        } while (t0.c(iArr) != 0);
        return new u0(iArr);
    }

    public boolean t(int i2) {
        return i2 == 2;
    }
}
