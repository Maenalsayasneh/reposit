package i0.e.b.g3.o;

import com.clubhouse.android.ui.events.EventsFilteringType;
import i0.d.a.a.a;
import i0.e.b.a3.b.c;
import m0.n.b.i;

/* compiled from: EventsViewModel.kt */
public final class y implements c {
    public final EventsFilteringType a;

    public y(EventsFilteringType eventsFilteringType) {
        i.e(eventsFilteringType, "eventsFilteringType");
        this.a = eventsFilteringType;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y) && this.a == ((y) obj).a;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        StringBuilder P0 = a.P0("ChangeFilteringType(eventsFilteringType=");
        P0.append(this.a);
        P0.append(')');
        return P0.toString();
    }
}
