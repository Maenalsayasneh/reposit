package i0.n.c.a.e.c;

import i0.n.c.b.d.d.a;
import java.util.regex.Pattern;
import m0.n.b.i;

/* compiled from: PatternMatcher.kt */
public abstract class b {
    public final Pattern a;

    public b(String str, a aVar) {
        i.e(str, "template");
        i.e(aVar, "patternFactory");
        i.e(str, "template");
        i.e(aVar, "patternFactory");
        this.a = ((a) aVar).a(str);
    }
}
