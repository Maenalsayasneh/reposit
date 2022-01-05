package s0.a.f.a;

import s0.a.a.b1;
import s0.a.a.c3.b;
import s0.a.a.f;
import s0.a.a.k;
import s0.a.a.m;
import s0.a.a.r;
import s0.a.a.s;

public class j extends m {
    public final k c;
    public final int d;
    public final int q;
    public final b x;

    public j(int i, int i2, b bVar) {
        this.c = new k(0);
        this.d = i;
        this.q = i2;
        this.x = bVar;
    }

    public j(s sVar) {
        this.c = k.B(sVar.D(0));
        this.d = k.B(sVar.D(1)).I();
        this.q = k.B(sVar.D(2)).I();
        this.x = b.s(sVar.D(3));
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
        f fVar = new f(10);
        fVar.a(this.c);
        fVar.a(new k((long) this.d));
        fVar.a(new k((long) this.q));
        fVar.a(this.x);
        return new b1(fVar);
    }
}
