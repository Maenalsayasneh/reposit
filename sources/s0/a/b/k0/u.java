package s0.a.b.k0;

import java.util.Objects;
import s0.a.b.i;

public class u implements i {
    public b0 c;
    public b0 d;

    public u(b0 b0Var, b0 b0Var2, c0 c0Var) {
        Objects.requireNonNull(b0Var, "staticPrivateKey cannot be null");
        Objects.requireNonNull(b0Var2, "ephemeralPrivateKey cannot be null");
        w wVar = b0Var.d;
        if (wVar.equals(b0Var2.d)) {
            w.b(wVar.g, new s0.a.e.b.i().a(wVar.i, b0Var2.q));
            this.c = b0Var;
            this.d = b0Var2;
            return;
        }
        throw new IllegalArgumentException("static and ephemeral private keys have different domain parameters");
    }
}
