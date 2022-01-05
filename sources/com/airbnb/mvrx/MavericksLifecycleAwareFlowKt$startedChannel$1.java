package com.airbnb.mvrx;

import androidx.lifecycle.Lifecycle;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: MavericksLifecycleAwareFlow.kt */
public final class MavericksLifecycleAwareFlowKt$startedChannel$1 extends Lambda implements l<Throwable, i> {
    public final /* synthetic */ Lifecycle c;
    public final /* synthetic */ MavericksLifecycleAwareFlowKt$startedChannel$observer$1 d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MavericksLifecycleAwareFlowKt$startedChannel$1(Lifecycle lifecycle, MavericksLifecycleAwareFlowKt$startedChannel$observer$1 mavericksLifecycleAwareFlowKt$startedChannel$observer$1) {
        super(1);
        this.c = lifecycle;
        this.d = mavericksLifecycleAwareFlowKt$startedChannel$observer$1;
    }

    public Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        this.c.b(this.d);
        return i.a;
    }
}
