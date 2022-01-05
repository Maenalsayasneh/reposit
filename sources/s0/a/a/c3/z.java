package s0.a.a.c3;

import i0.d.a.a.a;
import s0.a.a.b1;
import s0.a.a.e1;
import s0.a.a.f;
import s0.a.a.m;
import s0.a.a.r;
import s0.a.a.s;

public class z extends m {
    public a0 c;
    public x d;
    public f0 q;
    public int x = 1;

    public z(s sVar) {
        if (sVar.size() <= 3) {
            for (int i = 0; i != sVar.size(); i++) {
                s0.a.a.z B = s0.a.a.z.B(sVar.D(i));
                int i2 = B.c;
                if (i2 == 0) {
                    this.c = a0.s(B, false);
                } else if (i2 == 1) {
                    this.d = new x(s.C(B, false));
                } else if (i2 == 2) {
                    this.q = f0.s(B, false);
                } else {
                    throw new IllegalArgumentException("unknown tag in Holder");
                }
            }
            this.x = 1;
            return;
        }
        throw new IllegalArgumentException(a.K0(sVar, a.P0("Bad sequence size: ")));
    }

    public static z s(Object obj) {
        if (obj instanceof z) {
            return (z) obj;
        }
        if (obj instanceof s0.a.a.z) {
            return new z(s0.a.a.z.B(obj));
        }
        if (obj != null) {
            return new z(s.B(obj));
        }
        return null;
    }

    public r c() {
        if (this.x == 1) {
            f fVar = new f(3);
            a0 a0Var = this.c;
            if (a0Var != null) {
                fVar.a(new e1(false, 0, a0Var));
            }
            x xVar = this.d;
            if (xVar != null) {
                fVar.a(new e1(false, 1, xVar));
            }
            f0 f0Var = this.q;
            if (f0Var != null) {
                fVar.a(new e1(false, 2, f0Var));
            }
            return new b1(fVar);
        }
        x xVar2 = this.d;
        return xVar2 != null ? new e1(true, 1, xVar2) : new e1(true, 0, this.c);
    }

    public z(s0.a.a.z zVar) {
        int i = zVar.c;
        if (i == 0) {
            this.c = a0.s(zVar, true);
        } else if (i == 1) {
            this.d = new x(s.C(zVar, true));
        } else {
            throw new IllegalArgumentException("unknown tag in Holder");
        }
        this.x = 0;
    }
}
