package com.clubhouse.android.channels;

import com.clubhouse.android.data.models.remote.request.ActivePingRequest;
import com.clubhouse.android.data.models.remote.response.ActivePingResponse;
import com.clubhouse.android.data.network.ServerDataSource;
import com.clubhouse.android.data.network.ServerDataSource$activePing$2;
import com.clubhouse.android.shared.Result;
import i0.e.b.z2.a;
import i0.j.f.p.h;
import java.util.Objects;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;

@c(c = "com.clubhouse.android.channels.ChannelPingClient$startChannelPing$1", f = "ChannelPingClient.kt", l = {39}, m = "invokeSuspend")
/* compiled from: ChannelPingClient.kt */
public final class ChannelPingClient$startChannelPing$1 extends SuspendLambda implements p<i, m0.l.c<? super i>, Object> {
    public int c;
    public final /* synthetic */ a d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelPingClient$startChannelPing$1(a aVar, m0.l.c<? super ChannelPingClient$startChannelPing$1> cVar) {
        super(2, cVar);
        this.d = aVar;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        return new ChannelPingClient$startChannelPing$1(this.d, cVar);
    }

    public Object invoke(Object obj, Object obj2) {
        i iVar = (i) obj;
        return new ChannelPingClient$startChannelPing$1(this.d, (m0.l.c) obj2).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            a aVar = this.d;
            ServerDataSource serverDataSource = aVar.c;
            ActivePingRequest activePingRequest = new ActivePingRequest(aVar.d);
            this.c = 1;
            Objects.requireNonNull(serverDataSource);
            obj = serverDataSource.a(new ServerDataSource$activePing$2(serverDataSource, activePingRequest, (m0.l.c<? super ServerDataSource$activePing$2>) null), this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            try {
                h.d4(obj);
            } catch (Throwable th) {
                v0.a.a.d.w(th, "Ping failed", new Object[0]);
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.d.e.setValue(Boolean.valueOf(((ActivePingResponse) ((Result) obj).a()).a));
        return i.a;
    }
}
