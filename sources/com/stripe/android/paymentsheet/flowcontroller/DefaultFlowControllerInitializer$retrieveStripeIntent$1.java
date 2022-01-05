package com.stripe.android.paymentsheet.flowcontroller;

import com.stripe.android.paymentsheet.model.ClientSecret;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m0.l.f.a.c;

@c(c = "com.stripe.android.paymentsheet.flowcontroller.DefaultFlowControllerInitializer", f = "DefaultFlowControllerInitializer.kt", l = {171}, m = "retrieveStripeIntent")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/stripe/android/paymentsheet/model/ClientSecret;", "clientSecret", "Lm0/l/c;", "Lcom/stripe/android/model/StripeIntent;", "continuation", "", "retrieveStripeIntent", "(Lcom/stripe/android/paymentsheet/model/ClientSecret;Lm0/l/c;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 2})
/* compiled from: DefaultFlowControllerInitializer.kt */
public final class DefaultFlowControllerInitializer$retrieveStripeIntent$1 extends ContinuationImpl {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ DefaultFlowControllerInitializer this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DefaultFlowControllerInitializer$retrieveStripeIntent$1(DefaultFlowControllerInitializer defaultFlowControllerInitializer, m0.l.c cVar) {
        super(cVar);
        this.this$0 = defaultFlowControllerInitializer;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.retrieveStripeIntent((ClientSecret) null, this);
    }
}
