package com.clubhouse.wave;

import com.clubhouse.wave.data.models.local.ReceivedWave;
import i0.e.e.b;
import i0.j.f.p.h;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.q;

@c(c = "com.clubhouse.wave.WaveCoordinatorViewModel$subscribeToRescindedWaves$1", f = "WaveCoordinatorViewModel.kt", l = {}, m = "invokeSuspend")
/* compiled from: WaveCoordinatorViewModel.kt */
public final class WaveCoordinatorViewModel$subscribeToRescindedWaves$1 extends SuspendLambda implements q<List<? extends ReceivedWave>, ReceivedWave, m0.l.c<? super i>, Object> {
    public /* synthetic */ Object c;
    public /* synthetic */ Object d;
    public final /* synthetic */ WaveCoordinatorViewModel q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WaveCoordinatorViewModel$subscribeToRescindedWaves$1(WaveCoordinatorViewModel waveCoordinatorViewModel, m0.l.c<? super WaveCoordinatorViewModel$subscribeToRescindedWaves$1> cVar) {
        super(3, cVar);
        this.q = waveCoordinatorViewModel;
    }

    public Object invoke(Object obj, Object obj2, Object obj3) {
        WaveCoordinatorViewModel$subscribeToRescindedWaves$1 waveCoordinatorViewModel$subscribeToRescindedWaves$1 = new WaveCoordinatorViewModel$subscribeToRescindedWaves$1(this.q, (m0.l.c) obj3);
        waveCoordinatorViewModel$subscribeToRescindedWaves$1.c = (List) obj;
        waveCoordinatorViewModel$subscribeToRescindedWaves$1.d = (ReceivedWave) obj2;
        i iVar = i.a;
        waveCoordinatorViewModel$subscribeToRescindedWaves$1.invokeSuspend(iVar);
        return iVar;
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        List<ReceivedWave> list = (List) this.c;
        ReceivedWave receivedWave = (ReceivedWave) this.d;
        ArrayList arrayList = new ArrayList(h.K(list, 10));
        for (ReceivedWave receivedWave2 : list) {
            arrayList.add(new Integer(receivedWave2.c.getId().intValue()));
        }
        if (!arrayList.contains(receivedWave.c.getId())) {
            WaveCoordinatorViewModel waveCoordinatorViewModel = this.q;
            b bVar = b.a;
            int i = WaveCoordinatorViewModel.m;
            waveCoordinatorViewModel.o(bVar);
        }
        return i.a;
    }
}
