package com.stripe.android.view;

import com.stripe.android.CustomerSession;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m0.n.a.a;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/stripe/android/CustomerSession;", "invoke", "()Lcom/stripe/android/CustomerSession;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: PaymentFlowActivity.kt */
public final class PaymentFlowActivity$customerSession$2 extends Lambda implements a<CustomerSession> {
    public static final PaymentFlowActivity$customerSession$2 INSTANCE = new PaymentFlowActivity$customerSession$2();

    public PaymentFlowActivity$customerSession$2() {
        super(0);
    }

    public final CustomerSession invoke() {
        return CustomerSession.Companion.getInstance();
    }
}
