package s0.a.a.d3;

import java.math.BigInteger;
import s0.a.a.b1;
import s0.a.a.f;
import s0.a.a.m;
import s0.a.a.n;
import s0.a.a.r;
import s0.a.a.s;

public class k extends m implements m {
    public n c;
    public r d;

    public k(int i, int i2, int i3, int i4) {
        this.c = m.b1;
        f fVar = new f(3);
        fVar.a(new s0.a.a.k((long) i));
        if (i3 == 0) {
            if (i4 == 0) {
                fVar.a(m.c1);
                fVar.a(new s0.a.a.k((long) i2));
            } else {
                throw new IllegalArgumentException("inconsistent k values");
            }
        } else if (i3 <= i2 || i4 <= i3) {
            throw new IllegalArgumentException("inconsistent k values");
        } else {
            fVar.a(m.d1);
            f fVar2 = new f(3);
            fVar2.a(new s0.a.a.k((long) i2));
            fVar2.a(new s0.a.a.k((long) i3));
            fVar2.a(new s0.a.a.k((long) i4));
            fVar.a(new b1(fVar2));
        }
        this.d = new b1(fVar);
    }

    public k(BigInteger bigInteger) {
        this.c = m.a1;
        this.d = new s0.a.a.k(bigInteger);
    }

    public k(s sVar) {
        this.c = n.D(sVar.D(0));
        this.d = sVar.D(1).c();
    }

    public r c() {
        f fVar = new f(2);
        fVar.a(this.c);
        fVar.a(this.d);
        return new b1(fVar);
    }
}
