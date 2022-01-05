package m0.r.t.a.r.j.p;

import java.util.Objects;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import m0.n.b.i;
import m0.r.t.a.r.b.f;
import m0.r.t.a.r.c.u;
import m0.r.t.a.r.m.a0;
import m0.r.t.a.r.m.v;

/* compiled from: constantValues.kt */
public final class p extends m<Long> {
    public p(long j) {
        super(Long.valueOf(j));
    }

    public v a(u uVar) {
        i.e(uVar, "module");
        f m = uVar.m();
        Objects.requireNonNull(m);
        a0 t = m.t(PrimitiveType.LONG);
        if (t != null) {
            i.d(t, "module.builtIns.longType");
            return t;
        }
        f.a(58);
        throw null;
    }

    public String toString() {
        return ((Number) this.a).longValue() + ".toLong()";
    }
}
