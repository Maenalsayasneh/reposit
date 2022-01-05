package i0.e.b.g3.r.z2;

import com.clubhouse.android.data.models.local.club.Club;
import i0.d.a.a.a;
import i0.e.b.a3.b.c;

/* compiled from: OnboardingClubsViewModel.kt */
public final class i implements c {
    public final Club a;

    public i(Club club) {
        m0.n.b.i.e(club, "club");
        this.a = club;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && m0.n.b.i.a(this.a, ((i) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        StringBuilder P0 = a.P0("OnboardingToggleClub(club=");
        P0.append(this.a);
        P0.append(')');
        return P0.toString();
    }
}
