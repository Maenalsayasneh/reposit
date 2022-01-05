package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;
import m0.i;
import m0.l.c;
import m0.l.e;
import m0.r.t.a.r.m.a1.a;
import n0.a.c0;
import n0.a.f0;
import n0.a.f2.l;
import n0.a.f2.n;
import n0.a.g2.d0.d;
import n0.a.g2.d0.j;
import n0.a.g2.d0.o;

/* compiled from: Merge.kt */
public final class ChannelLimitedFlowMerge<T> extends d<T> {
    public final Iterable<n0.a.g2.d<T>> x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelLimitedFlowMerge(Iterable iterable, e eVar, int i, BufferOverflow bufferOverflow, int i2) {
        super((i2 & 2) != 0 ? EmptyCoroutineContext.c : null, (i2 & 4) != 0 ? -2 : i, (i2 & 8) != 0 ? BufferOverflow.SUSPEND : null);
        this.x = iterable;
    }

    public Object g(l<? super T> lVar, c<? super i> cVar) {
        o oVar = new o(lVar);
        for (n0.a.g2.d<T> channelLimitedFlowMerge$collectTo$2$1 : this.x) {
            a.E2(lVar, (e) null, (CoroutineStart) null, new ChannelLimitedFlowMerge$collectTo$2$1(channelLimitedFlowMerge$collectTo$2$1, oVar, (c<? super ChannelLimitedFlowMerge$collectTo$2$1>) null), 3, (Object) null);
        }
        return i.a;
    }

    public d<T> h(e eVar, int i, BufferOverflow bufferOverflow) {
        return new ChannelLimitedFlowMerge(this.x, eVar, i, bufferOverflow);
    }

    public n<T> j(f0 f0Var) {
        e eVar = this.c;
        int i = this.d;
        ChannelFlow$collectToFun$1 channelFlow$collectToFun$1 = new ChannelFlow$collectToFun$1(this, (c<? super ChannelFlow$collectToFun$1>) null);
        j jVar = new j(c0.a(f0Var, eVar), a.d(i, (BufferOverflow) null, (m0.n.a.l) null, 6));
        CoroutineStart.ATOMIC.invoke(channelFlow$collectToFun$1, jVar, jVar);
        return jVar;
    }

    public ChannelLimitedFlowMerge(Iterable<? extends n0.a.g2.d<? extends T>> iterable, e eVar, int i, BufferOverflow bufferOverflow) {
        super(eVar, i, bufferOverflow);
        this.x = iterable;
    }
}
