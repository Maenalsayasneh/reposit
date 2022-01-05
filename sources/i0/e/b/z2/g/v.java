package i0.e.b.z2.g;

import com.clubhouse.android.data.models.local.user.SourceLocation;
import com.clubhouse.android.user.model.User;
import com.stripe.android.model.Stripe3ds2AuthParams;
import i0.d.a.a.a;
import i0.e.b.a3.b.c;
import m0.n.b.i;

/* compiled from: ChannelViewModel.kt */
public final class v implements c {
    public final User a;
    public final SourceLocation b;

    public v(User user, SourceLocation sourceLocation) {
        i.e(user, "user");
        i.e(sourceLocation, Stripe3ds2AuthParams.FIELD_SOURCE);
        this.a = user;
        this.b = sourceLocation;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return i.a(this.a, vVar.a) && this.b == vVar.b;
    }

    public int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public String toString() {
        StringBuilder P0 = a.P0("FollowUser(user=");
        P0.append(this.a);
        P0.append(", source=");
        P0.append(this.b);
        P0.append(')');
        return P0.toString();
    }
}
