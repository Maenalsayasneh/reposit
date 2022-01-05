package androidx.paging;

import h0.u.b;
import h0.u.o;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.a;

@c(c = "androidx.paging.AsyncPagingDataDiffer$differBase$1", f = "AsyncPagingDataDiffer.kt", l = {99}, m = "presentNewList")
/* compiled from: AsyncPagingDataDiffer.kt */
public final class AsyncPagingDataDiffer$differBase$1$presentNewList$1 extends ContinuationImpl {
    public Object Y1;
    public Object Z1;
    public int a2;
    public /* synthetic */ Object c;
    public int d;
    public final /* synthetic */ AsyncPagingDataDiffer$differBase$1 q;
    public Object x;
    public Object y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AsyncPagingDataDiffer$differBase$1$presentNewList$1(AsyncPagingDataDiffer$differBase$1 asyncPagingDataDiffer$differBase$1, m0.l.c cVar) {
        super(cVar);
        this.q = asyncPagingDataDiffer$differBase$1;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.d |= Integer.MIN_VALUE;
        return this.q.b((o) null, (o) null, (b) null, 0, (a<i>) null, this);
    }
}
