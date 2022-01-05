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

public class q2 extends e.a {
    public static final g[] j = {new o2(c.b)};
    public r2 k = new r2(this, (g) null, (g) null);

    public q2() {
        super(233, 74, 0, 0);
        this.b = new o2(BigInteger.valueOf(0));
        this.c = new o2(BigInteger.valueOf(1));
        this.d = new BigInteger(1, d.b("8000000000000000000000000000069D5BB915BCD46EFB1AD5F173ABDF"));
        this.e = BigInteger.valueOf(4);
        this.f = 6;
    }

    public e a() {
        return new q2();
    }

    public a c(h[] hVarArr, int i, int i2) {
        long[] jArr = new long[(i2 * 4 * 2)];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            h hVar = hVarArr[i + i4];
            h3.j0(((o2) hVar.c).g, 0, jArr, i3);
            int i5 = i3 + 4;
            h3.j0(((o2) hVar.d).g, 0, jArr, i5);
            i3 = i5 + 4;
        }
        return new p2(this, i2, jArr);
    }

    public b d() {
        return new y();
    }

    public h f(g gVar, g gVar2) {
        return new r2(this, gVar, gVar2);
    }

    public h g(g gVar, g gVar2, g[] gVarArr) {
        return new r2(this, gVar, gVar2, gVarArr);
    }

    public g k(BigInteger bigInteger) {
        return new o2(bigInteger);
    }

    public int l() {
        return 233;
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
