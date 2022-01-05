package m0.r.t.a.r.m.b1;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import m0.n.b.i;
import m0.r.t.a.r.m.j0;
import m0.r.t.a.r.m.l0;
import m0.r.t.a.r.m.m0;
import m0.r.t.a.r.m.o0;

/* compiled from: CapturedTypeApproximation.kt */
public final class b extends l0 {
    public m0 h(j0 j0Var) {
        i.e(j0Var, InstabugDbContract.UserAttributesEntry.COLUMN_KEY);
        m0.r.t.a.r.j.o.a.b bVar = j0Var instanceof m0.r.t.a.r.j.o.a.b ? (m0.r.t.a.r.j.o.a.b) j0Var : null;
        if (bVar == null) {
            return null;
        }
        if (bVar.e().c()) {
            return new o0(Variance.OUT_VARIANCE, bVar.e().getType());
        }
        return bVar.e();
    }
}
