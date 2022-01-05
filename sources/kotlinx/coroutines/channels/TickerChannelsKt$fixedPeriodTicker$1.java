package kotlinx.coroutines.channels;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m0.l.f.a.c;
import m0.r.t.a.r.m.a1.a;
import n0.a.f2.r;

@c(c = "kotlinx.coroutines.channels.TickerChannelsKt", f = "TickerChannels.kt", l = {84, 88, 94, 96}, m = "fixedPeriodTicker")
/* compiled from: TickerChannels.kt */
public final class TickerChannelsKt$fixedPeriodTicker$1 extends ContinuationImpl {
    public long c;
    public long d;
    public Object q;
    public /* synthetic */ Object x;
    public int y;

    public TickerChannelsKt$fixedPeriodTicker$1(m0.l.c<? super TickerChannelsKt$fixedPeriodTicker$1> cVar) {
        super(cVar);
    }

    public final Object invokeSuspend(Object obj) {
        this.x = obj;
        this.y |= Integer.MIN_VALUE;
        return a.F(0, 0, (r) null, this);
    }
}
