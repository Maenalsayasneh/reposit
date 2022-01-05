package i0.e.b.g3.o;

import com.clubhouse.android.data.models.local.EventInClub;
import com.clubhouse.android.ui.events.EventActionType;
import i0.d.a.a.a;
import i0.e.b.a3.b.b;
import m0.n.b.i;

/* compiled from: HalfEventViewModel.kt */
public final class o0 implements b {
    public final EventActionType a;
    public final EventInClub b;

    public o0(EventActionType eventActionType, EventInClub eventInClub) {
        i.e(eventActionType, "eventActionType");
        i.e(eventInClub, "event");
        this.a = eventActionType;
        this.b = eventInClub;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        return this.a == o0Var.a && i.a(this.b, o0Var.b);
    }

    public int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public String toString() {
        StringBuilder P0 = a.P0("PerformEventAction(eventActionType=");
        P0.append(this.a);
        P0.append(", event=");
        P0.append(this.b);
        P0.append(')');
        return P0.toString();
    }
}
