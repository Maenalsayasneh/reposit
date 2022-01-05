package s0.a.a.u2;

import s0.a.a.b1;
import s0.a.a.f;
import s0.a.a.m;
import s0.a.a.n;
import s0.a.a.o;
import s0.a.a.r;
import s0.a.a.s;

public class j extends m {
    public n c;
    public o d;

    public j(s sVar) {
        this.c = (n) sVar.D(0);
        this.d = (o) sVar.D(1);
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
        f fVar = new f(2);
        fVar.a(this.c);
        fVar.a(this.d);
        return new b1(fVar);
    }
}
