package s0.a.b.k0;

import java.util.Objects;
import s0.a.b.i;

public class f implements i {
    public i c;
    public i d;
    public j q;

    public f(i iVar, i iVar2, j jVar) {
        Objects.requireNonNull(iVar, "staticPrivateKey cannot be null");
        Objects.requireNonNull(iVar2, "ephemeralPrivateKey cannot be null");
        h hVar = iVar.d;
        if (hVar.equals(iVar2.d)) {
            j jVar2 = new j(hVar.c.multiply(iVar2.q), hVar);
            this.c = iVar;
            this.d = iVar2;
            this.q = jVar2;
            return;
        }
        throw new IllegalArgumentException("Static and ephemeral private keys have different domain parameters");
    }
}
