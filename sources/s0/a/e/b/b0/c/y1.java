package s0.a.e.b.b0.c;

import com.pubnub.api.builder.PubNubErrorBuilder;
import java.math.BigInteger;
import s0.a.e.b.a;
import s0.a.e.b.b;
import s0.a.e.b.c;
import s0.a.e.b.e;
import s0.a.e.b.g;
import s0.a.e.b.h;
import s0.a.e.b.y;
import s0.a.g.k.d;

public class y1 extends e.a {
    public static final g[] j = {new w1(c.b)};
    public z1 k = new z1(this, (g) null, (g) null);

    public y1() {
        super(PubNubErrorBuilder.PNERR_HISTORY_MESSAGE_ACTIONS_MULTIPLE_CHANNELS, 3, 6, 7);
        w1 w1Var = new w1(BigInteger.valueOf(1));
        this.b = w1Var;
        this.c = w1Var;
        this.d = new BigInteger(1, d.b("04000000000000000000020108A2E0CC0D99F8A5EF"));
        this.e = BigInteger.valueOf(2);
        this.f = 6;
    }

    public e a() {
        return new y1();
    }

    public a c(h[] hVarArr, int i, int i2) {
        long[] jArr = new long[(i2 * 3 * 2)];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            h hVar = hVarArr[i + i4];
            h3.i0(((w1) hVar.c).g, 0, jArr, i3);
            int i5 = i3 + 3;
            h3.i0(((w1) hVar.d).g, 0, jArr, i5);
            i3 = i5 + 3;
        }
        return new x1(this, i2, jArr);
    }

    public b d() {
        return new y();
    }

    public h f(g gVar, g gVar2) {
        return new z1(this, gVar, gVar2);
    }

    public h g(g gVar, g gVar2, g[] gVarArr) {
        return new z1(this, gVar, gVar2, gVarArr);
    }

    public g k(BigInteger bigInteger) {
        return new w1(bigInteger);
    }

    public int l() {
        return PubNubErrorBuilder.PNERR_HISTORY_MESSAGE_ACTIONS_MULTIPLE_CHANNELS;
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
