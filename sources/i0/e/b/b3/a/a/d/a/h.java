package i0.e.b.b3.a.a.d.a;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import i0.d.a.a.a;
import java.util.Map;
import m0.n.b.f;
import m0.n.b.i;

/* compiled from: FeedItem.kt */
public final class h extends e {
    public final String a;
    public final String b;
    public final String c;
    public final Map<String, Object> d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(String str, String str2, String str3, Map<String, ? extends Object> map) {
        super((f) null);
        i.e(str, InstabugDbContract.FeatureRequestEntry.COLUMN_TITLE);
        i.e(str2, "dismissButtonText");
        i.e(str3, "acceptButtonText");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = map;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return i.a(this.a, hVar.a) && i.a(this.b, hVar.b) && i.a(this.c, hVar.c) && i.a(this.d, hVar.d);
    }

    public int hashCode() {
        int F = a.F(this.c, a.F(this.b, this.a.hashCode() * 31, 31), 31);
        Map<String, Object> map = this.d;
        return F + (map == null ? 0 : map.hashCode());
    }

    public String toString() {
        StringBuilder P0 = a.P0("LanguagePickerFeedItem(title=");
        P0.append(this.a);
        P0.append(", dismissButtonText=");
        P0.append(this.b);
        P0.append(", acceptButtonText=");
        P0.append(this.c);
        P0.append(", loggingContext=");
        return a.B0(P0, this.d, ')');
    }
}
