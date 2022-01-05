package s0.a.a.c2;

import s0.a.a.b1;
import s0.a.a.c3.b;
import s0.a.a.e1;
import s0.a.a.f;
import s0.a.a.m;
import s0.a.a.o0;
import s0.a.a.r;
import s0.a.a.s;
import s0.a.a.z;

public class l extends m {
    public final b c;
    public final s d;
    public final s0.a.a.b q;

    public l(s sVar) {
        this.c = b.s(sVar.D(0));
        int i = 1;
        if (sVar.D(1) instanceof z) {
            this.d = s.B(z.B(sVar.D(1)).C());
            i = 2;
        } else {
            this.d = null;
        }
        this.q = o0.D(sVar.D(i));
    }

    public static l s(Object obj) {
        if (obj instanceof l) {
            return (l) obj;
        }
        if (obj != null) {
            return new l(s.B(obj));
        }
        return null;
    }

    public r c() {
        f fVar = new f(3);
        fVar.a(this.c);
        s sVar = this.d;
        if (sVar != null) {
            fVar.a(new e1(0, sVar));
        }
        fVar.a(this.q);
        return new b1(fVar);
    }
}
