package com.stripe.android;

import com.stripe.android.model.ConfirmPaymentIntentParams;
import com.stripe.android.networking.ApiRequest;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m0.l.f.a.c;

@c(c = "com.stripe.android.StripePaymentController", f = "StripePaymentController.kt", l = {235}, m = "confirmPaymentIntent")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H@¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/stripe/android/model/ConfirmPaymentIntentParams;", "confirmStripeIntentParams", "Lcom/stripe/android/networking/ApiRequest$Options;", "requestOptions", "Lm0/l/c;", "Lcom/stripe/android/model/PaymentIntent;", "continuation", "", "confirmPaymentIntent", "(Lcom/stripe/android/model/ConfirmPaymentIntentParams;Lcom/stripe/android/networking/ApiRequest$Options;Lm0/l/c;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 2})
/* compiled from: StripePaymentController.kt */
public final class StripePaymentController$confirmPaymentIntent$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ StripePaymentController this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StripePaymentController$confirmPaymentIntent$1(StripePaymentController stripePaymentController, m0.l.c cVar) {
        super(cVar);
        this.this$0 = stripePaymentController;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.confirmPaymentIntent((ConfirmPaymentIntentParams) null, (ApiRequest.Options) null, this);
    }
}
