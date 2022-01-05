package i0.e.b.g3.u;

import com.clubhouse.android.ui.profile.EditBioArgs;
import i0.b.b.j;
import i0.d.a.a.a;
import java.util.Objects;
import m0.n.b.f;
import m0.n.b.i;

/* compiled from: EditBioViewModel.kt */
public final class c4 implements j {
    public final String a;

    public c4() {
        this((String) null, 1, (f) null);
    }

    public c4(String str) {
        i.e(str, "bio");
        this.a = str;
    }

    public static c4 copy$default(c4 c4Var, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c4Var.a;
        }
        Objects.requireNonNull(c4Var);
        i.e(str, "bio");
        return new c4(str);
    }

    public final String component1() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c4) && i.a(this.a, ((c4) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return a.x0(a.P0("EditBioState(bio="), this.a, ')');
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c4(String str, int i, f fVar) {
        this((i & 1) != 0 ? "" : str);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public c4(EditBioArgs editBioArgs) {
        this(editBioArgs.c);
        i.e(editBioArgs, "args");
    }
}
