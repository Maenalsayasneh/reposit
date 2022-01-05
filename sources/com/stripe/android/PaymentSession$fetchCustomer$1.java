package com.stripe.android;

import com.stripe.android.PaymentSession;
import com.stripe.android.PaymentSessionViewModel;
import h0.q.z;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/stripe/android/PaymentSessionViewModel$FetchCustomerResult;", "kotlin.jvm.PlatformType", "result", "Lm0/i;", "onChanged", "(Lcom/stripe/android/PaymentSessionViewModel$FetchCustomerResult;)V", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: PaymentSession.kt */
public final class PaymentSession$fetchCustomer$1<T> implements z<PaymentSessionViewModel.FetchCustomerResult> {
    public final /* synthetic */ PaymentSession this$0;

    public PaymentSession$fetchCustomer$1(PaymentSession paymentSession) {
        this.this$0 = paymentSession;
    }

    public final void onChanged(PaymentSessionViewModel.FetchCustomerResult fetchCustomerResult) {
        PaymentSession.PaymentSessionListener listener$payments_core_release;
        if ((fetchCustomerResult instanceof PaymentSessionViewModel.FetchCustomerResult.Error) && (listener$payments_core_release = this.this$0.getListener$payments_core_release()) != null) {
            PaymentSessionViewModel.FetchCustomerResult.Error error = (PaymentSessionViewModel.FetchCustomerResult.Error) fetchCustomerResult;
            listener$payments_core_release.onError(error.getErrorCode(), error.getErrorMessage());
        }
    }
}
