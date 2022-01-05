package com.clubhouse.backchannel.create;

import com.clubhouse.backchannel.chat.ChatArgs;
import h0.b0.v;
import h0.t.q;
import i0.e.c.e.e;
import i0.e.c.f.b.a.a;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;

@c(c = "com.clubhouse.backchannel.create.BackchannelCreateChatFragment$onViewCreated$8", f = "BackchannelCreateChatFragment.kt", l = {}, m = "invokeSuspend")
/* compiled from: BackchannelCreateChatFragment.kt */
public final class BackchannelCreateChatFragment$onViewCreated$8 extends SuspendLambda implements p<a, m0.l.c<? super i>, Object> {
    public /* synthetic */ Object c;
    public final /* synthetic */ BackchannelCreateChatFragment d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BackchannelCreateChatFragment$onViewCreated$8(BackchannelCreateChatFragment backchannelCreateChatFragment, m0.l.c<? super BackchannelCreateChatFragment$onViewCreated$8> cVar) {
        super(2, cVar);
        this.d = backchannelCreateChatFragment;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        BackchannelCreateChatFragment$onViewCreated$8 backchannelCreateChatFragment$onViewCreated$8 = new BackchannelCreateChatFragment$onViewCreated$8(this.d, cVar);
        backchannelCreateChatFragment$onViewCreated$8.c = obj;
        return backchannelCreateChatFragment$onViewCreated$8;
    }

    public Object invoke(Object obj, Object obj2) {
        BackchannelCreateChatFragment$onViewCreated$8 backchannelCreateChatFragment$onViewCreated$8 = new BackchannelCreateChatFragment$onViewCreated$8(this.d, (m0.l.c) obj2);
        backchannelCreateChatFragment$onViewCreated$8.c = (a) obj;
        i iVar = i.a;
        backchannelCreateChatFragment$onViewCreated$8.invokeSuspend(iVar);
        return iVar;
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        BackchannelCreateChatFragment backchannelCreateChatFragment = this.d;
        ChatArgs chatArgs = new ChatArgs(((a) this.c).a);
        m0.n.b.i.e(chatArgs, "mavericksArg");
        v.a1(backchannelCreateChatFragment, new e(chatArgs), (q) null, 2);
        return i.a;
    }
}
