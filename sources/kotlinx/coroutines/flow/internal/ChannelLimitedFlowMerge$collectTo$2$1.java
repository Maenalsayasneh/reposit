package kotlinx.coroutines.flow.internal;

import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import n0.a.f0;
import n0.a.g2.d;
import n0.a.g2.d0.o;

@c(c = "kotlinx.coroutines.flow.internal.ChannelLimitedFlowMerge$collectTo$2$1", f = "Merge.kt", l = {96}, m = "invokeSuspend")
/* compiled from: Merge.kt */
public final class ChannelLimitedFlowMerge$collectTo$2$1 extends SuspendLambda implements p<f0, m0.l.c<? super i>, Object> {
    public int c;
    public final /* synthetic */ d<T> d;
    public final /* synthetic */ o<T> q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelLimitedFlowMerge$collectTo$2$1(d<? extends T> dVar, o<T> oVar, m0.l.c<? super ChannelLimitedFlowMerge$collectTo$2$1> cVar) {
        super(2, cVar);
        this.d = dVar;
        this.q = oVar;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        return new ChannelLimitedFlowMerge$collectTo$2$1(this.d, this.q, cVar);
    }

    public Object invoke(Object obj, Object obj2) {
        f0 f0Var = (f0) obj;
        return new ChannelLimitedFlowMerge$collectTo$2$1(this.d, this.q, (m0.l.c) obj2).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            d<T> dVar = this.d;
            o<T> oVar = this.q;
            this.c = 1;
            if (dVar.collect(oVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            h.d4(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return i.a;
    }
}
