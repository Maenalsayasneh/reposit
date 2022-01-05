package com.stripe.android.view;

import android.app.Application;
import com.stripe.android.Logger;
import com.stripe.android.auth.PaymentBrowserAuthContract;
import com.stripe.android.view.PaymentAuthWebViewActivityViewModel;
import h0.q.m0;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m0.n.a.a;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lh0/q/m0$b;", "invoke", "()Lh0/q/m0$b;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: PaymentAuthWebViewActivity.kt */
public final class PaymentAuthWebViewActivity$viewModel$2 extends Lambda implements a<m0.b> {
    public final /* synthetic */ PaymentAuthWebViewActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PaymentAuthWebViewActivity$viewModel$2(PaymentAuthWebViewActivity paymentAuthWebViewActivity) {
        super(0);
        this.this$0 = paymentAuthWebViewActivity;
    }

    public final m0.b invoke() {
        Application application = this.this$0.getApplication();
        i.d(application, "application");
        Logger access$getLogger$p = this.this$0.getLogger();
        PaymentBrowserAuthContract.Args access$get_args$p = this.this$0.get_args();
        if (access$get_args$p != null) {
            return new PaymentAuthWebViewActivityViewModel.Factory(application, access$getLogger$p, access$get_args$p);
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
