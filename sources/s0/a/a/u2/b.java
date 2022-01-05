package s0.a.a.u2;

import s0.a.a.b1;
import s0.a.a.f;
import s0.a.a.k;
import s0.a.a.m;
import s0.a.a.o;
import s0.a.a.r;
import s0.a.a.s;

public class b extends m {
    public s0.a.a.c3.b c;
    public o d;
    public o q;
    public k x;

    public b(s0.a.a.c3.b bVar, o oVar, o oVar2, k kVar) {
        this.c = bVar;
        this.d = oVar;
        this.q = oVar2;
        this.x = kVar;
    }

    public b(s sVar) {
        this.c = s0.a.a.c3.b.s(sVar.D(0));
        this.d = (o) sVar.D(1);
        this.q = (o) sVar.D(2);
        this.x = (k) sVar.D(3);
    }

    public r c() {
        f fVar = new f(4);
        fVar.a(this.c);
        fVar.a(this.d);
        fVar.a(this.q);
        fVar.a(this.x);
        return new b1(fVar);
    }
}
