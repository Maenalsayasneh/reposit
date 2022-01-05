package i0.e.b.b3.a.a.e;

import i0.d.a.a.a;
import m0.n.b.f;

/* compiled from: NotificationInfo.kt */
public final class e extends k {
    public final int a;

    public e(int i) {
        super((f) null);
        this.a = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && this.a == ((e) obj).a;
    }

    public int hashCode() {
        return Integer.hashCode(this.a);
    }

    public String toString() {
        return a.s0(a.P0("EventTarget(eventId="), this.a, ')');
    }
}
