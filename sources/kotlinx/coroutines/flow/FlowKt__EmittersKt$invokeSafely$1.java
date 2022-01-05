package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m0.l.f.a.c;
import m0.n.a.q;
import m0.r.t.a.r.m.a1.a;
import n0.a.g2.e;

@c(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt", f = "Emitters.kt", l = {216}, m = "invokeSafely$FlowKt__EmittersKt")
/* compiled from: Emitters.kt */
public final class FlowKt__EmittersKt$invokeSafely$1<T> extends ContinuationImpl {
    public Object c;
    public /* synthetic */ Object d;
    public int q;

    public FlowKt__EmittersKt$invokeSafely$1(m0.l.c<? super FlowKt__EmittersKt$invokeSafely$1> cVar) {
        super(cVar);
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.q |= Integer.MIN_VALUE;
        return a.G((e) null, (q) null, (Throwable) null, this);
    }
}
