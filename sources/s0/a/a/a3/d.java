package s0.a.a.a3;

import java.util.Arrays;
import s0.a.a.b1;
import s0.a.a.e;
import s0.a.a.f;
import s0.a.a.m;
import s0.a.a.n;
import s0.a.a.o;
import s0.a.a.r;
import s0.a.a.s;
import s0.a.a.x0;
import s0.a.e.b.b0.c.h3;

public class d extends m {
    public static final byte[] c = {-87, -42, -21, 69, -15, 60, 112, -126, Byte.MIN_VALUE, -60, -106, 123, 35, 31, 94, -83, -10, 88, -21, -92, -64, 55, 41, 29, 56, -39, 107, -16, 37, -54, 78, 23, -8, -23, 114, 13, -58, 21, -76, 58, 40, -105, 95, 11, -63, -34, -93, 100, 56, -75, 100, -22, 44, 23, -97, -48, 18, 62, 109, -72, -6, -59, 121, 4};
    public n d;
    public b q;
    public byte[] x = c;

    public d(b bVar) {
        this.q = bVar;
    }

    public d(n nVar) {
        this.d = nVar;
    }

    public static byte[] s() {
        return h3.I(c);
    }

    public static d t(Object obj) {
        d dVar;
        if (obj instanceof d) {
            return (d) obj;
        }
        s B = s.B(obj);
        if (B.D(0) instanceof n) {
            dVar = new d(n.D(B.D(0)));
        } else {
            e D = B.D(0);
            dVar = new d(D instanceof b ? (b) D : D != null ? new b(s.B(D)) : null);
        }
        if (B.size() == 2) {
            byte[] bArr = o.B(B.D(1)).c;
            dVar.x = bArr;
            if (bArr.length != c.length) {
                throw new IllegalArgumentException("object parse error");
            }
        }
        return dVar;
    }

    public r c() {
        f fVar = new f(2);
        e eVar = this.d;
        if (eVar == null) {
            eVar = this.q;
        }
        fVar.a(eVar);
        if (!Arrays.equals(this.x, c)) {
            fVar.a(new x0(this.x));
        }
        return new b1(fVar);
    }

    public boolean u() {
        return this.d != null;
    }
}
