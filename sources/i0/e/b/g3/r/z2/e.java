package i0.e.b.g3.r.z2;

import com.clubhouse.android.data.models.local.club.Club;
import i0.d.a.a.a;
import i0.e.b.a3.b.c;
import m0.n.b.i;

/* compiled from: OnboardingClubsViewModel.kt */
public final class e implements c {
    public final Club a;

    public e(Club club) {
        i.e(club, "club");
        this.a = club;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && i.a(this.a, ((e) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        StringBuilder P0 = a.P0("AcceptRulesAndJoin(club=");
        P0.append(this.a);
        P0.append(')');
        return P0.toString();
    }
}
