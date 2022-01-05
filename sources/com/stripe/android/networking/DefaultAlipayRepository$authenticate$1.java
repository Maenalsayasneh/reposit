package com.stripe.android.networking;

import com.stripe.android.AlipayAuthenticator;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.networking.ApiRequest;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m0.l.f.a.c;

@c(c = "com.stripe.android.networking.DefaultAlipayRepository", f = "DefaultAlipayRepository.kt", l = {33}, m = "authenticate")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H@¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/stripe/android/model/PaymentIntent;", "paymentIntent", "Lcom/stripe/android/AlipayAuthenticator;", "authenticator", "Lcom/stripe/android/networking/ApiRequest$Options;", "requestOptions", "Lm0/l/c;", "Lcom/stripe/android/model/AlipayAuthResult;", "continuation", "", "authenticate", "(Lcom/stripe/android/model/PaymentIntent;Lcom/stripe/android/AlipayAuthenticator;Lcom/stripe/android/networking/ApiRequest$Options;Lm0/l/c;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 2})
/* compiled from: DefaultAlipayRepository.kt */
public final class DefaultAlipayRepository$authenticate$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ DefaultAlipayRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DefaultAlipayRepository$authenticate$1(DefaultAlipayRepository defaultAlipayRepository, m0.l.c cVar) {
        super(cVar);
        this.this$0 = defaultAlipayRepository;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.authenticate((PaymentIntent) null, (AlipayAuthenticator) null, (ApiRequest.Options) null, this);
    }
}
