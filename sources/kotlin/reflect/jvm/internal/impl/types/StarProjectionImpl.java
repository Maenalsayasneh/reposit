package kotlin.reflect.jvm.internal.impl.types;

import i0.j.f.p.h;
import kotlin.LazyThreadSafetyMode;
import m0.c;
import m0.n.b.i;
import m0.r.t.a.r.c.m0;
import m0.r.t.a.r.m.n0;
import m0.r.t.a.r.m.v;
import m0.r.t.a.r.m.x0.e;

/* compiled from: StarProjectionImpl.kt */
public final class StarProjectionImpl extends n0 {
    public final m0 a;
    public final c b = h.G2(LazyThreadSafetyMode.PUBLICATION, new StarProjectionImpl$_type$2(this));

    public StarProjectionImpl(m0 m0Var) {
        i.e(m0Var, "typeParameter");
        this.a = m0Var;
    }

    public m0.r.t.a.r.m.m0 a(e eVar) {
        i.e(eVar, "kotlinTypeRefiner");
        return this;
    }

    public Variance b() {
        return Variance.OUT_VARIANCE;
    }

    public boolean c() {
        return true;
    }

    public v getType() {
        return (v) this.b.getValue();
    }
}
