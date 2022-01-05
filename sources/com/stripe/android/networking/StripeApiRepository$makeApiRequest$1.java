package com.stripe.android.networking;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.a;

@c(c = "com.stripe.android.networking.StripeApiRepository", f = "StripeApiRepository.kt", l = {1031}, m = "makeApiRequest$payments_core_release")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H@¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/stripe/android/networking/ApiRequest;", "apiRequest", "Lkotlin/Function0;", "Lm0/i;", "onResponse", "Lm0/l/c;", "Lcom/stripe/android/networking/StripeResponse;", "continuation", "", "makeApiRequest", "(Lcom/stripe/android/networking/ApiRequest;Lm0/n/a/a;Lm0/l/c;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 2})
/* compiled from: StripeApiRepository.kt */
public final class StripeApiRepository$makeApiRequest$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ StripeApiRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StripeApiRepository$makeApiRequest$1(StripeApiRepository stripeApiRepository, m0.l.c cVar) {
        super(cVar);
        this.this$0 = stripeApiRepository;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.makeApiRequest$payments_core_release((ApiRequest) null, (a<i>) null, this);
    }
}
