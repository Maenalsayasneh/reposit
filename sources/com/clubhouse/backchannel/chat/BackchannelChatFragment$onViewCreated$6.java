package com.clubhouse.backchannel.chat;

import i0.e.c.c.i0;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import m0.r.k;

@c(c = "com.clubhouse.backchannel.chat.BackchannelChatFragment$onViewCreated$6", f = "BackchannelChatFragment.kt", l = {}, m = "invokeSuspend")
/* compiled from: BackchannelChatFragment.kt */
public final class BackchannelChatFragment$onViewCreated$6 extends SuspendLambda implements p<String, m0.l.c<? super i>, Object> {
    public final /* synthetic */ BackchannelChatFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BackchannelChatFragment$onViewCreated$6(BackchannelChatFragment backchannelChatFragment, m0.l.c<? super BackchannelChatFragment$onViewCreated$6> cVar) {
        super(2, cVar);
        this.c = backchannelChatFragment;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        return new BackchannelChatFragment$onViewCreated$6(this.c, cVar);
    }

    public Object invoke(Object obj, Object obj2) {
        String str = (String) obj;
        BackchannelChatFragment$onViewCreated$6 backchannelChatFragment$onViewCreated$6 = new BackchannelChatFragment$onViewCreated$6(this.c, (m0.l.c) obj2);
        i iVar = i.a;
        backchannelChatFragment$onViewCreated$6.invokeSuspend(iVar);
        return iVar;
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        BackchannelChatFragment backchannelChatFragment = this.c;
        k<Object>[] kVarArr = BackchannelChatFragment.Z1;
        backchannelChatFragment.P0().p(new i0(this.c.O0().f.getText().toString()));
        return i.a;
    }
}
