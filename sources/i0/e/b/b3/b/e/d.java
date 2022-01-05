package i0.e.b.b3.b.e;

import com.clubhouse.android.data.models.local.channel.UserInChannel;
import com.clubhouse.android.user.model.User;
import i0.d.a.a.a;
import java.util.Map;
import m0.n.b.f;
import m0.n.b.i;

/* compiled from: PagingItem.kt */
public final class d extends b {
    public final UserInChannel g;
    public final boolean h;
    public final boolean i;
    public final boolean j;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(UserInChannel userInChannel, boolean z, boolean z2, boolean z3, int i2) {
        this(userInChannel, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? false : z2, (i2 & 8) != 0 ? false : z3);
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
        UserInChannel userInChannel = this.g;
        i.e(userInChannel, "user");
        return new d(userInChannel, z, z2, z3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return i.a(this.g, dVar.g) && this.h == dVar.h && this.i == dVar.i && this.j == dVar.j;
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
        StringBuilder P0 = a.P0("ChannelUserItem(user=");
        P0.append(this.g);
        P0.append(", isSelf=");
        P0.append(this.h);
        P0.append(", followedBySelf=");
        P0.append(this.i);
        P0.append(", blockedBySelf=");
        return a.C0(P0, this.j, ')');
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(UserInChannel userInChannel, boolean z, boolean z2, boolean z3) {
        super(userInChannel, z, z2, z3, (Map) null, (f) null);
        i.e(userInChannel, "user");
        this.g = userInChannel;
        this.h = z;
        this.i = z2;
        this.j = z3;
    }
}
