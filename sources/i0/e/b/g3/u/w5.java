package i0.e.b.g3.u;

import com.clubhouse.android.data.models.local.EventInClub;
import i0.d.a.a.a;
import i0.e.b.a3.b.c;
import m0.n.b.i;

/* compiled from: ProfileViewModel.kt */
public final class w5 implements c {
    public final EventInClub a;

    public w5(EventInClub eventInClub) {
        i.e(eventInClub, "event");
        this.a = eventInClub;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w5) && i.a(this.a, ((w5) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        StringBuilder P0 = a.P0("UpdateUpcomingEvent(event=");
        P0.append(this.a);
        P0.append(')');
        return P0.toString();
    }
}
