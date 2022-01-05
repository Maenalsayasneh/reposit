package i0.e.b.g3.u.z5;

import i0.b.b.j;
import i0.d.a.a.a;
import java.util.Objects;
import m0.n.b.f;

/* compiled from: DeactivateViewModel.kt */
public final class q0 implements j {
    public final boolean a;

    public q0() {
        this(false, 1, (f) null);
    }

    public q0(boolean z) {
        this.a = z;
    }

    public static q0 copy$default(q0 q0Var, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = q0Var.a;
        }
        Objects.requireNonNull(q0Var);
        return new q0(z);
    }

    public final boolean component1() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q0) && this.a == ((q0) obj).a;
    }

    public int hashCode() {
        boolean z = this.a;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public String toString() {
        return a.C0(a.P0("DeactivateState(loading="), this.a, ')');
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q0(boolean z, int i, f fVar) {
        this((i & 1) != 0 ? false : z);
    }
}
