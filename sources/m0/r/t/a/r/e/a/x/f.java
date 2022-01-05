package m0.r.t.a.r.e.a.x;

import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import m0.n.b.i;
import m0.r.t.a.r.m.a0;
import m0.r.t.a.r.m.a1.a;
import m0.r.t.a.r.m.h;
import m0.r.t.a.r.m.k;
import m0.r.t.a.r.m.q;
import m0.r.t.a.r.m.s0;
import m0.r.t.a.r.m.v;
import m0.r.t.a.r.m.v0;

/* compiled from: typeEnhancement.kt */
public final class f extends k implements h {
    public final a0 d;

    public f(a0 a0Var) {
        i.e(a0Var, "delegate");
        this.d = a0Var;
    }

    public boolean D() {
        return true;
    }

    public v I(v vVar) {
        i.e(vVar, "replacement");
        v0 L0 = vVar.L0();
        if (!a.z2(L0) && !s0.g(L0)) {
            return L0;
        }
        if (L0 instanceof a0) {
            return U0((a0) L0);
        }
        if (L0 instanceof q) {
            KotlinTypeFactory kotlinTypeFactory = KotlinTypeFactory.a;
            q qVar = (q) L0;
            return i0.j.f.p.h.G4(KotlinTypeFactory.c(U0(qVar.d), U0(qVar.q)), i0.j.f.p.h.a1(L0));
        }
        throw new IllegalStateException(i.k("Incorrect type: ", L0).toString());
    }

    public boolean J0() {
        return false;
    }

    public a0 P0(boolean z) {
        return z ? this.d.M0(true) : this;
    }

    public a0 Q0(m0.r.t.a.r.c.r0.f fVar) {
        i.e(fVar, "newAnnotations");
        return new f(this.d.Q0(fVar));
    }

    public a0 R0() {
        return this.d;
    }

    public k T0(a0 a0Var) {
        i.e(a0Var, "delegate");
        return new f(a0Var);
    }

    public final a0 U0(a0 a0Var) {
        a0 P0 = a0Var.M0(false);
        if (!a.z2(a0Var)) {
            return P0;
        }
        return new f(P0);
    }

    /* renamed from: V0 */
    public f O0(m0.r.t.a.r.c.r0.f fVar) {
        i.e(fVar, "newAnnotations");
        return new f(this.d.Q0(fVar));
    }
}
