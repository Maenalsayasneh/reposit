package androidx.paging;

import androidx.paging.ActiveFlowTracker;
import h0.u.w;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import n0.a.g2.e;

@c(c = "androidx.paging.CachedPagingDataKt$cachedIn$multicastedFlow$4", f = "CachedPagingData.kt", l = {98}, m = "invokeSuspend")
/* compiled from: CachedPagingData.kt */
public final class CachedPagingDataKt$cachedIn$multicastedFlow$4 extends SuspendLambda implements p<e<? super w<T>>, m0.l.c<? super i>, Object> {
    public int c;
    public final /* synthetic */ ActiveFlowTracker d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CachedPagingDataKt$cachedIn$multicastedFlow$4(ActiveFlowTracker activeFlowTracker, m0.l.c cVar) {
        super(2, cVar);
        this.d = activeFlowTracker;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        m0.n.b.i.e(cVar, "completion");
        return new CachedPagingDataKt$cachedIn$multicastedFlow$4(this.d, cVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        m0.l.c cVar = (m0.l.c) obj2;
        m0.n.b.i.e(cVar, "completion");
        return new CachedPagingDataKt$cachedIn$multicastedFlow$4(this.d, cVar).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            ActiveFlowTracker activeFlowTracker = this.d;
            if (activeFlowTracker != null) {
                ActiveFlowTracker.FlowType flowType = ActiveFlowTracker.FlowType.PAGED_DATA_FLOW;
                this.c = 1;
                if (activeFlowTracker.b(flowType, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else if (i == 1) {
            h.d4(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return i.a;
    }
}
