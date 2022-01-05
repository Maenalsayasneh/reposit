package s0.a.a.c3;

import i0.d.a.a.a;
import s0.a.a.b1;
import s0.a.a.f;
import s0.a.a.k;
import s0.a.a.m;
import s0.a.a.o0;
import s0.a.a.r;
import s0.a.a.s;
import s0.a.a.z;

public class a0 extends m {
    public x c;
    public k d;
    public o0 q;

    public a0(s sVar) {
        if (sVar.size() == 2 || sVar.size() == 3) {
            this.c = x.s(sVar.D(0));
            this.d = k.B(sVar.D(1));
            if (sVar.size() == 3) {
                this.q = o0.D(sVar.D(2));
                return;
            }
            return;
        }
        throw new IllegalArgumentException(a.K0(sVar, a.P0("Bad sequence size: ")));
    }

    public static a0 s(z zVar, boolean z) {
        s C = s.C(zVar, z);
        if (C instanceof a0) {
            return (a0) C;
        }
        if (C != null) {
            return new a0(s.B(C));
        }
        return null;
    }

    public r c() {
        f fVar = new f(3);
        fVar.a(this.c);
        fVar.a(this.d);
        o0 o0Var = this.q;
        if (o0Var != null) {
            fVar.a(o0Var);
        }
        return new b1(fVar);
    }
}
