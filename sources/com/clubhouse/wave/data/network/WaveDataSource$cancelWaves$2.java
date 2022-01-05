package com.clubhouse.wave.data.network;

import com.clubhouse.android.data.models.remote.response.EmptySuccessResponse;
import i0.e.e.k.a.a;
import i0.e.e.k.a.b;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;
import t0.v;

@c(c = "com.clubhouse.wave.data.network.WaveDataSource$cancelWaves$2", f = "WaveDataSource.kt", l = {42}, m = "invokeSuspend")
/* compiled from: WaveDataSource.kt */
public final class WaveDataSource$cancelWaves$2 extends SuspendLambda implements l<m0.l.c<? super v<EmptySuccessResponse>>, Object> {
    public int c;
    public final /* synthetic */ b d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WaveDataSource$cancelWaves$2(b bVar, m0.l.c<? super WaveDataSource$cancelWaves$2> cVar) {
        super(1, cVar);
        this.d = bVar;
    }

    public final m0.l.c<i> create(m0.l.c<?> cVar) {
        return new WaveDataSource$cancelWaves$2(this.d, cVar);
    }

    public Object invoke(Object obj) {
        return new WaveDataSource$cancelWaves$2(this.d, (m0.l.c) obj).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            a aVar = this.d.e;
            this.c = 1;
            obj = aVar.c(this);
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
