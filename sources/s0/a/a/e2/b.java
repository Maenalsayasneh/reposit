package s0.a.a.e2;

import s0.a.a.b1;
import s0.a.a.f;
import s0.a.a.k;
import s0.a.a.m;
import s0.a.a.o;
import s0.a.a.r;
import s0.a.a.s;
import s0.a.a.x0;
import s0.a.e.b.b0.c.h3;

public class b extends m {
    public byte[] c;
    public int d;

    public b(s sVar) {
        this.c = o.B(sVar.D(0)).c;
        this.d = sVar.size() == 2 ? k.B(sVar.D(1)).I() : 12;
    }

    public b(byte[] bArr, int i) {
        this.c = h3.I(bArr);
        this.d = i;
    }

    public static b s(Object obj) {
        if (obj instanceof b) {
            return (b) obj;
        }
        if (obj != null) {
            return new b(s.B(obj));
        }
        return null;
    }

    public r c() {
        f fVar = new f(2);
        fVar.a(new x0(this.c));
        int i = this.d;
        if (i != 12) {
            fVar.a(new k((long) i));
        }
        return new b1(fVar);
    }

    public byte[] t() {
        return h3.I(this.c);
    }
}
