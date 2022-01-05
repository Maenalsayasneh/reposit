package i0.e.b.g3.q;

import i0.d.a.a.a;
import i0.e.b.a3.b.c;

/* compiled from: InvitesViewModel.kt */
public final class i implements c {
    public final String a;

    public i(String str) {
        m0.n.b.i.e(str, "phoneNumber");
        this.a = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && m0.n.b.i.a(this.a, ((i) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return a.x0(a.P0("InvitePhone(phoneNumber="), this.a, ')');
    }
}
