package i0.e.b.b3.a.a.e;

import i0.d.a.a.a;

/* compiled from: NotificationInfo.kt */
public final class f extends k {
    public final long a;

    public f(long j) {
        super((m0.n.b.f) null);
        this.a = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && this.a == ((f) obj).a;
    }

    public int hashCode() {
        return Long.hashCode(this.a);
    }

    public String toString() {
        StringBuilder P0 = a.P0("FollowsYouStackedTarget(notificationId=");
        P0.append(this.a);
        P0.append(')');
        return P0.toString();
    }
}
