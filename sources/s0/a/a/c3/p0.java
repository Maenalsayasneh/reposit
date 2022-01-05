package s0.a.a.c3;

import java.math.BigInteger;
import s0.a.a.b3.c;
import s0.a.a.k;
import s0.a.a.m;
import s0.a.a.o0;
import s0.a.a.r;
import s0.a.a.s;
import s0.a.a.w2.n;
import s0.a.a.z;

public class p0 extends m implements y0, n {
    public s c;
    public c d;
    public c q;

    public p0(s sVar) {
        int i;
        this.c = sVar;
        if (sVar.D(0) instanceof z) {
            k.C((z) sVar.D(0), true);
            i = 0;
        } else {
            BigInteger.valueOf(0).toByteArray();
            i = -1;
        }
        k.B(sVar.D(i + 1));
        b.s(sVar.D(i + 2));
        this.d = c.s(sVar.D(i + 3));
        s sVar2 = (s) sVar.D(i + 4);
        t0.t(sVar2.D(0));
        t0.t(sVar2.D(1));
        this.q = c.s(sVar.D(i + 5));
        int i2 = i + 6;
        m0.s(sVar.D(i2));
        for (int size = (sVar.size() - i2) - 1; size > 0; size--) {
            z B = z.B(sVar.D(i2 + size));
            int i3 = B.c;
            if (i3 == 1 || i3 == 2) {
                o0.E(B, false);
            } else if (i3 == 3) {
                w0.s(B);
            }
        }
    }

    public static p0 s(Object obj) {
        if (obj instanceof p0) {
            return (p0) obj;
        }
        if (obj != null) {
            return new p0(s.B(obj));
        }
        return null;
    }

    public r c() {
        return this.c;
    }
}
