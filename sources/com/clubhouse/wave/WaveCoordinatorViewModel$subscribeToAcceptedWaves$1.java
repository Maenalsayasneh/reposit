package com.clubhouse.wave;

import com.clubhouse.android.data.models.local.channel.Channel;
import com.clubhouse.android.data.models.local.user.SourceLocation;
import i0.e.b.z2.f.e;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;

@c(c = "com.clubhouse.wave.WaveCoordinatorViewModel$subscribeToAcceptedWaves$1", f = "WaveCoordinatorViewModel.kt", l = {}, m = "invokeSuspend")
/* compiled from: WaveCoordinatorViewModel.kt */
public final class WaveCoordinatorViewModel$subscribeToAcceptedWaves$1 extends SuspendLambda implements p<String, m0.l.c<? super i>, Object> {
    public /* synthetic */ Object c;
    public final /* synthetic */ WaveCoordinatorViewModel d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WaveCoordinatorViewModel$subscribeToAcceptedWaves$1(WaveCoordinatorViewModel waveCoordinatorViewModel, m0.l.c<? super WaveCoordinatorViewModel$subscribeToAcceptedWaves$1> cVar) {
        super(2, cVar);
        this.d = waveCoordinatorViewModel;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        WaveCoordinatorViewModel$subscribeToAcceptedWaves$1 waveCoordinatorViewModel$subscribeToAcceptedWaves$1 = new WaveCoordinatorViewModel$subscribeToAcceptedWaves$1(this.d, cVar);
        waveCoordinatorViewModel$subscribeToAcceptedWaves$1.c = obj;
        return waveCoordinatorViewModel$subscribeToAcceptedWaves$1;
    }

    public Object invoke(Object obj, Object obj2) {
        WaveCoordinatorViewModel$subscribeToAcceptedWaves$1 waveCoordinatorViewModel$subscribeToAcceptedWaves$1 = new WaveCoordinatorViewModel$subscribeToAcceptedWaves$1(this.d, (m0.l.c) obj2);
        waveCoordinatorViewModel$subscribeToAcceptedWaves$1.c = (String) obj;
        i iVar = i.a;
        waveCoordinatorViewModel$subscribeToAcceptedWaves$1.invokeSuspend(iVar);
        return iVar;
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        WaveCoordinatorViewModel waveCoordinatorViewModel = this.d;
        e eVar = new e((String) this.c, (Channel) null, SourceLocation.WAVE, 2);
        int i = WaveCoordinatorViewModel.m;
        waveCoordinatorViewModel.o(eVar);
        return i.a;
    }
}
