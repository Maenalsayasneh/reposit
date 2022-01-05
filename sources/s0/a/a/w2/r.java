package s0.a.a.w2;

import s0.a.a.b1;
import s0.a.a.c3.b;
import s0.a.a.e1;
import s0.a.a.f;
import s0.a.a.m;
import s0.a.a.s;
import s0.a.a.v0;
import s0.a.a.x0;
import s0.a.a.z;

public class r extends m {
    public static final b c;
    public static final b d;
    public static final b q = new b(n.v, new x0(new byte[0]));
    public b Y1;
    public b x;
    public b y;

    static {
        b bVar = new b(s0.a.a.v2.b.f, v0.c);
        c = bVar;
        d = new b(n.u, bVar);
    }

    public r() {
        this.x = c;
        this.y = d;
        this.Y1 = q;
    }

    public r(b bVar, b bVar2, b bVar3) {
        this.x = bVar;
        this.y = bVar2;
        this.Y1 = bVar3;
    }

    public r(s sVar) {
        this.x = c;
        this.y = d;
        this.Y1 = q;
        for (int i = 0; i != sVar.size(); i++) {
            z zVar = (z) sVar.D(i);
            int i2 = zVar.c;
            if (i2 == 0) {
                this.x = b.s(s.C(zVar, true));
            } else if (i2 == 1) {
                this.y = b.s(s.C(zVar, true));
            } else if (i2 == 2) {
                this.Y1 = b.s(s.C(zVar, true));
            } else {
                throw new IllegalArgumentException("unknown tag");
            }
        }
    }

    public s0.a.a.r c() {
        f fVar = new f(3);
        if (!this.x.equals(c)) {
            fVar.a(new e1(true, 0, this.x));
        }
        if (!this.y.equals(d)) {
            fVar.a(new e1(true, 1, this.y));
        }
        if (!this.Y1.equals(q)) {
            fVar.a(new e1(true, 2, this.Y1));
        }
        return new b1(fVar);
    }
}
