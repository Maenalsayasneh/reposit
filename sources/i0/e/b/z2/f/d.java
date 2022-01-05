package i0.e.b.z2.f;

import com.clubhouse.android.data.models.local.club.Club;
import i0.d.a.a.a;
import m0.n.b.i;

/* compiled from: Audience.kt */
public final class d implements a {
    public final Club c;

    public d(Club club) {
        i.e(club, "club");
        this.c = club;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && i.a(this.c, ((d) obj).c);
    }

    public int hashCode() {
        return this.c.hashCode();
    }

    public String toString() {
        StringBuilder P0 = a.P0("ClubAudience(club=");
        P0.append(this.c);
        P0.append(')');
        return P0.toString();
    }
}
