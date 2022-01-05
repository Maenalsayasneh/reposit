package com.clubhouse.android.data.network;

import com.clubhouse.android.data.models.remote.response.GetFeedResponse;
import i0.e.b.b3.b.b;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;
import t0.v;

@c(c = "com.clubhouse.android.data.network.ServerDataSource$getFeed$2", f = "ServerDataSource.kt", l = {360}, m = "invokeSuspend")
/* compiled from: ServerDataSource.kt */
public final class ServerDataSource$getFeed$2 extends SuspendLambda implements l<m0.l.c<? super v<GetFeedResponse>>, Object> {
    public final /* synthetic */ Boolean Y1;
    public final /* synthetic */ Boolean Z1;
    public int c;
    public final /* synthetic */ ServerDataSource d;
    public final /* synthetic */ Boolean q;
    public final /* synthetic */ Boolean x;
    public final /* synthetic */ Boolean y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ServerDataSource$getFeed$2(ServerDataSource serverDataSource, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, m0.l.c<? super ServerDataSource$getFeed$2> cVar) {
        super(1, cVar);
        this.d = serverDataSource;
        this.q = bool;
        this.x = bool2;
        this.y = bool3;
        this.Y1 = bool4;
        this.Z1 = bool5;
    }

    public final m0.l.c<i> create(m0.l.c<?> cVar) {
        return new ServerDataSource$getFeed$2(this.d, this.q, this.x, this.y, this.Y1, this.Z1, cVar);
    }

    public Object invoke(Object obj) {
        return ((ServerDataSource$getFeed$2) create((m0.l.c) obj)).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            b bVar = this.d.e;
            Boolean bool = this.q;
            Boolean bool2 = this.x;
            Boolean bool3 = this.y;
            Boolean bool4 = this.Y1;
            Boolean bool5 = this.Z1;
            this.c = 1;
            obj = bVar.R(bool, bool2, bool3, bool4, bool5, this);
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
