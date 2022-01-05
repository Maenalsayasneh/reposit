package i0.e.b.g3.w;

import i0.d.a.a.a;
import i0.e.b.a3.b.c;
import i0.e.b.b3.b.e.m;
import m0.n.b.i;

/* compiled from: ExploreV2ViewModel.kt */
public final class i0 implements c {
    public final m a;

    public i0(m mVar) {
        i.e(mVar, "user");
        this.a = mVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i0) && i.a(this.a, ((i0) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        StringBuilder P0 = a.P0("ToggleFollowUserItem(user=");
        P0.append(this.a);
        P0.append(')');
        return P0.toString();
    }
}
