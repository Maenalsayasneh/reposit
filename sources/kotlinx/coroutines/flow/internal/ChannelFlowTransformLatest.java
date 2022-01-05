package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.channels.BufferOverflow;
import m0.i;
import m0.l.c;
import m0.n.a.q;
import m0.r.t.a.r.m.a1.a;
import n0.a.g2.d;
import n0.a.g2.d0.e;

/* compiled from: Merge.kt */
public final class ChannelFlowTransformLatest<T, R> extends e<T, R> {
    public final q<n0.a.g2.e<? super R>, T, c<? super i>, Object> y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelFlowTransformLatest(q qVar, d dVar, m0.l.e eVar, int i, BufferOverflow bufferOverflow, int i2) {
        super(dVar, (i2 & 4) != 0 ? EmptyCoroutineContext.c : null, (i2 & 8) != 0 ? -2 : i, (i2 & 16) != 0 ? BufferOverflow.SUSPEND : null);
        this.y = qVar;
    }

    public n0.a.g2.d0.d<R> h(m0.l.e eVar, int i, BufferOverflow bufferOverflow) {
        return new ChannelFlowTransformLatest(this.y, this.x, eVar, i, bufferOverflow);
    }

    public Object k(n0.a.g2.e<? super R> eVar, c<? super i> cVar) {
        Object z1 = a.z1(new ChannelFlowTransformLatest$flowCollect$3(this, eVar, (c<? super ChannelFlowTransformLatest$flowCollect$3>) null), cVar);
        if (z1 == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return z1;
        }
        return i.a;
    }

    public ChannelFlowTransformLatest(q<? super n0.a.g2.e<? super R>, ? super T, ? super c<? super i>, ? extends Object> qVar, d<? extends T> dVar, m0.l.e eVar, int i, BufferOverflow bufferOverflow) {
        super(dVar, eVar, i, bufferOverflow);
        this.y = qVar;
    }
}
