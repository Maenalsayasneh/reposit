package androidx.paging;

import h0.u.w;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;
import n0.a.g2.d;

@c(c = "androidx.paging.PagingDataDiffer$collectFrom$2", f = "PagingDataDiffer.kt", l = {390}, m = "invokeSuspend")
/* compiled from: PagingDataDiffer.kt */
public final class PagingDataDiffer$collectFrom$2 extends SuspendLambda implements l<m0.l.c<? super i>, Object> {
    public int c;
    public final /* synthetic */ PagingDataDiffer d;
    public final /* synthetic */ w q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PagingDataDiffer$collectFrom$2(PagingDataDiffer pagingDataDiffer, w wVar, m0.l.c cVar) {
        super(1, cVar);
        this.d = pagingDataDiffer;
        this.q = wVar;
    }

    public final m0.l.c<i> create(m0.l.c<?> cVar) {
        m0.n.b.i.e(cVar, "completion");
        return new PagingDataDiffer$collectFrom$2(this.d, this.q, cVar);
    }

    public final Object invoke(Object obj) {
        m0.l.c cVar = (m0.l.c) obj;
        m0.n.b.i.e(cVar, "completion");
        return new PagingDataDiffer$collectFrom$2(this.d, this.q, cVar).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            PagingDataDiffer pagingDataDiffer = this.d;
            w wVar = this.q;
            pagingDataDiffer.b = wVar.e;
            d<PageEvent<T>> dVar = wVar.d;
            PagingDataDiffer$collectFrom$2$invokeSuspend$$inlined$collect$1 pagingDataDiffer$collectFrom$2$invokeSuspend$$inlined$collect$1 = new PagingDataDiffer$collectFrom$2$invokeSuspend$$inlined$collect$1(this);
            this.c = 1;
            if (dVar.collect(pagingDataDiffer$collectFrom$2$invokeSuspend$$inlined$collect$1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            h.d4(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return i.a;
    }
}
