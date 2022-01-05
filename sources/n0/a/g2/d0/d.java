package n0.a.g2.d0;

import java.util.ArrayList;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.flow.internal.ChannelFlow$collect$2;
import kotlinx.coroutines.flow.internal.ChannelFlow$collectToFun$1;
import m0.j.g;
import m0.l.c;
import m0.l.e;
import m0.n.b.i;
import m0.r.t.a.r.m.a1.a;
import n0.a.f0;
import n0.a.f2.l;
import n0.a.f2.n;

/* compiled from: ChannelFlow.kt */
public abstract class d<T> implements k<T> {
    public final e c;
    public final int d;
    public final BufferOverflow q;

    public d(e eVar, int i, BufferOverflow bufferOverflow) {
        this.c = eVar;
        this.d = i;
        this.q = bufferOverflow;
    }

    public n0.a.g2.d<T> c(e eVar, int i, BufferOverflow bufferOverflow) {
        e plus = eVar.plus(this.c);
        if (bufferOverflow == BufferOverflow.SUSPEND) {
            int i2 = this.d;
            if (i2 != -3) {
                if (i != -3) {
                    if (i2 != -2) {
                        if (i != -2 && (i2 = i2 + i) < 0) {
                            i = Integer.MAX_VALUE;
                        }
                    }
                }
                i = i2;
            }
            bufferOverflow = this.q;
        }
        if (i.a(plus, this.c) && i == this.d && bufferOverflow == this.q) {
            return this;
        }
        return h(plus, i, bufferOverflow);
    }

    public Object collect(n0.a.g2.e<? super T> eVar, c<? super m0.i> cVar) {
        Object P0 = a.P0(new ChannelFlow$collect$2(eVar, this, (c<? super ChannelFlow$collect$2>) null), cVar);
        return P0 == CoroutineSingletons.COROUTINE_SUSPENDED ? P0 : m0.i.a;
    }

    public String f() {
        return null;
    }

    public abstract Object g(l<? super T> lVar, c<? super m0.i> cVar);

    public abstract d<T> h(e eVar, int i, BufferOverflow bufferOverflow);

    public n0.a.g2.d<T> i() {
        return null;
    }

    public n<T> j(f0 f0Var) {
        e eVar = this.c;
        int i = this.d;
        if (i == -3) {
            i = -2;
        }
        return ProduceKt.b(f0Var, eVar, i, this.q, CoroutineStart.ATOMIC, (m0.n.a.l<? super Throwable, m0.i>) null, new ChannelFlow$collectToFun$1(this, (c<? super ChannelFlow$collectToFun$1>) null));
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String f = f();
        if (f != null) {
            arrayList.add(f);
        }
        e eVar = this.c;
        if (eVar != EmptyCoroutineContext.c) {
            arrayList.add(i.k("context=", eVar));
        }
        int i = this.d;
        if (i != -3) {
            arrayList.add(i.k("capacity=", Integer.valueOf(i)));
        }
        BufferOverflow bufferOverflow = this.q;
        if (bufferOverflow != BufferOverflow.SUSPEND) {
            arrayList.add(i.k("onBufferOverflow=", bufferOverflow));
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('[');
        return i0.d.a.a.a.x0(sb, g.E(arrayList, ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (m0.n.a.l) null, 62), ']');
    }
}
