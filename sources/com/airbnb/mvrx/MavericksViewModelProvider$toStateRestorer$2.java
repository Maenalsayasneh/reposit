package com.airbnb.mvrx;

import android.os.Bundle;
import h0.b0.v;
import i0.b.b.j;
import kotlin.jvm.internal.Lambda;
import m0.n.a.l;
import m0.n.b.i;

/* compiled from: MavericksViewModelProvider.kt */
public final class MavericksViewModelProvider$toStateRestorer$2 extends Lambda implements l<S, S> {
    public final /* synthetic */ Bundle c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MavericksViewModelProvider$toStateRestorer$2(Bundle bundle) {
        super(1);
        this.c = bundle;
    }

    public Object invoke(Object obj) {
        j jVar = (j) obj;
        i.e(jVar, "it");
        return v.O1(this.c, jVar, false);
    }
}
