package com.clubhouse.backchannel.create;

import i0.e.b.a3.d.b;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import m0.r.k;

@c(c = "com.clubhouse.backchannel.create.BackchannelCreateChatFragment$onViewCreated$3", f = "BackchannelCreateChatFragment.kt", l = {}, m = "invokeSuspend")
/* compiled from: BackchannelCreateChatFragment.kt */
public final class BackchannelCreateChatFragment$onViewCreated$3 extends SuspendLambda implements p<String, m0.l.c<? super i>, Object> {
    public /* synthetic */ Object c;
    public final /* synthetic */ BackchannelCreateChatFragment d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BackchannelCreateChatFragment$onViewCreated$3(BackchannelCreateChatFragment backchannelCreateChatFragment, m0.l.c<? super BackchannelCreateChatFragment$onViewCreated$3> cVar) {
        super(2, cVar);
        this.d = backchannelCreateChatFragment;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        BackchannelCreateChatFragment$onViewCreated$3 backchannelCreateChatFragment$onViewCreated$3 = new BackchannelCreateChatFragment$onViewCreated$3(this.d, cVar);
        backchannelCreateChatFragment$onViewCreated$3.c = obj;
        return backchannelCreateChatFragment$onViewCreated$3;
    }

    public Object invoke(Object obj, Object obj2) {
        BackchannelCreateChatFragment$onViewCreated$3 backchannelCreateChatFragment$onViewCreated$3 = new BackchannelCreateChatFragment$onViewCreated$3(this.d, (m0.l.c) obj2);
        backchannelCreateChatFragment$onViewCreated$3.c = (String) obj;
        i iVar = i.a;
        backchannelCreateChatFragment$onViewCreated$3.invokeSuspend(iVar);
        return iVar;
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        BackchannelCreateChatFragment backchannelCreateChatFragment = this.d;
        k<Object>[] kVarArr = BackchannelCreateChatFragment.Z1;
        backchannelCreateChatFragment.O0().p(new b((String) this.c));
        return i.a;
    }
}
