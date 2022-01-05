package n0.a.g2;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowKt__ChannelsKt;
import m0.i;
import m0.l.c;
import m0.l.e;
import n0.a.f0;
import n0.a.f2.l;
import n0.a.f2.n;
import n0.a.g2.d0.d;
import n0.a.g2.d0.o;

/* compiled from: Channels.kt */
public final class a<T> extends d<T> {
    public static final /* synthetic */ AtomicIntegerFieldUpdater x = AtomicIntegerFieldUpdater.newUpdater(a.class, "consumed");
    public final boolean Y1;
    private volatile /* synthetic */ int consumed;
    public final n<T> y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(n nVar, boolean z, e eVar, int i, BufferOverflow bufferOverflow, int i2) {
        super((i2 & 4) != 0 ? EmptyCoroutineContext.c : null, (i2 & 8) != 0 ? -3 : i, (i2 & 16) != 0 ? BufferOverflow.SUSPEND : null);
        this.y = nVar;
        this.Y1 = z;
        this.consumed = 0;
    }

    public Object collect(e<? super T> eVar, c<? super i> cVar) {
        if (this.d == -3) {
            k();
            Object a = FlowKt__ChannelsKt.a(eVar, this.y, this.Y1, cVar);
            if (a == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return a;
            }
            return i.a;
        }
        Object collect = super.collect(eVar, cVar);
        if (collect == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return collect;
        }
        return i.a;
    }

    public String f() {
        return m0.n.b.i.k("channel=", this.y);
    }

    public Object g(l<? super T> lVar, c<? super i> cVar) {
        Object a = FlowKt__ChannelsKt.a(new o(lVar), this.y, this.Y1, cVar);
        if (a == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return a;
        }
        return i.a;
    }

    public d<T> h(e eVar, int i, BufferOverflow bufferOverflow) {
        return new a(this.y, this.Y1, eVar, i, bufferOverflow);
    }

    public d<T> i() {
        return new a(this.y, this.Y1, (e) null, 0, (BufferOverflow) null, 28);
    }

    public n<T> j(f0 f0Var) {
        k();
        if (this.d == -3) {
            return this.y;
        }
        return super.j(f0Var);
    }

    public final void k() {
        if (this.Y1) {
            boolean z = true;
            if (x.getAndSet(this, 1) != 0) {
                z = false;
            }
            if (!z) {
                throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once".toString());
            }
        }
    }

    public a(n<? extends T> nVar, boolean z, e eVar, int i, BufferOverflow bufferOverflow) {
        super(eVar, i, bufferOverflow);
        this.y = nVar;
        this.Y1 = z;
        this.consumed = 0;
    }
}
