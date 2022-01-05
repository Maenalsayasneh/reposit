package com.stripe.android.networking;

import com.stripe.android.model.parsers.ModelJsonParser;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.a;

@c(c = "com.stripe.android.networking.StripeApiRepository", f = "StripeApiRepository.kt", l = {1013}, m = "fetchStripeModel")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\tH@¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lcom/stripe/android/model/StripeModel;", "ModelType", "Lcom/stripe/android/networking/ApiRequest;", "apiRequest", "Lcom/stripe/android/model/parsers/ModelJsonParser;", "jsonParser", "Lkotlin/Function0;", "Lm0/i;", "onResponse", "Lm0/l/c;", "continuation", "", "fetchStripeModel", "(Lcom/stripe/android/networking/ApiRequest;Lcom/stripe/android/model/parsers/ModelJsonParser;Lm0/n/a/a;Lm0/l/c;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 2})
/* compiled from: StripeApiRepository.kt */
public final class StripeApiRepository$fetchStripeModel$1 extends ContinuationImpl {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ StripeApiRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StripeApiRepository$fetchStripeModel$1(StripeApiRepository stripeApiRepository, m0.l.c cVar) {
        super(cVar);
        this.this$0 = stripeApiRepository;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.fetchStripeModel((ApiRequest) null, (ModelJsonParser) null, (a<i>) null, this);
    }
}
