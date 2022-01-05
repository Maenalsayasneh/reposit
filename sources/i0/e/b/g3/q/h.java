package i0.e.b.g3.q;

import i0.d.a.a.a;
import i0.e.b.a3.b.c;
import m0.n.b.i;

/* compiled from: InvitesViewModel.kt */
public final class h implements c {
    public final String a;
    public final String b;

    public h(String str, String str2) {
        i.e(str, "phoneNumber");
        this.a = str;
        this.b = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return i.a(this.a, hVar.a) && i.a(this.b, hVar.b);
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder P0 = a.P0("Invite(phoneNumber=");
        P0.append(this.a);
        P0.append(", name=");
        return a.w0(P0, this.b, ')');
    }
}
