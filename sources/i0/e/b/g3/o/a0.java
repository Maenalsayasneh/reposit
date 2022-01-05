package i0.e.b.g3.o;

import com.clubhouse.android.data.models.local.EventInClub;
import i0.d.a.a.a;
import i0.e.b.a3.b.c;
import m0.n.b.i;

/* compiled from: EventsViewModel.kt */
public final class a0 implements c {
    public final EventInClub a;

    public a0(EventInClub eventInClub) {
        i.e(eventInClub, "event");
        this.a = eventInClub;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a0) && i.a(this.a, ((a0) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        StringBuilder P0 = a.P0("DeleteEvent(event=");
        P0.append(this.a);
        P0.append(')');
        return P0.toString();
    }
}
