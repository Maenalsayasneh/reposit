package m0.r.t.a.r.m;

import m0.n.a.l;
import m0.r.t.a.r.b.g;
import m0.r.t.a.r.g.b;

/* compiled from: TypeSubstitutor */
public final class q0 implements l<b, Boolean> {
    public Object invoke(Object obj) {
        b bVar = (b) obj;
        if (bVar != null) {
            return Boolean.valueOf(!bVar.equals(g.a.G));
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", new Object[]{"name", "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor$1", "invoke"}));
    }
}
