package com.airbnb.mvrx;

import androidx.recyclerview.widget.RecyclerView;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import m0.r.t.a.r.m.a1.a;
import n0.a.f0;

@c(c = "com.airbnb.mvrx.MavericksViewModel$execute$3", f = "MavericksViewModel.kt", l = {217}, m = "invokeSuspend")
/* compiled from: MavericksViewModel.kt */
public final class MavericksViewModel$execute$3 extends SuspendLambda implements p<f0, m0.l.c<? super i>, Object> {
    public int c;

    public MavericksViewModel$execute$3(m0.l.c cVar) {
        super(2, cVar);
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        m0.n.b.i.e(cVar, "completion");
        return new MavericksViewModel$execute$3(cVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        m0.l.c cVar = (m0.l.c) obj2;
        m0.n.b.i.e(cVar, "completion");
        return new MavericksViewModel$execute$3(cVar).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            this.c = 1;
            if (a.d1(RecyclerView.FOREVER_NS, this) == coroutineSingletons) {
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
