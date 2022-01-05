package s0.a.e.b.b0.c;

import java.math.BigInteger;
import java.security.SecureRandom;
import s0.a.e.b.a;
import s0.a.e.b.c;
import s0.a.e.b.e;
import s0.a.e.b.g;
import s0.a.e.b.h;
import s0.a.g.k.d;

public class j extends e.b {
    public static final BigInteger i = l.g;
    public static final g[] j = {new l(c.b)};
    public m k = new m(this, (g) null, (g) null);

    public j() {
        super(i);
        this.b = new l(new BigInteger(1, d.b("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF7FFFFFFC")));
        this.c = new l(new BigInteger(1, d.b("1C97BEFC54BD7A8B65ACF89F81D4D4ADC565FA45")));
        this.d = new BigInteger(1, d.b("0100000000000000000001F4C8F927AED3CA752257"));
        this.e = BigInteger.valueOf(1);
        this.f = 2;
    }

    public e a() {
        return new j();
    }

    public a c(h[] hVarArr, int i2, int i3) {
        int[] iArr = new int[(i3 * 5 * 2)];
        int i4 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            h hVar = hVarArr[i2 + i5];
            h3.d0(((l) hVar.c).h, 0, iArr, i4);
            int i6 = i4 + 5;
            h3.d0(((l) hVar.d).h, 0, iArr, i6);
            i4 = i6 + 5;
        }
        return new i(this, i3, iArr);
    }

    public h f(g gVar, g gVar2) {
        return new m(this, gVar, gVar2);
    }

    public h g(g gVar, g gVar2, g[] gVarArr) {
        return new m(this, gVar, gVar2, gVarArr);
    }

    public g k(BigInteger bigInteger) {
        return new l(bigInteger);
    }

    public int l() {
        return i.bitLength();
    }

    public h m() {
        return this.k;
    }

    public g s(SecureRandom secureRandom) {
        int[] iArr = new int[5];
        do {
            byte[] bArr = new byte[20];
            do {
                secureRandom.nextBytes(bArr);
                h3.h2(bArr, 0, iArr, 0, 5);
            } while (h3.f2(5, iArr, k.a) == 0);
        } while (k.b(iArr) != 0);
        return new l(iArr);
    }

    public boolean t(int i2) {
        return i2 == 2;
    }
}
