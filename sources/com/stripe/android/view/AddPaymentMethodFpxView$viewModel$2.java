package com.stripe.android.view;

import android.app.Application;
import com.stripe.android.view.FpxViewModel;
import h0.o.a.k;
import h0.q.k0;
import h0.q.m0;
import h0.q.n0;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m0.n.a.a;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/stripe/android/view/FpxViewModel;", "invoke", "()Lcom/stripe/android/view/FpxViewModel;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: AddPaymentMethodFpxView.kt */
public final class AddPaymentMethodFpxView$viewModel$2 extends Lambda implements a<FpxViewModel> {
    public final /* synthetic */ k $activity;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddPaymentMethodFpxView$viewModel$2(k kVar) {
        super(0);
        this.$activity = kVar;
    }

    public final FpxViewModel invoke() {
        k0 k0Var;
        k kVar = this.$activity;
        Application application = kVar.getApplication();
        i.d(application, "activity.application");
        FpxViewModel.Factory factory = new FpxViewModel.Factory(application);
        n0 viewModelStore = kVar.getViewModelStore();
        Class cls = FpxViewModel.class;
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            String n02 = i0.d.a.a.a.n0("androidx.lifecycle.ViewModelProvider.DefaultKey:", canonicalName);
            k0 k0Var2 = viewModelStore.a.get(n02);
            if (!cls.isInstance(k0Var2)) {
                if (factory instanceof m0.c) {
                    k0Var = ((m0.c) factory).create(n02, cls);
                } else {
                    k0Var = factory.create(cls);
                }
                k0Var2 = k0Var;
                k0 put = viewModelStore.a.put(n02, k0Var2);
                if (put != null) {
                    put.onCleared();
                }
            } else if (factory instanceof m0.e) {
                ((m0.e) factory).onRequery(k0Var2);
            }
            i.d(k0Var2, "ViewModelProvider(\n     …FpxViewModel::class.java)");
            return (FpxViewModel) k0Var2;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }
}
