package com.stripe.android.view;

import android.content.Intent;
import com.stripe.android.view.PaymentFlowActivityStarter;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m0.n.a.a;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/stripe/android/view/PaymentFlowActivityStarter$Args;", "invoke", "()Lcom/stripe/android/view/PaymentFlowActivityStarter$Args;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: PaymentFlowActivity.kt */
public final class PaymentFlowActivity$args$2 extends Lambda implements a<PaymentFlowActivityStarter.Args> {
    public final /* synthetic */ PaymentFlowActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PaymentFlowActivity$args$2(PaymentFlowActivity paymentFlowActivity) {
        super(0);
        this.this$0 = paymentFlowActivity;
    }

    public final PaymentFlowActivityStarter.Args invoke() {
        PaymentFlowActivityStarter.Args.Companion companion = PaymentFlowActivityStarter.Args.Companion;
        Intent intent = this.this$0.getIntent();
        i.d(intent, "intent");
        return companion.create(intent);
    }
}
