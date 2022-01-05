package com.clubhouse.android.data.network;

import com.clubhouse.android.data.models.remote.request.SearchV2Request;
import com.clubhouse.android.data.models.remote.response.PaginatedSearchItemsResponse;
import i0.e.b.b3.b.b;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;
import t0.v;

@c(c = "com.clubhouse.android.data.network.ServerDataSource$search$2", f = "ServerDataSource.kt", l = {178}, m = "invokeSuspend")
/* compiled from: ServerDataSource.kt */
public final class ServerDataSource$search$2 extends SuspendLambda implements l<m0.l.c<? super v<PaginatedSearchItemsResponse>>, Object> {
    public int c;
    public final /* synthetic */ ServerDataSource d;
    public final /* synthetic */ SearchV2Request q;
    public final /* synthetic */ int x;
    public final /* synthetic */ int y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ServerDataSource$search$2(ServerDataSource serverDataSource, SearchV2Request searchV2Request, int i, int i2, m0.l.c<? super ServerDataSource$search$2> cVar) {
        super(1, cVar);
        this.d = serverDataSource;
        this.q = searchV2Request;
        this.x = i;
        this.y = i2;
    }

    public final m0.l.c<i> create(m0.l.c<?> cVar) {
        return new ServerDataSource$search$2(this.d, this.q, this.x, this.y, cVar);
    }

    public Object invoke(Object obj) {
        return new ServerDataSource$search$2(this.d, this.q, this.x, this.y, (m0.l.c) obj).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            b bVar = this.d.e;
            SearchV2Request searchV2Request = this.q;
            int i2 = this.x;
            int i3 = this.y;
            this.c = 1;
            obj = bVar.n1(searchV2Request, i2, i3, this);
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
