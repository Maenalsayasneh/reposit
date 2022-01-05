package s0.a.e.b.b0.c;

import java.math.BigInteger;
import java.security.SecureRandom;
import s0.a.e.b.a;
import s0.a.e.b.c;
import s0.a.e.b.e;
import s0.a.e.b.g;
import s0.a.e.b.h;
import s0.a.g.k.d;

public class t extends e.b {
    public static final BigInteger i = v.g;
    public static final g[] j = {new v(c.b)};
    public w k = new w(this, (g) null, (g) null);

    public t() {
        super(i);
        this.b = new v(c.a);
        this.c = new v(BigInteger.valueOf(3));
        this.d = new BigInteger(1, d.b("FFFFFFFFFFFFFFFFFFFFFFFE26F2FC170F69466A74DEFD8D"));
        this.e = BigInteger.valueOf(1);
        this.f = 2;
    }

    public e a() {
        return new t();
    }

    public a c(h[] hVarArr, int i2, int i3) {
        int[] iArr = new int[(i3 * 6 * 2)];
        int i4 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            h hVar = hVarArr[i2 + i5];
            h3.e0(((v) hVar.c).h, 0, iArr, i4);
            int i6 = i4 + 6;
            h3.e0(((v) hVar.d).h, 0, iArr, i6);
            i4 = i6 + 6;
        }
        return new s(this, i3, iArr);
    }

    public h f(g gVar, g gVar2) {
        return new w(this, gVar, gVar2);
    }

    public h g(g gVar, g gVar2, g[] gVarArr) {
        return new w(this, gVar, gVar2, gVarArr);
    }

    public g k(BigInteger bigInteger) {
        return new v(bigInteger);
    }

    public int l() {
        return i.bitLength();
    }

    public h m() {
        return this.k;
    }

    public g s(SecureRandom secureRandom) {
        int[] iArr = new int[6];
        do {
            byte[] bArr = new byte[24];
            do {
                secureRandom.nextBytes(bArr);
                h3.h2(bArr, 0, iArr, 0, 6);
            } while (h3.f2(6, iArr, u.a) == 0);
        } while (u.a(iArr) != 0);
        return new v(iArr);
    }

    public boolean t(int i2) {
        return i2 == 2;
    }
}
