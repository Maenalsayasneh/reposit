package s0.a.e.b.b0.c;

import com.pubnub.api.builder.PubNubErrorBuilder;
import java.math.BigInteger;
import s0.a.e.b.a;
import s0.a.e.b.c;
import s0.a.e.b.e;
import s0.a.e.b.g;
import s0.a.e.b.h;
import s0.a.g.k.d;

public class e2 extends e.a {
    public static final g[] j = {new w1(c.b)};
    public f2 k = new f2(this, (g) null, (g) null);

    public e2() {
        super(PubNubErrorBuilder.PNERR_HISTORY_MESSAGE_ACTIONS_MULTIPLE_CHANNELS, 3, 6, 7);
        this.b = new w1(BigInteger.valueOf(1));
        this.c = new w1(new BigInteger(1, d.b("020A601907B8C953CA1481EB10512F78744A3205FD")));
        this.d = new BigInteger(1, d.b("040000000000000000000292FE77E70C12A4234C33"));
        this.e = BigInteger.valueOf(2);
        this.f = 6;
    }

    public e a() {
        return new e2();
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
        return new d2(this, i2, jArr);
    }

    public h f(g gVar, g gVar2) {
        return new f2(this, gVar, gVar2);
    }

    public h g(g gVar, g gVar2, g[] gVarArr) {
        return new f2(this, gVar, gVar2, gVarArr);
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
        return false;
    }
}
