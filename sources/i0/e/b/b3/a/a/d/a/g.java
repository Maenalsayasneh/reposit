package i0.e.b.b3.a.a.d.a;

import i0.d.a.a.a;
import java.util.Map;
import m0.n.b.f;
import m0.n.b.i;

/* compiled from: FeedItem.kt */
public final class g extends e {
    public final Map<String, Object> a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(Map<String, ? extends Object> map) {
        super((f) null);
        i.e(map, "loggingContext");
        this.a = map;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && i.a(this.a, ((g) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return a.B0(a.P0("InvitePromptFeedItem(loggingContext="), this.a, ')');
    }
}
