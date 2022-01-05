package androidx.paging;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m0.j.l;
import m0.l.f.a.c;

@c(c = "androidx.paging.FlattenedPageController", f = "CachedPageEventFlow.kt", l = {297, 174}, m = "record")
/* compiled from: CachedPageEventFlow.kt */
public final class FlattenedPageController$record$1 extends ContinuationImpl {
    public Object Y1;
    public Object Z1;
    public Object a2;
    public Object b2;
    public /* synthetic */ Object c;
    public int d;
    public final /* synthetic */ FlattenedPageController q;
    public Object x;
    public Object y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlattenedPageController$record$1(FlattenedPageController flattenedPageController, m0.l.c cVar) {
        super(cVar);
        this.q = flattenedPageController;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.d |= Integer.MIN_VALUE;
        return this.q.b((l) null, this);
    }
}
