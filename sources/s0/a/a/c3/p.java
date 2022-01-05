package s0.a.a.c3;

import i0.d.a.a.a;
import java.util.Enumeration;
import s0.a.a.b1;
import s0.a.a.e1;
import s0.a.a.f;
import s0.a.a.m;
import s0.a.a.r;
import s0.a.a.s;
import s0.a.a.z;

public class p extends m {
    public n c;
    public n d;

    public p(s sVar) {
        if (sVar.size() == 1 || sVar.size() == 2) {
            Enumeration E = sVar.E();
            while (E.hasMoreElements()) {
                z B = z.B(E.nextElement());
                int i = B.c;
                if (i == 0) {
                    this.c = n.s(s.C(B, true));
                } else if (i == 1) {
                    this.d = n.s(s.C(B, true));
                } else {
                    StringBuilder P0 = a.P0("Bad tag number: ");
                    P0.append(B.c);
                    throw new IllegalArgumentException(P0.toString());
                }
            }
            return;
        }
        throw new IllegalArgumentException(a.K0(sVar, a.P0("Bad sequence size: ")));
    }

    public r c() {
        f fVar = new f(2);
        n nVar = this.c;
        if (nVar != null) {
            fVar.a(new e1(0, nVar));
        }
        n nVar2 = this.d;
        if (nVar2 != null) {
            fVar.a(new e1(1, nVar2));
        }
        return new b1(fVar);
    }
}
