package i0.e.b.g3.n;

import com.clubhouse.android.data.models.local.EventInClub;
import i0.d.a.a.a;
import i0.e.b.a3.b.c;
import m0.n.b.i;

/* compiled from: CreateChannelViewModel.kt */
public final class r implements c {
    public final EventInClub a;

    public r() {
        this((EventInClub) null, 1);
    }

    public r(EventInClub eventInClub) {
        this.a = eventInClub;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r) && i.a(this.a, ((r) obj).a);
    }

    public int hashCode() {
        EventInClub eventInClub = this.a;
        if (eventInClub == null) {
            return 0;
        }
        return eventInClub.hashCode();
    }

    public String toString() {
        StringBuilder P0 = a.P0("CreateChannel(event=");
        P0.append(this.a);
        P0.append(')');
        return P0.toString();
    }

    public r(EventInClub eventInClub, int i) {
        int i2 = i & 1;
        this.a = null;
    }
}
