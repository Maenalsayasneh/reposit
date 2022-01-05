package i0.e.b.b3.a.a.d.a;

import com.clubhouse.android.data.models.local.club.Club;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import i0.d.a.a.a;
import java.util.List;
import m0.n.b.f;
import m0.n.b.i;

/* compiled from: FeedItem.kt */
public final class b extends e {
    public final String a;
    public final List<Club> b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(String str, List<? extends Club> list) {
        super((f) null);
        i.e(str, InstabugDbContract.FeatureRequestEntry.COLUMN_TITLE);
        i.e(list, "clubs");
        this.a = str;
        this.b = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return i.a(this.a, bVar.a) && i.a(this.b, bVar.b);
    }

    public int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public String toString() {
        StringBuilder P0 = a.P0("ClubSuggestionsFeedItem(title=");
        P0.append(this.a);
        P0.append(", clubs=");
        return a.A0(P0, this.b, ')');
    }
}
