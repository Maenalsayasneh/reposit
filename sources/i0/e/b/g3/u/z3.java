package i0.e.b.g3.u;

import i0.d.a.a.a;
import i0.e.b.a3.b.b;
import m0.n.b.i;

/* compiled from: EditBioViewModel.kt */
public final class z3 implements b {
    public final String a;

    public z3(String str) {
        i.e(str, "bio");
        this.a = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z3) && i.a(this.a, ((z3) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return a.x0(a.P0("DismissEditBio(bio="), this.a, ')');
    }
}
