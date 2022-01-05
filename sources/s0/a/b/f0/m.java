package s0.a.b.f0;

import java.security.SecureRandom;
import s0.a.b.b;
import s0.a.b.c;
import s0.a.b.k0.h0;
import s0.a.b.q;

public class m implements c {
    public SecureRandom g;

    public void a(q qVar) {
        this.g = qVar.a;
    }

    public b b() {
        h0 h0Var = new h0(this.g);
        return new b(h0Var.a(), h0Var);
    }
}
