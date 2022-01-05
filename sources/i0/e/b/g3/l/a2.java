package i0.e.b.g3.l;

import com.clubhouse.android.data.models.local.club.ClubRule;
import com.clubhouse.android.ui.clubs.HalfClubRulesArgs;
import i0.b.b.j;
import i0.d.a.a.a;
import java.util.List;
import java.util.Objects;
import m0.n.b.i;

/* compiled from: HalfClubRulesViewModel.kt */
public final class a2 implements j {
    public final HalfClubRulesArgs a;
    public final int b;
    public final String c;
    public final List<ClubRule> d;

    public a2(HalfClubRulesArgs halfClubRulesArgs, int i, String str, List<ClubRule> list) {
        i.e(halfClubRulesArgs, "args");
        i.e(str, "clubName");
        i.e(list, "clubRules");
        this.a = halfClubRulesArgs;
        this.b = i;
        this.c = str;
        this.d = list;
    }

    public static a2 copy$default(a2 a2Var, HalfClubRulesArgs halfClubRulesArgs, int i, String str, List<ClubRule> list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            halfClubRulesArgs = a2Var.a;
        }
        if ((i2 & 2) != 0) {
            i = a2Var.b;
        }
        if ((i2 & 4) != 0) {
            str = a2Var.c;
        }
        if ((i2 & 8) != 0) {
            list = a2Var.d;
        }
        Objects.requireNonNull(a2Var);
        i.e(halfClubRulesArgs, "args");
        i.e(str, "clubName");
        i.e(list, "clubRules");
        return new a2(halfClubRulesArgs, i, str, list);
    }

    public final HalfClubRulesArgs component1() {
        return this.a;
    }

    public final int component2() {
        return this.b;
    }

    public final String component3() {
        return this.c;
    }

    public final List<ClubRule> component4() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a2)) {
            return false;
        }
        a2 a2Var = (a2) obj;
        return i.a(this.a, a2Var.a) && this.b == a2Var.b && i.a(this.c, a2Var.c) && i.a(this.d, a2Var.d);
    }

    public int hashCode() {
        return this.d.hashCode() + a.F(this.c, a.M(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public String toString() {
        StringBuilder P0 = a.P0("HalfClubRulesViewState(args=");
        P0.append(this.a);
        P0.append(", clubId=");
        P0.append(this.b);
        P0.append(", clubName=");
        P0.append(this.c);
        P0.append(", clubRules=");
        return a.A0(P0, this.d, ')');
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public a2(HalfClubRulesArgs halfClubRulesArgs) {
        this(halfClubRulesArgs, halfClubRulesArgs.c.getId(), halfClubRulesArgs.c.getName(), halfClubRulesArgs.c.b0());
        i.e(halfClubRulesArgs, "args");
    }
}
