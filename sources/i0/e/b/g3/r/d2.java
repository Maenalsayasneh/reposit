package i0.e.b.g3.r;

import i0.d.a.a.a;
import i0.e.b.a3.b.c;
import m0.n.b.i;

/* compiled from: CollectPhoneNumberViewModel.kt */
public final class d2 implements c {
    public final String a;

    public d2(String str) {
        i.e(str, "number");
        this.a = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d2) && i.a(this.a, ((d2) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return a.x0(a.P0("ValidateNumber(number="), this.a, ')');
    }
}
