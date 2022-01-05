package androidx.paging;

import h0.u.r;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import n0.a.g2.e;

@c(c = "androidx.paging.PageFetcherSnapshotState$consumePrependGenerationIdAsFlow$1", f = "PageFetcherSnapshotState.kt", l = {}, m = "invokeSuspend")
/* compiled from: PageFetcherSnapshotState.kt */
public final class PageFetcherSnapshotState$consumePrependGenerationIdAsFlow$1 extends SuspendLambda implements p<e<? super Integer>, m0.l.c<? super i>, Object> {
    public final /* synthetic */ r c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PageFetcherSnapshotState$consumePrependGenerationIdAsFlow$1(r rVar, m0.l.c cVar) {
        super(2, cVar);
        this.c = rVar;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        m0.n.b.i.e(cVar, "completion");
        return new PageFetcherSnapshotState$consumePrependGenerationIdAsFlow$1(this.c, cVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        m0.l.c cVar = (m0.l.c) obj2;
        m0.n.b.i.e(cVar, "completion");
        r rVar = this.c;
        new PageFetcherSnapshotState$consumePrependGenerationIdAsFlow$1(rVar, cVar);
        i iVar = i.a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(iVar);
        rVar.h.offer(new Integer(rVar.f));
        return iVar;
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        r rVar = this.c;
        rVar.h.offer(new Integer(rVar.f));
        return i.a;
    }
}
