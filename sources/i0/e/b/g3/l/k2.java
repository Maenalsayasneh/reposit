package i0.e.b.g3.l;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import i0.d.a.a.a;
import i0.e.b.a3.b.c;
import m0.n.b.i;

/* compiled from: ClubViewModel.kt */
public final class k2 implements c {
    public final String a;

    public k2(String str) {
        i.e(str, InstabugDbContract.FeatureRequestEntry.COLUMN_DESCRIPTION);
        this.a = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k2) && i.a(this.a, ((k2) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return a.x0(a.P0("UpdateClubDescription(description="), this.a, ')');
    }
}
