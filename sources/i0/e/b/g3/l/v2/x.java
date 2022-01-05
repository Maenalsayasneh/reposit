package i0.e.b.g3.l.v2;

import android.net.Uri;
import i0.d.a.a.a;
import i0.e.b.a3.b.c;
import m0.n.b.i;

/* compiled from: CreateClubViewModel.kt */
public final class x implements c {
    public final Uri a;

    public x(Uri uri) {
        i.e(uri, "photoUri");
        this.a = uri;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x) && i.a(this.a, ((x) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        StringBuilder P0 = a.P0("UpdatePhoto(photoUri=");
        P0.append(this.a);
        P0.append(')');
        return P0.toString();
    }
}
