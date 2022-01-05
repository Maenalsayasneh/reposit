package com.clubhouse.wave;

import i0.e.e.k.b.a;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;

@c(c = "com.clubhouse.wave.WaveCoordinatorViewModel$suspendSentWaves$1", f = "WaveCoordinatorViewModel.kt", l = {134}, m = "invokeSuspend")
/* compiled from: WaveCoordinatorViewModel.kt */
public final class WaveCoordinatorViewModel$suspendSentWaves$1 extends SuspendLambda implements l<m0.l.c<? super i>, Object> {
    public int c;
    public final /* synthetic */ WaveCoordinatorViewModel d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WaveCoordinatorViewModel$suspendSentWaves$1(WaveCoordinatorViewModel waveCoordinatorViewModel, m0.l.c<? super WaveCoordinatorViewModel$suspendSentWaves$1> cVar) {
        super(1, cVar);
        this.d = waveCoordinatorViewModel;
    }

    public final m0.l.c<i> create(m0.l.c<?> cVar) {
        return new WaveCoordinatorViewModel$suspendSentWaves$1(this.d, cVar);
    }

    public Object invoke(Object obj) {
        return new WaveCoordinatorViewModel$suspendSentWaves$1(this.d, (m0.l.c) obj).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            WaveCoordinatorViewModel waveCoordinatorViewModel = this.d;
            int i2 = WaveCoordinatorViewModel.m;
            a q = waveCoordinatorViewModel.q();
            this.c = 1;
            if (q.b(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            h.d4(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return i.a;
    }
}
