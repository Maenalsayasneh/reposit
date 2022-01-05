package i0.f.a.c.t;

import com.fasterxml.jackson.databind.util.NameTransformer;
import i0.d.a.a.a;

/* compiled from: NameTransformer */
public final class k extends NameTransformer {
    public final /* synthetic */ String d;

    public k(String str) {
        this.d = str;
    }

    public String a(String str) {
        return a.y0(new StringBuilder(), this.d, str);
    }

    public String toString() {
        return a.y0(a.P0("[PrefixTransformer('"), this.d, "')]");
    }
}
