package com.stripe.android;

import com.stripe.android.CustomerSession;
import com.stripe.android.PaymentSessionViewModel;
import com.stripe.android.model.Customer;
import h0.q.y;
import kotlin.Metadata;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J)\u0010\r\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"com/stripe/android/PaymentSessionViewModel$fetchCustomer$1", "Lcom/stripe/android/CustomerSession$CustomerRetrievalListener;", "Lcom/stripe/android/model/Customer;", "customer", "Lm0/i;", "onCustomerRetrieved", "(Lcom/stripe/android/model/Customer;)V", "", "errorCode", "", "errorMessage", "Lcom/stripe/android/StripeError;", "stripeError", "onError", "(ILjava/lang/String;Lcom/stripe/android/StripeError;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: PaymentSessionViewModel.kt */
public final class PaymentSessionViewModel$fetchCustomer$1 implements CustomerSession.CustomerRetrievalListener {
    public final /* synthetic */ boolean $isInitialFetch;
    public final /* synthetic */ y $resultData;
    public final /* synthetic */ PaymentSessionViewModel this$0;

    public PaymentSessionViewModel$fetchCustomer$1(PaymentSessionViewModel paymentSessionViewModel, boolean z, y yVar) {
        this.this$0 = paymentSessionViewModel;
        this.$isInitialFetch = z;
        this.$resultData = yVar;
    }

    public void onCustomerRetrieved(Customer customer) {
        i.e(customer, "customer");
        this.this$0.onCustomerRetrieved$payments_core_release(customer.getId(), this.$isInitialFetch, new PaymentSessionViewModel$fetchCustomer$1$onCustomerRetrieved$1(this));
    }

    public void onError(int i, String str, StripeError stripeError) {
        i.e(str, "errorMessage");
        this.this$0._networkState.setValue(PaymentSessionViewModel.NetworkState.Inactive);
        this.$resultData.setValue(new PaymentSessionViewModel.FetchCustomerResult.Error(i, str, stripeError));
    }
}
