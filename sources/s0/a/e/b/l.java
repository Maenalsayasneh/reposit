package s0.a.e.b;

import java.math.BigInteger;
import m0.r.t.a.r.m.a1.a;
import s0.a.e.b.b0.c.h3;
import s0.a.e.b.c0.c;

public class l extends b {
    public final e a;
    public final c b;

    public l(e eVar, c cVar) {
        if (eVar.d != null) {
            this.a = eVar;
            this.b = cVar;
            return;
        }
        throw new IllegalArgumentException("Need curve with known group order");
    }

    public h b(h hVar, BigInteger bigInteger) {
        h[] hVarArr;
        h[] hVarArr2;
        h[] hVarArr3;
        h[] hVarArr4;
        if (this.a.j(hVar.b)) {
            BigInteger[] c = this.b.c(bigInteger.mod(hVar.b.d));
            boolean z = false;
            BigInteger bigInteger2 = c[0];
            BigInteger bigInteger3 = c[1];
            if (!this.b.b()) {
                return a.j2(hVar, bigInteger2, h3.p2(this.b, hVar), bigInteger3);
            }
            c cVar = this.b;
            boolean z2 = bigInteger2.signum() < 0;
            if (bigInteger3.signum() < 0) {
                z = true;
            }
            BigInteger abs = bigInteger2.abs();
            BigInteger abs2 = bigInteger3.abs();
            u f = v.f(hVar, v.d(Math.max(abs.bitLength(), abs2.bitLength()), 8), true);
            h p2 = h3.p2(cVar, hVar);
            u uVar = (u) p2.b.r(p2, "bc_wnaf", new w(f, true, cVar.a()));
            int min = Math.min(8, f.f);
            int min2 = Math.min(8, uVar.f);
            if (z2) {
                hVarArr = f.d;
            } else {
                hVarArr = f.c;
            }
            h[] hVarArr5 = hVarArr;
            if (z) {
                hVarArr2 = uVar.d;
            } else {
                hVarArr2 = uVar.c;
            }
            h[] hVarArr6 = hVarArr2;
            if (z2) {
                hVarArr3 = f.c;
            } else {
                hVarArr3 = f.d;
            }
            h[] hVarArr7 = hVarArr3;
            if (z) {
                hVarArr4 = uVar.c;
            } else {
                hVarArr4 = uVar.d;
            }
            return a.k2(hVarArr5, hVarArr7, v.b(min, abs), hVarArr6, hVarArr4, v.b(min2, abs2));
        }
        throw new IllegalStateException();
    }
}
