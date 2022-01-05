package com.clubhouse.android.data.network;

import com.clubhouse.android.data.models.remote.response.PaginatedGetRecentPaymentsResponse;
import i0.e.b.b3.b.b;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;
import t0.v;

@c(c = "com.clubhouse.android.data.network.ServerDataSource$getRecentPayments$2", f = "ServerDataSource.kt", l = {391}, m = "invokeSuspend")
/* compiled from: ServerDataSource.kt */
public final class ServerDataSource$getRecentPayments$2 extends SuspendLambda implements l<m0.l.c<? super v<PaginatedGetRecentPaymentsResponse>>, Object> {
    public int c;
    public final /* synthetic */ ServerDataSource d;
    public final /* synthetic */ int q;
    public final /* synthetic */ int x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ServerDataSource$getRecentPayments$2(ServerDataSource serverDataSource, int i, int i2, m0.l.c<? super ServerDataSource$getRecentPayments$2> cVar) {
        super(1, cVar);
        this.d = serverDataSource;
        this.q = i;
        this.x = i2;
    }

    public final m0.l.c<i> create(m0.l.c<?> cVar) {
        return new ServerDataSource$getRecentPayments$2(this.d, this.q, this.x, cVar);
    }

    public Object invoke(Object obj) {
        return new ServerDataSource$getRecentPayments$2(this.d, this.q, this.x, (m0.l.c) obj).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            b bVar = this.d.e;
            int i2 = this.q;
            int i3 = this.x;
            this.c = 1;
            obj = bVar.I(i2, i3, this);
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
