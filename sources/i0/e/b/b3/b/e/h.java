package i0.e.b.b3.b.e;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import i0.d.a.a.a;
import java.util.Map;
import m0.n.b.i;

/* compiled from: PagingItem.kt */
public final class h extends j {
    public final String b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(String str) {
        super((Map) null, 1);
        i.e(str, InstabugDbContract.FeatureRequestEntry.COLUMN_TITLE);
        this.b = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && i.a(this.b, ((h) obj).b);
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public String toString() {
        return a.x0(a.P0("HeaderItem(title="), this.b, ')');
    }
}
