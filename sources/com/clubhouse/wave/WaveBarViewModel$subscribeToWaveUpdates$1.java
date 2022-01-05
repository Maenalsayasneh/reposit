package com.clubhouse.wave;

import com.clubhouse.wave.data.models.local.SentWave;
import i0.j.f.p.h;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;
import m0.n.a.p;

@c(c = "com.clubhouse.wave.WaveBarViewModel$subscribeToWaveUpdates$1", f = "WaveBarViewModel.kt", l = {}, m = "invokeSuspend")
/* compiled from: WaveBarViewModel.kt */
public final class WaveBarViewModel$subscribeToWaveUpdates$1 extends SuspendLambda implements p<List<? extends SentWave>, m0.l.c<? super i>, Object> {
    public /* synthetic */ Object c;
    public final /* synthetic */ WaveBarViewModel d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WaveBarViewModel$subscribeToWaveUpdates$1(WaveBarViewModel waveBarViewModel, m0.l.c<? super WaveBarViewModel$subscribeToWaveUpdates$1> cVar) {
        super(2, cVar);
        this.d = waveBarViewModel;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        WaveBarViewModel$subscribeToWaveUpdates$1 waveBarViewModel$subscribeToWaveUpdates$1 = new WaveBarViewModel$subscribeToWaveUpdates$1(this.d, cVar);
        waveBarViewModel$subscribeToWaveUpdates$1.c = obj;
        return waveBarViewModel$subscribeToWaveUpdates$1;
    }

    public Object invoke(Object obj, Object obj2) {
        WaveBarViewModel$subscribeToWaveUpdates$1 waveBarViewModel$subscribeToWaveUpdates$1 = new WaveBarViewModel$subscribeToWaveUpdates$1(this.d, (m0.l.c) obj2);
        waveBarViewModel$subscribeToWaveUpdates$1.c = (List) obj;
        i iVar = i.a;
        waveBarViewModel$subscribeToWaveUpdates$1.invokeSuspend(iVar);
        return iVar;
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        final List list = (List) this.c;
        WaveBarViewModel waveBarViewModel = this.d;
        AnonymousClass1 r1 = new l<i0.e.e.i, i0.e.e.i>() {
            public Object invoke(Object obj) {
                i0.e.e.i iVar = (i0.e.e.i) obj;
                m0.n.b.i.e(iVar, "$this$setState");
                return i0.e.e.i.copy$default(iVar, list, false, false, 6, (Object) null);
            }
        };
        int i = WaveBarViewModel.m;
        waveBarViewModel.m(r1);
        return i.a;
    }
}
