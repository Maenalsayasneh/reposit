package i0.e.b.b3.a.a.e;

import i0.d.a.a.a;
import m0.n.b.f;
import m0.n.b.i;

/* compiled from: NotificationInfo.kt */
public final class b extends k {
    public final String a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(String str) {
        super((f) null);
        i.e(str, "channelId");
        this.a = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && i.a(this.a, ((b) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return a.x0(a.P0("ChannelTarget(channelId="), this.a, ')');
    }
}
