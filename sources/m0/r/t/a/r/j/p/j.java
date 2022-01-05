package m0.r.t.a.r.j.p;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import m0.i;
import m0.r.t.a.r.c.u;
import m0.r.t.a.r.m.a0;
import m0.r.t.a.r.m.p;
import m0.r.t.a.r.m.v;

/* compiled from: constantValues.kt */
public abstract class j extends g<i> {

    /* compiled from: constantValues.kt */
    public static final class a extends j {
        public final String b;

        public a(String str) {
            m0.n.b.i.e(str, InstabugDbContract.BugEntry.COLUMN_MESSAGE);
            this.b = str;
        }

        public v a(u uVar) {
            m0.n.b.i.e(uVar, "module");
            a0 d = p.d(this.b);
            m0.n.b.i.d(d, "createErrorType(message)");
            return d;
        }

        public String toString() {
            return this.b;
        }
    }

    public j() {
        super(i.a);
    }

    public Object b() {
        throw new UnsupportedOperationException();
    }
}
