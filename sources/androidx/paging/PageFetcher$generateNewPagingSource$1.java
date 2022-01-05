package androidx.paging;

import h0.u.x;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m0.l.f.a.c;

@c(c = "androidx.paging.PageFetcher", f = "PageFetcher.kt", l = {211}, m = "generateNewPagingSource")
/* compiled from: PageFetcher.kt */
public final class PageFetcher$generateNewPagingSource$1 extends ContinuationImpl {
    public /* synthetic */ Object c;
    public int d;
    public final /* synthetic */ PageFetcher q;
    public Object x;
    public Object y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PageFetcher$generateNewPagingSource$1(PageFetcher pageFetcher, m0.l.c cVar) {
        super(cVar);
        this.q = pageFetcher;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.d |= Integer.MIN_VALUE;
        return this.q.a((x) null, this);
    }
}
