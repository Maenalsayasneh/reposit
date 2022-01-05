package com.stripe.android.paymentsheet;

import android.view.View;
import com.stripe.android.paymentsheet.PaymentOptionsAdapter;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroid/view/View;", "kotlin.jvm.PlatformType", "it", "Lm0/i;", "onClick", "(Landroid/view/View;)V", "com/stripe/android/paymentsheet/PaymentOptionsAdapter$onCreateViewHolder$2$1", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: PaymentOptionsAdapter.kt */
public final class PaymentOptionsAdapter$onCreateViewHolder$$inlined$apply$lambda$1 implements View.OnClickListener {
    public final /* synthetic */ PaymentOptionsAdapter.GooglePayViewHolder $this_apply;
    public final /* synthetic */ PaymentOptionsAdapter this$0;

    public PaymentOptionsAdapter$onCreateViewHolder$$inlined$apply$lambda$1(PaymentOptionsAdapter.GooglePayViewHolder googlePayViewHolder, PaymentOptionsAdapter paymentOptionsAdapter) {
        this.$this_apply = googlePayViewHolder;
        this.this$0 = paymentOptionsAdapter;
    }

    public final void onClick(View view) {
        this.this$0.onItemSelected$payments_core_release(this.$this_apply.getBindingAdapterPosition(), true);
    }
}
