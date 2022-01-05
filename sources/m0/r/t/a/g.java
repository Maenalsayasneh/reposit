package m0.r.t.a;

import java.util.Comparator;
import m0.r.t.a.r.c.o;
import m0.r.t.a.r.c.p;

/* compiled from: KDeclarationContainerImpl.kt */
public final class g<T> implements Comparator<p> {
    public static final g c = new g();

    public int compare(Object obj, Object obj2) {
        Integer b = o.b((p) obj, (p) obj2);
        if (b != null) {
            return b.intValue();
        }
        return 0;
    }
}
