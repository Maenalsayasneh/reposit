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

public class x2 extends e.a {
    public static final g[] j = {new v2(c.b)};
    public y2 k = new y2(this, (g) null, (g) null);

    public x2() {
        super(239, PubNubErrorBuilder.PNERR_MESSAGE_ACTION_MISSING, 0, 0);
        this.b = new v2(BigInteger.valueOf(0));
        this.c = new v2(BigInteger.valueOf(1));
        this.d = new BigInteger(1, d.b("2000000000000000000000000000005A79FEC67CB6E91F1C1DA800E478A5"));
        this.e = BigInteger.valueOf(4);
        this.f = 6;
    }

    public e a() {
        return new x2();
    }

    public a c(h[] hVarArr, int i, int i2) {
        long[] jArr = new long[(i2 * 4 * 2)];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            h hVar = hVarArr[i + i4];
            h3.j0(((v2) hVar.c).g, 0, jArr, i3);
            int i5 = i3 + 4;
            h3.j0(((v2) hVar.d).g, 0, jArr, i5);
            i3 = i5 + 4;
        }
        return new w2(this, i2, jArr);
    }

    public b d() {
        return new y();
    }

    public h f(g gVar, g gVar2) {
        return new y2(this, gVar, gVar2);
    }

    public h g(g gVar, g gVar2, g[] gVarArr) {
        return new y2(this, gVar, gVar2, gVarArr);
    }

    public g k(BigInteger bigInteger) {
        return new v2(bigInteger);
    }

    public int l() {
        return 239;
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
