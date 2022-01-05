package com.airbnb.mvrx.navigation;

import androidx.fragment.app.Fragment;
import com.airbnb.mvrx.DefaultViewModelDelegateFactory;
import com.airbnb.mvrx.MavericksViewModel;
import h0.t.f;
import i0.b.b.j;
import i0.b.b.k0;
import i0.b.b.l0.a;
import i0.b.b.q;
import m0.c;
import m0.n.a.l;
import m0.n.a.p;
import m0.n.b.i;
import m0.r.d;
import m0.r.k;

/* compiled from: MavericksExtensions.kt */
public final class DefaultNavigationViewModelDelegateFactory implements a, k0 {
    public final k0 a;

    public DefaultNavigationViewModelDelegateFactory(k0 k0Var, int i) {
        DefaultViewModelDelegateFactory defaultViewModelDelegateFactory = (i & 1) != 0 ? new DefaultViewModelDelegateFactory() : null;
        i.e(defaultViewModelDelegateFactory, "defaultViewModelDelegateFactory");
        this.a = defaultViewModelDelegateFactory;
    }

    public <S extends j, T extends Fragment & q, VM extends MavericksViewModel<S>> c<VM> a(T t, k<?> kVar, d<VM> dVar, m0.n.a.a<String> aVar, d<S> dVar2, int i, p<? super i0.b.b.k<VM, S>, ? super f, ? extends VM> pVar) {
        i.e(t, "fragment");
        i.e(kVar, "viewModelProperty");
        i.e(dVar, "viewModelClass");
        i.e(aVar, "keyFactory");
        i.e(dVar2, "stateClass");
        i.e(pVar, "viewModelProvider");
        return new navigationLifecycleAwareLazy(t, new DefaultNavigationViewModelDelegateFactory$createLazyNavigationViewModel$1(t, i, pVar));
    }

    public <S extends j, T extends Fragment & q, VM extends MavericksViewModel<S>> c<VM> b(T t, k<?> kVar, d<VM> dVar, m0.n.a.a<String> aVar, d<S> dVar2, boolean z, l<? super i0.b.b.k<VM, S>, ? extends VM> lVar) {
        i.e(t, "fragment");
        i.e(kVar, "viewModelProperty");
        i.e(dVar, "viewModelClass");
        i.e(aVar, "keyFactory");
        i.e(dVar2, "stateClass");
        l<? super i0.b.b.k<VM, S>, ? extends VM> lVar2 = lVar;
        i.e(lVar2, "viewModelProvider");
        return this.a.b(t, kVar, dVar, aVar, dVar2, z, lVar2);
    }
}
