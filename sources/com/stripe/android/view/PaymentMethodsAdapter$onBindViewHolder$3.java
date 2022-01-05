package com.stripe.android.view;

import android.view.View;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroid/view/View;", "kotlin.jvm.PlatformType", "it", "Lm0/i;", "onClick", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: PaymentMethodsAdapter.kt */
public final class PaymentMethodsAdapter$onBindViewHolder$3 implements View.OnClickListener {
    public final /* synthetic */ PaymentMethodsAdapter this$0;

    public PaymentMethodsAdapter$onBindViewHolder$3(PaymentMethodsAdapter paymentMethodsAdapter) {
        this.this$0 = paymentMethodsAdapter;
    }

    public final void onClick(View view) {
        this.this$0._addPaymentMethodArgs.setValue(this.this$0.getAddCardArgs$payments_core_release());
    }
}
