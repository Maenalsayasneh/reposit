package com.airbnb.mvrx;

import androidx.fragment.app.Fragment;
import h0.b0.v;
import i0.b.b.b0;
import kotlin.jvm.internal.Lambda;
import m0.l.c;
import m0.n.a.a;
import m0.n.a.l;

/* compiled from: ViewModelDelegateProvider.kt */
public final class DefaultViewModelDelegateFactory$createLazyViewModel$1 extends Lambda implements a<VM> {
    public final /* synthetic */ l c;
    public final /* synthetic */ Fragment d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DefaultViewModelDelegateFactory$createLazyViewModel$1(l lVar, Fragment fragment) {
        super(0);
        this.c = lVar;
        this.d = fragment;
    }

    public Object invoke() {
        MavericksViewModel mavericksViewModel = (MavericksViewModel) this.c.invoke(new b0());
        v.b(mavericksViewModel, this.d, (DeliveryMode) null, new DefaultViewModelDelegateFactory$createLazyViewModel$1$$special$$inlined$apply$lambda$1((c) null, this), 2);
        return mavericksViewModel;
    }
}
