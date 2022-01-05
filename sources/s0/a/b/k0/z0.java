package s0.a.b.k0;

import java.util.Objects;
import s0.a.b.i;

public class z0 implements i {
    public b0 c;
    public b0 d;
    public c0 q;

    public z0(b0 b0Var, b0 b0Var2, c0 c0Var) {
        Objects.requireNonNull(b0Var, "staticPrivateKey cannot be null");
        Objects.requireNonNull(b0Var2, "ephemeralPrivateKey cannot be null");
        w wVar = b0Var.d;
        if (wVar.equals(b0Var2.d)) {
            if (c0Var == null) {
                c0Var = new c0(new s0.a.e.b.i().a(wVar.i, b0Var2.q), wVar);
            } else if (!wVar.equals(c0Var.d)) {
                throw new IllegalArgumentException("Ephemeral public key has different domain parameters");
            }
            this.c = b0Var;
            this.d = b0Var2;
            this.q = c0Var;
            return;
        }
        throw new IllegalArgumentException("Static and ephemeral private keys have different domain parameters");
    }
}
