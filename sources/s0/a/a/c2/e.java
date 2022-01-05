package s0.a.a.c2;

import java.math.BigInteger;
import java.util.Date;
import s0.a.a.b1;
import s0.a.a.f;
import s0.a.a.f1;
import s0.a.a.i;
import s0.a.a.k;
import s0.a.a.m;
import s0.a.a.o;
import s0.a.a.r;
import s0.a.a.s;
import s0.a.a.s0;
import s0.a.a.x0;
import s0.a.e.b.b0.c.h3;

public class e extends m {
    public final String Y1;
    public final BigInteger c;
    public final String d;
    public final i q;
    public final i x;
    public final o y;

    public e(BigInteger bigInteger, String str, Date date, Date date2, byte[] bArr, String str2) {
        this.c = bigInteger;
        this.d = str;
        this.q = new s0(date);
        this.x = new s0(date2);
        this.y = new x0(h3.I(bArr));
        this.Y1 = null;
    }

    public e(s sVar) {
        this.c = k.B(sVar.D(0)).E();
        this.d = f1.B(sVar.D(1)).e();
        this.q = i.E(sVar.D(2));
        this.x = i.E(sVar.D(3));
        this.y = o.B(sVar.D(4));
        this.Y1 = sVar.size() == 6 ? f1.B(sVar.D(5)).e() : null;
    }

    public static e t(Object obj) {
        if (obj instanceof e) {
            return (e) obj;
        }
        if (obj != null) {
            return new e(s.B(obj));
        }
        return null;
    }

    public r c() {
        f fVar = new f(6);
        fVar.a(new k(this.c));
        fVar.a(new f1(this.d));
        fVar.a(this.q);
        fVar.a(this.x);
        fVar.a(this.y);
        String str = this.Y1;
        if (str != null) {
            fVar.a(new f1(str));
        }
        return new b1(fVar);
    }

    public byte[] s() {
        return h3.I(this.y.c);
    }
}
