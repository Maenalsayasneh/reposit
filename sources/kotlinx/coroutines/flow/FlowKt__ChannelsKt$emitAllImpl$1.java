package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m0.l.f.a.c;
import n0.a.f2.n;
import n0.a.g2.e;

@c(c = "kotlinx.coroutines.flow.FlowKt__ChannelsKt", f = "Channels.kt", l = {51, 62}, m = "emitAllImpl$FlowKt__ChannelsKt")
/* compiled from: Channels.kt */
public final class FlowKt__ChannelsKt$emitAllImpl$1<T> extends ContinuationImpl {
    public Object c;
    public Object d;
    public boolean q;
    public /* synthetic */ Object x;
    public int y;

    public FlowKt__ChannelsKt$emitAllImpl$1(m0.l.c<? super FlowKt__ChannelsKt$emitAllImpl$1> cVar) {
        super(cVar);
    }

    public final Object invokeSuspend(Object obj) {
        this.x = obj;
        this.y |= Integer.MIN_VALUE;
        return FlowKt__ChannelsKt.a((e) null, (n) null, false, this);
    }
}
