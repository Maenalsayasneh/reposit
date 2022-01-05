package m0.r.t.a.r.m;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import m0.n.b.f;
import m0.n.b.i;

/* compiled from: DisjointKeysUnionTypeSubstitution.kt */
public final class m extends p0 {
    public final p0 b;
    public final p0 c;

    public m(p0 p0Var, p0 p0Var2, f fVar) {
        this.b = p0Var;
        this.c = p0Var2;
    }

    public boolean a() {
        return this.b.a() || this.c.a();
    }

    public boolean b() {
        return this.b.b() || this.c.b();
    }

    public m0.r.t.a.r.c.r0.f d(m0.r.t.a.r.c.r0.f fVar) {
        i.e(fVar, "annotations");
        return this.c.d(this.b.d(fVar));
    }

    public m0 e(v vVar) {
        i.e(vVar, InstabugDbContract.UserAttributesEntry.COLUMN_KEY);
        m0 e = this.b.e(vVar);
        return e == null ? this.c.e(vVar) : e;
    }

    public v g(v vVar, Variance variance) {
        i.e(vVar, "topLevelType");
        i.e(variance, "position");
        return this.c.g(this.b.g(vVar, variance), variance);
    }
}
