package com.stripe.android;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m0.l.f.a.c;

@c(c = "com.stripe.android.StripeKtxKt", f = "StripeKtx.kt", l = {484}, m = "retrievePaymentIntent")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H@¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/stripe/android/Stripe;", "", "clientSecret", "stripeAccountId", "Lm0/l/c;", "Lcom/stripe/android/model/PaymentIntent;", "continuation", "", "retrievePaymentIntent", "(Lcom/stripe/android/Stripe;Ljava/lang/String;Ljava/lang/String;Lm0/l/c;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 2})
/* compiled from: StripeKtx.kt */
public final class StripeKtxKt$retrievePaymentIntent$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;

    public StripeKtxKt$retrievePaymentIntent$1(m0.l.c cVar) {
        super(cVar);
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return StripeKtxKt.retrievePaymentIntent((Stripe) null, (String) null, (String) null, this);
    }
}
