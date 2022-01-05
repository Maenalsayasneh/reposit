package i0.e.b.g3.u;

import i0.d.a.a.a;
import i0.e.b.a3.b.b;
import m0.n.b.i;

/* compiled from: EditPhotoViewModel.kt */
public final class a4 implements b {
    public final String a;

    public a4(String str) {
        this.a = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a4) && i.a(this.a, ((a4) obj).a);
    }

    public int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return a.w0(a.P0("DismissEditPhoto(photoUrl="), this.a, ')');
    }
}
