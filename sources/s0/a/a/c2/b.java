package s0.a.a.c2;

import s0.a.a.b1;
import s0.a.a.f;
import s0.a.a.m;
import s0.a.a.o;
import s0.a.a.r;
import s0.a.a.s;
import s0.a.a.x0;

public class b extends m {
    public final s0.a.a.c3.b c;
    public final o d;

    public b(s0.a.a.c3.b bVar, byte[] bArr) {
        this.c = bVar;
        this.d = new x0(bArr);
    }

    public b(s sVar) {
        this.c = s0.a.a.c3.b.s(sVar.D(0));
        this.d = o.B(sVar.D(1));
    }

    public r c() {
        f fVar = new f(2);
        fVar.a(this.c);
        fVar.a(this.d);
        return new b1(fVar);
    }
}
