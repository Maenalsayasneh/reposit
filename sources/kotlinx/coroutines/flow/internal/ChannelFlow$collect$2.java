package kotlinx.coroutines.flow.internal;

import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt__ChannelsKt;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import n0.a.f0;
import n0.a.f2.n;
import n0.a.g2.d0.d;
import n0.a.g2.e;

@c(c = "kotlinx.coroutines.flow.internal.ChannelFlow$collect$2", f = "ChannelFlow.kt", l = {123}, m = "invokeSuspend")
/* compiled from: ChannelFlow.kt */
public final class ChannelFlow$collect$2 extends SuspendLambda implements p<f0, m0.l.c<? super i>, Object> {
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ e<T> q;
    public final /* synthetic */ d<T> x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelFlow$collect$2(e<? super T> eVar, d<T> dVar, m0.l.c<? super ChannelFlow$collect$2> cVar) {
        super(2, cVar);
        this.q = eVar;
        this.x = dVar;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        ChannelFlow$collect$2 channelFlow$collect$2 = new ChannelFlow$collect$2(this.q, this.x, cVar);
        channelFlow$collect$2.d = obj;
        return channelFlow$collect$2;
    }

    public Object invoke(Object obj, Object obj2) {
        ChannelFlow$collect$2 channelFlow$collect$2 = new ChannelFlow$collect$2(this.q, this.x, (m0.l.c) obj2);
        channelFlow$collect$2.d = (f0) obj;
        return channelFlow$collect$2.invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            e<T> eVar = this.q;
            n<T> j = this.x.j((f0) this.d);
            this.c = 1;
            Object a = FlowKt__ChannelsKt.a(eVar, j, true, this);
            if (a != coroutineSingletons) {
                a = i.a;
            }
            if (a == coroutineSingletons) {
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
