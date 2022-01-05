package i0.e.b.g3.n;

import i0.e.b.a3.b.c;
import i0.e.b.z2.f.a;
import m0.n.b.i;

/* compiled from: CreateChannelViewModel.kt */
public final class u implements c {
    public final a a;

    public u(a aVar) {
        i.e(aVar, "audience");
        this.a = aVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u) && i.a(this.a, ((u) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("SetAudience(audience=");
        P0.append(this.a);
        P0.append(')');
        return P0.toString();
    }
}
