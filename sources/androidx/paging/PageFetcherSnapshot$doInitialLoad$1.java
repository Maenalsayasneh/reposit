package androidx.paging;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m0.l.f.a.c;

@c(c = "androidx.paging.PageFetcherSnapshot", f = "PageFetcherSnapshot.kt", l = {611, 272, 275, 623, 635, 647, 304, 659, 671, 329}, m = "doInitialLoad")
/* compiled from: PageFetcherSnapshot.kt */
public final class PageFetcherSnapshot$doInitialLoad$1 extends ContinuationImpl {
    public Object Y1;
    public Object Z1;
    public boolean a2;
    public /* synthetic */ Object c;
    public int d;
    public final /* synthetic */ PageFetcherSnapshot q;
    public Object x;
    public Object y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PageFetcherSnapshot$doInitialLoad$1(PageFetcherSnapshot pageFetcherSnapshot, m0.l.c cVar) {
        super(cVar);
        this.q = pageFetcherSnapshot;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.d |= Integer.MIN_VALUE;
        return this.q.d(this);
    }
}
