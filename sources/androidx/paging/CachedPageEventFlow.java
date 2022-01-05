package androidx.paging;

import g0.a.b.b.a;
import h0.u.i0.c;
import java.util.concurrent.atomic.AtomicBoolean;
import m0.j.l;
import m0.n.b.i;
import n0.a.f0;
import n0.a.g2.d;
import n0.a.g2.s;

/* compiled from: CachedPageEventFlow.kt */
public final class CachedPageEventFlow<T> {
    public final FlattenedPageController<T> a;
    public final AtomicBoolean b = new AtomicBoolean(false);
    public final c<l<PageEvent<T>>> c;
    public final d<PageEvent<T>> d;

    public CachedPageEventFlow(d<? extends PageEvent<T>> dVar, f0 f0Var) {
        i.e(dVar, "src");
        i.e(f0Var, "scope");
        FlattenedPageController<T> flattenedPageController = new FlattenedPageController<>();
        this.a = flattenedPageController;
        this.c = new c(f0Var, 0, new s(new CachedPageEventFlow$multicastedSrc$1(this, dVar, (m0.l.c) null)), false, new CachedPageEventFlow$multicastedSrc$2(flattenedPageController), true, 8);
        this.d = a.z0(new CachedPageEventFlow$downstreamFlow$1(this, (m0.l.c) null));
    }
}
