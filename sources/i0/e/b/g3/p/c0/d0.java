package i0.e.b.g3.p.c0;

import i0.d.a.a.a;
import i0.e.b.a3.b.c;
import i0.e.b.b3.b.e.m;
import m0.n.b.i;

/* compiled from: FeedViewModel.kt */
public final class d0 implements c {
    public final m a;

    public d0(m mVar) {
        i.e(mVar, "user");
        this.a = mVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d0) && i.a(this.a, ((d0) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        StringBuilder P0 = a.P0("ToggleFollowUser(user=");
        P0.append(this.a);
        P0.append(')');
        return P0.toString();
    }
}
