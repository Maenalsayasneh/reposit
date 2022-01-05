package com.stripe.android;

import com.stripe.android.model.Stripe3ds2Fingerprint;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.networking.ApiRequest;
import com.stripe.android.stripe3ds2.transaction.Transaction;
import com.stripe.android.view.AuthActivityStarter;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import n0.a.f0;

@c(c = "com.stripe.android.StripePaymentController$begin3ds2Auth$2", f = "StripePaymentController.kt", l = {762, 783, 800, 807}, m = "invokeSuspend")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ln0/a/f0;", "Lm0/i;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: StripePaymentController.kt */
public final class StripePaymentController$begin3ds2Auth$2 extends SuspendLambda implements p<f0, m0.l.c<? super i>, Object> {
    public final /* synthetic */ AuthActivityStarter.Host $host;
    public final /* synthetic */ ApiRequest.Options $requestOptions;
    public final /* synthetic */ Stripe3ds2Fingerprint $stripe3ds2Fingerprint;
    public final /* synthetic */ StripeIntent $stripeIntent;
    public final /* synthetic */ Transaction $transaction;
    public int I$0;
    private /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ StripePaymentController this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StripePaymentController$begin3ds2Auth$2(StripePaymentController stripePaymentController, Transaction transaction, Stripe3ds2Fingerprint stripe3ds2Fingerprint, ApiRequest.Options options, AuthActivityStarter.Host host, StripeIntent stripeIntent, m0.l.c cVar) {
        super(2, cVar);
        this.this$0 = stripePaymentController;
        this.$transaction = transaction;
        this.$stripe3ds2Fingerprint = stripe3ds2Fingerprint;
        this.$requestOptions = options;
        this.$host = host;
        this.$stripeIntent = stripeIntent;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        m0.n.b.i.e(cVar, "completion");
        StripePaymentController$begin3ds2Auth$2 stripePaymentController$begin3ds2Auth$2 = new StripePaymentController$begin3ds2Auth$2(this.this$0, this.$transaction, this.$stripe3ds2Fingerprint, this.$requestOptions, this.$host, this.$stripeIntent, cVar);
        stripePaymentController$begin3ds2Auth$2.L$0 = obj;
        return stripePaymentController$begin3ds2Auth$2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((StripePaymentController$begin3ds2Auth$2) create(obj, (m0.l.c) obj2)).invokeSuspend(i.a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x00a1 A[SYNTHETIC, Splitter:B:25:0x00a1] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a4 A[Catch:{ all -> 0x002c }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00fa  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            r24 = this;
            r12 = r24
            kotlin.coroutines.intrinsics.CoroutineSingletons r13 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r0 = r12.label
            r1 = 4
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            if (r0 == 0) goto L_0x0039
            if (r0 == r4) goto L_0x002f
            if (r0 == r3) goto L_0x0023
            if (r0 == r2) goto L_0x001e
            if (r0 != r1) goto L_0x0016
            goto L_0x001e
        L_0x0016:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x001e:
            i0.j.f.p.h.d4(r25)
            goto L_0x010f
        L_0x0023:
            int r3 = r12.I$0
            i0.j.f.p.h.d4(r25)     // Catch:{ all -> 0x002c }
            r0 = r25
            goto L_0x009f
        L_0x002c:
            r0 = move-exception
            goto L_0x00b2
        L_0x002f:
            java.lang.Object r0 = r12.L$0
            n0.a.f0 r0 = (n0.a.f0) r0
            i0.j.f.p.h.d4(r25)
            r0 = r25
            goto L_0x004d
        L_0x0039:
            i0.j.f.p.h.d4(r25)
            java.lang.Object r0 = r12.L$0
            n0.a.f0 r0 = (n0.a.f0) r0
            com.stripe.android.stripe3ds2.transaction.Transaction r6 = r12.$transaction
            r12.L$0 = r0
            r12.label = r4
            java.lang.Object r0 = r6.createAuthenticationRequestParameters(r12)
            if (r0 != r13) goto L_0x004d
            return r13
        L_0x004d:
            com.stripe.android.stripe3ds2.transaction.AuthenticationRequestParameters r0 = (com.stripe.android.stripe3ds2.transaction.AuthenticationRequestParameters) r0
            com.stripe.android.StripePaymentController r4 = r12.this$0
            com.stripe.android.PaymentAuthConfig r4 = r4.config
            com.stripe.android.PaymentAuthConfig$Stripe3ds2Config r4 = r4.getStripe3ds2Config$payments_core_release()
            int r4 = r4.getTimeout$payments_core_release()
            com.stripe.android.model.Stripe3ds2AuthParams r6 = new com.stripe.android.model.Stripe3ds2AuthParams
            com.stripe.android.model.Stripe3ds2Fingerprint r7 = r12.$stripe3ds2Fingerprint
            java.lang.String r15 = r7.getSource()
            java.lang.String r16 = r0.getSdkAppId()
            java.lang.String r17 = r0.getSdkReferenceNumber()
            com.stripe.android.stripe3ds2.transaction.SdkTransactionId r7 = r0.getSdkTransactionId()
            java.lang.String r18 = r7.getValue()
            java.lang.String r19 = r0.getDeviceData()
            java.lang.String r20 = r0.getSdkEphemeralPublicKey()
            java.lang.String r21 = r0.getMessageVersion()
            r23 = 0
            r14 = r6
            r22 = r4
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23)
            com.stripe.android.StripePaymentController r0 = r12.this$0     // Catch:{ all -> 0x00b0 }
            com.stripe.android.networking.StripeRepository r0 = r0.stripeRepository     // Catch:{ all -> 0x00b0 }
            com.stripe.android.networking.ApiRequest$Options r7 = r12.$requestOptions     // Catch:{ all -> 0x00b0 }
            r12.L$0 = r5     // Catch:{ all -> 0x00b0 }
            r12.I$0 = r4     // Catch:{ all -> 0x00b0 }
            r12.label = r3     // Catch:{ all -> 0x00b0 }
            java.lang.Object r0 = r0.start3ds2Auth(r6, r7, r12)     // Catch:{ all -> 0x00b0 }
            if (r0 != r13) goto L_0x009e
            return r13
        L_0x009e:
            r3 = r4
        L_0x009f:
            if (r0 == 0) goto L_0x00a4
            com.stripe.android.model.Stripe3ds2AuthResult r0 = (com.stripe.android.model.Stripe3ds2AuthResult) r0     // Catch:{ all -> 0x002c }
            goto L_0x00b6
        L_0x00a4:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x002c }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x002c }
            r4.<init>(r0)     // Catch:{ all -> 0x002c }
            throw r4     // Catch:{ all -> 0x002c }
        L_0x00b0:
            r0 = move-exception
            r3 = r4
        L_0x00b2:
            java.lang.Object r0 = i0.j.f.p.h.l0(r0)
        L_0x00b6:
            r6 = r3
            com.stripe.android.StripePaymentController r3 = r12.this$0
            m0.n.a.l r3 = r3.paymentRelayStarterFactory
            com.stripe.android.view.AuthActivityStarter$Host r4 = r12.$host
            java.lang.Object r3 = r3.invoke(r4)
            r7 = r3
            com.stripe.android.PaymentRelayStarter r7 = (com.stripe.android.PaymentRelayStarter) r7
            java.lang.Throwable r3 = kotlin.Result.a(r0)
            if (r3 != 0) goto L_0x00fa
            com.stripe.android.model.Stripe3ds2AuthResult r0 = (com.stripe.android.model.Stripe3ds2AuthResult) r0
            com.stripe.android.StripePaymentController r1 = r12.this$0
            com.stripe.android.stripe3ds2.transaction.Transaction r3 = r12.$transaction
            com.stripe.android.model.Stripe3ds2Fingerprint r4 = r12.$stripe3ds2Fingerprint
            java.lang.String r4 = r4.getSource()
            com.stripe.android.StripePaymentController$Companion r8 = com.stripe.android.StripePaymentController.Companion
            com.stripe.android.model.StripeIntent r9 = r12.$stripeIntent
            int r8 = r8.getRequestCode$payments_core_release((com.stripe.android.model.StripeIntent) r9)
            com.stripe.android.view.AuthActivityStarter$Host r9 = r12.$host
            com.stripe.android.model.StripeIntent r10 = r12.$stripeIntent
            com.stripe.android.networking.ApiRequest$Options r11 = r12.$requestOptions
            r12.L$0 = r5
            r12.label = r2
            r2 = r0
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r11
            r11 = r24
            java.lang.Object r0 = r1.on3ds2AuthSuccess$payments_core_release(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            if (r0 != r13) goto L_0x010f
            return r13
        L_0x00fa:
            com.stripe.android.StripePaymentController r0 = r12.this$0
            com.stripe.android.StripePaymentController$Companion r2 = com.stripe.android.StripePaymentController.Companion
            com.stripe.android.model.StripeIntent r4 = r12.$stripeIntent
            int r2 = r2.getRequestCode$payments_core_release((com.stripe.android.model.StripeIntent) r4)
            r12.L$0 = r5
            r12.label = r1
            java.lang.Object r0 = r0.on3ds2AuthFailure(r3, r2, r7, r12)
            if (r0 != r13) goto L_0x010f
            return r13
        L_0x010f:
            m0.i r0 = m0.i.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.StripePaymentController$begin3ds2Auth$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
