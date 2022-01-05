package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m0.l.f.a.c;
import m0.r.t.a.r.m.a1.a;
import n0.a.g2.d;
import n0.a.g2.e;

@c(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt", f = "Errors.kt", l = {227}, m = "catchImpl")
/* compiled from: Errors.kt */
public final class FlowKt__ErrorsKt$catchImpl$1<T> extends ContinuationImpl {
    public Object c;
    public /* synthetic */ Object d;
    public int q;

    public FlowKt__ErrorsKt$catchImpl$1(m0.l.c<? super FlowKt__ErrorsKt$catchImpl$1> cVar) {
        super(cVar);
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.q |= Integer.MIN_VALUE;
        return a.u0((d) null, (e) null, this);
    }
}
