package com.stripe.android.view;

import androidx.core.app.ActivityOptionsCompat;
import com.stripe.android.view.AddPaymentMethodActivityStarter;
import h0.a.f.b;
import h0.q.z;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;", "kotlin.jvm.PlatformType", "args", "Lm0/i;", "onChanged", "(Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;)V", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: PaymentMethodsActivity.kt */
public final class PaymentMethodsActivity$onCreate$4<T> implements z<AddPaymentMethodActivityStarter.Args> {
    public final /* synthetic */ b $addPaymentMethodLauncher;

    public PaymentMethodsActivity$onCreate$4(b bVar) {
        this.$addPaymentMethodLauncher = bVar;
    }

    public final void onChanged(AddPaymentMethodActivityStarter.Args args) {
        if (args != null) {
            this.$addPaymentMethodLauncher.a(args, (ActivityOptionsCompat) null);
        }
    }
}
