package i0.e.b.g3.l.v2;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import i0.d.a.a.a;
import i0.e.b.a3.b.c;
import m0.n.b.i;

/* compiled from: CreateClubViewModel.kt */
public final class r implements c {
    public final String a;

    public r(String str) {
        i.e(str, InstabugDbContract.FeatureRequestEntry.COLUMN_DESCRIPTION);
        this.a = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r) && i.a(this.a, ((r) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return a.x0(a.P0("UpdateDescription(description="), this.a, ')');
    }
}
