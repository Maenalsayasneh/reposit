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

public class k3 extends e.a {
    public static final g[] j = {new i3(c.b)};
    public l3 k = new l3(this, (g) null, (g) null);

    public k3() {
        super(409, 87, 0, 0);
        this.b = new i3(BigInteger.valueOf(0));
        this.c = new i3(BigInteger.valueOf(1));
        this.d = new BigInteger(1, d.b("7FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFE5F83B2D4EA20400EC4557D5ED3E3E7CA5B4B5C83B8E01E5FCF"));
        this.e = BigInteger.valueOf(4);
        this.f = 6;
    }

    public e a() {
        return new k3();
    }

    public a c(h[] hVarArr, int i, int i2) {
        long[] jArr = new long[(i2 * 7 * 2)];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            h hVar = hVarArr[i + i4];
            h3.m0(((i3) hVar.c).g, 0, jArr, i3);
            int i5 = i3 + 7;
            h3.m0(((i3) hVar.d).g, 0, jArr, i5);
            i3 = i5 + 7;
        }
        return new j3(this, i2, jArr);
    }

    public b d() {
        return new y();
    }

    public h f(g gVar, g gVar2) {
        return new l3(this, gVar, gVar2);
    }

    public h g(g gVar, g gVar2, g[] gVarArr) {
        return new l3(this, gVar, gVar2, gVarArr);
    }

    public g k(BigInteger bigInteger) {
        return new i3(bigInteger);
    }

    public int l() {
        return 409;
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
