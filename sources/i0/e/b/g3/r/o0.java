package i0.e.b.g3.r;

import com.clubhouse.android.data.models.local.user.BasicUser;
import com.clubhouse.android.ui.onboarding.CollectNameArgs;
import i0.b.b.j;
import i0.d.a.a.a;
import java.util.Objects;
import m0.n.b.f;
import m0.n.b.i;

/* compiled from: CollectNameViewModel.kt */
public final class o0 implements j {
    public final BasicUser a;
    public final boolean b;

    public o0() {
        this((BasicUser) null, false, 3, (f) null);
    }

    public o0(BasicUser basicUser, boolean z) {
        this.a = basicUser;
        this.b = z;
    }

    public static o0 copy$default(o0 o0Var, BasicUser basicUser, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            basicUser = o0Var.a;
        }
        if ((i & 2) != 0) {
            z = o0Var.b;
        }
        Objects.requireNonNull(o0Var);
        return new o0(basicUser, z);
    }

    public final BasicUser component1() {
        return this.a;
    }

    public final boolean component2() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        return i.a(this.a, o0Var.a) && this.b == o0Var.b;
    }

    public int hashCode() {
        BasicUser basicUser = this.a;
        int hashCode = (basicUser == null ? 0 : basicUser.hashCode()) * 31;
        boolean z = this.b;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public String toString() {
        StringBuilder P0 = a.P0("CollectNameState(user=");
        P0.append(this.a);
        P0.append(", isLoading=");
        return a.C0(P0, this.b, ')');
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o0(BasicUser basicUser, boolean z, int i, f fVar) {
        this((i & 1) != 0 ? null : basicUser, (i & 2) != 0 ? false : z);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public o0(CollectNameArgs collectNameArgs) {
        this(collectNameArgs.c, false, 2, (f) null);
        i.e(collectNameArgs, "args");
    }
}
