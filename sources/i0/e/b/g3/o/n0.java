package i0.e.b.g3.o;

import com.clubhouse.android.data.models.local.EventInClub;
import i0.d.a.a.a;
import i0.e.b.a3.b.c;
import m0.n.b.i;

/* compiled from: HalfEventViewModel.kt */
public final class n0 implements c {
    public final EventInClub a;
    public final boolean b;

    public n0(EventInClub eventInClub, boolean z) {
        i.e(eventInClub, "event");
        this.a = eventInClub;
        this.b = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        return i.a(this.a, n0Var.a) && this.b == n0Var.b;
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        boolean z = this.b;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public String toString() {
        StringBuilder P0 = a.P0("MarkAsSubscribed(event=");
        P0.append(this.a);
        P0.append(", subscribed=");
        return a.C0(P0, this.b, ')');
    }
}
