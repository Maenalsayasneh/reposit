package i0.e.b.g3.r.z2;

import com.clubhouse.android.data.models.local.club.Club;
import i0.d.a.a.a;
import i0.e.b.a3.b.b;
import m0.n.b.i;

/* compiled from: OnboardingClubsViewModel.kt */
public final class j implements b {
    public final Club a;

    public j(Club club) {
        i.e(club, "club");
        this.a = club;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && i.a(this.a, ((j) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        StringBuilder P0 = a.P0("ShowClubRules(club=");
        P0.append(this.a);
        P0.append(')');
        return P0.toString();
    }
}
