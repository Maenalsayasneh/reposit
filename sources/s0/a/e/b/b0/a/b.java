package s0.a.e.b.b0.a;

import java.math.BigInteger;
import java.security.SecureRandom;
import s0.a.e.b.a;
import s0.a.e.b.b0.c.h3;
import s0.a.e.b.c;
import s0.a.e.b.e;
import s0.a.e.b.g;
import s0.a.e.b.h;
import s0.a.g.k.d;

public class b extends e.b {
    public static final BigInteger i = d.g;
    public static final BigInteger j;
    public static final BigInteger k = new BigInteger(1, d.b("7B425ED097B425ED097B425ED097B425ED097B425ED097B4260B5E9C7710C864"));
    public static final g[] l;
    public e m = new e(this, (g) null, (g) null);

    static {
        BigInteger bigInteger = new BigInteger(1, d.b("2AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA984914A144"));
        j = bigInteger;
        l = new g[]{new d(c.b), new d(bigInteger)};
    }

    public b() {
        super(i);
        this.b = new d(j);
        this.c = new d(k);
        this.d = new BigInteger(1, d.b("1000000000000000000000000000000014DEF9DEA2F79CD65812631A5CF5D3ED"));
        this.e = BigInteger.valueOf(8);
        this.f = 4;
    }

    public e a() {
        return new b();
    }

    public a c(h[] hVarArr, int i2, int i3) {
        int[] iArr = new int[(i3 * 8 * 2)];
        int i4 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            h hVar = hVarArr[i2 + i5];
            h3.g0(((d) hVar.c).i, 0, iArr, i4);
            int i6 = i4 + 8;
            h3.g0(((d) hVar.d).i, 0, iArr, i6);
            i4 = i6 + 8;
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
        return this.m;
    }

    public g s(SecureRandom secureRandom) {
        int[] iArr = new int[8];
        do {
            byte[] bArr = new byte[32];
            do {
                secureRandom.nextBytes(bArr);
                h3.h2(bArr, 0, iArr, 0, 8);
                iArr[7] = iArr[7] & Integer.MAX_VALUE;
            } while (h3.f2(8, iArr, c.a) == 0);
        } while (c.a(iArr) != 0);
        return new d(iArr);
    }

    public boolean t(int i2) {
        return i2 == 4;
    }
}
