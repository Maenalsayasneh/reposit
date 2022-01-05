package com.clubhouse.android.channels.analytics;

import i0.e.b.z2.g.k;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;

@c(c = "com.clubhouse.android.channels.analytics.ChannelLogger$1$state$1", f = "ChannelLogger.kt", l = {}, m = "invokeSuspend")
/* compiled from: ChannelLogger.kt */
public final class ChannelLogger$1$state$1 extends SuspendLambda implements p<k, m0.l.c<? super Boolean>, Object> {
    public /* synthetic */ Object c;

    public ChannelLogger$1$state$1(m0.l.c<? super ChannelLogger$1$state$1> cVar) {
        super(2, cVar);
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        ChannelLogger$1$state$1 channelLogger$1$state$1 = new ChannelLogger$1$state$1(cVar);
        channelLogger$1$state$1.c = obj;
        return channelLogger$1$state$1;
    }

    public Object invoke(Object obj, Object obj2) {
        ChannelLogger$1$state$1 channelLogger$1$state$1 = new ChannelLogger$1$state$1((m0.l.c) obj2);
        channelLogger$1$state$1.c = (k) obj;
        i iVar = i.a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(iVar);
        return Boolean.valueOf(((k) channelLogger$1$state$1.c).m);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        return Boolean.valueOf(((k) this.c).m);
    }
}
