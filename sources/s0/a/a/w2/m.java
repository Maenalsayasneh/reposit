package s0.a.a.w2;

import java.math.BigInteger;
import s0.a.a.b1;
import s0.a.a.f;
import s0.a.a.k;
import s0.a.a.o;
import s0.a.a.r;
import s0.a.a.s;
import s0.a.a.x0;

public class m extends s0.a.a.m {
    public k c;
    public o d;

    public m(s sVar) {
        this.d = (o) sVar.D(0);
        this.c = k.B(sVar.D(1));
    }

    public m(byte[] bArr, int i) {
        this.d = new x0(bArr);
        this.c = new k((long) i);
    }

    public static m s(Object obj) {
        if (obj instanceof m) {
            return (m) obj;
        }
        if (obj != null) {
            return new m(s.B(obj));
        }
        return null;
    }

    public r c() {
        f fVar = new f(2);
        fVar.a(this.d);
        fVar.a(this.c);
        return new b1(fVar);
    }

    public BigInteger t() {
        return this.c.E();
    }
}
