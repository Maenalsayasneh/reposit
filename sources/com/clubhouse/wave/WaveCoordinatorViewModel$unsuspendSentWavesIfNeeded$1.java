package com.clubhouse.wave;

import com.airbnb.mvrx.MavericksViewModel;
import i0.e.e.j;
import i0.e.e.k.b.a;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.l.c;
import m0.n.a.l;
import m0.r.m;
import n0.a.d0;

/* compiled from: WaveCoordinatorViewModel.kt */
public final class WaveCoordinatorViewModel$unsuspendSentWavesIfNeeded$1 extends Lambda implements l<j, i> {
    public final /* synthetic */ WaveCoordinatorViewModel c;

    @m0.l.f.a.c(c = "com.clubhouse.wave.WaveCoordinatorViewModel$unsuspendSentWavesIfNeeded$1$1", f = "WaveCoordinatorViewModel.kt", l = {143, 144}, m = "invokeSuspend")
    /* renamed from: com.clubhouse.wave.WaveCoordinatorViewModel$unsuspendSentWavesIfNeeded$1$1  reason: invalid class name */
    /* compiled from: WaveCoordinatorViewModel.kt */
    public final class AnonymousClass1 extends SuspendLambda implements l<c<? super i>, Object> {
        public int c;

        public final c<i> create(c<?> cVar) {
            return new AnonymousClass1(waveCoordinatorViewModel, cVar);
        }

        public Object invoke(Object obj) {
            return new AnonymousClass1(waveCoordinatorViewModel, (c) obj).invokeSuspend(i.a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.c;
            if (i == 0) {
                h.d4(obj);
                if (j.this.b) {
                    WaveCoordinatorViewModel waveCoordinatorViewModel = waveCoordinatorViewModel;
                    int i2 = WaveCoordinatorViewModel.m;
                    a q2 = waveCoordinatorViewModel.q();
                    this.c = 1;
                    obj = q2.d(this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return i.a;
            } else if (i == 1) {
                h.d4(obj);
            } else if (i == 2) {
                h.d4(obj);
                return i.a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            if (((Boolean) obj).booleanValue()) {
                WaveCoordinatorViewModel waveCoordinatorViewModel2 = waveCoordinatorViewModel;
                int i3 = WaveCoordinatorViewModel.m;
                a q3 = waveCoordinatorViewModel2.q();
                this.c = 2;
                if (q3.a(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return i.a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WaveCoordinatorViewModel$unsuspendSentWavesIfNeeded$1(WaveCoordinatorViewModel waveCoordinatorViewModel) {
        super(1);
        this.c = waveCoordinatorViewModel;
    }

    public Object invoke(Object obj) {
        final j jVar = (j) obj;
        m0.n.b.i.e(jVar, "state");
        final WaveCoordinatorViewModel waveCoordinatorViewModel = this.c;
        MavericksViewModel.f(waveCoordinatorViewModel, new AnonymousClass1((c<? super AnonymousClass1>) null), (d0) null, (m) null, AnonymousClass2.c, 3, (Object) null);
        return i.a;
    }
}
