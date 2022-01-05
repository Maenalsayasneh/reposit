package com.stripe.android.googlepay;

import com.google.android.gms.common.api.Status;
import com.stripe.android.googlepay.StripeGooglePayContract;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.ShippingInformation;
import h0.q.z;
import kotlin.Metadata;
import kotlin.Result;
import m0.n.b.f;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/Result;", "Lcom/stripe/android/model/PaymentMethod;", "kotlin.jvm.PlatformType", "result", "Lm0/i;", "onChanged", "(Lkotlin/Result;)V", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: StripeGooglePayActivity.kt */
public final class StripeGooglePayActivity$onGooglePayResult$1<T> implements z<Result<? extends PaymentMethod>> {
    public final /* synthetic */ ShippingInformation $shippingInformation;
    public final /* synthetic */ StripeGooglePayActivity this$0;

    public StripeGooglePayActivity$onGooglePayResult$1(StripeGooglePayActivity stripeGooglePayActivity, ShippingInformation shippingInformation) {
        this.this$0 = stripeGooglePayActivity;
        this.$shippingInformation = shippingInformation;
    }

    public final void onChanged(Result<? extends PaymentMethod> result) {
        if (result != null) {
            Object obj = result.c;
            Throwable a = Result.a(obj);
            if (a == null) {
                this.this$0.onPaymentMethodCreated((PaymentMethod) obj, this.$shippingInformation);
                return;
            }
            this.this$0.getViewModel().setPaymentMethod((PaymentMethod) null);
            this.this$0.getViewModel().updateGooglePayResult(new StripeGooglePayContract.Result.Error(a, (Status) null, (PaymentMethod) null, (ShippingInformation) null, 14, (f) null));
        }
    }
}
