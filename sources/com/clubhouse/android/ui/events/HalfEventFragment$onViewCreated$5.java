package com.clubhouse.android.ui.events;

import com.clubhouse.android.data.models.local.channel.ChannelInRoomWithAccess;
import com.clubhouse.android.data.models.local.user.SourceLocation;
import com.clubhouse.android.ui.channels.ChannelNavigation;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;

@c(c = "com.clubhouse.android.ui.events.HalfEventFragment$onViewCreated$5", f = "HalfEventFragment.kt", l = {}, m = "invokeSuspend")
/* compiled from: HalfEventFragment.kt */
public final class HalfEventFragment$onViewCreated$5 extends SuspendLambda implements p<ChannelInRoomWithAccess, m0.l.c<? super i>, Object> {
    public /* synthetic */ Object c;
    public final /* synthetic */ HalfEventFragment d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HalfEventFragment$onViewCreated$5(HalfEventFragment halfEventFragment, m0.l.c<? super HalfEventFragment$onViewCreated$5> cVar) {
        super(2, cVar);
        this.d = halfEventFragment;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        HalfEventFragment$onViewCreated$5 halfEventFragment$onViewCreated$5 = new HalfEventFragment$onViewCreated$5(this.d, cVar);
        halfEventFragment$onViewCreated$5.c = obj;
        return halfEventFragment$onViewCreated$5;
    }

    public Object invoke(Object obj, Object obj2) {
        HalfEventFragment$onViewCreated$5 halfEventFragment$onViewCreated$5 = new HalfEventFragment$onViewCreated$5(this.d, (m0.l.c) obj2);
        halfEventFragment$onViewCreated$5.c = (ChannelInRoomWithAccess) obj;
        i iVar = i.a;
        halfEventFragment$onViewCreated$5.invokeSuspend(iVar);
        return iVar;
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        ChannelInRoomWithAccess channelInRoomWithAccess = (ChannelInRoomWithAccess) this.c;
        ChannelNavigation.b(this.d, channelInRoomWithAccess.d2, channelInRoomWithAccess, SourceLocation.UNKNOWN);
        this.d.dismiss();
        return i.a;
    }
}
