package com.stripe.android.networking;

import com.stripe.android.AlipayAuthenticator;
import com.stripe.android.model.AlipayAuthResult;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.networking.ApiRequest;
import kotlin.Metadata;
import m0.l.c;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J+\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H¦@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/networking/AlipayRepository;", "", "Lcom/stripe/android/model/PaymentIntent;", "paymentIntent", "Lcom/stripe/android/AlipayAuthenticator;", "authenticator", "Lcom/stripe/android/networking/ApiRequest$Options;", "requestOptions", "Lcom/stripe/android/model/AlipayAuthResult;", "authenticate", "(Lcom/stripe/android/model/PaymentIntent;Lcom/stripe/android/AlipayAuthenticator;Lcom/stripe/android/networking/ApiRequest$Options;Lm0/l/c;)Ljava/lang/Object;", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: AlipayRepository.kt */
public interface AlipayRepository {
    Object authenticate(PaymentIntent paymentIntent, AlipayAuthenticator alipayAuthenticator, ApiRequest.Options options, c<? super AlipayAuthResult> cVar);
}
