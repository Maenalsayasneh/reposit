package i0.e.b.g3.u;

import i0.d.a.a.a;
import i0.e.b.a3.b.c;
import m0.n.b.i;

/* compiled from: EditBioViewModel.kt */
public final class s5 implements c {
    public final String a;

    public s5(String str) {
        i.e(str, "bio");
        this.a = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s5) && i.a(this.a, ((s5) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return a.x0(a.P0("UpdateBio(bio="), this.a, ')');
    }
}
