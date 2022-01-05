package androidx.paging;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import m0.i;
import m0.l.c;
import m0.r.t.a.r.m.a1.a;
import n0.a.g2.e;

/* compiled from: Collect.kt */
public final class PagingDataDiffer$collectFrom$2$invokeSuspend$$inlined$collect$1 implements e<PageEvent<T>> {
    public final /* synthetic */ PagingDataDiffer$collectFrom$2 c;

    public PagingDataDiffer$collectFrom$2$invokeSuspend$$inlined$collect$1(PagingDataDiffer$collectFrom$2 pagingDataDiffer$collectFrom$2) {
        this.c = pagingDataDiffer$collectFrom$2;
    }

    public Object emit(Object obj, c cVar) {
        Object k4 = a.k4(this.c.d.k, new PagingDataDiffer$collectFrom$2$invokeSuspend$$inlined$collect$1$lambda$1((PageEvent) obj, (c) null, this), cVar);
        if (k4 == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return k4;
        }
        return i.a;
    }
}
