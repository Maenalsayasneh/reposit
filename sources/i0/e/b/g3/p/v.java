package i0.e.b.g3.p;

import i0.d.a.a.a;
import i0.e.b.a3.b.c;
import m0.n.b.i;

/* compiled from: HallwayViewModel.kt */
public final class v implements c {
    public final String a;

    public v(String str) {
        i.e(str, "channelId");
        this.a = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v) && i.a(this.a, ((v) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return a.x0(a.P0("OpenHideChannelDialog(channelId="), this.a, ')');
    }
}
