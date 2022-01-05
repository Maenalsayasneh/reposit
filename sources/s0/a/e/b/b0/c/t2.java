package s0.a.e.b.b0.c;

import java.math.BigInteger;
import s0.a.e.b.a;
import s0.a.e.b.c;
import s0.a.e.b.e;
import s0.a.e.b.g;
import s0.a.e.b.h;
import s0.a.g.k.d;

public class t2 extends e.a {
    public static final g[] j = {new o2(c.b)};
    public u2 k = new u2(this, (g) null, (g) null);

    public t2() {
        super(233, 74, 0, 0);
        this.b = new o2(BigInteger.valueOf(1));
        this.c = new o2(new BigInteger(1, d.b("0066647EDE6C332C7F8C0923BB58213B333B20E9CE4281FE115F7D8F90AD")));
        this.d = new BigInteger(1, d.b("01000000000000000000000000000013E974E72F8A6922031D2603CFE0D7"));
        this.e = BigInteger.valueOf(2);
        this.f = 6;
    }

    public e a() {
        return new t2();
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
        return new s2(this, i2, jArr);
    }

    public h f(g gVar, g gVar2) {
        return new u2(this, gVar, gVar2);
    }

    public h g(g gVar, g gVar2, g[] gVarArr) {
        return new u2(this, gVar, gVar2, gVarArr);
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
        return false;
    }
}
