package s0.a.a.a3;

import s0.a.a.b1;
import s0.a.a.f;
import s0.a.a.k;
import s0.a.a.m;
import s0.a.a.r;
import s0.a.a.s;

public class a extends m {
    public int c;
    public int d;
    public int q;
    public int x;

    public a(s sVar) {
        this.c = k.B(sVar.D(0)).G();
        if (sVar.D(1) instanceof k) {
            this.d = ((k) sVar.D(1)).G();
        } else if (sVar.D(1) instanceof s) {
            s B = s.B(sVar.D(1));
            this.d = k.B(B.D(0)).G();
            this.q = k.B(B.D(1)).G();
            this.x = k.B(B.D(2)).G();
        } else {
            throw new IllegalArgumentException("object parse error");
        }
    }

    public r c() {
        f fVar = new f(2);
        fVar.a(new k((long) this.c));
        if (this.q == 0) {
            fVar.a(new k((long) this.d));
        } else {
            f fVar2 = new f(3);
            fVar2.a(new k((long) this.d));
            fVar2.a(new k((long) this.q));
            fVar2.a(new k((long) this.x));
            fVar.a(new b1(fVar2));
        }
        return new b1(fVar);
    }
}
