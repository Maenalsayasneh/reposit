package n0.a.g2.d0;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.ChannelFlowOperator$collectWithContextUndispatched$2;
import kotlinx.coroutines.flow.internal.UndispatchedContextCollector;
import kotlinx.coroutines.internal.ThreadContextKt;
import m0.i;
import m0.l.c;
import m0.l.d;
import m0.r.t.a.r.m.a1.a;
import n0.a.f2.l;
import n0.a.g2.d;

/* compiled from: ChannelFlow.kt */
public abstract class e<S, T> extends d<T> {
    public final d<S> x;

    public e(d<? extends S> dVar, m0.l.e eVar, int i, BufferOverflow bufferOverflow) {
        super(eVar, i, bufferOverflow);
        this.x = dVar;
    }

    public Object collect(n0.a.g2.e<? super T> eVar, c<? super i> cVar) {
        if (this.d == -3) {
            m0.l.e context = cVar.getContext();
            m0.l.e plus = context.plus(this.c);
            if (m0.n.b.i.a(plus, context)) {
                Object k = k(eVar, cVar);
                if (k == CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return k;
                }
                return i.a;
            }
            int i = m0.l.d.h;
            d.a aVar = d.a.c;
            if (m0.n.b.i.a(plus.get(aVar), context.get(aVar))) {
                m0.l.e context2 = cVar.getContext();
                if (!(eVar instanceof o ? true : eVar instanceof m)) {
                    eVar = new UndispatchedContextCollector<>(eVar, context2);
                }
                Object l4 = a.l4(plus, eVar, ThreadContextKt.b(plus), new ChannelFlowOperator$collectWithContextUndispatched$2(this, (c<? super ChannelFlowOperator$collectWithContextUndispatched$2>) null), cVar);
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (l4 != coroutineSingletons) {
                    l4 = i.a;
                }
                if (l4 == coroutineSingletons) {
                    return l4;
                }
                return i.a;
            }
        }
        Object collect = super.collect(eVar, cVar);
        return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : i.a;
    }

    public Object g(l<? super T> lVar, c<? super i> cVar) {
        Object k = k(new o(lVar), cVar);
        return k == CoroutineSingletons.COROUTINE_SUSPENDED ? k : i.a;
    }

    public abstract Object k(n0.a.g2.e<? super T> eVar, c<? super i> cVar);

    public String toString() {
        return this.x + " -> " + super.toString();
    }
}
