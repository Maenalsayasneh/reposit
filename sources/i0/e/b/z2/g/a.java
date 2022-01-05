package i0.e.b.z2.g;

import com.clubhouse.android.data.models.local.club.Club;
import i0.e.b.a3.b.c;
import m0.n.b.i;

/* compiled from: ChannelViewModel.kt */
public final class a implements c {
    public final Club a;

    public a(Club club) {
        i.e(club, "club");
        this.a = club;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && i.a(this.a, ((a) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("AcceptClubInvite(club=");
        P0.append(this.a);
        P0.append(')');
        return P0.toString();
    }
}
