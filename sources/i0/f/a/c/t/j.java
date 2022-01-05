package i0.f.a.c.t;

import com.fasterxml.jackson.databind.util.NameTransformer;
import i0.d.a.a.a;

/* compiled from: NameTransformer */
public final class j extends NameTransformer {
    public final /* synthetic */ String d;
    public final /* synthetic */ String q;

    public j(String str, String str2) {
        this.d = str;
        this.q = str2;
    }

    public String a(String str) {
        return this.d + str + this.q;
    }

    public String toString() {
        StringBuilder P0 = a.P0("[PreAndSuffixTransformer('");
        P0.append(this.d);
        P0.append("','");
        return a.y0(P0, this.q, "')]");
    }
}
