package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m0.l.f.a.c;
import n0.a.g2.e;

@c(c = "kotlinx.coroutines.flow.SharedFlowImpl", f = "SharedFlow.kt", l = {341, 348, 351}, m = "collect")
/* compiled from: SharedFlow.kt */
public final class SharedFlowImpl$collect$1 extends ContinuationImpl {
    public final /* synthetic */ SharedFlowImpl<T> Y1;
    public int Z1;
    public Object c;
    public Object d;
    public Object q;
    public Object x;
    public /* synthetic */ Object y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SharedFlowImpl$collect$1(SharedFlowImpl<T> sharedFlowImpl, m0.l.c<? super SharedFlowImpl$collect$1> cVar) {
        super(cVar);
        this.Y1 = sharedFlowImpl;
    }

    public final Object invokeSuspend(Object obj) {
        this.y = obj;
        this.Z1 |= Integer.MIN_VALUE;
        return this.Y1.collect((e) null, this);
    }
}
