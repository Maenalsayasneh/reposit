package com.clubhouse.backchannel.data.network;

import com.clubhouse.backchannel.data.models.remote.response.ArchivedChatsResponse;
import i0.e.c.f.c.a;
import i0.e.c.f.c.b;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;
import t0.v;

@c(c = "com.clubhouse.backchannel.data.network.ChatDataSource$getArchivedChats$2", f = "ChatDataSource.kt", l = {71}, m = "invokeSuspend")
/* compiled from: ChatDataSource.kt */
public final class ChatDataSource$getArchivedChats$2 extends SuspendLambda implements l<m0.l.c<? super v<ArchivedChatsResponse>>, Object> {
    public int c;
    public final /* synthetic */ b d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChatDataSource$getArchivedChats$2(b bVar, m0.l.c<? super ChatDataSource$getArchivedChats$2> cVar) {
        super(1, cVar);
        this.d = bVar;
    }

    public final m0.l.c<i> create(m0.l.c<?> cVar) {
        return new ChatDataSource$getArchivedChats$2(this.d, cVar);
    }

    public Object invoke(Object obj) {
        return new ChatDataSource$getArchivedChats$2(this.d, (m0.l.c) obj).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            a aVar = this.d.e;
            this.c = 1;
            obj = aVar.i(this);
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
