package s0.a.a.d3;

import i0.d.a.a.a;
import s0.a.a.b1;
import s0.a.a.f;
import s0.a.a.k;
import s0.a.a.m;
import s0.a.a.o0;
import s0.a.a.r;
import s0.a.a.s;

public class d extends m {
    public o0 c;
    public k d;

    public d(s sVar) {
        if (sVar.size() == 2) {
            this.c = o0.D(sVar.D(0));
            this.d = k.B(sVar.D(1));
            return;
        }
        throw new IllegalArgumentException(a.K0(sVar, a.P0("Bad sequence size: ")));
    }

    public d(byte[] bArr, int i) {
        if (bArr != null) {
            this.c = new o0(bArr);
            this.d = new k((long) i);
            return;
        }
        throw new IllegalArgumentException("'seed' cannot be null");
    }

    public r c() {
        f fVar = new f(2);
        fVar.a(this.c);
        fVar.a(this.d);
        return new b1(fVar);
    }
}
