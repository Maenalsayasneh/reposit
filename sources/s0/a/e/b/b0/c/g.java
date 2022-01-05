package s0.a.e.b.b0.c;

import java.math.BigInteger;
import java.security.SecureRandom;
import s0.a.e.b.a;
import s0.a.e.b.c;
import s0.a.e.b.e;
import s0.a.e.b.h;
import s0.a.g.k.d;

public class g extends e.b {
    public static final BigInteger i = q.g;
    public static final s0.a.e.b.g[] j = {new q(c.b)};
    public h k = new h(this, (s0.a.e.b.g) null, (s0.a.e.b.g) null);

    public g() {
        super(i);
        this.b = new q(c.a);
        this.c = new q(BigInteger.valueOf(7));
        this.d = new BigInteger(1, d.b("0100000000000000000001B8FA16DFAB9ACA16B6B3"));
        this.e = BigInteger.valueOf(1);
        this.f = 2;
    }

    public e a() {
        return new g();
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
        return new f(this, i3, iArr);
    }

    public h f(s0.a.e.b.g gVar, s0.a.e.b.g gVar2) {
        return new h(this, gVar, gVar2);
    }

    public h g(s0.a.e.b.g gVar, s0.a.e.b.g gVar2, s0.a.e.b.g[] gVarArr) {
        return new h(this, gVar, gVar2, gVarArr);
    }

    public s0.a.e.b.g k(BigInteger bigInteger) {
        return new q(bigInteger);
    }

    public int l() {
        return i.bitLength();
    }

    public h m() {
        return this.k;
    }

    public s0.a.e.b.g s(SecureRandom secureRandom) {
        int[] iArr = new int[5];
        p.f(secureRandom, iArr);
        return new q(iArr);
    }

    public boolean t(int i2) {
        return i2 == 2;
    }
}
