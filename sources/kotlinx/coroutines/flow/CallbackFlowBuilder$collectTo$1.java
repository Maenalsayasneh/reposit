package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m0.l.f.a.c;
import n0.a.f2.l;

@c(c = "kotlinx.coroutines.flow.CallbackFlowBuilder", f = "Builders.kt", l = {355}, m = "collectTo")
/* compiled from: Builders.kt */
public final class CallbackFlowBuilder$collectTo$1 extends ContinuationImpl {
    public Object c;
    public /* synthetic */ Object d;
    public final /* synthetic */ CallbackFlowBuilder<T> q;
    public int x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CallbackFlowBuilder$collectTo$1(CallbackFlowBuilder<T> callbackFlowBuilder, m0.l.c<? super CallbackFlowBuilder$collectTo$1> cVar) {
        super(cVar);
        this.q = callbackFlowBuilder;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.x |= Integer.MIN_VALUE;
        return this.q.g((l) null, this);
    }
}
