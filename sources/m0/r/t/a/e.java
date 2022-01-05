package m0.r.t.a;

import m0.n.b.i;
import m0.r.t.a.s.b;

/* compiled from: kClassCache.kt */
public final class e {
    public static b<String, Object> a;

    static {
        b<Object, Object> bVar = b.a;
        if (bVar != null) {
            i.d(bVar, "HashPMap.empty<String, Any>()");
            a = bVar;
            return;
        }
        throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", new Object[]{"kotlin/reflect/jvm/internal/pcollections/HashPMap", "empty"}));
    }
}
