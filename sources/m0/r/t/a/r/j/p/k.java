package m0.r.t.a.r.j.p;

import java.util.Objects;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import m0.n.b.i;
import m0.r.t.a.r.b.f;
import m0.r.t.a.r.c.u;
import m0.r.t.a.r.m.a0;
import m0.r.t.a.r.m.v;

/* compiled from: constantValues.kt */
public final class k extends g<Float> {
    public k(float f) {
        super(Float.valueOf(f));
    }

    public v a(u uVar) {
        i.e(uVar, "module");
        f m = uVar.m();
        Objects.requireNonNull(m);
        a0 t = m.t(PrimitiveType.FLOAT);
        if (t != null) {
            i.d(t, "module.builtIns.floatType");
            return t;
        }
        f.a(59);
        throw null;
    }

    public String toString() {
        return ((Number) this.a).floatValue() + ".toFloat()";
    }
}
