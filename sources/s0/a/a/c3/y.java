package s0.a.a.c3;

import i0.d.a.a.a;
import java.math.BigInteger;
import s0.a.a.b1;
import s0.a.a.e1;
import s0.a.a.f;
import s0.a.a.k;
import s0.a.a.m;
import s0.a.a.r;
import s0.a.a.s;
import s0.a.a.z;

public class y extends m {
    public static final BigInteger c = BigInteger.valueOf(0);
    public w d;
    public k q;
    public k x;

    public y(s sVar) {
        z zVar;
        this.d = w.t(sVar.D(0));
        int size = sVar.size();
        if (size != 1) {
            if (size == 2) {
                zVar = z.B(sVar.D(1));
                int i = zVar.c;
                if (i == 0) {
                    this.q = k.C(zVar, false);
                    return;
                } else if (i != 1) {
                    StringBuilder P0 = a.P0("Bad tag number: ");
                    P0.append(zVar.c);
                    throw new IllegalArgumentException(P0.toString());
                }
            } else if (size == 3) {
                z B = z.B(sVar.D(1));
                if (B.c == 0) {
                    this.q = k.C(B, false);
                    zVar = z.B(sVar.D(2));
                    if (zVar.c != 1) {
                        StringBuilder P02 = a.P0("Bad tag number for 'maximum': ");
                        P02.append(zVar.c);
                        throw new IllegalArgumentException(P02.toString());
                    }
                } else {
                    StringBuilder P03 = a.P0("Bad tag number for 'minimum': ");
                    P03.append(B.c);
                    throw new IllegalArgumentException(P03.toString());
                }
            } else {
                throw new IllegalArgumentException(a.K0(sVar, a.P0("Bad sequence size: ")));
            }
            this.x = k.C(zVar, false);
        }
    }

    public r c() {
        f fVar = new f(3);
        fVar.a(this.d);
        k kVar = this.q;
        if (kVar != null && !kVar.F(c)) {
            fVar.a(new e1(false, 0, this.q));
        }
        k kVar2 = this.x;
        if (kVar2 != null) {
            fVar.a(new e1(false, 1, kVar2));
        }
        return new b1(fVar);
    }
}
