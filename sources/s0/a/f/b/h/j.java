package s0.a.f.b.h;

import i0.d.a.a.a;
import java.util.Map;
import java.util.Objects;
import s0.a.a.n;
import s0.a.e.b.b0.c.h3;

public final class j {
    public final r a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final n g;

    public j(n nVar) {
        Objects.requireNonNull(nVar, "treeDigest == null");
        this.g = nVar;
        s0.a.b.n a2 = c.a(nVar);
        String algorithmName = a2.getAlgorithmName();
        int digestSize = algorithmName.equals("SHAKE128") ? 32 : algorithmName.equals("SHAKE256") ? 64 : a2.getDigestSize();
        this.b = digestSize;
        this.c = 16;
        int ceil = (int) Math.ceil(((double) (digestSize * 8)) / ((double) h3.k2(16)));
        this.e = ceil;
        int floor = ((int) Math.floor((double) (h3.k2((16 - 1) * ceil) / h3.k2(16)))) + 1;
        this.f = floor;
        int i = ceil + floor;
        this.d = i;
        String algorithmName2 = a2.getAlgorithmName();
        Map<String, i> map = i.a;
        Objects.requireNonNull(algorithmName2, "algorithmName == null");
        i iVar = i.a.get(i.b(algorithmName2, digestSize, 16, i));
        this.a = iVar;
        if (iVar == null) {
            StringBuilder P0 = a.P0("cannot find OID for digest algorithm: ");
            P0.append(a2.getAlgorithmName());
            throw new IllegalArgumentException(P0.toString());
        }
    }
}
