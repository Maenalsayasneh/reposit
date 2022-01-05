package m0.r.t.a.r.m;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import java.util.List;
import java.util.Objects;
import m0.n.b.i;
import m0.r.t.a.r.c.f;
import m0.r.t.a.r.c.m0;

/* compiled from: StarProjectionImpl.kt */
public final class f0 extends l0 {
    public final /* synthetic */ List<j0> c;

    public f0(List<? extends j0> list) {
        this.c = list;
    }

    public m0 h(j0 j0Var) {
        i.e(j0Var, InstabugDbContract.UserAttributesEntry.COLUMN_KEY);
        if (!this.c.contains(j0Var)) {
            return null;
        }
        f c2 = j0Var.c();
        Objects.requireNonNull(c2, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeParameterDescriptor");
        return s0.m((m0) c2);
    }
}
