package com.airbnb.mvrx;

import kotlin.jvm.internal.Lambda;
import m0.n.a.a;

/* compiled from: MavericksViewModel.kt */
public final class MavericksViewModel$tag$2 extends Lambda implements a<String> {
    public final /* synthetic */ MavericksViewModel c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MavericksViewModel$tag$2(MavericksViewModel mavericksViewModel) {
        super(0);
        this.c = mavericksViewModel;
    }

    public Object invoke() {
        return this.c.getClass().getSimpleName();
    }
}
