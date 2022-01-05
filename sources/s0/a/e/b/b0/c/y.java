package s0.a.e.b.b0.c;

import java.math.BigInteger;
import java.security.SecureRandom;
import s0.a.e.b.a;
import s0.a.e.b.c;
import s0.a.e.b.e;
import s0.a.e.b.g;
import s0.a.e.b.h;
import s0.a.g.k.d;

public class y extends e.b {
    public static final BigInteger i = a0.g;
    public static final g[] j = {new a0(c.b)};
    public b0 k = new b0(this, (g) null, (g) null);

    public y() {
        super(i);
        this.b = new a0(new BigInteger(1, d.b("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFFFFFFFFFC")));
        this.c = new a0(new BigInteger(1, d.b("64210519E59C80E70FA7E9AB72243049FEB8DEECC146B9B1")));
        this.d = new BigInteger(1, d.b("FFFFFFFFFFFFFFFFFFFFFFFF99DEF836146BC9B1B4D22831"));
        this.e = BigInteger.valueOf(1);
        this.f = 2;
    }

    public e a() {
        return new y();
    }

    public a c(h[] hVarArr, int i2, int i3) {
        int[] iArr = new int[(i3 * 6 * 2)];
        int i4 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            h hVar = hVarArr[i2 + i5];
            h3.e0(((a0) hVar.c).h, 0, iArr, i4);
            int i6 = i4 + 6;
            h3.e0(((a0) hVar.d).h, 0, iArr, i6);
            i4 = i6 + 6;
        }
        return new x(this, i3, iArr);
    }

    public h f(g gVar, g gVar2) {
        return new b0(this, gVar, gVar2);
    }

    public h g(g gVar, g gVar2, g[] gVarArr) {
        return new b0(this, gVar, gVar2, gVarArr);
    }

    public g k(BigInteger bigInteger) {
        return new a0(bigInteger);
    }

    public int l() {
        return i.bitLength();
    }

    public h m() {
        return this.k;
    }

    public g s(SecureRandom secureRandom) {
        int[] iArr = new int[6];
        do {
            byte[] bArr = new byte[24];
            do {
                secureRandom.nextBytes(bArr);
                h3.h2(bArr, 0, iArr, 0, 6);
            } while (h3.f2(6, iArr, z.a) == 0);
        } while (z.c(iArr) != 0);
        return new a0(iArr);
    }

    public boolean t(int i2) {
        return i2 == 2;
    }
}
