package s0.a.a.w2;

import s0.a.a.b1;
import s0.a.a.c3.b;
import s0.a.a.e1;
import s0.a.a.f;
import s0.a.a.k;
import s0.a.a.m;
import s0.a.a.r;
import s0.a.a.s;
import s0.a.a.v0;
import s0.a.a.z;

public class u extends m {
    public static final b c;
    public static final b d;
    public static final k q = new k(20);
    public static final k x = new k(1);
    public b Y1;
    public k Z1;
    public k a2;
    public b y;

    static {
        b bVar = new b(s0.a.a.v2.b.f, v0.c);
        c = bVar;
        d = new b(n.u, bVar);
    }

    public u() {
        this.y = c;
        this.Y1 = d;
        this.Z1 = q;
        this.a2 = x;
    }

    public u(b bVar, b bVar2, k kVar, k kVar2) {
        this.y = bVar;
        this.Y1 = bVar2;
        this.Z1 = kVar;
        this.a2 = kVar2;
    }

    public u(s sVar) {
        this.y = c;
        this.Y1 = d;
        this.Z1 = q;
        this.a2 = x;
        for (int i = 0; i != sVar.size(); i++) {
            z zVar = (z) sVar.D(i);
            int i2 = zVar.c;
            if (i2 == 0) {
                this.y = b.s(s.C(zVar, true));
            } else if (i2 == 1) {
                this.Y1 = b.s(s.C(zVar, true));
            } else if (i2 == 2) {
                this.Z1 = k.C(zVar, true);
            } else if (i2 == 3) {
                this.a2 = k.C(zVar, true);
            } else {
                throw new IllegalArgumentException("unknown tag");
            }
        }
    }

    public static u s(Object obj) {
        if (obj instanceof u) {
            return (u) obj;
        }
        if (obj != null) {
            return new u(s.B(obj));
        }
        return null;
    }

    public r c() {
        f fVar = new f(4);
        if (!this.y.equals(c)) {
            fVar.a(new e1(true, 0, this.y));
        }
        if (!this.Y1.equals(d)) {
            fVar.a(new e1(true, 1, this.Y1));
        }
        if (!this.Z1.w(q)) {
            fVar.a(new e1(true, 2, this.Z1));
        }
        if (!this.a2.w(x)) {
            fVar.a(new e1(true, 3, this.a2));
        }
        return new b1(fVar);
    }
}
