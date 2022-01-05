package i0.f.a.c.t;

import com.fasterxml.jackson.databind.util.NameTransformer;
import i0.d.a.a.a;

/* compiled from: NameTransformer */
public final class l extends NameTransformer {
    public final /* synthetic */ String d;

    public l(String str) {
        this.d = str;
    }

    public String a(String str) {
        StringBuilder P0 = a.P0(str);
        P0.append(this.d);
        return P0.toString();
    }

    public String toString() {
        return a.y0(a.P0("[SuffixTransformer('"), this.d, "')]");
    }
}
