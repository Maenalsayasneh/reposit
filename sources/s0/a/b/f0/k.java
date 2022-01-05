package s0.a.b.f0;

import java.math.BigInteger;
import java.security.SecureRandom;
import s0.a.b.b;
import s0.a.b.c;
import s0.a.b.k0.b0;
import s0.a.b.k0.c0;
import s0.a.b.k0.w;
import s0.a.b.k0.y;
import s0.a.b.q;
import s0.a.e.b.i;
import s0.a.e.b.v;

public class k implements c, s0.a.e.b.c {
    public w g;
    public SecureRandom h;

    public void a(q qVar) {
        y yVar = (y) qVar;
        this.h = yVar.a;
        this.g = yVar.c;
    }

    public b b() {
        BigInteger bigInteger = this.g.j;
        int bitLength = bigInteger.bitLength();
        int i = bitLength >>> 2;
        while (true) {
            BigInteger e = s0.a.g.b.e(bitLength, this.h);
            if (e.compareTo(s0.a.e.b.c.b) >= 0 && e.compareTo(bigInteger) < 0 && v.c(e) >= i) {
                return new b(new c0(new i().a(this.g.i, e), this.g), new b0(e, this.g));
            }
        }
    }
}
