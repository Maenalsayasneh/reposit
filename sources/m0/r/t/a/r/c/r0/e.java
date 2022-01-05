package m0.r.t.a.r.c.r0;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import m0.n.b.i;
import m0.r.t.a.r.g.d;

/* compiled from: annotationUtil.kt */
public final class e {
    public static final d a;
    public static final d b;
    public static final d c;
    public static final d d;
    public static final d e;

    static {
        d g = d.g(InstabugDbContract.BugEntry.COLUMN_MESSAGE);
        i.d(g, "identifier(\"message\")");
        a = g;
        d g2 = d.g("replaceWith");
        i.d(g2, "identifier(\"replaceWith\")");
        b = g2;
        d g3 = d.g("level");
        i.d(g3, "identifier(\"level\")");
        c = g3;
        d g4 = d.g("expression");
        i.d(g4, "identifier(\"expression\")");
        d = g4;
        d g5 = d.g("imports");
        i.d(g5, "identifier(\"imports\")");
        e = g5;
    }
}
