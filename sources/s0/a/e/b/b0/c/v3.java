package s0.a.e.b.b0.c;

import java.math.BigInteger;
import s0.a.e.b.a;
import s0.a.e.b.c;
import s0.a.e.b.e;
import s0.a.e.b.g;
import s0.a.e.b.h;
import s0.a.g.k.d;

public class v3 extends e.a {
    public static final g[] j = {new q3(c.b)};
    public static final q3 k;
    public static final q3 l;
    public w3 m = new w3(this, (g) null, (g) null);

    static {
        q3 q3Var = new q3(new BigInteger(1, d.b("02F40E7E2221F295DE297117B7F3D62F5C6A97FFCB8CEFF1CD6BA8CE4A9A18AD84FFABBD8EFA59332BE7AD6756A66E294AFD185A78FF12AA520E4DE739BACA0C7FFEFF7F2955727A")));
        k = q3Var;
        l = (q3) q3Var.n();
    }

    public v3() {
        super(571, 2, 5, 10);
        this.b = new q3(BigInteger.valueOf(1));
        this.c = k;
        this.d = new BigInteger(1, d.b("03FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFE661CE18FF55987308059B186823851EC7DD9CA1161DE93D5174D66E8382E9BB2FE84E47"));
        this.e = BigInteger.valueOf(2);
        this.f = 6;
    }

    public e a() {
        return new v3();
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
        return new u3(this, i2, jArr);
    }

    public h f(g gVar, g gVar2) {
        return new w3(this, gVar, gVar2);
    }

    public h g(g gVar, g gVar2, g[] gVarArr) {
        return new w3(this, gVar, gVar2, gVarArr);
    }

    public g k(BigInteger bigInteger) {
        return new q3(bigInteger);
    }

    public int l() {
        return 571;
    }

    public h m() {
        return this.m;
    }

    public boolean t(int i) {
        return i == 6;
    }

    public boolean v() {
        return false;
    }
}
