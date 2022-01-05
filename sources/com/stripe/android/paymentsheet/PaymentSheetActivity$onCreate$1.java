package com.stripe.android.paymentsheet;

import androidx.core.app.ActivityOptionsCompat;
import com.stripe.android.googlepay.StripeGooglePayContract;
import com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel;
import h0.a.f.b;
import h0.q.z;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel$Event;", "Lcom/stripe/android/googlepay/StripeGooglePayContract$Args;", "kotlin.jvm.PlatformType", "event", "Lm0/i;", "onChanged", "(Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel$Event;)V", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: PaymentSheetActivity.kt */
public final class PaymentSheetActivity$onCreate$1<T> implements z<BaseSheetViewModel.Event<? extends StripeGooglePayContract.Args>> {
    public final /* synthetic */ b $googlePayLauncher;

    public PaymentSheetActivity$onCreate$1(b bVar) {
        this.$googlePayLauncher = bVar;
    }

    public final void onChanged(BaseSheetViewModel.Event<StripeGooglePayContract.Args> event) {
        StripeGooglePayContract.Args contentIfNotHandled = event.getContentIfNotHandled();
        if (contentIfNotHandled != null) {
            this.$googlePayLauncher.a(contentIfNotHandled, (ActivityOptionsCompat) null);
        }
    }
}
