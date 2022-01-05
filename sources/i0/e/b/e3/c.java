package i0.e.b.e3;

import i0.d.a.a.a;
import m0.n.b.i;

/* compiled from: NotificationUtil.kt */
public final class c {
    public final String a;
    public final int b;
    public final int c;

    public c(String str, int i, int i2) {
        i.e(str, "channelId");
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return i.a(this.a, cVar.a) && this.b == cVar.b && this.c == cVar.c;
    }

    public int hashCode() {
        return Integer.hashCode(this.c) + a.M(this.b, this.a.hashCode() * 31, 31);
    }

    public String toString() {
        StringBuilder P0 = a.P0("NotificationGroup(channelId=");
        P0.append(this.a);
        P0.append(", title=");
        P0.append(this.b);
        P0.append(", importance=");
        return a.s0(P0, this.c, ')');
    }
}
