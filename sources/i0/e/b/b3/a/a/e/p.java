package i0.e.b.b3.a.a.e;

import com.clubhouse.android.data.models.local.user.BasicUser;
import i0.d.a.a.a;
import m0.n.b.f;
import m0.n.b.i;

/* compiled from: NotificationInfo.kt */
public final class p extends j {
    public final BasicUser a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p(BasicUser basicUser) {
        super((f) null);
        i.e(basicUser, "user");
        this.a = basicUser;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p) && i.a(this.a, ((p) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        StringBuilder P0 = a.P0("UserSource(user=");
        P0.append(this.a);
        P0.append(')');
        return P0.toString();
    }
}
