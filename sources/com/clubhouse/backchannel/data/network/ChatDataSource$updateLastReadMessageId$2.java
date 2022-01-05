package com.clubhouse.backchannel.data.network;

import com.clubhouse.android.data.models.remote.response.EmptySuccessResponse;
import com.clubhouse.backchannel.data.models.remote.request.UpdateLastReadMessageRequest;
import i0.e.c.f.c.a;
import i0.e.c.f.c.b;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;
import t0.v;

@c(c = "com.clubhouse.backchannel.data.network.ChatDataSource$updateLastReadMessageId$2", f = "ChatDataSource.kt", l = {58}, m = "invokeSuspend")
/* compiled from: ChatDataSource.kt */
public final class ChatDataSource$updateLastReadMessageId$2 extends SuspendLambda implements l<m0.l.c<? super v<EmptySuccessResponse>>, Object> {
    public int c;
    public final /* synthetic */ b d;
    public final /* synthetic */ String q;
    public final /* synthetic */ int x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChatDataSource$updateLastReadMessageId$2(b bVar, String str, int i, m0.l.c<? super ChatDataSource$updateLastReadMessageId$2> cVar) {
        super(1, cVar);
        this.d = bVar;
        this.q = str;
        this.x = i;
    }

    public final m0.l.c<i> create(m0.l.c<?> cVar) {
        return new ChatDataSource$updateLastReadMessageId$2(this.d, this.q, this.x, cVar);
    }

    public Object invoke(Object obj) {
        return new ChatDataSource$updateLastReadMessageId$2(this.d, this.q, this.x, (m0.l.c) obj).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            a aVar = this.d.e;
            UpdateLastReadMessageRequest updateLastReadMessageRequest = new UpdateLastReadMessageRequest(this.q, this.x);
            this.c = 1;
            obj = aVar.j(updateLastReadMessageRequest, this);
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
