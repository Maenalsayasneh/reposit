package com.stripe.android.googlepay;

import com.stripe.android.googlepay.StripeGooglePayContract;
import h0.q.z;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/stripe/android/googlepay/StripeGooglePayContract$Result;", "kotlin.jvm.PlatformType", "googlePayResult", "Lm0/i;", "onChanged", "(Lcom/stripe/android/googlepay/StripeGooglePayContract$Result;)V", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: StripeGooglePayActivity.kt */
public final class StripeGooglePayActivity$onCreate$2<T> implements z<StripeGooglePayContract.Result> {
    public final /* synthetic */ StripeGooglePayActivity this$0;

    public StripeGooglePayActivity$onCreate$2(StripeGooglePayActivity stripeGooglePayActivity) {
        this.this$0 = stripeGooglePayActivity;
    }

    public final void onChanged(StripeGooglePayContract.Result result) {
        if (result != null) {
            this.this$0.finishWithResult(result);
        }
    }
}
