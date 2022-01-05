package com.airbnb.mvrx;

import h0.q.f;
import h0.q.p;
import kotlin.Metadata;
import m0.n.b.i;
import m0.r.t.a.r.m.a1.a;
import n0.a.f2.d;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"com/airbnb/mvrx/MavericksLifecycleAwareFlowKt$startedChannel$observer$1", "Lh0/q/f;", "Lh0/q/p;", "owner", "Lm0/i;", "onStart", "(Lh0/q/p;)V", "onStop", "onDestroy", "mvrx_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: MavericksLifecycleAwareFlow.kt */
public final class MavericksLifecycleAwareFlowKt$startedChannel$observer$1 implements f {
    public final /* synthetic */ d c;

    public MavericksLifecycleAwareFlowKt$startedChannel$observer$1(d dVar) {
        this.c = dVar;
    }

    public void onDestroy(p pVar) {
        i.e(pVar, "owner");
        a.D0(this.c, (Throwable) null, 1, (Object) null);
    }

    public void onStart(p pVar) {
        i.e(pVar, "owner");
        this.c.offer(Boolean.TRUE);
    }

    public void onStop(p pVar) {
        i.e(pVar, "owner");
        this.c.offer(Boolean.FALSE);
    }
}
