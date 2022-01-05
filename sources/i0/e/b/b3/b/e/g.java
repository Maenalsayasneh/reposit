package i0.e.b.b3.b.e;

import com.clubhouse.android.data.models.local.EventInClub;
import i0.d.a.a.a;
import java.util.Map;
import m0.n.b.f;
import m0.n.b.i;

/* compiled from: PagingItem.kt */
public final class g extends a {
    public final EventInClub d;
    public final Map<String, Object> e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(EventInClub eventInClub, Map<String, ? extends Object> map) {
        super(eventInClub, map, (f) null);
        i.e(eventInClub, "event");
        this.d = eventInClub;
        this.e = map;
    }

    public EventInClub a() {
        return this.d;
    }

    public a b(EventInClub eventInClub) {
        i.e(eventInClub, "event");
        Map<String, Object> map = this.e;
        i.e(eventInClub, "event");
        return new g(eventInClub, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return i.a(this.d, gVar.d) && i.a(this.e, gVar.e);
    }

    public int hashCode() {
        int i;
        int hashCode = this.d.hashCode() * 31;
        Map<String, Object> map = this.e;
        if (map == null) {
            i = 0;
        } else {
            i = map.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder P0 = a.P0("EventItem(event=");
        P0.append(this.d);
        P0.append(", loggingContext=");
        return a.B0(P0, this.e, ')');
    }
}
