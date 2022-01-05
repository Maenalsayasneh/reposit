package n0.a.g2.d0;

import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.channels.BufferOverflow;
import m0.i;
import m0.l.c;
import m0.l.e;
import n0.a.g2.d;

/* compiled from: ChannelFlow.kt */
public final class f<T> extends e<T, T> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(d dVar, e eVar, int i, BufferOverflow bufferOverflow, int i2) {
        super(dVar, (i2 & 2) != 0 ? EmptyCoroutineContext.c : null, (i2 & 4) != 0 ? -3 : i, (i2 & 8) != 0 ? BufferOverflow.SUSPEND : bufferOverflow);
    }

    public d<T> h(e eVar, int i, BufferOverflow bufferOverflow) {
        return new f(this.x, eVar, i, bufferOverflow);
    }

    public d<T> i() {
        return this.x;
    }

    public Object k(n0.a.g2.e<? super T> eVar, c<? super i> cVar) {
        Object collect = this.x.collect(eVar, cVar);
        if (collect == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return collect;
        }
        return i.a;
    }

    public f(d<? extends T> dVar, e eVar, int i, BufferOverflow bufferOverflow) {
        super(dVar, eVar, i, bufferOverflow);
    }
}
