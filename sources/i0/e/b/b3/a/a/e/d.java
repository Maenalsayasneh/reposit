package i0.e.b.b3.a.a.e;

import i0.d.a.a.a;
import m0.n.b.f;

/* compiled from: NotificationInfo.kt */
public final class d extends k {
    public final int a;

    public d(int i) {
        super((f) null);
        this.a = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && this.a == ((d) obj).a;
    }

    public int hashCode() {
        return Integer.hashCode(this.a);
    }

    public String toString() {
        return a.s0(a.P0("ClubTarget(clubId="), this.a, ')');
    }
}
