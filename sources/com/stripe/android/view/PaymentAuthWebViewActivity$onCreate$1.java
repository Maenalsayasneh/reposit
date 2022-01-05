package com.stripe.android.view;

import com.google.android.material.progressindicator.CircularProgressIndicator;
import h0.q.z;
import kotlin.Metadata;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "kotlin.jvm.PlatformType", "shouldHide", "Lm0/i;", "onChanged", "(Ljava/lang/Boolean;)V", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: PaymentAuthWebViewActivity.kt */
public final class PaymentAuthWebViewActivity$onCreate$1<T> implements z<Boolean> {
    public final /* synthetic */ PaymentAuthWebViewActivity this$0;

    public PaymentAuthWebViewActivity$onCreate$1(PaymentAuthWebViewActivity paymentAuthWebViewActivity) {
        this.this$0 = paymentAuthWebViewActivity;
    }

    public final void onChanged(Boolean bool) {
        i.d(bool, "shouldHide");
        if (bool.booleanValue()) {
            CircularProgressIndicator circularProgressIndicator = this.this$0.getViewBinding().progressBar;
            i.d(circularProgressIndicator, "viewBinding.progressBar");
            circularProgressIndicator.setVisibility(8);
        }
    }
}
