package i0.e.b.g3.p.c0;

import com.clubhouse.android.data.models.local.club.Club;
import i0.d.a.a.a;
import i0.e.b.a3.b.c;
import m0.n.b.i;

/* compiled from: FeedViewModel.kt */
public final class a0 implements c {
    public final Club a;

    public a0(Club club) {
        i.e(club, "club");
        this.a = club;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a0) && i.a(this.a, ((a0) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        StringBuilder P0 = a.P0("RemoveClubSuggestion(club=");
        P0.append(this.a);
        P0.append(')');
        return P0.toString();
    }
}
