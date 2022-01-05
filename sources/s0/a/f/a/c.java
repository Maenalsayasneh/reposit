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
import s0.a.f.d.a.b;
import s0.a.f.d.a.d;
import s0.a.f.d.a.e;

public class c extends m {
    public byte[] Y1;
    public byte[] Z1;
    public int c;
    public int d;
    public byte[] q;
    public byte[] x;
    public byte[] y;

    public c(int i, int i2, b bVar, e eVar, d dVar, d dVar2, a aVar) {
        this.c = i;
        this.d = i2;
        this.q = bVar.a();
        this.x = eVar.f();
        this.y = aVar.a();
        this.Y1 = dVar.a();
        this.Z1 = dVar2.a();
    }

    public c(s sVar) {
        this.c = ((k) sVar.D(0)).I();
        this.d = ((k) sVar.D(1)).I();
        this.q = ((o) sVar.D(2)).c;
        this.x = ((o) sVar.D(3)).c;
        this.Y1 = ((o) sVar.D(4)).c;
        this.Z1 = ((o) sVar.D(5)).c;
        this.y = ((o) sVar.D(6)).c;
    }

    public static c t(Object obj) {
        if (obj instanceof c) {
            return (c) obj;
        }
        if (obj != null) {
            return new c(s.B(obj));
        }
        return null;
    }

    public r c() {
        f fVar = new f(10);
        fVar.a(new k((long) this.c));
        fVar.a(new k((long) this.d));
        fVar.a(new x0(this.q));
        fVar.a(new x0(this.x));
        fVar.a(new x0(this.Y1));
        fVar.a(new x0(this.Z1));
        fVar.a(new x0(this.y));
        return new b1(fVar);
    }

    public b s() {
        return new b(this.q);
    }
}
