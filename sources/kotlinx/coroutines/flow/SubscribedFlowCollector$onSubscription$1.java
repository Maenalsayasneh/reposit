package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m0.l.f.a.c;

@c(c = "kotlinx.coroutines.flow.SubscribedFlowCollector", f = "Share.kt", l = {410, 414}, m = "onSubscription")
/* compiled from: Share.kt */
public final class SubscribedFlowCollector$onSubscription$1 extends ContinuationImpl {
    public Object c;
    public Object d;
    public /* synthetic */ Object q;
    public final /* synthetic */ SubscribedFlowCollector<T> x;
    public int y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SubscribedFlowCollector$onSubscription$1(SubscribedFlowCollector<T> subscribedFlowCollector, m0.l.c<? super SubscribedFlowCollector$onSubscription$1> cVar) {
        super(cVar);
        this.x = subscribedFlowCollector;
    }

    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.y |= Integer.MIN_VALUE;
        return this.x.c(this);
    }
}
