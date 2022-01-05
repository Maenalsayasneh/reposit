package i0.e.b.g3.u;

import i0.d.a.a.a;
import i0.e.b.a3.b.c;
import m0.n.b.i;

/* compiled from: ProfileViewModel.kt */
public final class x5 implements c {
    public final String a;

    public x5(String str) {
        i.e(str, "email");
        this.a = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x5) && i.a(this.a, ((x5) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return a.x0(a.P0("VerifyEmail(email="), this.a, ')');
    }
}
