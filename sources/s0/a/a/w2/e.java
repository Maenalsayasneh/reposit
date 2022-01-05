package s0.a.a.w2;

import s0.a.a.f;
import s0.a.a.g0;
import s0.a.a.k;
import s0.a.a.m;
import s0.a.a.r;
import s0.a.a.s;

public class e extends m {
    public s c;

    public e(s sVar) {
        if (((k) sVar.D(0)).I() == 0) {
            this.c = s.B(sVar.D(1));
            return;
        }
        throw new IllegalArgumentException("sequence not version 0");
    }

    public r c() {
        f fVar = new f(2);
        fVar.a(new k(0));
        fVar.a(this.c);
        return new g0(fVar);
    }
}
