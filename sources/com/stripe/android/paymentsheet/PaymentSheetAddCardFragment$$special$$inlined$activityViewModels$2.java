package com.stripe.android.paymentsheet;

import androidx.fragment.app.Fragment;
import h0.o.a.k;
import h0.q.m0;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m0.n.a.a;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lh0/q/k0;", "VM", "Lh0/q/m0$b;", "invoke", "()Lh0/q/m0$b;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: FragmentViewModelLazy.kt */
public final class PaymentSheetAddCardFragment$$special$$inlined$activityViewModels$2 extends Lambda implements a<m0.b> {
    public final /* synthetic */ Fragment $this_activityViewModels;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PaymentSheetAddCardFragment$$special$$inlined$activityViewModels$2(Fragment fragment) {
        super(0);
        this.$this_activityViewModels = fragment;
    }

    public final m0.b invoke() {
        k requireActivity = this.$this_activityViewModels.requireActivity();
        i.d(requireActivity, "requireActivity()");
        return requireActivity.getDefaultViewModelProviderFactory();
    }
}
