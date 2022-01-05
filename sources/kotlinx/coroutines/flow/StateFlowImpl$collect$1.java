package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m0.l.f.a.c;
import n0.a.g2.e;

@c(c = "kotlinx.coroutines.flow.StateFlowImpl", f = "StateFlow.kt", l = {386, 398, 403}, m = "collect")
/* compiled from: StateFlow.kt */
public final class StateFlowImpl$collect$1 extends ContinuationImpl {
    public /* synthetic */ Object Y1;
    public final /* synthetic */ StateFlowImpl<T> Z1;
    public int a2;
    public Object c;
    public Object d;
    public Object q;
    public Object x;
    public Object y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StateFlowImpl$collect$1(StateFlowImpl<T> stateFlowImpl, m0.l.c<? super StateFlowImpl$collect$1> cVar) {
        super(cVar);
        this.Z1 = stateFlowImpl;
    }

    public final Object invokeSuspend(Object obj) {
        this.Y1 = obj;
        this.a2 |= Integer.MIN_VALUE;
        return this.Z1.collect((e) null, this);
    }
}
