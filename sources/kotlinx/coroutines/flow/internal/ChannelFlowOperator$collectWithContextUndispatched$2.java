package kotlinx.coroutines.flow.internal;

import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import n0.a.g2.e;

@c(c = "kotlinx.coroutines.flow.internal.ChannelFlowOperator$collectWithContextUndispatched$2", f = "ChannelFlow.kt", l = {152}, m = "invokeSuspend")
/* compiled from: ChannelFlow.kt */
public final class ChannelFlowOperator$collectWithContextUndispatched$2 extends SuspendLambda implements p<e<? super T>, m0.l.c<? super i>, Object> {
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ n0.a.g2.d0.e<S, T> q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelFlowOperator$collectWithContextUndispatched$2(n0.a.g2.d0.e<S, T> eVar, m0.l.c<? super ChannelFlowOperator$collectWithContextUndispatched$2> cVar) {
        super(2, cVar);
        this.q = eVar;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        ChannelFlowOperator$collectWithContextUndispatched$2 channelFlowOperator$collectWithContextUndispatched$2 = new ChannelFlowOperator$collectWithContextUndispatched$2(this.q, cVar);
        channelFlowOperator$collectWithContextUndispatched$2.d = obj;
        return channelFlowOperator$collectWithContextUndispatched$2;
    }

    public Object invoke(Object obj, Object obj2) {
        ChannelFlowOperator$collectWithContextUndispatched$2 channelFlowOperator$collectWithContextUndispatched$2 = new ChannelFlowOperator$collectWithContextUndispatched$2(this.q, (m0.l.c) obj2);
        channelFlowOperator$collectWithContextUndispatched$2.d = (e) obj;
        return channelFlowOperator$collectWithContextUndispatched$2.invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            n0.a.g2.d0.e<S, T> eVar = this.q;
            this.c = 1;
            if (eVar.k((e) this.d, this) == coroutineSingletons) {
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
