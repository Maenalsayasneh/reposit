package s0.a.e.b.c0;

import java.math.BigInteger;
import s0.a.e.b.b0.c.h3;
import s0.a.e.b.e;
import s0.a.e.b.p;

public class d implements c {
    public final e a;
    public final p b;

    public d(e eVar, e eVar2) {
        this.a = eVar2;
        this.b = new p(eVar.k(eVar2.a));
    }

    public p a() {
        return this.b;
    }

    public boolean b() {
        return true;
    }

    public BigInteger[] c(BigInteger bigInteger) {
        f fVar = this.a.b;
        int i = fVar.g;
        BigInteger F = h3.F(bigInteger, fVar.e, i);
        BigInteger F2 = h3.F(bigInteger, fVar.f, i);
        return new BigInteger[]{bigInteger.subtract(F.multiply(fVar.a).add(F2.multiply(fVar.c))), F.multiply(fVar.b).add(F2.multiply(fVar.d)).negate()};
    }
}
