package com.clubhouse.android.data.network;

import com.clubhouse.android.data.models.remote.request.AudienceReplyRequest;
import com.clubhouse.android.data.models.remote.response.AudienceReplyResponse;
import i0.e.b.b3.b.b;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;
import t0.v;

@c(c = "com.clubhouse.android.data.network.ServerDataSource$audienceReply$2", f = "ServerDataSource.kt", l = {226}, m = "invokeSuspend")
/* compiled from: ServerDataSource.kt */
public final class ServerDataSource$audienceReply$2 extends SuspendLambda implements l<m0.l.c<? super v<AudienceReplyResponse>>, Object> {
    public int c;
    public final /* synthetic */ ServerDataSource d;
    public final /* synthetic */ AudienceReplyRequest q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ServerDataSource$audienceReply$2(ServerDataSource serverDataSource, AudienceReplyRequest audienceReplyRequest, m0.l.c<? super ServerDataSource$audienceReply$2> cVar) {
        super(1, cVar);
        this.d = serverDataSource;
        this.q = audienceReplyRequest;
    }

    public final m0.l.c<i> create(m0.l.c<?> cVar) {
        return new ServerDataSource$audienceReply$2(this.d, this.q, cVar);
    }

    public Object invoke(Object obj) {
        return new ServerDataSource$audienceReply$2(this.d, this.q, (m0.l.c) obj).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            b bVar = this.d.e;
            AudienceReplyRequest audienceReplyRequest = this.q;
            this.c = 1;
            obj = bVar.W0(audienceReplyRequest, this);
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
