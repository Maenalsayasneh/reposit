package i0.e.b.c3;

import androidx.fragment.app.Fragment;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import i0.d.a.a.a;
import m0.n.b.i;
import m0.r.d;

/* compiled from: FragmentKey.kt */
public final class b {
    public final d<? extends Fragment> a;

    public b(d<? extends Fragment> dVar) {
        i.e(dVar, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
        this.a = dVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && i.a(this.a, ((b) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        StringBuilder P0 = a.P0("FragmentClass(value=");
        P0.append(this.a);
        P0.append(')');
        return P0.toString();
    }
}
