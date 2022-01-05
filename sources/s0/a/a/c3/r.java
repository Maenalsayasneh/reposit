package s0.a.a.c3;

import java.util.Enumeration;
import s0.a.a.b1;
import s0.a.a.f;
import s0.a.a.m;
import s0.a.a.o;
import s0.a.a.s;
import s0.a.a.x0;
import s0.a.e.b.b0.c.h3;

public class r extends m {
    public byte[] c;
    public b d;

    public r(b bVar, byte[] bArr) {
        this.c = h3.I(bArr);
        this.d = bVar;
    }

    public r(s sVar) {
        Enumeration E = sVar.E();
        this.d = b.s(E.nextElement());
        this.c = o.B(E.nextElement()).c;
    }

    public s0.a.a.r c() {
        f fVar = new f(2);
        fVar.a(this.d);
        fVar.a(new x0(this.c));
        return new b1(fVar);
    }
}
