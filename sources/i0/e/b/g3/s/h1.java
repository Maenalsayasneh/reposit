package i0.e.b.g3.s;

import i0.d.a.a.a;
import i0.e.b.a3.b.c;
import m0.n.b.i;

/* compiled from: PaymentsRegistrationViewModel.kt */
public final class h1 implements c {
    public final String a;

    public h1(String str) {
        i.e(str, "email");
        this.a = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h1) && i.a(this.a, ((h1) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return a.x0(a.P0("VerifyEmail(email="), this.a, ')');
    }
}
