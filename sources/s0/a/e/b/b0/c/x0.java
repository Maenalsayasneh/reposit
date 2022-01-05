package s0.a.e.b.b0.c;

import java.math.BigInteger;
import java.security.SecureRandom;
import s0.a.e.b.a;
import s0.a.e.b.c;
import s0.a.e.b.e;
import s0.a.e.b.g;
import s0.a.e.b.h;
import s0.a.g.k.d;

public class x0 extends e.b {
    public static final BigInteger i = z0.g;
    public static final g[] j = {new z0(c.b)};
    public a1 k = new a1(this, (g) null, (g) null);

    public x0() {
        super(i);
        this.b = new z0(new BigInteger(1, d.b("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFF0000000000000000FFFFFFFC")));
        this.c = new z0(new BigInteger(1, d.b("B3312FA7E23EE7E4988E056BE3F82D19181D9C6EFE8141120314088F5013875AC656398D8A2ED19D2A85C8EDD3EC2AEF")));
        this.d = new BigInteger(1, d.b("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFC7634D81F4372DDF581A0DB248B0A77AECEC196ACCC52973"));
        this.e = BigInteger.valueOf(1);
        this.f = 2;
    }

    public e a() {
        return new x0();
    }

    public a c(h[] hVarArr, int i2, int i3) {
        int[] iArr = new int[(i3 * 12 * 2)];
        int i4 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            h hVar = hVarArr[i2 + i5];
            System.arraycopy(((z0) hVar.c).h, 0, iArr, i4, 12);
            int i6 = i4 + 12;
            System.arraycopy(((z0) hVar.d).h, 0, iArr, i6, 12);
            i4 = i6 + 12;
        }
        return new w0(this, i3, iArr);
    }

    public h f(g gVar, g gVar2) {
        return new a1(this, gVar, gVar2);
    }

    public h g(g gVar, g gVar2, g[] gVarArr) {
        return new a1(this, gVar, gVar2, gVarArr);
    }

    public g k(BigInteger bigInteger) {
        return new z0(bigInteger);
    }

    public int l() {
        return i.bitLength();
    }

    public h m() {
        return this.k;
    }

    public g s(SecureRandom secureRandom) {
        int[] iArr = new int[12];
        do {
            byte[] bArr = new byte[48];
            do {
                secureRandom.nextBytes(bArr);
                h3.h2(bArr, 0, iArr, 0, 12);
            } while (h3.f2(12, iArr, y0.a) == 0);
        } while (y0.c(iArr) != 0);
        return new z0(iArr);
    }

    public boolean t(int i2) {
        return i2 == 2;
    }
}
