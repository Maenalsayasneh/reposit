package i0.e.b.g3.o;

import com.clubhouse.android.data.models.local.EventInClub;
import i0.d.a.a.a;
import i0.e.b.a3.b.c;
import m0.n.b.i;

/* compiled from: HalfEventViewModel.kt */
public final class z implements c {
    public final EventInClub a;

    public z(EventInClub eventInClub) {
        i.e(eventInClub, "event");
        this.a = eventInClub;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z) && i.a(this.a, ((z) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        StringBuilder P0 = a.P0("CreateRoom(event=");
        P0.append(this.a);
        P0.append(')');
        return P0.toString();
    }
}
