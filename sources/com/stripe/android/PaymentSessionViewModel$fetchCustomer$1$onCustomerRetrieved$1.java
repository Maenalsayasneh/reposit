package com.stripe.android;

import com.stripe.android.PaymentSessionViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.a;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lm0/i;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: PaymentSessionViewModel.kt */
public final class PaymentSessionViewModel$fetchCustomer$1$onCustomerRetrieved$1 extends Lambda implements a<i> {
    public final /* synthetic */ PaymentSessionViewModel$fetchCustomer$1 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PaymentSessionViewModel$fetchCustomer$1$onCustomerRetrieved$1(PaymentSessionViewModel$fetchCustomer$1 paymentSessionViewModel$fetchCustomer$1) {
        super(0);
        this.this$0 = paymentSessionViewModel$fetchCustomer$1;
    }

    public final void invoke() {
        this.this$0.this$0._networkState.setValue(PaymentSessionViewModel.NetworkState.Inactive);
        this.this$0.$resultData.setValue(PaymentSessionViewModel.FetchCustomerResult.Success.INSTANCE);
    }
}
