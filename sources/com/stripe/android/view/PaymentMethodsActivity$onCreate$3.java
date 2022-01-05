package com.stripe.android.view;

import com.google.android.material.progressindicator.LinearProgressIndicator;
import h0.q.z;
import kotlin.Metadata;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "kotlin.jvm.PlatformType", "it", "Lm0/i;", "onChanged", "(Ljava/lang/Boolean;)V", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: PaymentMethodsActivity.kt */
public final class PaymentMethodsActivity$onCreate$3<T> implements z<Boolean> {
    public final /* synthetic */ PaymentMethodsActivity this$0;

    public PaymentMethodsActivity$onCreate$3(PaymentMethodsActivity paymentMethodsActivity) {
        this.this$0 = paymentMethodsActivity;
    }

    public final void onChanged(Boolean bool) {
        LinearProgressIndicator linearProgressIndicator = this.this$0.getViewBinding$payments_core_release().progressBar;
        i.d(linearProgressIndicator, "viewBinding.progressBar");
        i.d(bool, "it");
        linearProgressIndicator.setVisibility(bool.booleanValue() ? 0 : 8);
    }
}
