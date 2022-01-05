package m0.r.t.a.r.m;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import java.util.Map;
import m0.n.b.i;

/* compiled from: TypeSubstitution.kt */
public final class k0 extends l0 {
    public final /* synthetic */ Map<j0, m0> c;
    public final /* synthetic */ boolean d;

    public k0(Map<j0, ? extends m0> map, boolean z) {
        this.c = map;
        this.d = z;
    }

    public boolean a() {
        return this.d;
    }

    public boolean f() {
        return this.c.isEmpty();
    }

    public m0 h(j0 j0Var) {
        i.e(j0Var, InstabugDbContract.UserAttributesEntry.COLUMN_KEY);
        return this.c.get(j0Var);
    }
}
