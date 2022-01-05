package m0.r.t.a.r.m;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import m0.n.b.f;

/* compiled from: KotlinType.kt */
public abstract class w0 extends v {
    public w0() {
        super((f) null);
    }

    public List<m0> H0() {
        return M0().H0();
    }

    public j0 I0() {
        return M0().I0();
    }

    public boolean J0() {
        return M0().J0();
    }

    public final v0 L0() {
        v M0 = M0();
        while (M0 instanceof w0) {
            M0 = ((w0) M0).M0();
        }
        return (v0) M0;
    }

    public abstract v M0();

    public boolean N0() {
        return true;
    }

    public m0.r.t.a.r.c.r0.f getAnnotations() {
        return M0().getAnnotations();
    }

    public MemberScope o() {
        return M0().o();
    }

    public String toString() {
        return N0() ? M0().toString() : "<Not computed yet>";
    }
}
