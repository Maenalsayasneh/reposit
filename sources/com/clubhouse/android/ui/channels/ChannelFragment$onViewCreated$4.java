package com.clubhouse.android.ui.channels;

import com.clubhouse.android.ui.ChannelDisplayState;
import i0.e.b.z2.g.j;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;

@c(c = "com.clubhouse.android.ui.channels.ChannelFragment$onViewCreated$4", f = "ChannelFragment.kt", l = {}, m = "invokeSuspend")
/* compiled from: ChannelFragment.kt */
public final class ChannelFragment$onViewCreated$4 extends SuspendLambda implements p<ChannelDisplayState, m0.l.c<? super i>, Object> {
    public /* synthetic */ Object c;
    public final /* synthetic */ ChannelFragment d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelFragment$onViewCreated$4(ChannelFragment channelFragment, m0.l.c<? super ChannelFragment$onViewCreated$4> cVar) {
        super(2, cVar);
        this.d = channelFragment;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        ChannelFragment$onViewCreated$4 channelFragment$onViewCreated$4 = new ChannelFragment$onViewCreated$4(this.d, cVar);
        channelFragment$onViewCreated$4.c = obj;
        return channelFragment$onViewCreated$4;
    }

    public Object invoke(Object obj, Object obj2) {
        ChannelFragment$onViewCreated$4 channelFragment$onViewCreated$4 = new ChannelFragment$onViewCreated$4(this.d, (m0.l.c) obj2);
        channelFragment$onViewCreated$4.c = (ChannelDisplayState) obj;
        i iVar = i.a;
        channelFragment$onViewCreated$4.invokeSuspend(iVar);
        return iVar;
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        this.d.S0().p(new j(((ChannelDisplayState) this.c) == ChannelDisplayState.EXPANDED));
        return i.a;
    }
}
