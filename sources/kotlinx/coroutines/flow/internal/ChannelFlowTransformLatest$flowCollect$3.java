package kotlinx.coroutines.flow.internal;

import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import n0.a.f0;
import n0.a.g2.d;
import n0.a.g2.e;

@c(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3", f = "Merge.kt", l = {101}, m = "invokeSuspend")
/* compiled from: Merge.kt */
public final class ChannelFlowTransformLatest$flowCollect$3 extends SuspendLambda implements p<f0, m0.l.c<? super i>, Object> {
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ ChannelFlowTransformLatest<T, R> q;
    public final /* synthetic */ e<R> x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelFlowTransformLatest$flowCollect$3(ChannelFlowTransformLatest<T, R> channelFlowTransformLatest, e<? super R> eVar, m0.l.c<? super ChannelFlowTransformLatest$flowCollect$3> cVar) {
        super(2, cVar);
        this.q = channelFlowTransformLatest;
        this.x = eVar;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        ChannelFlowTransformLatest$flowCollect$3 channelFlowTransformLatest$flowCollect$3 = new ChannelFlowTransformLatest$flowCollect$3(this.q, this.x, cVar);
        channelFlowTransformLatest$flowCollect$3.d = obj;
        return channelFlowTransformLatest$flowCollect$3;
    }

    public Object invoke(Object obj, Object obj2) {
        ChannelFlowTransformLatest$flowCollect$3 channelFlowTransformLatest$flowCollect$3 = new ChannelFlowTransformLatest$flowCollect$3(this.q, this.x, (m0.l.c) obj2);
        channelFlowTransformLatest$flowCollect$3.d = (f0) obj;
        return channelFlowTransformLatest$flowCollect$3.invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            ChannelFlowTransformLatest<T, R> channelFlowTransformLatest = this.q;
            d<S> dVar = channelFlowTransformLatest.x;
            ChannelFlowTransformLatest$flowCollect$3$invokeSuspend$$inlined$collect$1 channelFlowTransformLatest$flowCollect$3$invokeSuspend$$inlined$collect$1 = new ChannelFlowTransformLatest$flowCollect$3$invokeSuspend$$inlined$collect$1(ref$ObjectRef, (f0) this.d, channelFlowTransformLatest, this.x);
            this.c = 1;
            if (dVar.collect(channelFlowTransformLatest$flowCollect$3$invokeSuspend$$inlined$collect$1, this) == coroutineSingletons) {
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
