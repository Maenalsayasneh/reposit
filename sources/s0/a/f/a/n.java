package s0.a.f.a;

import java.math.BigInteger;
import s0.a.a.b1;
import s0.a.a.f;
import s0.a.a.k;
import s0.a.a.m;
import s0.a.a.o;
import s0.a.a.r;
import s0.a.a.s;
import s0.a.a.x0;
import s0.a.e.b.b0.c.h3;

public class n extends m {
    public final byte[] c;
    public final byte[] d;

    public n(s sVar) {
        if (k.B(sVar.D(0)).F(BigInteger.valueOf(0))) {
            this.c = h3.I(o.B(sVar.D(1)).c);
            this.d = h3.I(o.B(sVar.D(2)).c);
            return;
        }
        throw new IllegalArgumentException("unknown version of sequence");
    }

    public n(byte[] bArr, byte[] bArr2) {
        this.c = h3.I(bArr);
        this.d = h3.I(bArr2);
    }

    public static n s(Object obj) {
        if (obj instanceof n) {
            return (n) obj;
        }
        if (obj != null) {
            return new n(s.B(obj));
        }
        return null;
    }

    public r c() {
        f fVar = new f(10);
        fVar.a(new k(0));
        fVar.a(new x0(this.c));
        fVar.a(new x0(this.d));
        return new b1(fVar);
    }
}
