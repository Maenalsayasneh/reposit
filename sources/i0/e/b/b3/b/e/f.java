package i0.e.b.b3.b.e;

import com.clubhouse.android.data.models.local.user.UserInClub;
import com.clubhouse.android.user.model.User;
import i0.d.a.a.a;
import java.util.Map;
import m0.n.b.i;

/* compiled from: PagingItem.kt */
public final class f extends b {
    public final UserInClub g;
    public final boolean h;
    public final boolean i;
    public final boolean j;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(UserInClub userInClub, boolean z, boolean z2, boolean z3, int i2) {
        this(userInClub, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? false : z2, (i2 & 8) != 0 ? false : z3);
    }

    public static f g(f fVar, UserInClub userInClub, boolean z, boolean z2, boolean z3, int i2) {
        if ((i2 & 1) != 0) {
            userInClub = fVar.g;
        }
        if ((i2 & 2) != 0) {
            z = fVar.h;
        }
        if ((i2 & 4) != 0) {
            z2 = fVar.i;
        }
        if ((i2 & 8) != 0) {
            z3 = fVar.j;
        }
        i.e(userInClub, "user");
        return new f(userInClub, z, z2, z3);
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
        return g(this, (UserInClub) null, z, z2, z3, 1);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return i.a(this.g, fVar.g) && this.h == fVar.h && this.i == fVar.i && this.j == fVar.j;
    }

    public int hashCode() {
        int hashCode = this.g.hashCode() * 31;
        boolean z = this.h;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i2 = (hashCode + (z ? 1 : 0)) * 31;
        boolean z3 = this.i;
        if (z3) {
            z3 = true;
        }
        int i3 = (i2 + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.j;
        if (!z4) {
            z2 = z4;
        }
        return i3 + (z2 ? 1 : 0);
    }

    public String toString() {
        StringBuilder P0 = a.P0("ClubUserItem(user=");
        P0.append(this.g);
        P0.append(", isSelf=");
        P0.append(this.h);
        P0.append(", followedBySelf=");
        P0.append(this.i);
        P0.append(", blockedBySelf=");
        return a.C0(P0, this.j, ')');
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(UserInClub userInClub, boolean z, boolean z2, boolean z3) {
        super(userInClub, z, z2, z3, (Map) null, (m0.n.b.f) null);
        i.e(userInClub, "user");
        this.g = userInClub;
        this.h = z;
        this.i = z2;
        this.j = z3;
    }
}
