package s0.a.e.b.b0.c;

import java.math.BigInteger;
import s0.a.e.b.a;
import s0.a.e.b.c;
import s0.a.e.b.e;
import s0.a.e.b.g;
import s0.a.e.b.h;
import s0.a.g.k.d;

public class m2 extends e.a {
    public static final g[] j = {new h2(c.b)};
    public n2 k = new n2(this, (g) null, (g) null);

    public m2() {
        super(193, 15, 0, 0);
        this.b = new h2(new BigInteger(1, d.b("0163F35A5137C2CE3EA6ED8667190B0BC43ECD69977702709B")));
        this.c = new h2(new BigInteger(1, d.b("00C9BB9E8927D4D64C377E2AB2856A5B16E3EFB7F61D4316AE")));
        this.d = new BigInteger(1, d.b("010000000000000000000000015AAB561B005413CCD4EE99D5"));
        this.e = BigInteger.valueOf(2);
        this.f = 6;
    }

    public e a() {
        return new m2();
    }

    public a c(h[] hVarArr, int i, int i2) {
        long[] jArr = new long[(i2 * 4 * 2)];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            h hVar = hVarArr[i + i4];
            h3.j0(((h2) hVar.c).g, 0, jArr, i3);
            int i5 = i3 + 4;
            h3.j0(((h2) hVar.d).g, 0, jArr, i5);
            i3 = i5 + 4;
        }
        return new l2(this, i2, jArr);
    }

    public h f(g gVar, g gVar2) {
        return new n2(this, gVar, gVar2);
    }

    public h g(g gVar, g gVar2, g[] gVarArr) {
        return new n2(this, gVar, gVar2, gVarArr);
    }

    public g k(BigInteger bigInteger) {
        return new h2(bigInteger);
    }

    public int l() {
        return 193;
    }

    public h m() {
        return this.k;
    }

    public boolean t(int i) {
        return i == 6;
    }

    public boolean v() {
        return false;
    }
}
