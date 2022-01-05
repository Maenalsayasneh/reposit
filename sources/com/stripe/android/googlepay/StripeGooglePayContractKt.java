package com.stripe.android.googlepay;

import com.google.android.gms.common.api.Status;
import com.stripe.android.R;
import com.stripe.android.googlepay.StripeGooglePayContract;
import kotlin.Metadata;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/stripe/android/googlepay/StripeGooglePayContract$Result$Error;", "", "getErrorResourceID", "(Lcom/stripe/android/googlepay/StripeGooglePayContract$Result$Error;)Ljava/lang/Integer;", "payments-core_release"}, k = 2, mv = {1, 4, 2})
/* compiled from: StripeGooglePayContract.kt */
public final class StripeGooglePayContractKt {
    public static final Integer getErrorResourceID(StripeGooglePayContract.Result.Error error) {
        int i;
        i.e(error, "$this$getErrorResourceID");
        Status googlePayStatus = error.getGooglePayStatus();
        if (i.a(googlePayStatus, Status.c)) {
            return null;
        }
        if (i.a(googlePayStatus, Status.q) || i.a(googlePayStatus, Status.y) || i.a(googlePayStatus, Status.Y1) || googlePayStatus == null) {
            return Integer.valueOf(R.string.stripe_google_pay_error_internal);
        }
        switch (error.getGooglePayStatus().a2) {
            case 0:
            case 2:
            case 3:
            case 5:
            case 8:
            case 10:
            case 13:
            case 14:
            case 16:
            case 17:
                i = R.string.stripe_google_pay_error_internal;
                break;
            case 4:
                i = R.string.stripe_failure_reason_authentication;
                break;
            case 6:
                i = R.string.stripe_google_pay_error_resolution_required;
                break;
            case 7:
                i = R.string.stripe_failure_connection_error;
                break;
            case 15:
                i = R.string.stripe_failure_reason_timed_out;
                break;
            default:
                i = R.string.stripe_google_pay_error_internal;
                break;
        }
        return Integer.valueOf(i);
    }
}
