package s0.a.e.b.b0.c;

import java.math.BigInteger;
import java.security.SecureRandom;
import s0.a.e.b.a;
import s0.a.e.b.c;
import s0.a.e.b.e;
import s0.a.e.b.g;
import s0.a.e.b.h;
import s0.a.g.k.d;

public class b extends e.b {
    public static final BigInteger i = d.g;
    public static final g[] j = {new d(c.b)};
    public e k = new e(this, (g) null, (g) null);

    public b() {
        super(i);
        this.b = new d(new BigInteger(1, d.b("FFFFFFFDFFFFFFFFFFFFFFFFFFFFFFFC")));
        this.c = new d(new BigInteger(1, d.b("E87579C11079F43DD824993C2CEE5ED3")));
        this.d = new BigInteger(1, d.b("FFFFFFFE0000000075A30D1B9038A115"));
        this.e = BigInteger.valueOf(1);
        this.f = 2;
    }

    public e a() {
        return new b();
    }

    public a c(h[] hVarArr, int i2, int i3) {
        int[] iArr = new int[(i3 * 4 * 2)];
        int i4 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            h hVar = hVarArr[i2 + i5];
            h3.b0(((d) hVar.c).h, 0, iArr, i4);
            int i6 = i4 + 4;
            h3.b0(((d) hVar.d).h, 0, iArr, i6);
            i4 = i6 + 4;
        }
        return new a(this, i3, iArr);
    }

    public h f(g gVar, g gVar2) {
        return new e(this, gVar, gVar2);
    }

    public h g(g gVar, g gVar2, g[] gVarArr) {
        return new e(this, gVar, gVar2, gVarArr);
    }

    public g k(BigInteger bigInteger) {
        return new d(bigInteger);
    }

    public int l() {
        return i.bitLength();
    }

    public h m() {
        return this.k;
    }

    public g s(SecureRandom secureRandom) {
        int[] iArr = new int[4];
        do {
            byte[] bArr = new byte[16];
            do {
                secureRandom.nextBytes(bArr);
                h3.h2(bArr, 0, iArr, 0, 4);
            } while (h3.f2(4, iArr, c.a) == 0);
        } while (c.c(iArr) != 0);
        return new d(iArr);
    }

    public boolean t(int i2) {
        return i2 == 2;
    }
}
