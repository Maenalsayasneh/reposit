package com.airbnb.mvrx;

import androidx.fragment.app.Fragment;
import i0.b.b.j;
import i0.b.b.k0;
import i0.b.b.q;
import m0.c;
import m0.n.a.a;
import m0.n.a.l;
import m0.n.b.i;
import m0.r.d;
import m0.r.k;

/* compiled from: ViewModelDelegateProvider.kt */
public final class DefaultViewModelDelegateFactory implements k0 {
    public <S extends j, T extends Fragment & q, VM extends MavericksViewModel<S>> c<VM> b(T t, k<?> kVar, d<VM> dVar, a<String> aVar, d<S> dVar2, boolean z, l<? super i0.b.b.k<VM, S>, ? extends VM> lVar) {
        i.e(t, "fragment");
        i.e(kVar, "viewModelProperty");
        i.e(dVar, "viewModelClass");
        i.e(aVar, "keyFactory");
        i.e(dVar2, "stateClass");
        i.e(lVar, "viewModelProvider");
        return new lifecycleAwareLazy(t, new DefaultViewModelDelegateFactory$createLazyViewModel$1(lVar, t));
    }
}
