package i0.e.b.g3.u;

import com.clubhouse.android.ui.profile.HalfProfileArgs;
import i0.b.b.j;
import i0.d.a.a.a;
import java.util.Objects;
import m0.n.b.f;
import m0.n.b.i;

/* compiled from: HalfProfileContainerViewModel.kt */
public final class n4 implements j {
    public final HalfProfileArgs a;
    public final boolean b;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public n4(HalfProfileArgs halfProfileArgs) {
        this(halfProfileArgs, halfProfileArgs.q);
        i.e(halfProfileArgs, "halfProfileArgs");
    }

    public static n4 copy$default(n4 n4Var, HalfProfileArgs halfProfileArgs, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            halfProfileArgs = n4Var.a;
        }
        if ((i & 2) != 0) {
            z = n4Var.b;
        }
        Objects.requireNonNull(n4Var);
        i.e(halfProfileArgs, "args");
        return new n4(halfProfileArgs, z);
    }

    public final HalfProfileArgs component1() {
        return this.a;
    }

    public final boolean component2() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n4)) {
            return false;
        }
        n4 n4Var = (n4) obj;
        return i.a(this.a, n4Var.a) && this.b == n4Var.b;
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        boolean z = this.b;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public String toString() {
        StringBuilder P0 = a.P0("HalfProfileContainerViewState(args=");
        P0.append(this.a);
        P0.append(", expanded=");
        return a.C0(P0, this.b, ')');
    }

    public n4(HalfProfileArgs halfProfileArgs, boolean z) {
        i.e(halfProfileArgs, "args");
        this.a = halfProfileArgs;
        this.b = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n4(HalfProfileArgs halfProfileArgs, boolean z, int i, f fVar) {
        this(halfProfileArgs, (i & 2) != 0 ? false : z);
    }
}
