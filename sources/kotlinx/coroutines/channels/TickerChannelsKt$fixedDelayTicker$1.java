package kotlinx.coroutines.channels;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m0.l.f.a.c;
import m0.r.t.a.r.m.a1.a;
import n0.a.f2.r;

@c(c = "kotlinx.coroutines.channels.TickerChannelsKt", f = "TickerChannels.kt", l = {106, 108, 109}, m = "fixedDelayTicker")
/* compiled from: TickerChannels.kt */
public final class TickerChannelsKt$fixedDelayTicker$1 extends ContinuationImpl {
    public long c;
    public Object d;
    public /* synthetic */ Object q;
    public int x;

    public TickerChannelsKt$fixedDelayTicker$1(m0.l.c<? super TickerChannelsKt$fixedDelayTicker$1> cVar) {
        super(cVar);
    }

    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.x |= Integer.MIN_VALUE;
        return a.E(0, 0, (r) null, this);
    }
}
