package com.stripe.android.view;

import android.content.DialogInterface;
import com.stripe.android.model.PaymentMethod;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 0>", "", "<anonymous parameter 1>", "Lm0/i;", "onClick", "(Landroid/content/DialogInterface;I)V", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: DeletePaymentMethodDialogFactory.kt */
public final class DeletePaymentMethodDialogFactory$create$2 implements DialogInterface.OnClickListener {
    public final /* synthetic */ PaymentMethod $paymentMethod;
    public final /* synthetic */ DeletePaymentMethodDialogFactory this$0;

    public DeletePaymentMethodDialogFactory$create$2(DeletePaymentMethodDialogFactory deletePaymentMethodDialogFactory, PaymentMethod paymentMethod) {
        this.this$0 = deletePaymentMethodDialogFactory;
        this.$paymentMethod = paymentMethod;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.this$0.adapter.resetPaymentMethod$payments_core_release(this.$paymentMethod);
    }
}
