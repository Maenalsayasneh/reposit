package m0.r.t.a.r.m;

import i0.j.f.p.h;
import kotlin.NoWhenBranchMatchedException;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import m0.n.b.i;
import m0.r.t.a.r.c.m0;
import m0.r.t.a.r.c.r0.f;
import m0.r.t.a.r.i.b;
import m0.r.t.a.r.m.a1.a;
import m0.r.t.a.r.m.x0.e;

/* compiled from: flexibleTypes.kt */
public final class r extends q implements h {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r(a0 a0Var, a0 a0Var2) {
        super(a0Var, a0Var2);
        i.e(a0Var, "lowerBound");
        i.e(a0Var2, "upperBound");
    }

    public boolean D() {
        return (this.d.I0().c() instanceof m0) && i.a(this.d.I0(), this.q.I0());
    }

    public v I(v vVar) {
        v0 v0Var;
        i.e(vVar, "replacement");
        v0 L0 = vVar.L0();
        if (L0 instanceof q) {
            v0Var = L0;
        } else if (L0 instanceof a0) {
            KotlinTypeFactory kotlinTypeFactory = KotlinTypeFactory.a;
            a0 a0Var = (a0) L0;
            v0Var = KotlinTypeFactory.c(a0Var, a0Var.M0(true));
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return h.a2(v0Var, L0);
    }

    public v0 M0(boolean z) {
        KotlinTypeFactory kotlinTypeFactory = KotlinTypeFactory.a;
        return KotlinTypeFactory.c(this.d.M0(z), this.q.M0(z));
    }

    public v0 O0(f fVar) {
        i.e(fVar, "newAnnotations");
        KotlinTypeFactory kotlinTypeFactory = KotlinTypeFactory.a;
        return KotlinTypeFactory.c(this.d.Q0(fVar), this.q.Q0(fVar));
    }

    public a0 P0() {
        return this.d;
    }

    public String Q0(DescriptorRenderer descriptorRenderer, b bVar) {
        i.e(descriptorRenderer, "renderer");
        i.e(bVar, "options");
        if (!bVar.o()) {
            return descriptorRenderer.t(descriptorRenderer.w(this.d), descriptorRenderer.w(this.q), a.F1(this));
        }
        StringBuilder N0 = i0.d.a.a.a.N0('(');
        N0.append(descriptorRenderer.w(this.d));
        N0.append("..");
        N0.append(descriptorRenderer.w(this.q));
        N0.append(')');
        return N0.toString();
    }

    /* renamed from: R0 */
    public q N0(e eVar) {
        i.e(eVar, "kotlinTypeRefiner");
        return new r((a0) eVar.g(this.d), (a0) eVar.g(this.q));
    }
}
