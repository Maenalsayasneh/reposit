package androidx.paging;

import kotlin.jvm.internal.FunctionReferenceImpl;
import m0.i;
import m0.n.a.a;

/* compiled from: PageFetcher.kt */
public final /* synthetic */ class PageFetcher$generateNewPagingSource$4 extends FunctionReferenceImpl implements a<i> {
    public PageFetcher$generateNewPagingSource$4(PageFetcher pageFetcher) {
        super(0, pageFetcher, PageFetcher.class, "invalidate", "invalidate()V", 0);
    }

    public Object invoke() {
        ((PageFetcher) this.receiver).a.send(Boolean.FALSE);
        return i.a;
    }
}
