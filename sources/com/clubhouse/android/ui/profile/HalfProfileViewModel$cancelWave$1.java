package com.clubhouse.android.ui.profile;

import i0.e.e.k.b.a;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;

@c(c = "com.clubhouse.android.ui.profile.HalfProfileViewModel$cancelWave$1", f = "HalfProfileViewModel.kt", l = {233}, m = "invokeSuspend")
/* compiled from: HalfProfileViewModel.kt */
public final class HalfProfileViewModel$cancelWave$1 extends SuspendLambda implements l<m0.l.c<? super i>, Object> {
    public int c;
    public final /* synthetic */ HalfProfileViewModel d;
    public final /* synthetic */ int q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HalfProfileViewModel$cancelWave$1(HalfProfileViewModel halfProfileViewModel, int i, m0.l.c<? super HalfProfileViewModel$cancelWave$1> cVar) {
        super(1, cVar);
        this.d = halfProfileViewModel;
        this.q = i;
    }

    public final m0.l.c<i> create(m0.l.c<?> cVar) {
        return new HalfProfileViewModel$cancelWave$1(this.d, this.q, cVar);
    }

    public Object invoke(Object obj) {
        return new HalfProfileViewModel$cancelWave$1(this.d, this.q, (m0.l.c) obj).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            a q2 = HalfProfileViewModel.q(this.d);
            int i2 = this.q;
            this.c = 1;
            if (q2.l(i2, this) == coroutineSingletons) {
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
