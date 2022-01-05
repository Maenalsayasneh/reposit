package s0.a.a.c3;

import i0.d.a.a.a;
import s0.a.a.b1;
import s0.a.a.e;
import s0.a.a.m;
import s0.a.a.o0;
import s0.a.a.r;
import s0.a.a.s;

public class f extends m {
    public g c;
    public b d;
    public o0 q;

    public f(s sVar) {
        if (sVar.size() == 3) {
            e D = sVar.D(0);
            this.c = D instanceof g ? (g) D : D != null ? new g(s.B(D)) : null;
            this.d = b.s(sVar.D(1));
            this.q = o0.D(sVar.D(2));
            return;
        }
        throw new IllegalArgumentException(a.K0(sVar, a.P0("Bad sequence size: ")));
    }

    public r c() {
        s0.a.a.f fVar = new s0.a.a.f(3);
        fVar.a(this.c);
        fVar.a(this.d);
        fVar.a(this.q);
        return new b1(fVar);
    }
}
