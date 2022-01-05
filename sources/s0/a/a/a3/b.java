package s0.a.a.a3;

import java.math.BigInteger;
import s0.a.a.b1;
import s0.a.a.e;
import s0.a.a.e1;
import s0.a.a.f;
import s0.a.a.k;
import s0.a.a.m;
import s0.a.a.o;
import s0.a.a.r;
import s0.a.a.s;
import s0.a.a.z;

public class b extends m {
    public o Y1;
    public BigInteger c = BigInteger.valueOf(0);
    public a d;
    public k q;
    public o x;
    public k y;

    public b(s sVar) {
        int i = 0;
        if (sVar.D(0) instanceof z) {
            z zVar = (z) sVar.D(0);
            if (!zVar.d || zVar.c != 0) {
                throw new IllegalArgumentException("object parse error");
            }
            this.c = k.B(zVar).E();
            i = 1;
        }
        e D = sVar.D(i);
        this.d = D instanceof a ? (a) D : D != null ? new a(s.B(D)) : null;
        int i2 = i + 1;
        this.q = k.B(sVar.D(i2));
        int i3 = i2 + 1;
        this.x = o.B(sVar.D(i3));
        int i4 = i3 + 1;
        this.y = k.B(sVar.D(i4));
        this.Y1 = o.B(sVar.D(i4 + 1));
    }

    public r c() {
        f fVar = new f(6);
        if (this.c.compareTo(BigInteger.valueOf(0)) != 0) {
            fVar.a(new e1(true, 0, new k(this.c)));
        }
        fVar.a(this.d);
        fVar.a(this.q);
        fVar.a(this.x);
        fVar.a(this.y);
        fVar.a(this.Y1);
        return new b1(fVar);
    }
}
