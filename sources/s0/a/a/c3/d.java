package s0.a.a.c3;

import i0.d.a.a.a;
import s0.a.a.b1;
import s0.a.a.f;
import s0.a.a.i;
import s0.a.a.m;
import s0.a.a.r;
import s0.a.a.s;

public class d extends m {
    public i c;
    public i d;

    public d(s sVar) {
        if (sVar.size() == 2) {
            this.c = i.E(sVar.D(0));
            this.d = i.E(sVar.D(1));
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
