package com.stripe.android.paymentsheet;

import android.widget.ScrollView;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m0.n.a.a;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/widget/ScrollView;", "invoke", "()Landroid/widget/ScrollView;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: PaymentOptionsActivity.kt */
public final class PaymentOptionsActivity$scrollView$2 extends Lambda implements a<ScrollView> {
    public final /* synthetic */ PaymentOptionsActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PaymentOptionsActivity$scrollView$2(PaymentOptionsActivity paymentOptionsActivity) {
        super(0);
        this.this$0 = paymentOptionsActivity;
    }

    public final ScrollView invoke() {
        ScrollView scrollView = this.this$0.getViewBinding$payments_core_release().scrollView;
        i.d(scrollView, "viewBinding.scrollView");
        return scrollView;
    }
}
