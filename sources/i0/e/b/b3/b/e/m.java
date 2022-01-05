package i0.e.b.b3.b.e;

import com.clubhouse.android.data.models.local.user.UserInList;
import com.clubhouse.android.user.model.User;
import i0.d.a.a.a;
import java.util.Map;
import m0.n.b.f;
import m0.n.b.i;

/* compiled from: PagingItem.kt */
public final class m extends b {
    public final UserInList g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final Map<String, Object> k;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(UserInList userInList, boolean z, boolean z2, boolean z3, Map map, int i2) {
        this(userInList, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? false : z2, (i2 & 8) != 0 ? false : z3, (i2 & 16) != 0 ? null : map);
    }

    public static m g(m mVar, UserInList userInList, boolean z, boolean z2, boolean z3, Map map, int i2) {
        Map<String, Object> map2 = null;
        UserInList userInList2 = (i2 & 1) != 0 ? mVar.g : null;
        if ((i2 & 2) != 0) {
            z = mVar.h;
        }
        boolean z4 = z;
        if ((i2 & 4) != 0) {
            z2 = mVar.i;
        }
        boolean z5 = z2;
        if ((i2 & 8) != 0) {
            z3 = mVar.j;
        }
        boolean z6 = z3;
        if ((i2 & 16) != 0) {
            map2 = mVar.k;
        }
        i.e(userInList2, "user");
        return new m(userInList2, z4, z5, z6, map2);
    }

    public boolean a() {
        return this.j;
    }

    public boolean b() {
        return this.i;
    }

    public User c() {
        return this.g;
    }

    public boolean d() {
        return this.h;
    }

    public b e(boolean z, boolean z2, boolean z3) {
        return g(this, (UserInList) null, z, z2, z3, (Map) null, 17);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return i.a(this.g, mVar.g) && this.h == mVar.h && this.i == mVar.i && this.j == mVar.j && i.a(this.k, mVar.k);
    }

    public int hashCode() {
        int i2;
        int hashCode = this.g.hashCode() * 31;
        boolean z = this.h;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i3 = (hashCode + (z ? 1 : 0)) * 31;
        boolean z3 = this.i;
        if (z3) {
            z3 = true;
        }
        int i4 = (i3 + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.j;
        if (!z4) {
            z2 = z4;
        }
        int i5 = (i4 + (z2 ? 1 : 0)) * 31;
        Map<String, Object> map = this.k;
        if (map == null) {
            i2 = 0;
        } else {
            i2 = map.hashCode();
        }
        return i5 + i2;
    }

    public String toString() {
        StringBuilder P0 = a.P0("UserItem(user=");
        P0.append(this.g);
        P0.append(", isSelf=");
        P0.append(this.h);
        P0.append(", followedBySelf=");
        P0.append(this.i);
        P0.append(", blockedBySelf=");
        P0.append(this.j);
        P0.append(", loggingContext=");
        return a.B0(P0, this.k, ')');
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m(UserInList userInList, boolean z, boolean z2, boolean z3, Map<String, ? extends Object> map) {
        super(userInList, z, z2, z3, map, (f) null);
        i.e(userInList, "user");
        this.g = userInList;
        this.h = z;
        this.i = z2;
        this.j = z3;
        this.k = map;
    }
}
