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

public class b extends m {
    public final int c;
    public final int d;
    public final a q;
    public final s0.a.a.c3.b x;

    public b(int i, int i2, a aVar, s0.a.a.c3.b bVar) {
        this.c = i;
        this.d = i2;
        this.q = new a(aVar.a());
        this.x = bVar;
    }

    public b(s sVar) {
        this.c = ((k) sVar.D(0)).I();
        this.d = ((k) sVar.D(1)).I();
        this.q = new a(((o) sVar.D(2)).c);
        this.x = s0.a.a.c3.b.s(sVar.D(3));
    }

    public static b s(Object obj) {
        if (obj instanceof b) {
            return (b) obj;
        }
        if (obj != null) {
            return new b(s.B(obj));
        }
        return null;
    }

    public r c() {
        f fVar = new f(10);
        fVar.a(new k((long) this.c));
        fVar.a(new k((long) this.d));
        fVar.a(new x0(this.q.a()));
        fVar.a(this.x);
        return new b1(fVar);
    }
}
