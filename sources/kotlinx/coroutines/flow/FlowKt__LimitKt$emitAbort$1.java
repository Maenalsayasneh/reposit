package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m0.l.f.a.c;
import m0.r.t.a.r.m.a1.a;
import n0.a.g2.e;

@c(c = "kotlinx.coroutines.flow.FlowKt__LimitKt", f = "Limit.kt", l = {73}, m = "emitAbort$FlowKt__LimitKt")
/* compiled from: Limit.kt */
public final class FlowKt__LimitKt$emitAbort$1<T> extends ContinuationImpl {
    public Object c;
    public /* synthetic */ Object d;
    public int q;

    public FlowKt__LimitKt$emitAbort$1(m0.l.c<? super FlowKt__LimitKt$emitAbort$1> cVar) {
        super(cVar);
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.q |= Integer.MIN_VALUE;
        return a.D((e) null, (Object) null, this);
    }
}
