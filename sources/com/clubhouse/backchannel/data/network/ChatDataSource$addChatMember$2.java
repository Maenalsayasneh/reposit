package com.clubhouse.backchannel.data.network;

import com.clubhouse.backchannel.data.models.remote.request.ChatMemberRequest;
import com.clubhouse.pubsub.user.backchannel.models.remote.ChatMember;
import i0.e.c.f.c.a;
import i0.e.c.f.c.b;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;
import t0.v;

@c(c = "com.clubhouse.backchannel.data.network.ChatDataSource$addChatMember$2", f = "ChatDataSource.kt", l = {30}, m = "invokeSuspend")
/* compiled from: ChatDataSource.kt */
public final class ChatDataSource$addChatMember$2 extends SuspendLambda implements l<m0.l.c<? super v<ChatMember>>, Object> {
    public int c;
    public final /* synthetic */ b d;
    public final /* synthetic */ ChatMemberRequest q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChatDataSource$addChatMember$2(b bVar, ChatMemberRequest chatMemberRequest, m0.l.c<? super ChatDataSource$addChatMember$2> cVar) {
        super(1, cVar);
        this.d = bVar;
        this.q = chatMemberRequest;
    }

    public final m0.l.c<i> create(m0.l.c<?> cVar) {
        return new ChatDataSource$addChatMember$2(this.d, this.q, cVar);
    }

    public Object invoke(Object obj) {
        return new ChatDataSource$addChatMember$2(this.d, this.q, (m0.l.c) obj).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            a aVar = this.d.e;
            ChatMemberRequest chatMemberRequest = this.q;
            this.c = 1;
            obj = aVar.a(chatMemberRequest, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            h.d4(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }
}
