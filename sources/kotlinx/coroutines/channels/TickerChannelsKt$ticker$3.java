package kotlinx.coroutines.channels;

import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import m0.r.t.a.r.m.a1.a;
import n0.a.f2.l;
import n0.a.f2.r;

@c(c = "kotlinx.coroutines.channels.TickerChannelsKt$ticker$3", f = "TickerChannels.kt", l = {72, 73}, m = "invokeSuspend")
/* compiled from: TickerChannels.kt */
public final class TickerChannelsKt$ticker$3 extends SuspendLambda implements p<l<? super i>, m0.l.c<? super i>, Object> {
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ TickerMode q;
    public final /* synthetic */ long x;
    public final /* synthetic */ long y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TickerChannelsKt$ticker$3(TickerMode tickerMode, long j, long j2, m0.l.c<? super TickerChannelsKt$ticker$3> cVar) {
        super(2, cVar);
        this.q = tickerMode;
        this.x = j;
        this.y = j2;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        TickerChannelsKt$ticker$3 tickerChannelsKt$ticker$3 = new TickerChannelsKt$ticker$3(this.q, this.x, this.y, cVar);
        tickerChannelsKt$ticker$3.d = obj;
        return tickerChannelsKt$ticker$3;
    }

    public Object invoke(Object obj, Object obj2) {
        TickerChannelsKt$ticker$3 tickerChannelsKt$ticker$3 = new TickerChannelsKt$ticker$3(this.q, this.x, this.y, (m0.l.c) obj2);
        tickerChannelsKt$ticker$3.d = (l) obj;
        return tickerChannelsKt$ticker$3.invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            l lVar = (l) this.d;
            int ordinal = this.q.ordinal();
            if (ordinal == 0) {
                long j = this.x;
                long j2 = this.y;
                r e = lVar.e();
                this.c = 1;
                if (a.F(j, j2, e, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else if (ordinal == 1) {
                long j3 = this.x;
                long j4 = this.y;
                r e2 = lVar.e();
                this.c = 2;
                if (a.E(j3, j4, e2, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else if (i == 1 || i == 2) {
            h.d4(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return i.a;
    }
}
