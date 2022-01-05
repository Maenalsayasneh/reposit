package i0.e.b.g3.n;

import i0.d.a.a.a;
import i0.e.b.a3.b.c;
import i0.e.b.b3.b.e.m;
import m0.n.b.i;

/* compiled from: ChooseUsersViewModel.kt */
public final class w implements c {
    public final m a;

    public w(m mVar) {
        i.e(mVar, "user");
        this.a = mVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w) && i.a(this.a, ((w) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        StringBuilder P0 = a.P0("ToggleUser(user=");
        P0.append(this.a);
        P0.append(')');
        return P0.toString();
    }
}
