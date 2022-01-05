package com.stripe.android.networking;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;

@c(c = "com.stripe.android.networking.StripeApiRepository", f = "StripeApiRepository.kt", l = {1065}, m = "makeFileUploadRequest$payments_core_release")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0014\u0010\u0005\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00040\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H@¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/stripe/android/networking/FileUploadRequest;", "fileUploadRequest", "Lkotlin/Function1;", "Lcom/stripe/android/networking/RequestId;", "Lm0/i;", "onResponse", "Lm0/l/c;", "Lcom/stripe/android/networking/StripeResponse;", "continuation", "", "makeFileUploadRequest", "(Lcom/stripe/android/networking/FileUploadRequest;Lm0/n/a/l;Lm0/l/c;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 2})
/* compiled from: StripeApiRepository.kt */
public final class StripeApiRepository$makeFileUploadRequest$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ StripeApiRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StripeApiRepository$makeFileUploadRequest$1(StripeApiRepository stripeApiRepository, m0.l.c cVar) {
        super(cVar);
        this.this$0 = stripeApiRepository;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.makeFileUploadRequest$payments_core_release((FileUploadRequest) null, (l<? super RequestId, i>) null, this);
    }
}
