package s0.a.c.n;

import java.security.spec.AlgorithmParameterSpec;
import s0.a.a.g2.b;
import s0.a.a.n;
import s0.a.a.x2.a;

public class j implements AlgorithmParameterSpec {
    public final n a;
    public final n b;
    public final n c;

    public j(String str) {
        n c2 = b.c(str);
        n nVar = str.indexOf("12-512") > 0 ? a.d : str.indexOf("12-256") > 0 ? a.c : s0.a.a.g2.a.p;
        this.a = c2;
        this.b = nVar;
        this.c = null;
    }
}
