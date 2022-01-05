package i0.e.b.g3.u.z5;

import com.clubhouse.android.data.models.local.Language;
import i0.b.b.j;
import i0.d.a.a.a;
import java.util.List;
import java.util.Objects;
import kotlin.collections.EmptyList;
import m0.n.b.f;
import m0.n.b.i;

/* compiled from: LanguagesViewModel.kt */
public final class v0 implements j {
    public final List<Language> a;
    public final boolean b;

    public v0() {
        this((List) null, false, 3, (f) null);
    }

    public v0(List<Language> list, boolean z) {
        i.e(list, "languages");
        this.a = list;
        this.b = z;
    }

    public static v0 copy$default(v0 v0Var, List<Language> list, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            list = v0Var.a;
        }
        if ((i & 2) != 0) {
            z = v0Var.b;
        }
        Objects.requireNonNull(v0Var);
        i.e(list, "languages");
        return new v0(list, z);
    }

    public final List<Language> component1() {
        return this.a;
    }

    public final boolean component2() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        return i.a(this.a, v0Var.a) && this.b == v0Var.b;
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
        StringBuilder P0 = a.P0("LanguagesViewState(languages=");
        P0.append(this.a);
        P0.append(", languagesUpdated=");
        return a.C0(P0, this.b, ')');
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public v0(List list, boolean z, int i, f fVar) {
        this((i & 1) != 0 ? EmptyList.c : list, (i & 2) != 0 ? false : z);
    }
}
