package s0.a.a.c3;

import s0.a.a.b1;
import s0.a.a.e;
import s0.a.a.e1;
import s0.a.a.f;
import s0.a.a.m;
import s0.a.a.n;
import s0.a.a.r;
import s0.a.a.s;
import s0.a.a.z;

public class g0 extends m {
    public final n c;
    public final e d;

    public g0(s sVar) {
        this.c = n.D(sVar.D(0));
        this.d = z.B(sVar.D(1)).C();
    }

    public static g0 s(Object obj) {
        if (obj instanceof g0) {
            return (g0) obj;
        }
        if (obj != null) {
            return new g0(s.B(obj));
        }
        return null;
    }

    public r c() {
        f fVar = new f(2);
        fVar.a(this.c);
        fVar.a(new e1(true, 0, this.d));
        return new b1(fVar);
    }
}
