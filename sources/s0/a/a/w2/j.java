package s0.a.a.w2;

import s0.a.a.b1;
import s0.a.a.f;
import s0.a.a.k;
import s0.a.a.m;
import s0.a.a.o;
import s0.a.a.r;
import s0.a.a.s;
import s0.a.a.x0;

public class j extends m {
    public k c;
    public o d;

    public j(s sVar) {
        this.d = (o) sVar.D(0);
        this.c = (k) sVar.D(1);
    }

    public j(byte[] bArr, int i) {
        if (bArr.length == 8) {
            this.d = new x0(bArr);
            this.c = new k((long) i);
            return;
        }
        throw new IllegalArgumentException("salt length must be 8");
    }

    public r c() {
        f fVar = new f(2);
        fVar.a(this.d);
        fVar.a(this.c);
        return new b1(fVar);
    }
}
