package com.stripe.android.view;

import com.stripe.android.model.PaymentMethod;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m0.n.a.a;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/stripe/android/model/PaymentMethod$Type;", "invoke", "()Lcom/stripe/android/model/PaymentMethod$Type;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: AddPaymentMethodActivity.kt */
public final class AddPaymentMethodActivity$paymentMethodType$2 extends Lambda implements a<PaymentMethod.Type> {
    public final /* synthetic */ AddPaymentMethodActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddPaymentMethodActivity$paymentMethodType$2(AddPaymentMethodActivity addPaymentMethodActivity) {
        super(0);
        this.this$0 = addPaymentMethodActivity;
    }

    public final PaymentMethod.Type invoke() {
        return this.this$0.getArgs().getPaymentMethodType$payments_core_release();
    }
}
