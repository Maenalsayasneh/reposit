package i0.e.b.g3.r.z2;

import com.clubhouse.android.data.models.local.club.Club;
import i0.b.b.j;
import i0.d.a.a.a;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import kotlin.collections.EmptySet;
import m0.n.b.f;
import m0.n.b.i;

/* compiled from: OnboardingClubsViewModel.kt */
public final class h implements j {
    public final boolean a;
    public final List<Club> b;
    public final String c;
    public final Set<Integer> d;
    public final boolean e;
    public final boolean f;

    public h() {
        this(false, (List) null, (String) null, (Set) null, 15, (f) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public h(boolean z, List list, String str, Set set, int i, f fVar) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : str, (i & 8) != 0 ? EmptySet.c : set);
    }

    public static h copy$default(h hVar, boolean z, List<Club> list, String str, Set<Integer> set, int i, Object obj) {
        if ((i & 1) != 0) {
            z = hVar.a;
        }
        if ((i & 2) != 0) {
            list = hVar.b;
        }
        if ((i & 4) != 0) {
            str = hVar.c;
        }
        if ((i & 8) != 0) {
            set = hVar.d;
        }
        Objects.requireNonNull(hVar);
        i.e(set, "selected");
        return new h(z, list, str, set);
    }

    public final boolean component1() {
        return this.a;
    }

    public final List<Club> component2() {
        return this.b;
    }

    public final String component3() {
        return this.c;
    }

    public final Set<Integer> component4() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.a == hVar.a && i.a(this.b, hVar.b) && i.a(this.c, hVar.c) && i.a(this.d, hVar.d);
    }

    public int hashCode() {
        boolean z = this.a;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        List<Club> list = this.b;
        int i2 = 0;
        int hashCode = (i + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.c;
        if (str != null) {
            i2 = str.hashCode();
        }
        return this.d.hashCode() + ((hashCode + i2) * 31);
    }

    public String toString() {
        StringBuilder P0 = a.P0("OnboardingClubsState(loading=");
        P0.append(this.a);
        P0.append(", clubs=");
        P0.append(this.b);
        P0.append(", title=");
        P0.append(this.c);
        P0.append(", selected=");
        P0.append(this.d);
        P0.append(')');
        return P0.toString();
    }

    public h(boolean z, List<? extends Club> list, String str, Set<Integer> set) {
        i.e(set, "selected");
        this.a = z;
        this.b = list;
        this.c = str;
        this.d = set;
        this.e = !set.isEmpty();
        this.f = set.isEmpty();
    }
}
