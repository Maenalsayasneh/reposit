package s0.a.a.w2;

import java.math.BigInteger;
import s0.a.a.e;
import s0.a.a.f;
import s0.a.a.g0;
import s0.a.a.k;
import s0.a.a.m;
import s0.a.a.r;
import s0.a.a.s;

public class o extends m implements n {
    public c c;
    public i d = null;

    public o(s sVar) {
        i iVar = null;
        if (k.B(sVar.D(0)).I() == 3) {
            this.c = c.s(sVar.D(1));
            if (sVar.size() == 3) {
                e D = sVar.D(2);
                BigInteger bigInteger = i.c;
                if (D instanceof i) {
                    iVar = (i) D;
                } else if (D != null) {
                    iVar = new i(s.B(D));
                }
                this.d = iVar;
                return;
            }
            return;
        }
        throw new IllegalArgumentException("wrong version for PFX PDU");
    }

    public o(c cVar, i iVar) {
        this.c = cVar;
        this.d = iVar;
    }

    public r c() {
        f fVar = new f(3);
        fVar.a(new k(3));
        fVar.a(this.c);
        i iVar = this.d;
        if (iVar != null) {
            fVar.a(iVar);
        }
        return new g0(fVar);
    }
}
