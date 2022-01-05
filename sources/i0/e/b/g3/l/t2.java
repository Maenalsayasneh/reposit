package i0.e.b.g3.l;

import android.net.Uri;
import i0.d.a.a.a;
import i0.e.b.a3.b.c;
import m0.n.b.i;

/* compiled from: ClubViewModel.kt */
public final class t2 implements c {
    public final Uri a;

    public t2(Uri uri) {
        i.e(uri, "photo");
        this.a = uri;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t2) && i.a(this.a, ((t2) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        StringBuilder P0 = a.P0("UpdatePhoto(photo=");
        P0.append(this.a);
        P0.append(')');
        return P0.toString();
    }
}
