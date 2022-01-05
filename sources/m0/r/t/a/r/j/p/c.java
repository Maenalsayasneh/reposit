package m0.r.t.a.r.j.p;

import java.util.Objects;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import m0.n.b.i;
import m0.r.t.a.r.b.f;
import m0.r.t.a.r.c.u;
import m0.r.t.a.r.m.a0;
import m0.r.t.a.r.m.v;

/* compiled from: constantValues.kt */
public final class c extends g<Boolean> {
    public c(boolean z) {
        super(Boolean.valueOf(z));
    }

    public v a(u uVar) {
        i.e(uVar, "module");
        f m = uVar.m();
        Objects.requireNonNull(m);
        a0 t = m.t(PrimitiveType.BOOLEAN);
        if (t != null) {
            i.d(t, "module.builtIns.booleanType");
            return t;
        }
        f.a(62);
        throw null;
    }
}
