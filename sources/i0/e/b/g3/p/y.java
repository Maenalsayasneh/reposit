package i0.e.b.g3.p;

import i0.d.a.a.a;
import i0.e.b.a3.b.b;
import m0.n.b.i;

/* compiled from: HallwayViewModel.kt */
public final class y implements b {
    public final String a;

    public y(String str) {
        i.e(str, "channelId");
        this.a = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y) && i.a(this.a, ((y) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return a.x0(a.P0("ShowHideChannelDialog(channelId="), this.a, ')');
    }
}
