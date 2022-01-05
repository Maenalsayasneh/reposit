package i0.e.b.b3.a.a.d.a;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import i0.d.a.a.a;
import i0.e.b.b3.b.e.m;
import java.util.List;
import m0.n.b.f;
import m0.n.b.i;

/* compiled from: FeedItem.kt */
public final class j extends e {
    public final String a;
    public final List<m> b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(String str, List<m> list) {
        super((f) null);
        i.e(str, InstabugDbContract.FeatureRequestEntry.COLUMN_TITLE);
        i.e(list, "users");
        this.a = str;
        this.b = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return i.a(this.a, jVar.a) && i.a(this.b, jVar.b);
    }

    public int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public String toString() {
        StringBuilder P0 = a.P0("UserSuggestionsFeedItem(title=");
        P0.append(this.a);
        P0.append(", users=");
        return a.A0(P0, this.b, ')');
    }
}
