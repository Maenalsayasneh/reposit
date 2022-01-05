package m0.r.t.a.r.m;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import m0.n.b.f;
import m0.n.b.i;
import m0.r.t.a.r.i.b;
import m0.r.t.a.r.m.z0.d;

/* compiled from: KotlinType.kt */
public abstract class q extends v0 implements d {
    public final a0 d;
    public final a0 q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q(a0 a0Var, a0 a0Var2) {
        super((f) null);
        i.e(a0Var, "lowerBound");
        i.e(a0Var2, "upperBound");
        this.d = a0Var;
        this.q = a0Var2;
    }

    public List<m0> H0() {
        return P0().H0();
    }

    public j0 I0() {
        return P0().I0();
    }

    public boolean J0() {
        return P0().J0();
    }

    public abstract a0 P0();

    public abstract String Q0(DescriptorRenderer descriptorRenderer, b bVar);

    public m0.r.t.a.r.c.r0.f getAnnotations() {
        return P0().getAnnotations();
    }

    public MemberScope o() {
        return P0().o();
    }

    public String toString() {
        return DescriptorRenderer.b.w(this);
    }
}
