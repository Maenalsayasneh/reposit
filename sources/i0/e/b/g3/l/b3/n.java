package i0.e.b.g3.l.b3;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import i0.d.a.a.a;
import i0.e.b.a3.b.c;
import m0.n.b.i;

/* compiled from: EditClubRulesViewModel.kt */
public final class n implements c {
    public final String a;
    public final String b;

    public n(String str, String str2) {
        i.e(str, InstabugDbContract.FeatureRequestEntry.COLUMN_TITLE);
        i.e(str2, InstabugDbContract.FeatureRequestEntry.COLUMN_DESCRIPTION);
        this.a = str;
        this.b = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return i.a(this.a, nVar.a) && i.a(this.b, nVar.b);
    }

    public int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public String toString() {
        StringBuilder P0 = a.P0("UpdateClubRuleThree(title=");
        P0.append(this.a);
        P0.append(", description=");
        return a.x0(P0, this.b, ')');
    }
}
