package s0.a.a.c2;

import s0.a.a.b1;
import s0.a.a.c3.b;
import s0.a.a.f;
import s0.a.a.m;
import s0.a.a.o;
import s0.a.a.r;
import s0.a.a.s;
import s0.a.a.w2.h;
import s0.a.a.x0;
import s0.a.e.b.b0.c.h3;

public class j extends m {
    public final b c;
    public final h d;
    public final o q;

    public j(b bVar, h hVar, byte[] bArr) {
        this.c = bVar;
        this.d = hVar;
        this.q = new x0(h3.I(bArr));
    }

    public j(s sVar) {
        this.c = b.s(sVar.D(0));
        this.d = h.s(sVar.D(1));
        this.q = o.B(sVar.D(2));
    }

    public static j s(Object obj) {
        if (obj instanceof j) {
            return (j) obj;
        }
        if (obj != null) {
            return new j(s.B(obj));
        }
        return null;
    }

    public r c() {
        f fVar = new f(3);
        fVar.a(this.c);
        fVar.a(this.d);
        fVar.a(this.q);
        return new b1(fVar);
    }
}
