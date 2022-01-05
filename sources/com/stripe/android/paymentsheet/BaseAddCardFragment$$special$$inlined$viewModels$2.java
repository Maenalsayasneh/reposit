package com.stripe.android.paymentsheet;

import h0.q.n0;
import h0.q.o0;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m0.n.a.a;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lh0/q/k0;", "VM", "Lh0/q/n0;", "invoke", "()Lh0/q/n0;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: FragmentViewModelLazy.kt */
public final class BaseAddCardFragment$$special$$inlined$viewModels$2 extends Lambda implements a<n0> {
    public final /* synthetic */ a $ownerProducer;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseAddCardFragment$$special$$inlined$viewModels$2(a aVar) {
        super(0);
        this.$ownerProducer = aVar;
    }

    public final n0 invoke() {
        n0 viewModelStore = ((o0) this.$ownerProducer.invoke()).getViewModelStore();
        i.d(viewModelStore, "ownerProducer().viewModelStore");
        return viewModelStore;
    }
}
