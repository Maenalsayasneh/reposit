package com.stripe.android.paymentsheet;

import com.google.android.material.appbar.AppBarLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m0.n.a.a;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/google/android/material/appbar/AppBarLayout;", "invoke", "()Lcom/google/android/material/appbar/AppBarLayout;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: PaymentOptionsActivity.kt */
public final class PaymentOptionsActivity$appbar$2 extends Lambda implements a<AppBarLayout> {
    public final /* synthetic */ PaymentOptionsActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PaymentOptionsActivity$appbar$2(PaymentOptionsActivity paymentOptionsActivity) {
        super(0);
        this.this$0 = paymentOptionsActivity;
    }

    public final AppBarLayout invoke() {
        AppBarLayout appBarLayout = this.this$0.getViewBinding$payments_core_release().appbar;
        i.d(appBarLayout, "viewBinding.appbar");
        return appBarLayout;
    }
}
