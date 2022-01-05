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

public class c3 extends e.a {
    public static final g[] j = {new a3(c.b)};
    public d3 k = new d3(this, (g) null, (g) null);

    public c3() {
        super(283, 5, 7, 12);
        this.b = new a3(BigInteger.valueOf(0));
        this.c = new a3(BigInteger.valueOf(1));
        this.d = new BigInteger(1, d.b("01FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFE9AE2ED07577265DFF7F94451E061E163C61"));
        this.e = BigInteger.valueOf(4);
        this.f = 6;
    }

    public e a() {
        return new c3();
    }

    public a c(h[] hVarArr, int i, int i2) {
        long[] jArr = new long[(i2 * 5 * 2)];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            h hVar = hVarArr[i + i4];
            h3.l0(((a3) hVar.c).g, 0, jArr, i3);
            int i5 = i3 + 5;
            h3.l0(((a3) hVar.d).g, 0, jArr, i5);
            i3 = i5 + 5;
        }
        return new b3(this, i2, jArr);
    }

    public b d() {
        return new y();
    }

    public h f(g gVar, g gVar2) {
        return new d3(this, gVar, gVar2);
    }

    public h g(g gVar, g gVar2, g[] gVarArr) {
        return new d3(this, gVar, gVar2, gVarArr);
    }

    public g k(BigInteger bigInteger) {
        return new a3(bigInteger);
    }

    public int l() {
        return 283;
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
