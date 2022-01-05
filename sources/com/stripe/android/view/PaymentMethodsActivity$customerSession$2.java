package com.stripe.android.view;

import com.stripe.android.CustomerSession;
import i0.j.f.p.h;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.jvm.internal.Lambda;
import m0.n.a.a;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/Result;", "Lcom/stripe/android/CustomerSession;", "invoke", "()Lkotlin/Result;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: PaymentMethodsActivity.kt */
public final class PaymentMethodsActivity$customerSession$2 extends Lambda implements a<Result<? extends CustomerSession>> {
    public final /* synthetic */ PaymentMethodsActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PaymentMethodsActivity$customerSession$2(PaymentMethodsActivity paymentMethodsActivity) {
        super(0);
        this.this$0 = paymentMethodsActivity;
    }

    public final Result<? extends CustomerSession> invoke() {
        Object obj;
        try {
            obj = CustomerSession.Companion.getInstance();
        } catch (Throwable th) {
            obj = h.l0(th);
        }
        return new Result<>(obj);
    }
}
