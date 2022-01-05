package androidx.paging;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m0.l.f.a.c;

@c(c = "androidx.paging.FlattenedPageController", f = "CachedPageEventFlow.kt", l = {310, 188}, m = "createTemporaryDownstream")
/* compiled from: CachedPageEventFlow.kt */
public final class FlattenedPageController$createTemporaryDownstream$1 extends ContinuationImpl {
    public Object Y1;
    public Object Z1;
    public int a2;
    public /* synthetic */ Object c;
    public int d;
    public final /* synthetic */ FlattenedPageController q;
    public Object x;
    public Object y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlattenedPageController$createTemporaryDownstream$1(FlattenedPageController flattenedPageController, m0.l.c cVar) {
        super(cVar);
        this.q = flattenedPageController;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.d |= Integer.MIN_VALUE;
        return this.q.a(this);
    }
}
