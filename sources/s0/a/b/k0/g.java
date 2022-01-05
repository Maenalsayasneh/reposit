package s0.a.b.k0;

import java.util.Objects;
import s0.a.b.i;

public class g implements i {
    public j c;
    public j d;

    public g(j jVar, j jVar2) {
        Objects.requireNonNull(jVar, "staticPublicKey cannot be null");
        Objects.requireNonNull(jVar2, "ephemeralPublicKey cannot be null");
        if (jVar.d.equals(jVar2.d)) {
            this.c = jVar;
            this.d = jVar2;
            return;
        }
        throw new IllegalArgumentException("Static and ephemeral public keys have different domain parameters");
    }
}
