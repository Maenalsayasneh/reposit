package m0.r.t.a.r.b.j;

import i0.j.f.p.h;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.GivenFunctionsMemberScope;
import m0.n.b.i;
import m0.r.t.a.r.c.r;
import m0.r.t.a.r.l.l;

/* compiled from: FunctionClassScope.kt */
public final class c extends GivenFunctionsMemberScope {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(l lVar, b bVar) {
        super(lVar, bVar);
        i.e(lVar, "storageManager");
        i.e(bVar, "containingClass");
    }

    public List<r> h() {
        int ordinal = ((b) this.c).b2.ordinal();
        if (ordinal == 0) {
            return h.L2(d.V0((b) this.c, false));
        }
        if (ordinal != 1) {
            return EmptyList.c;
        }
        return h.L2(d.V0((b) this.c, true));
    }
}
