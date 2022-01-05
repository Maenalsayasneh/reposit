package com.stripe.android.view;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lm0/i;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: AddPaymentMethodFpxView.kt */
public final class AddPaymentMethodFpxView$fpxAdapter$1 extends Lambda implements l<Integer, i> {
    public final /* synthetic */ AddPaymentMethodFpxView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddPaymentMethodFpxView$fpxAdapter$1(AddPaymentMethodFpxView addPaymentMethodFpxView) {
        super(1);
        this.this$0 = addPaymentMethodFpxView;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Number) obj).intValue());
        return i.a;
    }

    public final void invoke(int i) {
        this.this$0.getViewModel().setSelectedPosition$payments_core_release(Integer.valueOf(i));
    }
}
