package androidx.paging;

import h0.u.h;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m0.l.f.a.c;

@c(c = "androidx.paging.PageFetcherSnapshot", f = "PageFetcherSnapshot.kt", l = {684, 696, 386, 394, 708, 720, 437, 732, 456, 482, 744}, m = "doLoad")
/* compiled from: PageFetcherSnapshot.kt */
public final class PageFetcherSnapshot$doLoad$1 extends ContinuationImpl {
    public Object Y1;
    public Object Z1;
    public Object a2;
    public Object b2;
    public /* synthetic */ Object c;
    public Object c2;
    public int d;
    public Object d2;
    public Object e2;
    public Object f2;
    public Object g2;
    public int h2;
    public int i2;
    public final /* synthetic */ PageFetcherSnapshot q;
    public Object x;
    public Object y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PageFetcherSnapshot$doLoad$1(PageFetcherSnapshot pageFetcherSnapshot, m0.l.c cVar) {
        super(cVar);
        this.q = pageFetcherSnapshot;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.d |= Integer.MIN_VALUE;
        return this.q.e((LoadType) null, (h) null, this);
    }
}
