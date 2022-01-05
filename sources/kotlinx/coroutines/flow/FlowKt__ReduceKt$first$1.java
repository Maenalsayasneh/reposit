package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m0.l.f.a.c;
import m0.r.t.a.r.m.a1.a;
import n0.a.g2.d;

@c(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", l = {183}, m = "first")
/* compiled from: Reduce.kt */
public final class FlowKt__ReduceKt$first$1<T> extends ContinuationImpl {
    public Object c;
    public Object d;
    public /* synthetic */ Object q;
    public int x;

    public FlowKt__ReduceKt$first$1(m0.l.c<? super FlowKt__ReduceKt$first$1> cVar) {
        super(cVar);
    }

    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.x |= Integer.MIN_VALUE;
        return a.s1((d) null, this);
    }
}
