package s0.a.a.c3;

import i0.d.a.a.a;
import s0.a.a.b1;
import s0.a.a.e;
import s0.a.a.f;
import s0.a.a.k;
import s0.a.a.m;
import s0.a.a.o0;
import s0.a.a.r;
import s0.a.a.s;

public class g extends m {
    public d Y1;
    public s Z1;
    public o0 a2;
    public v b2;
    public k c;
    public z d;
    public c q;
    public b x;
    public k y;

    public g(s sVar) {
        if (sVar.size() < 6 || sVar.size() > 9) {
            throw new IllegalArgumentException(a.K0(sVar, a.P0("Bad sequence size: ")));
        }
        int i = 0;
        if (sVar.D(0) instanceof k) {
            this.c = k.B(sVar.D(0));
            i = 1;
        } else {
            this.c = new k(0);
        }
        this.d = z.s(sVar.D(i));
        this.q = c.s(sVar.D(i + 1));
        this.x = b.s(sVar.D(i + 2));
        this.y = k.B(sVar.D(i + 3));
        e D = sVar.D(i + 4);
        this.Y1 = D instanceof d ? (d) D : D != null ? new d(s.B(D)) : null;
        this.Z1 = s.B(sVar.D(i + 5));
        for (int i2 = i + 6; i2 < sVar.size(); i2++) {
            e D2 = sVar.D(i2);
            if (D2 instanceof o0) {
                this.a2 = o0.D(sVar.D(i2));
            } else if ((D2 instanceof s) || (D2 instanceof v)) {
                this.b2 = v.t(sVar.D(i2));
            }
        }
    }

    public r c() {
        f fVar = new f(9);
        if (this.c.I() != 0) {
            fVar.a(this.c);
        }
        fVar.a(this.d);
        fVar.a(this.q);
        fVar.a(this.x);
        fVar.a(this.y);
        fVar.a(this.Y1);
        fVar.a(this.Z1);
        o0 o0Var = this.a2;
        if (o0Var != null) {
            fVar.a(o0Var);
        }
        v vVar = this.b2;
        if (vVar != null) {
            fVar.a(vVar);
        }
        return new b1(fVar);
    }
}
