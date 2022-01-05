package i0.e.b.g3.o;

import com.clubhouse.android.data.models.local.EventInClub;
import i0.d.a.a.a;
import i0.e.b.a3.b.c;
import java.util.Map;
import m0.n.b.i;

/* compiled from: EventsViewModel.kt */
public final class p0 implements c {
    public final EventInClub a;
    public final Map<String, Object> b;

    public p0(EventInClub eventInClub, Map map, int i) {
        int i2 = i & 2;
        i.e(eventInClub, "event");
        this.a = eventInClub;
        this.b = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        return i.a(this.a, p0Var.a) && i.a(this.b, p0Var.b);
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Map<String, Object> map = this.b;
        return hashCode + (map == null ? 0 : map.hashCode());
    }

    public String toString() {
        StringBuilder P0 = a.P0("RSVPEvent(event=");
        P0.append(this.a);
        P0.append(", loggingContext=");
        return a.B0(P0, this.b, ')');
    }

    public p0(EventInClub eventInClub, Map<String, ? extends Object> map) {
        i.e(eventInClub, "event");
        this.a = eventInClub;
        this.b = map;
    }
}
