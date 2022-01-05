package com.airbnb.mvrx;

import i0.b.b.j;
import i0.b.b.l;
import m0.n.b.i;
import n0.a.f0;

/* compiled from: MavericksViewModelConfig.kt */
public abstract class MavericksViewModelConfig<S> {
    public final boolean a;
    public final l<S> b;
    public final f0 c;

    /* compiled from: MavericksViewModelConfig.kt */
    public enum BlockExecutions {
        No,
        Completely,
        WithLoading
    }

    public MavericksViewModelConfig(boolean z, l<S> lVar, f0 f0Var) {
        i.e(lVar, "stateStore");
        i.e(f0Var, "coroutineScope");
        this.a = z;
        this.b = lVar;
        this.c = f0Var;
    }

    public abstract <S extends j> BlockExecutions a(MavericksViewModel<S> mavericksViewModel);
}
