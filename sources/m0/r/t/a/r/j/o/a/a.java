package m0.r.t.a.r.j.o.a;

import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import m0.n.b.i;
import m0.r.t.a.r.c.r0.f;
import m0.r.t.a.r.m.a0;
import m0.r.t.a.r.m.j0;
import m0.r.t.a.r.m.m0;
import m0.r.t.a.r.m.p;
import m0.r.t.a.r.m.v0;
import m0.r.t.a.r.m.x0.e;

/* compiled from: CapturedTypeConstructor.kt */
public final class a extends a0 implements m0.r.t.a.r.m.z0.a {
    public final m0 d;
    public final b q;
    public final boolean x;
    public final f y;

    public a(m0 m0Var, b bVar, boolean z, f fVar) {
        i.e(m0Var, "typeProjection");
        i.e(bVar, "constructor");
        i.e(fVar, "annotations");
        this.d = m0Var;
        this.q = bVar;
        this.x = z;
        this.y = fVar;
    }

    public List<m0> H0() {
        return EmptyList.c;
    }

    public j0 I0() {
        return this.q;
    }

    public boolean J0() {
        return this.x;
    }

    public v0 M0(boolean z) {
        if (z == this.x) {
            return this;
        }
        return new a(this.d, this.q, z, this.y);
    }

    public v0 O0(f fVar) {
        i.e(fVar, "newAnnotations");
        return new a(this.d, this.q, this.x, fVar);
    }

    public a0 P0(boolean z) {
        if (z == this.x) {
            return this;
        }
        return new a(this.d, this.q, z, this.y);
    }

    public a0 Q0(f fVar) {
        i.e(fVar, "newAnnotations");
        return new a(this.d, this.q, this.x, fVar);
    }

    /* renamed from: R0 */
    public a N0(e eVar) {
        i.e(eVar, "kotlinTypeRefiner");
        m0 a = this.d.a(eVar);
        i.d(a, "typeProjection.refine(kotlinTypeRefiner)");
        return new a(a, this.q, this.x, this.y);
    }

    public f getAnnotations() {
        return this.y;
    }

    public MemberScope o() {
        MemberScope c = p.c("No member resolution should be done on captured type, it used only during constraint system resolution", true);
        i.d(c, "createErrorScope(\n            \"No member resolution should be done on captured type, it used only during constraint system resolution\", true\n        )");
        return c;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("Captured(");
        P0.append(this.d);
        P0.append(')');
        P0.append(this.x ? "?" : "");
        return P0.toString();
    }
}
