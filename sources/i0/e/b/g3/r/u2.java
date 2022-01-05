package i0.e.b.g3.r;

import com.clubhouse.android.ui.onboarding.WaitlistArgs;
import i0.b.b.j;
import i0.d.a.a.a;
import java.util.Objects;
import m0.n.b.f;
import m0.n.b.i;

/* compiled from: WaitlistViewModel.kt */
public final class u2 implements j {
    public final String a;
    public final boolean b;

    public u2() {
        this((String) null, false, 3, (f) null);
    }

    public u2(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public static u2 copy$default(u2 u2Var, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = u2Var.a;
        }
        if ((i & 2) != 0) {
            z = u2Var.b;
        }
        Objects.requireNonNull(u2Var);
        return new u2(str, z);
    }

    public final String component1() {
        return this.a;
    }

    public final boolean component2() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u2)) {
            return false;
        }
        u2 u2Var = (u2) obj;
        return i.a(this.a, u2Var.a) && this.b == u2Var.b;
    }

    public int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        boolean z = this.b;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public String toString() {
        StringBuilder P0 = a.P0("WaitlistState(username=");
        P0.append(this.a);
        P0.append(", isLoading=");
        return a.C0(P0, this.b, ')');
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u2(String str, boolean z, int i, f fVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? false : z);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public u2(WaitlistArgs waitlistArgs) {
        this(waitlistArgs.c, false, 2, (f) null);
        i.e(waitlistArgs, "args");
    }
}
