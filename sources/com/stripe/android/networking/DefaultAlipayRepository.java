package com.stripe.android.networking;

import kotlin.Metadata;
import m0.n.b.f;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ+\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Lcom/stripe/android/networking/DefaultAlipayRepository;", "Lcom/stripe/android/networking/AlipayRepository;", "Lcom/stripe/android/model/PaymentIntent;", "paymentIntent", "Lcom/stripe/android/AlipayAuthenticator;", "authenticator", "Lcom/stripe/android/networking/ApiRequest$Options;", "requestOptions", "Lcom/stripe/android/model/AlipayAuthResult;", "authenticate", "(Lcom/stripe/android/model/PaymentIntent;Lcom/stripe/android/AlipayAuthenticator;Lcom/stripe/android/networking/ApiRequest$Options;Lm0/l/c;)Ljava/lang/Object;", "Lcom/stripe/android/networking/StripeRepository;", "stripeRepository", "Lcom/stripe/android/networking/StripeRepository;", "<init>", "(Lcom/stripe/android/networking/StripeRepository;)V", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: DefaultAlipayRepository.kt */
public final class DefaultAlipayRepository implements AlipayRepository {
    @Deprecated
    private static final String ALIPAY_RESULT_FIELD = "resultStatus";
    private static final Companion Companion = new Companion((f) null);
    private final StripeRepository stripeRepository;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/networking/DefaultAlipayRepository$Companion;", "", "", "ALIPAY_RESULT_FIELD", "Ljava/lang/String;", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: DefaultAlipayRepository.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    public DefaultAlipayRepository(StripeRepository stripeRepository2) {
        i.e(stripeRepository2, "stripeRepository");
        this.stripeRepository = stripeRepository2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object authenticate(com.stripe.android.model.PaymentIntent r5, com.stripe.android.AlipayAuthenticator r6, com.stripe.android.networking.ApiRequest.Options r7, m0.l.c<? super com.stripe.android.model.AlipayAuthResult> r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof com.stripe.android.networking.DefaultAlipayRepository$authenticate$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.stripe.android.networking.DefaultAlipayRepository$authenticate$1 r0 = (com.stripe.android.networking.DefaultAlipayRepository$authenticate$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.stripe.android.networking.DefaultAlipayRepository$authenticate$1 r0 = new com.stripe.android.networking.DefaultAlipayRepository$authenticate$1
            r0.<init>(r4, r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            i0.j.f.p.h.d4(r8)
            goto L_0x008f
        L_0x0027:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x002f:
            i0.j.f.p.h.d4(r8)
            com.stripe.android.model.PaymentMethod r8 = r5.getPaymentMethod()
            if (r8 == 0) goto L_0x0045
            boolean r8 = r8.liveMode
            if (r8 == 0) goto L_0x003d
            goto L_0x0045
        L_0x003d:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Attempted to authenticate test mode PaymentIntent with the Alipay SDK.\nThe Alipay SDK does not support test mode payments."
            r5.<init>(r6)
            throw r5
        L_0x0045:
            com.stripe.android.model.StripeIntent$NextActionData r5 = r5.getNextActionData()
            boolean r8 = r5 instanceof com.stripe.android.model.StripeIntent.NextActionData.AlipayRedirect
            if (r8 == 0) goto L_0x00ad
            com.stripe.android.model.StripeIntent$NextActionData$AlipayRedirect r5 = (com.stripe.android.model.StripeIntent.NextActionData.AlipayRedirect) r5
            java.lang.String r8 = r5.getData()
            java.util.Map r6 = r6.onAuthenticationRequest(r8)
            java.lang.String r8 = "resultStatus"
            java.lang.Object r6 = r6.get(r8)
            java.lang.String r6 = (java.lang.String) r6
            if (r6 != 0) goto L_0x0062
            goto L_0x00a6
        L_0x0062:
            int r8 = r6.hashCode()
            r2 = 1596796(0x185d7c, float:2.237588E-39)
            if (r8 == r2) goto L_0x009c
            r2 = 1656379(0x19463b, float:2.321081E-39)
            if (r8 == r2) goto L_0x0092
            r2 = 1745751(0x1aa357, float:2.446318E-39)
            if (r8 == r2) goto L_0x0076
            goto L_0x00a6
        L_0x0076:
            java.lang.String r8 = "9000"
            boolean r6 = r6.equals(r8)
            if (r6 == 0) goto L_0x00a6
            java.lang.String r5 = r5.getAuthCompleteUrl()
            if (r5 == 0) goto L_0x00a7
            com.stripe.android.networking.StripeRepository r6 = r4.stripeRepository
            r0.label = r3
            java.lang.Object r8 = r6.retrieveObject(r5, r7, r0)
            if (r8 != r1) goto L_0x008f
            return r1
        L_0x008f:
            org.json.JSONObject r8 = (org.json.JSONObject) r8
            goto L_0x00a7
        L_0x0092:
            java.lang.String r5 = "6001"
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L_0x00a6
            r3 = 3
            goto L_0x00a7
        L_0x009c:
            java.lang.String r5 = "4000"
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L_0x00a6
            r3 = 2
            goto L_0x00a7
        L_0x00a6:
            r3 = 0
        L_0x00a7:
            com.stripe.android.model.AlipayAuthResult r5 = new com.stripe.android.model.AlipayAuthResult
            r5.<init>(r3)
            return r5
        L_0x00ad:
            java.lang.RuntimeException r5 = new java.lang.RuntimeException
            java.lang.String r6 = "Unable to authenticate Payment Intent with Alipay SDK"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.networking.DefaultAlipayRepository.authenticate(com.stripe.android.model.PaymentIntent, com.stripe.android.AlipayAuthenticator, com.stripe.android.networking.ApiRequest$Options, m0.l.c):java.lang.Object");
    }
}
