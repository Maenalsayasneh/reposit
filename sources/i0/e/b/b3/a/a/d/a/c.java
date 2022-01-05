package i0.e.b.b3.a.a.d.a;

import com.clubhouse.android.data.models.local.EventInClub;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import i0.d.a.a.a;
import java.util.List;
import java.util.Objects;
import m0.n.b.f;
import m0.n.b.i;

/* compiled from: FeedItem.kt */
public final class c extends e {
    public final String a;
    public final List<EventInClub> b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(String str, List<EventInClub> list) {
        super((f) null);
        i.e(str, InstabugDbContract.FeatureRequestEntry.COLUMN_TITLE);
        i.e(list, "events");
        this.a = str;
        this.b = list;
    }

    public static c a(c cVar, String str, List<EventInClub> list, int i) {
        String str2 = (i & 1) != 0 ? cVar.a : null;
        if ((i & 2) != 0) {
            list = cVar.b;
        }
        Objects.requireNonNull(cVar);
        i.e(str2, InstabugDbContract.FeatureRequestEntry.COLUMN_TITLE);
        i.e(list, "events");
        return new c(str2, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return i.a(this.a, cVar.a) && i.a(this.b, cVar.b);
    }

    public int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public String toString() {
        StringBuilder P0 = a.P0("EventSuggestionsFeedItem(title=");
        P0.append(this.a);
        P0.append(", events=");
        return a.A0(P0, this.b, ')');
    }
}
