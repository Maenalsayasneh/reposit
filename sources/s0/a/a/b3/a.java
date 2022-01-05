package s0.a.a.b3;

import s0.a.a.b1;
import s0.a.a.e;
import s0.a.a.f;
import s0.a.a.m;
import s0.a.a.n;
import s0.a.a.r;
import s0.a.a.s;

public class a extends m {
    public n c;
    public e d;

    public a(n nVar, e eVar) {
        this.c = nVar;
        this.d = eVar;
    }

    public a(s sVar) {
        this.c = (n) sVar.D(0);
        this.d = sVar.D(1);
    }

    public static a s(Object obj) {
        if (obj instanceof a) {
            return (a) obj;
        }
        if (obj != null) {
            return new a(s.B(obj));
        }
        throw new IllegalArgumentException("null value in getInstance()");
    }

    public r c() {
        f fVar = new f(2);
        fVar.a(this.c);
        fVar.a(this.d);
        return new b1(fVar);
    }
}
