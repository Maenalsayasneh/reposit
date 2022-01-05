package com.stripe.android.networking;

import com.stripe.android.networking.ApiRequest;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m0.l.f.a.c;

@c(c = "com.stripe.android.networking.StripeApiRepository", f = "StripeApiRepository.kt", l = {920}, m = "retrieveObject")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H@¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "url", "Lcom/stripe/android/networking/ApiRequest$Options;", "requestOptions", "Lm0/l/c;", "Lorg/json/JSONObject;", "continuation", "", "retrieveObject", "(Ljava/lang/String;Lcom/stripe/android/networking/ApiRequest$Options;Lm0/l/c;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 2})
/* compiled from: StripeApiRepository.kt */
public final class StripeApiRepository$retrieveObject$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ StripeApiRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StripeApiRepository$retrieveObject$1(StripeApiRepository stripeApiRepository, m0.l.c cVar) {
        super(cVar);
        this.this$0 = stripeApiRepository;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.retrieveObject((String) null, (ApiRequest.Options) null, this);
    }
}
