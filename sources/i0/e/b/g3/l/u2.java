package i0.e.b.g3.l;

import com.clubhouse.android.data.models.local.club.ClubRule;
import i0.d.a.a.a;
import i0.e.b.a3.b.c;
import java.util.List;
import m0.n.b.i;

/* compiled from: ClubViewModel.kt */
public final class u2 implements c {
    public final List<ClubRule> a;

    public u2(List<ClubRule> list) {
        i.e(list, "rules");
        this.a = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u2) && i.a(this.a, ((u2) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return a.A0(a.P0("UpdateRules(rules="), this.a, ')');
    }
}
