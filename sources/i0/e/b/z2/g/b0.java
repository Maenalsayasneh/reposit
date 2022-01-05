package i0.e.b.z2.g;

import com.clubhouse.android.data.models.local.club.Club;
import i0.d.a.a.a;
import i0.e.b.a3.b.c;
import m0.n.b.i;

/* compiled from: ChannelViewModel.kt */
public final class b0 implements c {
    public final Club a;
    public final String b;

    public b0(Club club, String str, int i) {
        int i2 = i & 2;
        i.e(club, "club");
        this.a = club;
        this.b = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return i.a(this.a, b0Var.a) && i.a(this.b, b0Var.b);
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder P0 = a.P0("JoinClub(club=");
        P0.append(this.a);
        P0.append(", reason=");
        return a.w0(P0, this.b, ')');
    }

    public b0(Club club, String str) {
        i.e(club, "club");
        this.a = club;
        this.b = str;
    }
}
