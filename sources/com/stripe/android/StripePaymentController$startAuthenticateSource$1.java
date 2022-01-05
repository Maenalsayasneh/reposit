package com.stripe.android;

import com.stripe.android.model.Source;
import com.stripe.android.networking.ApiRequest;
import com.stripe.android.view.AuthActivityStarter;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m0.l.f.a.c;

@c(c = "com.stripe.android.StripePaymentController", f = "StripePaymentController.kt", l = {321, 326, 332}, m = "startAuthenticateSource")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H@¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/stripe/android/view/AuthActivityStarter$Host;", "host", "Lcom/stripe/android/model/Source;", "source", "Lcom/stripe/android/networking/ApiRequest$Options;", "requestOptions", "Lm0/l/c;", "Lm0/i;", "continuation", "", "startAuthenticateSource", "(Lcom/stripe/android/view/AuthActivityStarter$Host;Lcom/stripe/android/model/Source;Lcom/stripe/android/networking/ApiRequest$Options;Lm0/l/c;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 2})
/* compiled from: StripePaymentController.kt */
public final class StripePaymentController$startAuthenticateSource$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ StripePaymentController this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StripePaymentController$startAuthenticateSource$1(StripePaymentController stripePaymentController, m0.l.c cVar) {
        super(cVar);
        this.this$0 = stripePaymentController;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.startAuthenticateSource((AuthActivityStarter.Host) null, (Source) null, (ApiRequest.Options) null, this);
    }
}
