package com.stripe.android.paymentsheet.flowcontroller;

import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.model.ClientSecret;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import n0.a.f0;

@c(c = "com.stripe.android.paymentsheet.flowcontroller.DefaultFlowController$configureInternal$1", f = "DefaultFlowController.kt", l = {190, 194}, m = "invokeSuspend")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ln0/a/f0;", "Lm0/i;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: DefaultFlowController.kt */
public final class DefaultFlowController$configureInternal$1 extends SuspendLambda implements p<f0, m0.l.c<? super i>, Object> {
    public final /* synthetic */ PaymentSheet.FlowController.ConfigCallback $callback;
    public final /* synthetic */ ClientSecret $clientSecret;
    public final /* synthetic */ PaymentSheet.Configuration $configuration;
    private /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ DefaultFlowController this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DefaultFlowController$configureInternal$1(DefaultFlowController defaultFlowController, ClientSecret clientSecret, PaymentSheet.Configuration configuration, PaymentSheet.FlowController.ConfigCallback configCallback, m0.l.c cVar) {
        super(2, cVar);
        this.this$0 = defaultFlowController;
        this.$clientSecret = clientSecret;
        this.$configuration = configuration;
        this.$callback = configCallback;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        m0.n.b.i.e(cVar, "completion");
        DefaultFlowController$configureInternal$1 defaultFlowController$configureInternal$1 = new DefaultFlowController$configureInternal$1(this.this$0, this.$clientSecret, this.$configuration, this.$callback, cVar);
        defaultFlowController$configureInternal$1.L$0 = obj;
        return defaultFlowController$configureInternal$1;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((DefaultFlowController$configureInternal$1) create(obj, (m0.l.c) obj2)).invokeSuspend(i.a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: n0.a.f0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            r24 = this;
            r6 = r24
            kotlin.coroutines.intrinsics.CoroutineSingletons r7 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r0 = r6.label
            r8 = 2
            r1 = 1
            if (r0 == 0) goto L_0x0027
            if (r0 == r1) goto L_0x001b
            if (r0 != r8) goto L_0x0013
            i0.j.f.p.h.d4(r25)
            goto L_0x00bb
        L_0x0013:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x001b:
            java.lang.Object r0 = r6.L$0
            n0.a.f0 r0 = (n0.a.f0) r0
            i0.j.f.p.h.d4(r25)
            r9 = r0
            r0 = r25
            goto L_0x009d
        L_0x0027:
            i0.j.f.p.h.d4(r25)
            java.lang.Object r0 = r6.L$0
            r9 = r0
            n0.a.f0 r9 = (n0.a.f0) r9
            com.stripe.android.paymentsheet.flowcontroller.DefaultFlowController r0 = r6.this$0
            com.stripe.android.paymentsheet.flowcontroller.FlowControllerInitializer r0 = r0.flowControllerInitializer
            com.stripe.android.paymentsheet.model.ClientSecret r2 = r6.$clientSecret
            com.stripe.android.paymentsheet.repositories.StripeIntentRepository$Api r3 = new com.stripe.android.paymentsheet.repositories.StripeIntentRepository$Api
            com.stripe.android.paymentsheet.flowcontroller.DefaultFlowController r4 = r6.this$0
            com.stripe.android.networking.StripeApiRepository r4 = r4.getStripeApiRepository()
            com.stripe.android.networking.ApiRequest$Options r5 = new com.stripe.android.networking.ApiRequest$Options
            com.stripe.android.paymentsheet.flowcontroller.DefaultFlowController r10 = r6.this$0
            com.stripe.android.PaymentConfiguration r10 = r10.getPaymentConfiguration()
            java.lang.String r11 = r10.getPublishableKey()
            com.stripe.android.paymentsheet.flowcontroller.DefaultFlowController r10 = r6.this$0
            com.stripe.android.PaymentConfiguration r10 = r10.getPaymentConfiguration()
            java.lang.String r12 = r10.getStripeAccountId()
            r13 = 0
            r14 = 4
            r15 = 0
            r10 = r5
            r10.<init>(r11, r12, r13, r14, r15)
            n0.a.d0 r10 = n0.a.m0.c
            r3.<init>(r4, r5, r10)
            com.stripe.android.paymentsheet.repositories.PaymentMethodsApiRepository r4 = new com.stripe.android.paymentsheet.repositories.PaymentMethodsApiRepository
            com.stripe.android.paymentsheet.flowcontroller.DefaultFlowController r5 = r6.this$0
            com.stripe.android.networking.StripeApiRepository r17 = r5.getStripeApiRepository()
            com.stripe.android.paymentsheet.flowcontroller.DefaultFlowController r5 = r6.this$0
            com.stripe.android.PaymentConfiguration r5 = r5.getPaymentConfiguration()
            java.lang.String r18 = r5.getPublishableKey()
            com.stripe.android.paymentsheet.flowcontroller.DefaultFlowController r5 = r6.this$0
            com.stripe.android.PaymentConfiguration r5 = r5.getPaymentConfiguration()
            java.lang.String r19 = r5.getStripeAccountId()
            r20 = 0
            r22 = 8
            r23 = 0
            r16 = r4
            r21 = r10
            r16.<init>(r17, r18, r19, r20, r21, r22, r23)
            com.stripe.android.paymentsheet.PaymentSheet$Configuration r5 = r6.$configuration
            r6.L$0 = r9
            r6.label = r1
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r24
            java.lang.Object r0 = r0.init(r1, r2, r3, r4, r5)
            if (r0 != r7) goto L_0x009d
            return r7
        L_0x009d:
            com.stripe.android.paymentsheet.flowcontroller.FlowControllerInitializer$InitResult r0 = (com.stripe.android.paymentsheet.flowcontroller.FlowControllerInitializer.InitResult) r0
            boolean r1 = m0.r.t.a.r.m.a1.a.r2(r9)
            r2 = 0
            if (r1 == 0) goto L_0x00b5
            com.stripe.android.paymentsheet.flowcontroller.DefaultFlowController r1 = r6.this$0
            com.stripe.android.paymentsheet.PaymentSheet$FlowController$ConfigCallback r3 = r6.$callback
            r6.L$0 = r2
            r6.label = r8
            java.lang.Object r0 = r1.dispatchResult(r0, r3, r6)
            if (r0 != r7) goto L_0x00bb
            return r7
        L_0x00b5:
            com.stripe.android.paymentsheet.PaymentSheet$FlowController$ConfigCallback r0 = r6.$callback
            r1 = 0
            r0.onConfigured(r1, r2)
        L_0x00bb:
            m0.i r0 = m0.i.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.flowcontroller.DefaultFlowController$configureInternal$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
