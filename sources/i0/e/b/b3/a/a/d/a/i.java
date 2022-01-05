package i0.e.b.b3.a.a.d.a;

import com.clubhouse.android.data.models.local.Topic;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import i0.d.a.a.a;
import java.util.List;
import java.util.Map;
import m0.n.b.f;

/* compiled from: FeedItem.kt */
public final class i extends e {
    public final String a;
    public final List<Topic> b;
    public final Map<String, Object> c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(String str, List<Topic> list, Map<String, ? extends Object> map) {
        super((f) null);
        m0.n.b.i.e(str, InstabugDbContract.FeatureRequestEntry.COLUMN_TITLE);
        m0.n.b.i.e(list, "topics");
        m0.n.b.i.e(map, "loggingContext");
        this.a = str;
        this.b = list;
        this.c = map;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return m0.n.b.i.a(this.a, iVar.a) && m0.n.b.i.a(this.b, iVar.b) && m0.n.b.i.a(this.c, iVar.c);
    }

    public int hashCode() {
        return this.c.hashCode() + a.H(this.b, this.a.hashCode() * 31, 31);
    }

    public String toString() {
        StringBuilder P0 = a.P0("TopicSuggestionsFeedItem(title=");
        P0.append(this.a);
        P0.append(", topics=");
        P0.append(this.b);
        P0.append(", loggingContext=");
        return a.B0(P0, this.c, ')');
    }
}
