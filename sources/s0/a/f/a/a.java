package s0.a.f.a;

import s0.a.a.b1;
import s0.a.a.c3.b;
import s0.a.a.f;
import s0.a.a.k;
import s0.a.a.m;
import s0.a.a.o;
import s0.a.a.r;
import s0.a.a.s;
import s0.a.a.x0;
import s0.a.f.d.a.d;
import s0.a.f.d.a.e;

public class a extends m {
    public b Y1;
    public int c;
    public int d;
    public byte[] q;
    public byte[] x;
    public byte[] y;

    public a(int i, int i2, s0.a.f.d.a.b bVar, e eVar, d dVar, b bVar2) {
        this.c = i;
        this.d = i2;
        this.q = bVar.a();
        this.x = eVar.f();
        this.y = dVar.a();
        this.Y1 = bVar2;
    }

    public a(s sVar) {
        this.c = ((k) sVar.D(0)).I();
        this.d = ((k) sVar.D(1)).I();
        this.q = ((o) sVar.D(2)).c;
        this.x = ((o) sVar.D(3)).c;
        this.y = ((o) sVar.D(4)).c;
        this.Y1 = b.s(sVar.D(5));
    }

    public static a t(Object obj) {
        if (obj instanceof a) {
            return (a) obj;
        }
        if (obj != null) {
            return new a(s.B(obj));
        }
        return null;
    }

    public r c() {
        f fVar = new f(10);
        fVar.a(new k((long) this.c));
        fVar.a(new k((long) this.d));
        fVar.a(new x0(this.q));
        fVar.a(new x0(this.x));
        fVar.a(new x0(this.y));
        fVar.a(this.Y1);
        return new b1(fVar);
    }

    public s0.a.f.d.a.b s() {
        return new s0.a.f.d.a.b(this.q);
    }
}
