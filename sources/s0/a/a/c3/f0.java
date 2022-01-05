package s0.a.a.c3;

import i0.d.a.a.a;
import s0.a.a.b1;
import s0.a.a.f;
import s0.a.a.g;
import s0.a.a.m;
import s0.a.a.n;
import s0.a.a.o0;
import s0.a.a.r;
import s0.a.a.s;
import s0.a.a.z;

public class f0 extends m {
    public g c;
    public n d;
    public b q;
    public o0 x;

    public f0(s sVar) {
        if (sVar.size() > 4 || sVar.size() < 3) {
            throw new IllegalArgumentException(a.K0(sVar, a.P0("Bad sequence size: ")));
        }
        int i = 0;
        this.c = g.C(sVar.D(0));
        if (sVar.size() == 4) {
            this.d = n.D(sVar.D(1));
            i = 1;
        }
        this.q = b.s(sVar.D(i + 1));
        this.x = o0.D(sVar.D(i + 2));
    }

    public static f0 s(z zVar, boolean z) {
        s C = s.C(zVar, z);
        if (C instanceof f0) {
            return (f0) C;
        }
        if (C != null) {
            return new f0(s.B(C));
        }
        return null;
    }

    public r c() {
        f fVar = new f(4);
        fVar.a(this.c);
        n nVar = this.d;
        if (nVar != null) {
            fVar.a(nVar);
        }
        fVar.a(this.q);
        fVar.a(this.x);
        return new b1(fVar);
    }
}
