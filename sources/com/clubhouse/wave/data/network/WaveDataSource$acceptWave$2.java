package com.clubhouse.wave.data.network;

import com.clubhouse.android.data.models.local.channel.ChannelInRoomWithAccess;
import com.clubhouse.wave.data.models.remote.request.AcceptWaveRequest;
import i0.e.e.k.a.a;
import i0.e.e.k.a.b;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;
import t0.v;

@c(c = "com.clubhouse.wave.data.network.WaveDataSource$acceptWave$2", f = "WaveDataSource.kt", l = {36}, m = "invokeSuspend")
/* compiled from: WaveDataSource.kt */
public final class WaveDataSource$acceptWave$2 extends SuspendLambda implements l<m0.l.c<? super v<ChannelInRoomWithAccess>>, Object> {
    public int c;
    public final /* synthetic */ b d;
    public final /* synthetic */ AcceptWaveRequest q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WaveDataSource$acceptWave$2(b bVar, AcceptWaveRequest acceptWaveRequest, m0.l.c<? super WaveDataSource$acceptWave$2> cVar) {
        super(1, cVar);
        this.d = bVar;
        this.q = acceptWaveRequest;
    }

    public final m0.l.c<i> create(m0.l.c<?> cVar) {
        return new WaveDataSource$acceptWave$2(this.d, this.q, cVar);
    }

    public Object invoke(Object obj) {
        return new WaveDataSource$acceptWave$2(this.d, this.q, (m0.l.c) obj).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            a aVar = this.d.e;
            AcceptWaveRequest acceptWaveRequest = this.q;
            this.c = 1;
            obj = aVar.h(acceptWaveRequest, this);
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
