package com.clubhouse.android.data.network;

import com.clubhouse.android.data.models.remote.request.UpdateTwitterProfileRequest;
import com.clubhouse.android.data.models.remote.response.EmptySuccessResponse;
import i0.e.b.b3.b.b;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;
import t0.v;

@c(c = "com.clubhouse.android.data.network.ServerDataSource$updateTwitterUsername$2", f = "ServerDataSource.kt", l = {77}, m = "invokeSuspend")
/* compiled from: ServerDataSource.kt */
public final class ServerDataSource$updateTwitterUsername$2 extends SuspendLambda implements l<m0.l.c<? super v<EmptySuccessResponse>>, Object> {
    public int c;
    public final /* synthetic */ ServerDataSource d;
    public final /* synthetic */ UpdateTwitterProfileRequest q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ServerDataSource$updateTwitterUsername$2(ServerDataSource serverDataSource, UpdateTwitterProfileRequest updateTwitterProfileRequest, m0.l.c<? super ServerDataSource$updateTwitterUsername$2> cVar) {
        super(1, cVar);
        this.d = serverDataSource;
        this.q = updateTwitterProfileRequest;
    }

    public final m0.l.c<i> create(m0.l.c<?> cVar) {
        return new ServerDataSource$updateTwitterUsername$2(this.d, this.q, cVar);
    }

    public Object invoke(Object obj) {
        return new ServerDataSource$updateTwitterUsername$2(this.d, this.q, (m0.l.c) obj).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            b bVar = this.d.e;
            UpdateTwitterProfileRequest updateTwitterProfileRequest = this.q;
            this.c = 1;
            obj = bVar.m1(updateTwitterProfileRequest, this);
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
