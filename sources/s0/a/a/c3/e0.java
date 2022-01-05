package s0.a.a.c3;

import i0.d.a.a.a;
import java.math.BigInteger;
import java.util.Enumeration;
import s0.a.a.b1;
import s0.a.a.e;
import s0.a.a.e1;
import s0.a.a.f;
import s0.a.a.m;
import s0.a.a.r;
import s0.a.a.s;
import s0.a.a.z;

public class e0 extends m {
    public y[] c;
    public y[] d;

    public e0(s sVar) {
        Enumeration E = sVar.E();
        while (E.hasMoreElements()) {
            z B = z.B(E.nextElement());
            int i = B.c;
            if (i == 0) {
                this.c = s(s.C(B, false));
            } else if (i == 1) {
                this.d = s(s.C(B, false));
            } else {
                StringBuilder P0 = a.P0("Unknown tag encountered: ");
                P0.append(B.c);
                throw new IllegalArgumentException(P0.toString());
            }
        }
    }

    public r c() {
        f fVar = new f(2);
        y[] yVarArr = this.c;
        if (yVarArr != null) {
            fVar.a(new e1(false, 0, new b1((e[]) yVarArr)));
        }
        y[] yVarArr2 = this.d;
        if (yVarArr2 != null) {
            fVar.a(new e1(false, 1, new b1((e[]) yVarArr2)));
        }
        return new b1(fVar);
    }

    public final y[] s(s sVar) {
        int size = sVar.size();
        y[] yVarArr = new y[size];
        for (int i = 0; i != size; i++) {
            e D = sVar.D(i);
            BigInteger bigInteger = y.c;
            yVarArr[i] = D == null ? null : D instanceof y ? (y) D : new y(s.B(D));
        }
        return yVarArr;
    }
}
