package s0.a.e.b.b0.c;

import java.math.BigInteger;
import s0.a.e.b.a;
import s0.a.e.b.c;
import s0.a.e.b.e;
import s0.a.e.b.g;
import s0.a.e.b.h;
import s0.a.g.k.d;

public class l1 extends e.a {
    public static final g[] j = {new g1(c.b)};
    public m1 k = new m1(this, (g) null, (g) null);

    public l1() {
        super(113, 9, 0, 0);
        this.b = new g1(new BigInteger(1, d.b("00689918DBEC7E5A0DD6DFC0AA55C7")));
        this.c = new g1(new BigInteger(1, d.b("0095E9A9EC9B297BD4BF36E059184F")));
        this.d = new BigInteger(1, d.b("010000000000000108789B2496AF93"));
        this.e = BigInteger.valueOf(2);
        this.f = 6;
    }

    public e a() {
        return new l1();
    }

    public a c(h[] hVarArr, int i, int i2) {
        long[] jArr = new long[(i2 * 2 * 2)];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            h hVar = hVarArr[i + i4];
            h3.h0(((g1) hVar.c).g, 0, jArr, i3);
            int i5 = i3 + 2;
            h3.h0(((g1) hVar.d).g, 0, jArr, i5);
            i3 = i5 + 2;
        }
        return new k1(this, i2, jArr);
    }

    public h f(g gVar, g gVar2) {
        return new m1(this, gVar, gVar2);
    }

    public h g(g gVar, g gVar2, g[] gVarArr) {
        return new m1(this, gVar, gVar2, gVarArr);
    }

    public g k(BigInteger bigInteger) {
        return new g1(bigInteger);
    }

    public int l() {
        return 113;
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
