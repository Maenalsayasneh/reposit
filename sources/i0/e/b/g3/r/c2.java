package i0.e.b.g3.r;

import i0.d.a.a.a;
import i0.e.b.a3.b.c;
import m0.n.b.i;

/* compiled from: CollectUsernameViewModel.kt */
public final class c2 implements c {
    public final String a;

    public c2(String str) {
        i.e(str, "username");
        this.a = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c2) && i.a(this.a, ((c2) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return a.x0(a.P0("UpdateUsername(username="), this.a, ')');
    }
}
