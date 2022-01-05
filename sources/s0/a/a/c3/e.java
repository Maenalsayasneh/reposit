package s0.a.a.c3;

import i0.d.a.a.a;
import s0.a.a.b1;
import s0.a.a.f;
import s0.a.a.m;
import s0.a.a.n;
import s0.a.a.r;
import s0.a.a.s;
import s0.a.a.v;

public class e extends m {
    public n c;
    public v d;

    public e(s sVar) {
        if (sVar.size() == 2) {
            this.c = n.D(sVar.D(0));
            this.d = v.C(sVar.D(1));
            return;
        }
        throw new IllegalArgumentException(a.K0(sVar, a.P0("Bad sequence size: ")));
    }

    public r c() {
        f fVar = new f(2);
        fVar.a(this.c);
        fVar.a(this.d);
        return new b1(fVar);
    }
}
