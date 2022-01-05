package s0.a.e.b.b0.c;

import java.math.BigInteger;
import s0.a.e.b.a;
import s0.a.e.b.b;
import s0.a.e.b.c;
import s0.a.e.b.e;
import s0.a.e.b.g;
import s0.a.e.b.h;
import s0.a.e.b.y;
import s0.a.g.k.d;

public class s3 extends e.a {
    public static final g[] j = {new q3(c.b)};
    public t3 k = new t3(this, (g) null, (g) null);

    public s3() {
        super(571, 2, 5, 10);
        this.b = new q3(BigInteger.valueOf(0));
        this.c = new q3(BigInteger.valueOf(1));
        this.d = new BigInteger(1, d.b("020000000000000000000000000000000000000000000000000000000000000000000000131850E1F19A63E4B391A8DB917F4138B630D84BE5D639381E91DEB45CFE778F637C1001"));
        this.e = BigInteger.valueOf(4);
        this.f = 6;
    }

    public e a() {
        return new s3();
    }

    public a c(h[] hVarArr, int i, int i2) {
        long[] jArr = new long[(i2 * 9 * 2)];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            h hVar = hVarArr[i + i4];
            h3.n0(((q3) hVar.c).g, 0, jArr, i3);
            int i5 = i3 + 9;
            h3.n0(((q3) hVar.d).g, 0, jArr, i5);
            i3 = i5 + 9;
        }
        return new r3(this, i2, jArr);
    }

    public b d() {
        return new y();
    }

    public h f(g gVar, g gVar2) {
        return new t3(this, gVar, gVar2);
    }

    public h g(g gVar, g gVar2, g[] gVarArr) {
        return new t3(this, gVar, gVar2, gVarArr);
    }

    public g k(BigInteger bigInteger) {
        return new q3(bigInteger);
    }

    public int l() {
        return 571;
    }

    public h m() {
        return this.k;
    }

    public boolean t(int i) {
        return i == 6;
    }

    public boolean v() {
        return true;
    }
}
