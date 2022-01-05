package i0.e.b.g3.k.w0.b;

import i0.d.a.a.a;
import i0.e.b.a3.b.c;
import i0.e.b.b3.b.e.m;
import m0.n.b.i;

/* compiled from: PingUserViewModel.kt */
public final class g implements c {
    public final m a;

    public g(m mVar) {
        i.e(mVar, "user");
        this.a = mVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && i.a(this.a, ((g) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        StringBuilder P0 = a.P0("SelectUser(user=");
        P0.append(this.a);
        P0.append(')');
        return P0.toString();
    }
}
