package s0.a.e.b.b0.c;

import com.pubnub.api.builder.PubNubErrorBuilder;
import java.math.BigInteger;
import s0.a.e.b.a;
import s0.a.e.b.c;
import s0.a.e.b.e;
import s0.a.e.b.g;
import s0.a.e.b.h;
import s0.a.g.k.d;

public class q1 extends e.a {
    public static final g[] j = {new o1(c.b)};
    public r1 k = new r1(this, (g) null, (g) null);

    public q1() {
        super(PubNubErrorBuilder.PNERR_INVALID_ARGUMENTS, 2, 3, 8);
        this.b = new o1(new BigInteger(1, d.b("07A11B09A76B562144418FF3FF8C2570B8")));
        this.c = new o1(new BigInteger(1, d.b("0217C05610884B63B9C6C7291678F9D341")));
        this.d = new BigInteger(1, d.b("0400000000000000023123953A9464B54D"));
        this.e = BigInteger.valueOf(2);
        this.f = 6;
    }

    public e a() {
        return new q1();
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
        return new p1(this, i2, jArr);
    }

    public h f(g gVar, g gVar2) {
        return new r1(this, gVar, gVar2);
    }

    public h g(g gVar, g gVar2, g[] gVarArr) {
        return new r1(this, gVar, gVar2, gVarArr);
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
