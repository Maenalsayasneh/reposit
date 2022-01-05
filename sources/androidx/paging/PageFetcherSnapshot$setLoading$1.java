package androidx.paging;

import h0.u.r;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m0.l.f.a.c;

@c(c = "androidx.paging.PageFetcherSnapshot", f = "PageFetcherSnapshot.kt", l = {506}, m = "setLoading")
/* compiled from: PageFetcherSnapshot.kt */
public final class PageFetcherSnapshot$setLoading$1 extends ContinuationImpl {
    public /* synthetic */ Object c;
    public int d;
    public final /* synthetic */ PageFetcherSnapshot q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PageFetcherSnapshot$setLoading$1(PageFetcherSnapshot pageFetcherSnapshot, m0.l.c cVar) {
        super(cVar);
        this.q = pageFetcherSnapshot;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.d |= Integer.MIN_VALUE;
        return this.q.i((r) null, (LoadType) null, this);
    }
}
