package s0.a.f.a;

import s0.a.a.b1;
import s0.a.a.f;
import s0.a.a.k;
import s0.a.a.m;
import s0.a.a.o;
import s0.a.a.r;
import s0.a.a.s;
import s0.a.a.x0;
import s0.a.f.d.a.a;

public class d extends m {
    public final int c;
    public final int d;
    public final a q;

    public d(int i, int i2, a aVar) {
        this.c = i;
        this.d = i2;
        this.q = new a(aVar);
    }

    public d(s sVar) {
        this.c = ((k) sVar.D(0)).I();
        this.d = ((k) sVar.D(1)).I();
        this.q = new a(((o) sVar.D(2)).c);
    }

    public static d s(Object obj) {
        if (obj instanceof d) {
            return (d) obj;
        }
        if (obj != null) {
            return new d(s.B(obj));
        }
        return null;
    }

    public r c() {
        f fVar = new f(10);
        fVar.a(new k((long) this.c));
        fVar.a(new k((long) this.d));
        fVar.a(new x0(this.q.a()));
        return new b1(fVar);
    }
}
