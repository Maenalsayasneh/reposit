package s0.a.f.a;

import s0.a.a.b1;
import s0.a.a.c3.b;
import s0.a.a.f;
import s0.a.a.k;
import s0.a.a.m;
import s0.a.a.r;
import s0.a.a.s;

public class i extends m {
    public final k c;
    public final int d;
    public final b q;

    public i(int i, b bVar) {
        this.c = new k(0);
        this.d = i;
        this.q = bVar;
    }

    public i(s sVar) {
        this.c = k.B(sVar.D(0));
        this.d = k.B(sVar.D(1)).I();
        this.q = b.s(sVar.D(2));
    }

    public static i s(Object obj) {
        if (obj instanceof i) {
            return (i) obj;
        }
        if (obj != null) {
            return new i(s.B(obj));
        }
        return null;
    }

    public r c() {
        f fVar = new f(10);
        fVar.a(this.c);
        fVar.a(new k((long) this.d));
        fVar.a(this.q);
        return new b1(fVar);
    }
}
