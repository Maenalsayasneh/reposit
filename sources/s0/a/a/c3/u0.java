package s0.a.a.c3;

import i0.d.a.a.a;
import s0.a.a.b1;
import s0.a.a.e1;
import s0.a.a.f;
import s0.a.a.m;
import s0.a.a.r;
import s0.a.a.s;
import s0.a.a.z;

public class u0 extends m {
    public x c;
    public a0 d;
    public f0 q;

    public u0(s sVar) {
        int i;
        if (sVar.size() <= 3) {
            if (!(sVar.D(0) instanceof z)) {
                this.c = x.s(sVar.D(0));
                i = 1;
            } else {
                i = 0;
            }
            while (i != sVar.size()) {
                z B = z.B(sVar.D(i));
                int i2 = B.c;
                if (i2 == 0) {
                    this.d = a0.s(B, false);
                } else if (i2 == 1) {
                    this.q = f0.s(B, false);
                } else {
                    StringBuilder P0 = a.P0("Bad tag number: ");
                    P0.append(B.c);
                    throw new IllegalArgumentException(P0.toString());
                }
                i++;
            }
            return;
        }
        throw new IllegalArgumentException(a.K0(sVar, a.P0("Bad sequence size: ")));
    }

    public static u0 s(Object obj) {
        if (obj instanceof u0) {
            return (u0) obj;
        }
        if (obj != null) {
            return new u0(s.B(obj));
        }
        return null;
    }

    public r c() {
        f fVar = new f(3);
        x xVar = this.c;
        if (xVar != null) {
            fVar.a(xVar);
        }
        a0 a0Var = this.d;
        if (a0Var != null) {
            fVar.a(new e1(false, 0, a0Var));
        }
        f0 f0Var = this.q;
        if (f0Var != null) {
            fVar.a(new e1(false, 1, f0Var));
        }
        return new b1(fVar);
    }
}
