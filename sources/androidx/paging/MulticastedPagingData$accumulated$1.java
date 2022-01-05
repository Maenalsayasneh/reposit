package androidx.paging;

import androidx.paging.ActiveFlowTracker;
import h0.u.l;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import n0.a.g2.e;

@c(c = "androidx.paging.MulticastedPagingData$accumulated$1", f = "CachedPagingData.kt", l = {38}, m = "invokeSuspend")
/* compiled from: CachedPagingData.kt */
public final class MulticastedPagingData$accumulated$1 extends SuspendLambda implements p<e<? super PageEvent<T>>, m0.l.c<? super i>, Object> {
    public int c;
    public final /* synthetic */ l d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MulticastedPagingData$accumulated$1(l lVar, m0.l.c cVar) {
        super(2, cVar);
        this.d = lVar;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        m0.n.b.i.e(cVar, "completion");
        return new MulticastedPagingData$accumulated$1(this.d, cVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        m0.l.c cVar = (m0.l.c) obj2;
        m0.n.b.i.e(cVar, "completion");
        return new MulticastedPagingData$accumulated$1(this.d, cVar).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            ActiveFlowTracker activeFlowTracker = this.d.d;
            if (activeFlowTracker != null) {
                ActiveFlowTracker.FlowType flowType = ActiveFlowTracker.FlowType.PAGE_EVENT_FLOW;
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
