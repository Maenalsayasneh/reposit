package m0.r.t.a.r.m;

import kotlin.reflect.jvm.internal.impl.types.Variance;

/* compiled from: TypeProjectionBase */
public abstract class n0 implements m0 {
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        return c() == m0Var.c() && b() == m0Var.b() && getType().equals(m0Var.getType());
    }

    public int hashCode() {
        int hashCode = b().hashCode();
        if (s0.p(getType())) {
            return (hashCode * 31) + 19;
        }
        return (hashCode * 31) + (c() ? 17 : getType().hashCode());
    }

    public String toString() {
        if (c()) {
            return "*";
        }
        if (b() == Variance.INVARIANT) {
            return getType().toString();
        }
        return b() + " " + getType();
    }
}
