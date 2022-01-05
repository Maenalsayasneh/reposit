package s0.a.a.y2;

import java.math.BigInteger;
import s0.a.a.b1;
import s0.a.a.e;
import s0.a.a.e1;
import s0.a.a.f;
import s0.a.a.k;
import s0.a.a.m;
import s0.a.a.o0;
import s0.a.a.r;
import s0.a.a.s;
import s0.a.a.x0;

public class b extends m {
    public s c;

    public b(BigInteger bigInteger, o0 o0Var, e eVar) {
        byte[] c2 = s0.a.g.b.c(bigInteger);
        f fVar = new f(4);
        fVar.a(new k(1));
        fVar.a(new x0(c2));
        if (eVar != null) {
            fVar.a(new e1(true, 0, eVar));
        }
        if (o0Var != null) {
            fVar.a(new e1(true, 1, o0Var));
        }
        this.c = new b1(fVar);
    }

    public r c() {
        return this.c;
    }
}
