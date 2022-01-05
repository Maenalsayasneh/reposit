package com.clubhouse.backchannel.data.repos;

import com.clubhouse.pubsub.user.backchannel.models.remote.Chat;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import n0.a.f0;

@c(c = "com.clubhouse.backchannel.data.repos.DefaultBackchannelRepo$applyRemovedChatMember$1$1$2", f = "DefaultBackchannelRepo.kt", l = {432}, m = "invokeSuspend")
/* compiled from: DefaultBackchannelRepo.kt */
public final class DefaultBackchannelRepo$applyRemovedChatMember$1$1$2 extends SuspendLambda implements p<f0, m0.l.c<? super i>, Object> {
    public int c;
    public final /* synthetic */ DefaultBackchannelRepo d;
    public final /* synthetic */ Chat q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DefaultBackchannelRepo$applyRemovedChatMember$1$1$2(DefaultBackchannelRepo defaultBackchannelRepo, Chat chat, m0.l.c<? super DefaultBackchannelRepo$applyRemovedChatMember$1$1$2> cVar) {
        super(2, cVar);
        this.d = defaultBackchannelRepo;
        this.q = chat;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        return new DefaultBackchannelRepo$applyRemovedChatMember$1$1$2(this.d, this.q, cVar);
    }

    public Object invoke(Object obj, Object obj2) {
        f0 f0Var = (f0) obj;
        return new DefaultBackchannelRepo$applyRemovedChatMember$1$1$2(this.d, this.q, (m0.l.c) obj2).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            n0.a.g2.p<String> pVar = this.d.j;
            String str = this.q.c;
            this.c = 1;
            if (pVar.emit(str, this) == coroutineSingletons) {
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
