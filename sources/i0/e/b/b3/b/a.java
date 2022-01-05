package i0.e.b.b3.b;

import com.clubhouse.android.data.models.local.club.ClubInStatus;
import com.clubhouse.android.data.models.local.user.UserInStatus;
import java.util.List;
import kotlin.collections.EmptyList;
import m0.n.b.i;

/* compiled from: BuddyListDataSource.kt */
public final class a {
    public final List<ClubInStatus> a;
    public final List<UserInStatus> b;
    public final boolean c;
    public final boolean d;

    public a() {
        this((List) null, (List) null, false, 7);
    }

    public a(List<ClubInStatus> list, List<UserInStatus> list2, boolean z) {
        i.e(list, "allClubs");
        i.e(list2, "onlineUsers");
        this.a = list;
        this.b = list2;
        this.c = z;
        boolean z2 = true;
        if (!(!list.isEmpty()) && !(!list2.isEmpty())) {
            z2 = false;
        }
        this.d = z2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return i.a(this.a, aVar.a) && i.a(this.b, aVar.b) && this.c == aVar.c;
    }

    public int hashCode() {
        int H = i0.d.a.a.a.H(this.b, this.a.hashCode() * 31, 31);
        boolean z = this.c;
        if (z) {
            z = true;
        }
        return H + (z ? 1 : 0);
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("BuddyListData(allClubs=");
        P0.append(this.a);
        P0.append(", onlineUsers=");
        P0.append(this.b);
        P0.append(", error=");
        return i0.d.a.a.a.C0(P0, this.c, ')');
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public a(List list, List list2, boolean z, int i) {
        this((i & 1) != 0 ? EmptyList.c : list, (i & 2) != 0 ? EmptyList.c : list2, (i & 4) != 0 ? false : z);
    }
}
