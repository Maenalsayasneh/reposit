package com.stripe.android;

import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.ShippingInformation;
import com.stripe.android.model.ShippingMethod;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.a;
import m0.n.a.l;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/stripe/android/model/PaymentMethod;", "paymentMethod", "Lm0/i;", "invoke", "(Lcom/stripe/android/model/PaymentMethod;)V", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: PaymentSessionViewModel.kt */
public final class PaymentSessionViewModel$onCustomerRetrieved$1 extends Lambda implements l<PaymentMethod, i> {
    public final /* synthetic */ a $onComplete;
    public final /* synthetic */ PaymentSessionViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PaymentSessionViewModel$onCustomerRetrieved$1(PaymentSessionViewModel paymentSessionViewModel, a aVar) {
        super(1);
        this.this$0 = paymentSessionViewModel;
        this.$onComplete = aVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((PaymentMethod) obj);
        return i.a;
    }

    public final void invoke(PaymentMethod paymentMethod) {
        if (paymentMethod != null) {
            PaymentSessionViewModel paymentSessionViewModel = this.this$0;
            paymentSessionViewModel.setPaymentSessionData(PaymentSessionData.copy$default(paymentSessionViewModel.getPaymentSessionData(), false, false, 0, 0, (ShippingInformation) null, (ShippingMethod) null, paymentMethod, false, 191, (Object) null));
        }
        this.$onComplete.invoke();
    }
}
