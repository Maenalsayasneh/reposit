package androidx.paging;

import g0.a.b.b.a;
import h0.u.n;
import h0.u.o;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import n0.a.f0;

@c(c = "androidx.paging.AsyncPagingDataDiffer$differBase$1$presentNewList$diffResult$1", f = "AsyncPagingDataDiffer.kt", l = {}, m = "invokeSuspend")
/* compiled from: AsyncPagingDataDiffer.kt */
public final class AsyncPagingDataDiffer$differBase$1$presentNewList$diffResult$1 extends SuspendLambda implements p<f0, m0.l.c<? super n>, Object> {
    public final /* synthetic */ AsyncPagingDataDiffer$differBase$1 c;
    public final /* synthetic */ o d;
    public final /* synthetic */ o q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AsyncPagingDataDiffer$differBase$1$presentNewList$diffResult$1(AsyncPagingDataDiffer$differBase$1 asyncPagingDataDiffer$differBase$1, o oVar, o oVar2, m0.l.c cVar) {
        super(2, cVar);
        this.c = asyncPagingDataDiffer$differBase$1;
        this.d = oVar;
        this.q = oVar2;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        m0.n.b.i.e(cVar, "completion");
        return new AsyncPagingDataDiffer$differBase$1$presentNewList$diffResult$1(this.c, this.d, this.q, cVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        m0.l.c cVar = (m0.l.c) obj2;
        m0.n.b.i.e(cVar, "completion");
        AsyncPagingDataDiffer$differBase$1 asyncPagingDataDiffer$differBase$1 = this.c;
        o oVar = this.d;
        o oVar2 = this.q;
        new AsyncPagingDataDiffer$differBase$1$presentNewList$diffResult$1(asyncPagingDataDiffer$differBase$1, oVar, oVar2, cVar);
        i iVar = i.a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(iVar);
        return a.p(oVar, oVar2, asyncPagingDataDiffer$differBase$1.l.f);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        return a.p(this.d, this.q, this.c.l.f);
    }
}
