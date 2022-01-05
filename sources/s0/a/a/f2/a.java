package s0.a.a.f2;

import java.util.Objects;
import s0.a.a.n;

public class a {
    public static final n a;
    public static final n b;
    public static final n c;

    static {
        n nVar = new n("1.3.6.1.4.1.3029");
        a = nVar;
        Objects.requireNonNull(nVar);
        n nVar2 = new n(new n(nVar, "1"), "5");
        b = nVar2;
        Objects.requireNonNull(nVar2);
        c = new n(nVar2, "1");
    }
}
