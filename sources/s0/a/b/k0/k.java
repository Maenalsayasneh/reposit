package s0.a.b.k0;

import java.util.Objects;
import s0.a.b.i;

public class k implements i {
    public i c;
    public i d;

    public k(i iVar, i iVar2, j jVar) {
        Objects.requireNonNull(iVar, "staticPrivateKey cannot be null");
        Objects.requireNonNull(iVar2, "ephemeralPrivateKey cannot be null");
        h hVar = iVar.d;
        if (hVar.equals(iVar2.d)) {
            new j(hVar.c.modPow(iVar2.q, hVar.d), hVar);
            this.c = iVar;
            this.d = iVar2;
            return;
        }
        throw new IllegalArgumentException("static and ephemeral private keys have different domain parameters");
    }
}
