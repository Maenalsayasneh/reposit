package m0.r.t.a.r.j.p;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import java.util.List;
import m0.n.a.l;
import m0.n.b.i;
import m0.r.t.a.r.b.f;
import m0.r.t.a.r.b.g;
import m0.r.t.a.r.c.u;
import m0.r.t.a.r.m.v;

/* compiled from: constantValues.kt */
public final class b extends g<List<? extends g<?>>> {
    public final l<u, v> b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(List<? extends g<?>> list, l<? super u, ? extends v> lVar) {
        super(list);
        i.e(list, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
        i.e(lVar, "computeType");
        this.b = lVar;
    }

    public v a(u uVar) {
        i.e(uVar, "module");
        v invoke = this.b.invoke(uVar);
        if (!f.z(invoke)) {
            m0.r.t.a.r.c.f c = invoke.I0().c();
            if (!((c == null || f.s(c) == null) ? false : true) && !f.C(invoke, g.a.f44i0.j()) && !f.C(invoke, g.a.f45j0.j()) && !f.C(invoke, g.a.f46k0.j()) && !f.C(invoke, g.a.f47l0.j())) {
            }
        }
        return invoke;
    }
}
