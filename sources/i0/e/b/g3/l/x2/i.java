package i0.e.b.g3.l.x2;

import com.clubhouse.android.user.model.User;
import i0.d.a.a.a;
import i0.e.b.a3.b.c;

/* compiled from: GrowClubViewModel.kt */
public final class i implements c {
    public final User a;
    public final String b;

    public i(User user, String str, int i) {
        String str2 = (i & 2) != 0 ? "" : null;
        m0.n.b.i.e(user, "user");
        this.a = user;
        this.b = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return m0.n.b.i.a(this.a, iVar.a) && m0.n.b.i.a(this.b, iVar.b);
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder P0 = a.P0("AddToClub(user=");
        P0.append(this.a);
        P0.append(", reason=");
        return a.w0(P0, this.b, ')');
    }

    public i(User user, String str) {
        m0.n.b.i.e(user, "user");
        this.a = user;
        this.b = str;
    }
}
