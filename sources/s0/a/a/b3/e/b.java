package s0.a.a.b3.e;

import m0.r.t.a.r.m.a1.a;
import s0.a.a.b3.c;
import s0.a.a.b3.d;

public class b extends c {
    public static final d Q = new b();

    public boolean a(c cVar, c cVar2) {
        s0.a.a.b3.b[] u = cVar.u();
        s0.a.a.b3.b[] u2 = cVar2.u();
        if (u.length != u2.length) {
            return false;
        }
        for (int i = 0; i != u.length; i++) {
            if (!a.b3(u[i], u2[i])) {
                return false;
            }
        }
        return true;
    }
}
