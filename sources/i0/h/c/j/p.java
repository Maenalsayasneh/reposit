package i0.h.c.j;

import java.util.HashSet;
import java.util.Set;

/* compiled from: CycleDetector */
public class p {
    public final d<?> a;
    public final Set<p> b = new HashSet();
    public final Set<p> c = new HashSet();

    public p(d<?> dVar) {
        this.a = dVar;
    }

    public boolean a() {
        return this.c.isEmpty();
    }
}
