package i0.e.b.g3.r;

import i0.d.a.a.a;
import i0.e.b.a3.b.c;
import m0.n.b.i;

/* compiled from: CollectNameViewModel.kt */
public final class b2 implements c {
    public final String a;
    public final String b;

    public b2(String str, String str2) {
        i.e(str, "firstName");
        i.e(str2, "lastName");
        this.a = str;
        this.b = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b2)) {
            return false;
        }
        b2 b2Var = (b2) obj;
        return i.a(this.a, b2Var.a) && i.a(this.b, b2Var.b);
    }

    public int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public String toString() {
        StringBuilder P0 = a.P0("UpdateName(firstName=");
        P0.append(this.a);
        P0.append(", lastName=");
        return a.x0(P0, this.b, ')');
    }
}
