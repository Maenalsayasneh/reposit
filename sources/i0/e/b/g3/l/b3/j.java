package i0.e.b.g3.l.b3;

import com.clubhouse.android.data.models.local.club.ClubRule;
import i0.d.a.a.a;
import java.util.Objects;
import m0.n.b.i;

/* compiled from: EditClubRulesViewModel.kt */
public final class j implements i0.b.b.j {
    public final ClubRule a;
    public final ClubRule b;
    public final ClubRule c;

    public j(ClubRule clubRule, ClubRule clubRule2, ClubRule clubRule3) {
        this.a = clubRule;
        this.b = clubRule2;
        this.c = clubRule3;
    }

    public static j copy$default(j jVar, ClubRule clubRule, ClubRule clubRule2, ClubRule clubRule3, int i, Object obj) {
        if ((i & 1) != 0) {
            clubRule = jVar.a;
        }
        if ((i & 2) != 0) {
            clubRule2 = jVar.b;
        }
        if ((i & 4) != 0) {
            clubRule3 = jVar.c;
        }
        Objects.requireNonNull(jVar);
        return new j(clubRule, clubRule2, clubRule3);
    }

    public final ClubRule component1() {
        return this.a;
    }

    public final ClubRule component2() {
        return this.b;
    }

    public final ClubRule component3() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return i.a(this.a, jVar.a) && i.a(this.b, jVar.b) && i.a(this.c, jVar.c);
    }

    public int hashCode() {
        ClubRule clubRule = this.a;
        int i = 0;
        int hashCode = (clubRule == null ? 0 : clubRule.hashCode()) * 31;
        ClubRule clubRule2 = this.b;
        int hashCode2 = (hashCode + (clubRule2 == null ? 0 : clubRule2.hashCode())) * 31;
        ClubRule clubRule3 = this.c;
        if (clubRule3 != null) {
            i = clubRule3.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder P0 = a.P0("EditClubRulesViewState(clubRuleOne=");
        P0.append(this.a);
        P0.append(", clubRuleTwo=");
        P0.append(this.b);
        P0.append(", clubRuleThree=");
        P0.append(this.c);
        P0.append(')');
        return P0.toString();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: com.clubhouse.android.data.models.local.club.ClubRule} */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public j(com.clubhouse.android.ui.clubs.rules.EditClubRulesArgs r5) {
        /*
            r4 = this;
            java.lang.String r0 = "args"
            m0.n.b.i.e(r5, r0)
            java.util.List<com.clubhouse.android.data.models.local.club.ClubRule> r0 = r5.d
            r1 = 0
            if (r0 != 0) goto L_0x000c
            r0 = r1
            goto L_0x0013
        L_0x000c:
            r2 = 0
            java.lang.Object r0 = m0.j.g.z(r0, r2)
            com.clubhouse.android.data.models.local.club.ClubRule r0 = (com.clubhouse.android.data.models.local.club.ClubRule) r0
        L_0x0013:
            java.util.List<com.clubhouse.android.data.models.local.club.ClubRule> r2 = r5.d
            if (r2 != 0) goto L_0x0019
            r2 = r1
            goto L_0x0020
        L_0x0019:
            r3 = 1
            java.lang.Object r2 = m0.j.g.z(r2, r3)
            com.clubhouse.android.data.models.local.club.ClubRule r2 = (com.clubhouse.android.data.models.local.club.ClubRule) r2
        L_0x0020:
            java.util.List<com.clubhouse.android.data.models.local.club.ClubRule> r5 = r5.d
            if (r5 != 0) goto L_0x0025
            goto L_0x002d
        L_0x0025:
            r1 = 2
            java.lang.Object r5 = m0.j.g.z(r5, r1)
            r1 = r5
            com.clubhouse.android.data.models.local.club.ClubRule r1 = (com.clubhouse.android.data.models.local.club.ClubRule) r1
        L_0x002d:
            r4.<init>(r0, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.e.b.g3.l.b3.j.<init>(com.clubhouse.android.ui.clubs.rules.EditClubRulesArgs):void");
    }
}
