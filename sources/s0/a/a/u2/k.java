package s0.a.a.u2;

import s0.a.a.b1;
import s0.a.a.b3.c;
import s0.a.a.b3.d;
import s0.a.a.c3.v;
import s0.a.a.e;
import s0.a.a.e1;
import s0.a.a.f;
import s0.a.a.i;
import s0.a.a.m;
import s0.a.a.o;
import s0.a.a.r;
import s0.a.a.s;
import s0.a.a.x0;
import s0.a.a.z;

public class k extends m {
    public static final s0.a.a.k c = new s0.a.a.k(0);
    public s Y1;
    public v Z1;
    public boolean d;
    public s0.a.a.k q;
    public i x;
    public i y;

    public k(s sVar) {
        i iVar;
        i iVar2;
        int i = 0;
        if (!(sVar.D(0) instanceof z) || ((z) sVar.D(0)).c != 0) {
            this.q = c;
        } else {
            this.d = true;
            this.q = s0.a.a.k.C((z) sVar.D(0), true);
            i = 1;
        }
        int i2 = i + 1;
        e D = sVar.D(i);
        if (D instanceof i) {
            iVar = (i) D;
        } else {
            if (D instanceof x0) {
                iVar2 = new i((o) (x0) D);
            } else if (D instanceof z) {
                z zVar = (z) D;
                if (zVar.c == 1) {
                    d dVar = c.c;
                    iVar2 = new i(c.s(s.C(zVar, true)));
                } else {
                    iVar2 = new i(o.C(zVar, true));
                }
            } else {
                iVar2 = new i(c.s(D));
            }
            iVar = iVar2;
        }
        this.x = iVar;
        int i3 = i2 + 1;
        this.y = i.E(sVar.D(i2));
        int i4 = i3 + 1;
        this.Y1 = (s) sVar.D(i3);
        if (sVar.size() > i4) {
            this.Z1 = v.u((z) sVar.D(i4), true);
        }
    }

    public static k s(Object obj) {
        if (obj instanceof k) {
            return (k) obj;
        }
        if (obj != null) {
            return new k(s.B(obj));
        }
        return null;
    }

    public r c() {
        f fVar = new f(5);
        if (this.d || !this.q.w(c)) {
            fVar.a(new e1(true, 0, this.q));
        }
        fVar.a(this.x);
        fVar.a(this.y);
        fVar.a(this.Y1);
        v vVar = this.Z1;
        if (vVar != null) {
            fVar.a(new e1(true, 1, vVar));
        }
        return new b1(fVar);
    }
}
