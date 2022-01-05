package s0.a.a.c2;

import s0.a.a.b1;
import s0.a.a.f;
import s0.a.a.m;
import s0.a.a.n;
import s0.a.a.o;
import s0.a.a.r;
import s0.a.a.s;
import s0.a.a.x0;
import s0.a.e.b.b0.c.h3;

public class k extends m {
    public final n c;
    public final o d;

    public k(n nVar, byte[] bArr) {
        this.c = nVar;
        this.d = new x0(h3.I(bArr));
    }

    public k(s sVar) {
        this.c = n.D(sVar.D(0));
        this.d = o.B(sVar.D(1));
    }

    public r c() {
        f fVar = new f(2);
        fVar.a(this.c);
        fVar.a(this.d);
        return new b1(fVar);
    }
}
