package s0.a.a.c2;

import s0.a.a.b1;
import s0.a.a.c3.b;
import s0.a.a.f;
import s0.a.a.m;
import s0.a.a.o;
import s0.a.a.r;
import s0.a.a.s;
import s0.a.a.x0;
import s0.a.e.b.b0.c.h3;

public class d extends m {
    public final b c;
    public final o d;

    public d(b bVar, byte[] bArr) {
        this.c = bVar;
        this.d = new x0(h3.I(bArr));
    }

    public d(s sVar) {
        this.c = b.s(sVar.D(0));
        this.d = o.B(sVar.D(1));
    }

    public r c() {
        f fVar = new f(2);
        fVar.a(this.c);
        fVar.a(this.d);
        return new b1(fVar);
    }
}
