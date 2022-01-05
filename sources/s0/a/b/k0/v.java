package s0.a.b.k0;

import java.util.Objects;
import s0.a.b.i;

public class v implements i {
    public c0 c;
    public c0 d;

    public v(c0 c0Var, c0 c0Var2) {
        Objects.requireNonNull(c0Var, "staticPublicKey cannot be null");
        Objects.requireNonNull(c0Var2, "ephemeralPublicKey cannot be null");
        if (c0Var.d.equals(c0Var2.d)) {
            this.c = c0Var;
            this.d = c0Var2;
            return;
        }
        throw new IllegalArgumentException("static and ephemeral public keys have different domain parameters");
    }
}
