package m0.r.t.a.r.m;

import kotlin.reflect.jvm.internal.impl.types.Variance;
import m0.n.b.i;
import m0.r.t.a.r.b.f;
import m0.r.t.a.r.m.x0.e;

/* compiled from: StarProjectionImpl.kt */
public final class e0 extends n0 {
    public final v a;

    public e0(f fVar) {
        i.e(fVar, "kotlinBuiltIns");
        a0 p = fVar.p();
        i.d(p, "kotlinBuiltIns.nullableAnyType");
        this.a = p;
    }

    public m0 a(e eVar) {
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
        return this.a;
    }
}
