package i0.e.b.g3.l.a3;

import com.clubhouse.android.data.models.local.club.ClubNominationUser;
import com.clubhouse.android.ui.clubs.invites.GrowClubArgs;
import i0.b.b.j;
import i0.d.a.a.a;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import m0.n.b.f;
import m0.n.b.i;

/* compiled from: ClubNominationsViewModel.kt */
public final class q implements j {
    public final int a;
    public final List<ClubNominationUser> b;
    public final Set<Integer> c;
    public final Set<Integer> d;
    public final boolean e;

    public q(int i, List<ClubNominationUser> list, Set<Integer> set, Set<Integer> set2, boolean z) {
        i.e(list, "nominations");
        i.e(set, "approvedNominations");
        i.e(set2, "rejectedNominations");
        this.a = i;
        this.b = list;
        this.c = set;
        this.d = set2;
        this.e = z;
    }

    public static q copy$default(q qVar, int i, List<ClubNominationUser> list, Set<Integer> set, Set<Integer> set2, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = qVar.a;
        }
        if ((i2 & 2) != 0) {
            list = qVar.b;
        }
        List<ClubNominationUser> list2 = list;
        if ((i2 & 4) != 0) {
            set = qVar.c;
        }
        Set<Integer> set3 = set;
        if ((i2 & 8) != 0) {
            set2 = qVar.d;
        }
        Set<Integer> set4 = set2;
        if ((i2 & 16) != 0) {
            z = qVar.e;
        }
        boolean z2 = z;
        Objects.requireNonNull(qVar);
        i.e(list2, "nominations");
        i.e(set3, "approvedNominations");
        i.e(set4, "rejectedNominations");
        return new q(i, list2, set3, set4, z2);
    }

    public final int component1() {
        return this.a;
    }

    public final List<ClubNominationUser> component2() {
        return this.b;
    }

    public final Set<Integer> component3() {
        return this.c;
    }

    public final Set<Integer> component4() {
        return this.d;
    }

    public final boolean component5() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.a == qVar.a && i.a(this.b, qVar.b) && i.a(this.c, qVar.c) && i.a(this.d, qVar.d) && this.e == qVar.e;
    }

    public int hashCode() {
        int I = a.I(this.d, a.I(this.c, a.H(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31);
        boolean z = this.e;
        if (z) {
            z = true;
        }
        return I + (z ? 1 : 0);
    }

    public String toString() {
        StringBuilder P0 = a.P0("ClubNominationsViewState(clubId=");
        P0.append(this.a);
        P0.append(", nominations=");
        P0.append(this.b);
        P0.append(", approvedNominations=");
        P0.append(this.c);
        P0.append(", rejectedNominations=");
        P0.append(this.d);
        P0.append(", loading=");
        return a.C0(P0, this.e, ')');
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public q(GrowClubArgs growClubArgs) {
        this(growClubArgs.c, (List) null, (Set) null, (Set) null, false, 30, (f) null);
        i.e(growClubArgs, "args");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public q(int i, List list, Set set, Set set2, boolean z, int i2, f fVar) {
        this(i, (i2 & 2) != 0 ? EmptyList.c : list, (i2 & 4) != 0 ? EmptySet.c : set, (i2 & 8) != 0 ? EmptySet.c : set2, (i2 & 16) != 0 ? false : z);
    }
}
