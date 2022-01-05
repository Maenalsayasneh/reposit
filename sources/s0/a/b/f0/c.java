package s0.a.b.f0;

import java.math.BigInteger;
import s0.a.b.b;
import s0.a.b.k0.d;
import s0.a.b.k0.h;
import s0.a.b.k0.i;
import s0.a.b.k0.j;
import s0.a.b.q;

public class c implements s0.a.b.c {
    public d g;

    public void a(q qVar) {
        this.g = (d) qVar;
    }

    public b b() {
        d dVar = d.a;
        d dVar2 = this.g;
        h hVar = dVar2.c;
        BigInteger a = d.a(hVar, dVar2.a);
        return new b(new j(hVar.c.modPow(a, hVar.d), hVar), new i(a, hVar));
    }
}
