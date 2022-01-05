package com.clubhouse.android.ui.creation;

import com.clubhouse.android.data.models.local.channel.ChannelInRoomWithAccess;
import com.clubhouse.android.data.models.local.user.SourceLocation;
import com.clubhouse.android.ui.channels.ChannelNavigation;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;

@c(c = "com.clubhouse.android.ui.creation.CreateChannelFragment$onViewCreated$6", f = "CreateChannelFragment.kt", l = {}, m = "invokeSuspend")
/* compiled from: CreateChannelFragment.kt */
public final class CreateChannelFragment$onViewCreated$6 extends SuspendLambda implements p<ChannelInRoomWithAccess, m0.l.c<? super i>, Object> {
    public /* synthetic */ Object c;
    public final /* synthetic */ CreateChannelFragment d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CreateChannelFragment$onViewCreated$6(CreateChannelFragment createChannelFragment, m0.l.c<? super CreateChannelFragment$onViewCreated$6> cVar) {
        super(2, cVar);
        this.d = createChannelFragment;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        CreateChannelFragment$onViewCreated$6 createChannelFragment$onViewCreated$6 = new CreateChannelFragment$onViewCreated$6(this.d, cVar);
        createChannelFragment$onViewCreated$6.c = obj;
        return createChannelFragment$onViewCreated$6;
    }

    public Object invoke(Object obj, Object obj2) {
        CreateChannelFragment$onViewCreated$6 createChannelFragment$onViewCreated$6 = new CreateChannelFragment$onViewCreated$6(this.d, (m0.l.c) obj2);
        createChannelFragment$onViewCreated$6.c = (ChannelInRoomWithAccess) obj;
        i iVar = i.a;
        createChannelFragment$onViewCreated$6.invokeSuspend(iVar);
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
