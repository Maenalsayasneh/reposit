package s0.a.a.q2;

import s0.a.a.b1;
import s0.a.a.f;
import s0.a.a.k;
import s0.a.a.m;
import s0.a.a.o;
import s0.a.a.r;
import s0.a.a.s;
import s0.a.a.x0;
import s0.a.e.b.b0.c.h3;

public class a extends m {
    public k c;
    public o d;

    public a(s sVar) {
        this.d = (o) sVar.D(0);
        this.c = (k) sVar.D(1);
    }

    public a(byte[] bArr, int i) {
        this.d = new x0(h3.I(bArr));
        this.c = new k((long) i);
    }

    public r c() {
        f fVar = new f(2);
        fVar.a(this.d);
        fVar.a(this.c);
        return new b1(fVar);
    }
}
