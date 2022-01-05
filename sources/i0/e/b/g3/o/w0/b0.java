package i0.e.b.g3.o.w0;

import com.clubhouse.android.data.models.local.EventInClub;
import i0.d.a.a.a;
import i0.e.b.a3.b.b;
import m0.n.b.i;

/* compiled from: AddEditEventViewModel.kt */
public final class b0 implements b {
    public final EventInClub a;

    public b0(EventInClub eventInClub) {
        i.e(eventInClub, "event");
        this.a = eventInClub;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b0) && i.a(this.a, ((b0) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        StringBuilder P0 = a.P0("EventWasCreated(event=");
        P0.append(this.a);
        P0.append(')');
        return P0.toString();
    }
}
