package i0.e.b.g3.l.v2;

import i0.d.a.a.a;
import i0.e.b.a3.b.c;
import m0.n.b.i;

/* compiled from: CreateClubViewModel.kt */
public final class w implements c {
    public final String a;

    public w(String str) {
        i.e(str, "name");
        this.a = str;
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
        return a.x0(a.P0("UpdateName(name="), this.a, ')');
    }
}
