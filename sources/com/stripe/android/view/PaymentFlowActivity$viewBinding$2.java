package com.stripe.android.view;

import android.view.View;
import android.view.ViewGroup;
import com.stripe.android.R;
import com.stripe.android.databinding.PaymentFlowActivityBinding;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m0.n.a.a;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/stripe/android/databinding/PaymentFlowActivityBinding;", "invoke", "()Lcom/stripe/android/databinding/PaymentFlowActivityBinding;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: PaymentFlowActivity.kt */
public final class PaymentFlowActivity$viewBinding$2 extends Lambda implements a<PaymentFlowActivityBinding> {
    public final /* synthetic */ PaymentFlowActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PaymentFlowActivity$viewBinding$2(PaymentFlowActivity paymentFlowActivity) {
        super(0);
        this.this$0 = paymentFlowActivity;
    }

    public final PaymentFlowActivityBinding invoke() {
        this.this$0.getViewStub$payments_core_release().setLayoutResource(R.layout.payment_flow_activity);
        View inflate = this.this$0.getViewStub$payments_core_release().inflate();
        Objects.requireNonNull(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        PaymentFlowActivityBinding bind = PaymentFlowActivityBinding.bind((ViewGroup) inflate);
        i.d(bind, "PaymentFlowActivityBinding.bind(root)");
        return bind;
    }
}
