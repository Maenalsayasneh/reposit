package m0.r.t.a.r.m;

import kotlin.reflect.jvm.internal.impl.types.Variance;
import m0.n.b.i;
import m0.r.t.a.r.c.r0.f;

/* compiled from: TypeSubstitution.kt */
public class j extends p0 {
    public final p0 b;

    public j(p0 p0Var) {
        i.e(p0Var, "substitution");
        this.b = p0Var;
    }

    public boolean a() {
        return this.b.a();
    }

    public f d(f fVar) {
        i.e(fVar, "annotations");
        return this.b.d(fVar);
    }

    public boolean f() {
        return this.b.f();
    }

    public v g(v vVar, Variance variance) {
        i.e(vVar, "topLevelType");
        i.e(variance, "position");
        return this.b.g(vVar, variance);
    }
}
