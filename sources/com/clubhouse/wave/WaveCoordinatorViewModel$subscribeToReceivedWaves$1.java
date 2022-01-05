package com.clubhouse.wave;

import com.clubhouse.wave.data.models.local.ReceivedWave;
import i0.e.e.e;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;

@c(c = "com.clubhouse.wave.WaveCoordinatorViewModel$subscribeToReceivedWaves$1", f = "WaveCoordinatorViewModel.kt", l = {}, m = "invokeSuspend")
/* compiled from: WaveCoordinatorViewModel.kt */
public final class WaveCoordinatorViewModel$subscribeToReceivedWaves$1 extends SuspendLambda implements p<ReceivedWave, m0.l.c<? super i>, Object> {
    public /* synthetic */ Object c;
    public final /* synthetic */ WaveCoordinatorViewModel d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WaveCoordinatorViewModel$subscribeToReceivedWaves$1(WaveCoordinatorViewModel waveCoordinatorViewModel, m0.l.c<? super WaveCoordinatorViewModel$subscribeToReceivedWaves$1> cVar) {
        super(2, cVar);
        this.d = waveCoordinatorViewModel;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        WaveCoordinatorViewModel$subscribeToReceivedWaves$1 waveCoordinatorViewModel$subscribeToReceivedWaves$1 = new WaveCoordinatorViewModel$subscribeToReceivedWaves$1(this.d, cVar);
        waveCoordinatorViewModel$subscribeToReceivedWaves$1.c = obj;
        return waveCoordinatorViewModel$subscribeToReceivedWaves$1;
    }

    public Object invoke(Object obj, Object obj2) {
        WaveCoordinatorViewModel$subscribeToReceivedWaves$1 waveCoordinatorViewModel$subscribeToReceivedWaves$1 = new WaveCoordinatorViewModel$subscribeToReceivedWaves$1(this.d, (m0.l.c) obj2);
        waveCoordinatorViewModel$subscribeToReceivedWaves$1.c = (ReceivedWave) obj;
        i iVar = i.a;
        waveCoordinatorViewModel$subscribeToReceivedWaves$1.invokeSuspend(iVar);
        return iVar;
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        ReceivedWave receivedWave = (ReceivedWave) this.c;
        WaveCoordinatorViewModel waveCoordinatorViewModel = this.d;
        e eVar = new e(receivedWave.c.getId().intValue(), receivedWave.c.Y1, receivedWave.d);
        int i = WaveCoordinatorViewModel.m;
        waveCoordinatorViewModel.o(eVar);
        return i.a;
    }
}
