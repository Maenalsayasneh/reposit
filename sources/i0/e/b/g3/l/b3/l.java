package i0.e.b.g3.l.b3;

import com.clubhouse.android.data.models.local.club.ClubRule;
import i0.d.a.a.a;
import i0.e.b.a3.b.b;
import java.util.List;
import m0.n.b.i;

/* compiled from: EditClubRulesViewModel.kt */
public final class l implements b {
    public final List<ClubRule> a;

    public l(List<ClubRule> list) {
        i.e(list, "clubRulesResult");
        this.a = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && i.a(this.a, ((l) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return a.A0(a.P0("SaveRulesComplete(clubRulesResult="), this.a, ')');
    }
}
