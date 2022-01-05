package s0.a.e.b.b0.c;

import com.pubnub.api.builder.PubNubErrorBuilder;
import java.math.BigInteger;
import s0.a.e.b.a;
import s0.a.e.b.c;
import s0.a.e.b.e;
import s0.a.e.b.g;
import s0.a.e.b.h;
import s0.a.g.k.d;

public class t1 extends e.a {
    public static final g[] j = {new o1(c.b)};
    public u1 k = new u1(this, (g) null, (g) null);

    public t1() {
        super(PubNubErrorBuilder.PNERR_INVALID_ARGUMENTS, 2, 3, 8);
        this.b = new o1(new BigInteger(1, d.b("03E5A88919D7CAFCBF415F07C2176573B2")));
        this.c = new o1(new BigInteger(1, d.b("04B8266A46C55657AC734CE38F018F2192")));
        this.d = new BigInteger(1, d.b("0400000000000000016954A233049BA98F"));
        this.e = BigInteger.valueOf(2);
        this.f = 6;
    }

    public e a() {
        return new t1();
    }

    public a c(h[] hVarArr, int i, int i2) {
        long[] jArr = new long[(i2 * 3 * 2)];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            h hVar = hVarArr[i + i4];
            h3.i0(((o1) hVar.c).g, 0, jArr, i3);
            int i5 = i3 + 3;
            h3.i0(((o1) hVar.d).g, 0, jArr, i5);
            i3 = i5 + 3;
        }
        return new s1(this, i2, jArr);
    }

    public h f(g gVar, g gVar2) {
        return new u1(this, gVar, gVar2);
    }

    public h g(g gVar, g gVar2, g[] gVarArr) {
        return new u1(this, gVar, gVar2, gVarArr);
    }

    public g k(BigInteger bigInteger) {
        return new o1(bigInteger);
    }

    public int l() {
        return PubNubErrorBuilder.PNERR_INVALID_ARGUMENTS;
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
