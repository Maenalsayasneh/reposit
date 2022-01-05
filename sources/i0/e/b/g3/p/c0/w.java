package i0.e.b.g3.p.c0;

import com.clubhouse.android.data.models.local.club.Club;
import i0.d.a.a.a;
import i0.e.b.a3.b.c;
import m0.n.b.i;

/* compiled from: FeedViewModel.kt */
public final class w implements c {
    public final Club a;
    public final String b;

    public w(Club club, String str, int i) {
        int i2 = i & 2;
        i.e(club, "club");
        this.a = club;
        this.b = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return i.a(this.a, wVar.a) && i.a(this.b, wVar.b);
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

    public w(Club club, String str) {
        i.e(club, "club");
        this.a = club;
        this.b = str;
    }
}
