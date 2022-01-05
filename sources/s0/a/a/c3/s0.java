package s0.a.a.c3;

import i0.d.a.a.a;
import java.util.Enumeration;
import s0.a.a.m;
import s0.a.a.r;
import s0.a.a.s;
import s0.a.a.z;

public class s0 extends m {
    public s c;

    public s0(s sVar) {
        this.c = sVar;
    }

    public r c() {
        return this.c;
    }

    public q0[] s() {
        q0 q0Var;
        q0[] q0VarArr = new q0[this.c.size()];
        Enumeration E = this.c.E();
        int i = 0;
        while (E.hasMoreElements()) {
            int i2 = i + 1;
            Object nextElement = E.nextElement();
            if (nextElement == null || (nextElement instanceof q0)) {
                q0Var = (q0) nextElement;
            } else if (nextElement instanceof z) {
                q0Var = new q0((z) nextElement);
            } else {
                StringBuilder P0 = a.P0("unknown object in factory: ");
                P0.append(nextElement.getClass());
                throw new IllegalArgumentException(P0.toString());
            }
            q0VarArr[i] = q0Var;
            i = i2;
        }
        return q0VarArr;
    }
}
