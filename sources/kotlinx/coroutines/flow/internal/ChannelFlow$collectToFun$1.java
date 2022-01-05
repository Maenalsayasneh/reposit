package kotlinx.coroutines.flow.internal;

import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import n0.a.f2.l;
import n0.a.g2.d0.d;

@c(c = "kotlinx.coroutines.flow.internal.ChannelFlow$collectToFun$1", f = "ChannelFlow.kt", l = {60}, m = "invokeSuspend")
/* compiled from: ChannelFlow.kt */
public final class ChannelFlow$collectToFun$1 extends SuspendLambda implements p<l<? super T>, m0.l.c<? super i>, Object> {
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ d<T> q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelFlow$collectToFun$1(d<T> dVar, m0.l.c<? super ChannelFlow$collectToFun$1> cVar) {
        super(2, cVar);
        this.q = dVar;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        ChannelFlow$collectToFun$1 channelFlow$collectToFun$1 = new ChannelFlow$collectToFun$1(this.q, cVar);
        channelFlow$collectToFun$1.d = obj;
        return channelFlow$collectToFun$1;
    }

    public Object invoke(Object obj, Object obj2) {
        ChannelFlow$collectToFun$1 channelFlow$collectToFun$1 = new ChannelFlow$collectToFun$1(this.q, (m0.l.c) obj2);
        channelFlow$collectToFun$1.d = (l) obj;
        return channelFlow$collectToFun$1.invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            d<T> dVar = this.q;
            this.c = 1;
            if (dVar.g((l) this.d, this) == coroutineSingletons) {
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
