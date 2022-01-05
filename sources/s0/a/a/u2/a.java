package s0.a.a.u2;

import s0.a.a.b1;
import s0.a.a.c3.b;
import s0.a.a.e1;
import s0.a.a.f;
import s0.a.a.m;
import s0.a.a.o0;
import s0.a.a.r;
import s0.a.a.s;
import s0.a.a.z;

public class a extends m {
    public k c;
    public b d;
    public o0 q;
    public s x;

    public a(s sVar) {
        this.c = k.s(sVar.D(0));
        this.d = b.s(sVar.D(1));
        this.q = (o0) sVar.D(2);
        if (sVar.size() > 3) {
            this.x = s.C((z) sVar.D(3), true);
        }
    }

    public static a s(Object obj) {
        if (obj instanceof a) {
            return (a) obj;
        }
        if (obj != null) {
            return new a(s.B(obj));
        }
        return null;
    }

    public r c() {
        f fVar = new f(4);
        fVar.a(this.c);
        fVar.a(this.d);
        fVar.a(this.q);
        s sVar = this.x;
        if (sVar != null) {
            fVar.a(new e1(true, 0, sVar));
        }
        return new b1(fVar);
    }
}
