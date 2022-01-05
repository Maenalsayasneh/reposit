package com.clubhouse.android.data.network;

import com.clubhouse.android.data.models.remote.request.GetClubRequest;
import com.clubhouse.android.data.models.remote.response.GetEventsResponse;
import i0.e.b.b3.b.b;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;
import t0.v;

@c(c = "com.clubhouse.android.data.network.ServerDataSource$getEventsForClub$2", f = "ServerDataSource.kt", l = {163}, m = "invokeSuspend")
/* compiled from: ServerDataSource.kt */
public final class ServerDataSource$getEventsForClub$2 extends SuspendLambda implements l<m0.l.c<? super v<GetEventsResponse>>, Object> {
    public int c;
    public final /* synthetic */ ServerDataSource d;
    public final /* synthetic */ GetClubRequest q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ServerDataSource$getEventsForClub$2(ServerDataSource serverDataSource, GetClubRequest getClubRequest, m0.l.c<? super ServerDataSource$getEventsForClub$2> cVar) {
        super(1, cVar);
        this.d = serverDataSource;
        this.q = getClubRequest;
    }

    public final m0.l.c<i> create(m0.l.c<?> cVar) {
        return new ServerDataSource$getEventsForClub$2(this.d, this.q, cVar);
    }

    public Object invoke(Object obj) {
        return new ServerDataSource$getEventsForClub$2(this.d, this.q, (m0.l.c) obj).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            b bVar = this.d.e;
            GetClubRequest getClubRequest = this.q;
            this.c = 1;
            obj = bVar.w(getClubRequest, this);
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
