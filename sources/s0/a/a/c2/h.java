package s0.a.a.c2;

import java.math.BigInteger;
import java.util.Date;
import s0.a.a.b1;
import s0.a.a.c3.b;
import s0.a.a.e;
import s0.a.a.f;
import s0.a.a.f1;
import s0.a.a.i;
import s0.a.a.k;
import s0.a.a.m;
import s0.a.a.r;
import s0.a.a.s;
import s0.a.a.s0;

public class h extends m {
    public final String Y1;
    public final BigInteger c;
    public final b d;
    public final i q;
    public final i x;
    public final f y;

    public h(b bVar, Date date, Date date2, f fVar, String str) {
        this.c = BigInteger.valueOf(1);
        this.d = bVar;
        this.q = new s0(date);
        this.x = new s0(date2);
        this.y = fVar;
        this.Y1 = null;
    }

    public h(s sVar) {
        this.c = k.B(sVar.D(0)).E();
        this.d = b.s(sVar.D(1));
        this.q = i.E(sVar.D(2));
        this.x = i.E(sVar.D(3));
        e D = sVar.D(4);
        String str = null;
        this.y = D instanceof f ? (f) D : D != null ? new f(s.B(D)) : null;
        this.Y1 = sVar.size() == 6 ? f1.B(sVar.D(5)).e() : str;
    }

    public static h s(Object obj) {
        if (obj instanceof h) {
            return (h) obj;
        }
        if (obj != null) {
            return new h(s.B(obj));
        }
        return null;
    }

    public r c() {
        f fVar = new f(6);
        fVar.a(new k(this.c));
        fVar.a(this.d);
        fVar.a(this.q);
        fVar.a(this.x);
        fVar.a(this.y);
        String str = this.Y1;
        if (str != null) {
            fVar.a(new f1(str));
        }
        return new b1(fVar);
    }
}
