package s0.a.a.g2;

import java.math.BigInteger;
import s0.a.a.b1;
import s0.a.a.f;
import s0.a.a.k;
import s0.a.a.m;
import s0.a.a.r;

public class e extends m {
    public int c;
    public k d;
    public k q;
    public k x;

    public e(int i, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.c = i;
        this.d = new k(bigInteger);
        this.q = new k(bigInteger2);
        this.x = new k(bigInteger3);
    }

    public r c() {
        f fVar = new f(4);
        fVar.a(new k((long) this.c));
        fVar.a(this.d);
        fVar.a(this.q);
        fVar.a(this.x);
        return new b1(fVar);
    }
}
