package m0.r.t.a.r.j.p;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import i0.d.a.a.a;
import m0.n.b.i;
import m0.r.t.a.r.c.u;
import m0.r.t.a.r.m.a0;
import m0.r.t.a.r.m.v;

/* compiled from: constantValues.kt */
public final class s extends g<String> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public s(String str) {
        super(str);
        i.e(str, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
    }

    public v a(u uVar) {
        i.e(uVar, "module");
        a0 v = uVar.m().v();
        i.d(v, "module.builtIns.stringType");
        return v;
    }

    public String toString() {
        return a.x0(a.N0('\"'), (String) this.a, '\"');
    }
}
