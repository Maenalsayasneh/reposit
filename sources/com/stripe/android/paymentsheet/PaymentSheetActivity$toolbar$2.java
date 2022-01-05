package com.stripe.android.paymentsheet;

import com.google.android.material.appbar.MaterialToolbar;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m0.n.a.a;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/google/android/material/appbar/MaterialToolbar;", "invoke", "()Lcom/google/android/material/appbar/MaterialToolbar;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: PaymentSheetActivity.kt */
public final class PaymentSheetActivity$toolbar$2 extends Lambda implements a<MaterialToolbar> {
    public final /* synthetic */ PaymentSheetActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PaymentSheetActivity$toolbar$2(PaymentSheetActivity paymentSheetActivity) {
        super(0);
        this.this$0 = paymentSheetActivity;
    }

    public final MaterialToolbar invoke() {
        MaterialToolbar materialToolbar = this.this$0.getViewBinding$payments_core_release().toolbar;
        i.d(materialToolbar, "viewBinding.toolbar");
        return materialToolbar;
    }
}
