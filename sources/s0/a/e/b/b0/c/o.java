package s0.a.e.b.b0.c;

import java.math.BigInteger;
import java.security.SecureRandom;
import s0.a.e.b.a;
import s0.a.e.b.c;
import s0.a.e.b.e;
import s0.a.e.b.g;
import s0.a.e.b.h;
import s0.a.g.k.d;

public class o extends e.b {
    public static final BigInteger i = q.g;
    public static final g[] j = {new q(c.b)};
    public r k = new r(this, (g) null, (g) null);

    public o() {
        super(i);
        this.b = new q(new BigInteger(1, d.b("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFAC70")));
        this.c = new q(new BigInteger(1, d.b("B4E134D3FB59EB8BAB57274904664D5AF50388BA")));
        this.d = new BigInteger(1, d.b("0100000000000000000000351EE786A818F3A1A16B"));
        this.e = BigInteger.valueOf(1);
        this.f = 2;
    }

    public e a() {
        return new o();
    }

    public a c(h[] hVarArr, int i2, int i3) {
        int[] iArr = new int[(i3 * 5 * 2)];
        int i4 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            h hVar = hVarArr[i2 + i5];
            h3.d0(((q) hVar.c).h, 0, iArr, i4);
            int i6 = i4 + 5;
            h3.d0(((q) hVar.d).h, 0, iArr, i6);
            i4 = i6 + 5;
        }
        return new n(this, i3, iArr);
    }

    public h f(g gVar, g gVar2) {
        return new r(this, gVar, gVar2);
    }

    public h g(g gVar, g gVar2, g[] gVarArr) {
        return new r(this, gVar, gVar2, gVarArr);
    }

    public g k(BigInteger bigInteger) {
        return new q(bigInteger);
    }

    public int l() {
        return i.bitLength();
    }

    public h m() {
        return this.k;
    }

    public g s(SecureRandom secureRandom) {
        int[] iArr = new int[5];
        p.f(secureRandom, iArr);
        return new q(iArr);
    }

    public boolean t(int i2) {
        return i2 == 2;
    }
}
