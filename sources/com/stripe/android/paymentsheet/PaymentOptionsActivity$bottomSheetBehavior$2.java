package com.stripe.android.paymentsheet;

import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m0.n.a.a;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u0010\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "Landroid/view/ViewGroup;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: PaymentOptionsActivity.kt */
public final class PaymentOptionsActivity$bottomSheetBehavior$2 extends Lambda implements a<BottomSheetBehavior<ViewGroup>> {
    public final /* synthetic */ PaymentOptionsActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PaymentOptionsActivity$bottomSheetBehavior$2(PaymentOptionsActivity paymentOptionsActivity) {
        super(0);
        this.this$0 = paymentOptionsActivity;
    }

    public final BottomSheetBehavior<ViewGroup> invoke() {
        return BottomSheetBehavior.H(this.this$0.getBottomSheet());
    }
}
