package i0.e.b.g3.u.z5;

import com.clubhouse.android.data.models.local.Language;
import i0.d.a.a.a;
import i0.e.b.a3.b.c;
import m0.n.b.i;

/* compiled from: LanguagesViewModel.kt */
public final class v1 implements c {
    public final Language a;
    public final boolean b;

    public v1(Language language, boolean z) {
        i.e(language, "language");
        this.a = language;
        this.b = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v1)) {
            return false;
        }
        v1 v1Var = (v1) obj;
        return i.a(this.a, v1Var.a) && this.b == v1Var.b;
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
        StringBuilder P0 = a.P0("UpdateLanguage(language=");
        P0.append(this.a);
        P0.append(", selected=");
        return a.C0(P0, this.b, ')');
    }
}
