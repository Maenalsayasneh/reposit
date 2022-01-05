package i0.e.b.g3.o.w0;

import i0.d.a.a.a;
import i0.e.b.a3.b.c;
import m0.n.b.i;

/* compiled from: AddEditEventViewModel.kt */
public final class m0 implements c {
    public final String a;

    public m0(String str) {
        i.e(str, "newDesciption");
        this.a = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m0) && i.a(this.a, ((m0) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return a.x0(a.P0("UpdateDescription(newDesciption="), this.a, ')');
    }
}
