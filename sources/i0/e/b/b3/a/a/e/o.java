package i0.e.b.b3.a.a.e;

import i0.d.a.a.a;
import m0.n.b.f;
import m0.n.b.i;

/* compiled from: NotificationInfo.kt */
public final class o extends k {
    public final String a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o(String str) {
        super((f) null);
        i.e(str, "url");
        this.a = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o) && i.a(this.a, ((o) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return a.x0(a.P0("UrlTarget(url="), this.a, ')');
    }
}
