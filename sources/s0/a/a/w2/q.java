package s0.a.a.w2;

import s0.a.a.b1;
import s0.a.a.e;
import s0.a.a.f;
import s0.a.a.k;
import s0.a.a.m;
import s0.a.a.o;
import s0.a.a.r;
import s0.a.a.s;
import s0.a.a.x0;

public class q extends m {
    public k c;
    public o d;

    public q(int i, byte[] bArr) {
        this.c = new k((long) i);
        this.d = new x0(bArr);
    }

    public q(s sVar) {
        e eVar;
        if (sVar.size() == 1) {
            this.c = null;
            eVar = sVar.D(0);
        } else {
            this.c = (k) sVar.D(0);
            eVar = sVar.D(1);
        }
        this.d = (o) eVar;
    }

    public q(byte[] bArr) {
        this.c = null;
        this.d = new x0(bArr);
    }

    public r c() {
        f fVar = new f(2);
        k kVar = this.c;
        if (kVar != null) {
            fVar.a(kVar);
        }
        fVar.a(this.d);
        return new b1(fVar);
    }
}
