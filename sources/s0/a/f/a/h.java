package s0.a.f.a;

import s0.a.a.b1;
import s0.a.a.c3.b;
import s0.a.a.f;
import s0.a.a.k;
import s0.a.a.m;
import s0.a.a.r;
import s0.a.a.s;

public class h extends m {
    public final k c;
    public final b d;

    public h(b bVar) {
        this.c = new k(0);
        this.d = bVar;
    }

    public h(s sVar) {
        this.c = k.B(sVar.D(0));
        this.d = b.s(sVar.D(1));
    }

    public static final h s(Object obj) {
        if (obj instanceof h) {
            return (h) obj;
        }
        if (obj != null) {
            return new h(s.B(obj));
        }
        return null;
    }

    public r c() {
        f fVar = new f(10);
        fVar.a(this.c);
        fVar.a(this.d);
        return new b1(fVar);
    }
}
