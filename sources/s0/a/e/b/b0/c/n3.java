package s0.a.e.b.b0.c;

import java.math.BigInteger;
import s0.a.e.b.a;
import s0.a.e.b.c;
import s0.a.e.b.e;
import s0.a.e.b.g;
import s0.a.e.b.h;
import s0.a.g.k.d;

public class n3 extends e.a {
    public static final g[] j = {new i3(c.b)};
    public o3 k = new o3(this, (g) null, (g) null);

    public n3() {
        super(409, 87, 0, 0);
        this.b = new i3(BigInteger.valueOf(1));
        this.c = new i3(new BigInteger(1, d.b("0021A5C2C8EE9FEB5C4B9A753B7B476B7FD6422EF1F3DD674761FA99D6AC27C8A9A197B272822F6CD57A55AA4F50AE317B13545F")));
        this.d = new BigInteger(1, d.b("010000000000000000000000000000000000000000000000000001E2AAD6A612F33307BE5FA47C3C9E052F838164CD37D9A21173"));
        this.e = BigInteger.valueOf(2);
        this.f = 6;
    }

    public e a() {
        return new n3();
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
        return new m3(this, i2, jArr);
    }

    public h f(g gVar, g gVar2) {
        return new o3(this, gVar, gVar2);
    }

    public h g(g gVar, g gVar2, g[] gVarArr) {
        return new o3(this, gVar, gVar2, gVarArr);
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
        return false;
    }
}
