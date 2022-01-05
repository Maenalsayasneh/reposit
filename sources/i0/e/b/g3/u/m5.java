package i0.e.b.g3.u;

import i0.d.a.a.a;
import i0.e.b.a3.b.b;
import m0.n.b.i;

/* compiled from: ProfileViewModel.kt */
public final class m5 implements b {
    public final String a;

    public m5(String str) {
        i.e(str, "email");
        this.a = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m5) && i.a(this.a, ((m5) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return a.x0(a.P0("ShowVerifyEmailSuccess(email="), this.a, ')');
    }
}
