package i0.e.b.b3.a.a.e;

import com.clubhouse.android.data.models.local.user.BasicUser;
import i0.d.a.a.a;
import m0.n.b.f;
import m0.n.b.i;

/* compiled from: NotificationInfo.kt */
public final class q extends k {
    public final BasicUser a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q(BasicUser basicUser) {
        super((f) null);
        i.e(basicUser, "user");
        this.a = basicUser;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q) && i.a(this.a, ((q) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        StringBuilder P0 = a.P0("UserTarget(user=");
        P0.append(this.a);
        P0.append(')');
        return P0.toString();
    }
}
