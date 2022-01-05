package kotlinx.coroutines.flow.internal;

import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import m0.n.a.q;
import n0.a.f0;
import n0.a.g2.e;

@c(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$2", f = "Merge.kt", l = {34}, m = "invokeSuspend")
/* compiled from: Merge.kt */
public final class ChannelFlowTransformLatest$flowCollect$3$1$2 extends SuspendLambda implements p<f0, m0.l.c<? super i>, Object> {
    public int c;
    public final /* synthetic */ ChannelFlowTransformLatest<T, R> d;
    public final /* synthetic */ e<R> q;
    public final /* synthetic */ T x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelFlowTransformLatest$flowCollect$3$1$2(ChannelFlowTransformLatest<T, R> channelFlowTransformLatest, e<? super R> eVar, T t, m0.l.c<? super ChannelFlowTransformLatest$flowCollect$3$1$2> cVar) {
        super(2, cVar);
        this.d = channelFlowTransformLatest;
        this.q = eVar;
        this.x = t;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        return new ChannelFlowTransformLatest$flowCollect$3$1$2(this.d, this.q, this.x, cVar);
    }

    public Object invoke(Object obj, Object obj2) {
        f0 f0Var = (f0) obj;
        return new ChannelFlowTransformLatest$flowCollect$3$1$2(this.d, this.q, this.x, (m0.l.c) obj2).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            q<e<? super R>, T, m0.l.c<? super i>, Object> qVar = this.d.y;
            e<R> eVar = this.q;
            T t = this.x;
            this.c = 1;
            if (qVar.invoke(eVar, t, this) == coroutineSingletons) {
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
