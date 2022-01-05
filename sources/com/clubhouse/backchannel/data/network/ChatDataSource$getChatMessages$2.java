package com.clubhouse.backchannel.data.network;

import com.clubhouse.backchannel.data.models.remote.response.ChatMessagesResponse;
import i0.e.c.f.c.a;
import i0.e.c.f.c.b;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;
import t0.v;

@c(c = "com.clubhouse.backchannel.data.network.ChatDataSource$getChatMessages$2", f = "ChatDataSource.kt", l = {55}, m = "invokeSuspend")
/* compiled from: ChatDataSource.kt */
public final class ChatDataSource$getChatMessages$2 extends SuspendLambda implements l<m0.l.c<? super v<ChatMessagesResponse>>, Object> {
    public final /* synthetic */ Integer Y1;
    public int c;
    public final /* synthetic */ b d;
    public final /* synthetic */ String q;
    public final /* synthetic */ Integer x;
    public final /* synthetic */ Integer y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChatDataSource$getChatMessages$2(b bVar, String str, Integer num, Integer num2, Integer num3, m0.l.c<? super ChatDataSource$getChatMessages$2> cVar) {
        super(1, cVar);
        this.d = bVar;
        this.q = str;
        this.x = num;
        this.y = num2;
        this.Y1 = num3;
    }

    public final m0.l.c<i> create(m0.l.c<?> cVar) {
        return new ChatDataSource$getChatMessages$2(this.d, this.q, this.x, this.y, this.Y1, cVar);
    }

    public Object invoke(Object obj) {
        return new ChatDataSource$getChatMessages$2(this.d, this.q, this.x, this.y, this.Y1, (m0.l.c) obj).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            a aVar = this.d.e;
            String str = this.q;
            Integer num = this.x;
            Integer num2 = this.y;
            Integer num3 = this.Y1;
            this.c = 1;
            obj = aVar.g(str, num, num2, num3, this);
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
