package com.stripe.android.payments;

import com.stripe.android.payments.PaymentFlowResult;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import n0.a.f0;

@c(c = "com.stripe.android.payments.PaymentFlowResultProcessor$processResult$2", f = "PaymentFlowResultProcessor.kt", l = {45, 58}, m = "invokeSuspend")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00028\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\u0010\b\u0001\u0010\u0003 \u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002*\u00020\u0004H@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/stripe/android/model/StripeIntent;", "T", "Lcom/stripe/android/StripeIntentResult;", "S", "Ln0/a/f0;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: PaymentFlowResultProcessor.kt */
public final class PaymentFlowResultProcessor$processResult$2 extends SuspendLambda implements p<f0, m0.l.c<? super S>, Object> {
    public final /* synthetic */ PaymentFlowResult.Unvalidated $unvalidatedResult;
    public Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ PaymentFlowResultProcessor this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PaymentFlowResultProcessor$processResult$2(PaymentFlowResultProcessor paymentFlowResultProcessor, PaymentFlowResult.Unvalidated unvalidated, m0.l.c cVar) {
        super(2, cVar);
        this.this$0 = paymentFlowResultProcessor;
        this.$unvalidatedResult = unvalidated;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        m0.n.b.i.e(cVar, "completion");
        return new PaymentFlowResultProcessor$processResult$2(this.this$0, this.$unvalidatedResult, cVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((PaymentFlowResultProcessor$processResult$2) create(obj, (m0.l.c) obj2)).invokeSuspend(i.a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00ba  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r12.label
            java.lang.String r2 = "Required value was null."
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L_0x002b
            if (r1 == r4) goto L_0x001f
            if (r1 != r3) goto L_0x0017
            java.lang.Object r0 = r12.L$0
            com.stripe.android.payments.PaymentFlowResult$Validated r0 = (com.stripe.android.payments.PaymentFlowResult.Validated) r0
            i0.j.f.p.h.d4(r13)
            goto L_0x00b4
        L_0x0017:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L_0x001f:
            java.lang.Object r1 = r12.L$1
            com.stripe.android.networking.ApiRequest$Options r1 = (com.stripe.android.networking.ApiRequest.Options) r1
            java.lang.Object r4 = r12.L$0
            com.stripe.android.payments.PaymentFlowResult$Validated r4 = (com.stripe.android.payments.PaymentFlowResult.Validated) r4
            i0.j.f.p.h.d4(r13)
            goto L_0x0065
        L_0x002b:
            i0.j.f.p.h.d4(r13)
            com.stripe.android.payments.PaymentFlowResult$Unvalidated r13 = r12.$unvalidatedResult
            com.stripe.android.payments.PaymentFlowResult$Validated r13 = r13.validate()
            com.stripe.android.networking.ApiRequest$Options r1 = new com.stripe.android.networking.ApiRequest$Options
            com.stripe.android.payments.PaymentFlowResultProcessor r5 = r12.this$0
            java.lang.String r6 = r5.publishableKey
            java.lang.String r7 = r13.getStripeAccountId$payments_core_release()
            r8 = 0
            r9 = 4
            r10 = 0
            r5 = r1
            r5.<init>(r6, r7, r8, r9, r10)
            com.stripe.android.payments.PaymentFlowResultProcessor r5 = r12.this$0
            java.lang.String r6 = r13.getClientSecret()
            com.stripe.android.payments.PaymentFlowResultProcessor$Companion r7 = com.stripe.android.payments.PaymentFlowResultProcessor.Companion
            java.util.List r7 = r7.getEXPAND_PAYMENT_METHOD()
            r12.L$0 = r13
            r12.L$1 = r1
            r12.label = r4
            java.lang.Object r4 = r5.retrieveStripeIntent(r6, r1, r7, r12)
            if (r4 != r0) goto L_0x0062
            return r0
        L_0x0062:
            r11 = r4
            r4 = r13
            r13 = r11
        L_0x0065:
            if (r13 == 0) goto L_0x00dd
            com.stripe.android.model.StripeIntent r13 = (com.stripe.android.model.StripeIntent) r13
            com.stripe.android.payments.PaymentFlowResultProcessor r5 = r12.this$0
            boolean r6 = r4.getCanCancelSource$payments_core_release()
            boolean r5 = r5.shouldCancelIntent(r13, r6)
            if (r5 == 0) goto L_0x00c4
            java.lang.String r5 = r4.getSourceId$payments_core_release()
            if (r5 == 0) goto L_0x007c
            goto L_0x007e
        L_0x007c:
            java.lang.String r5 = ""
        L_0x007e:
            com.stripe.android.payments.PaymentFlowResultProcessor r6 = r12.this$0
            com.stripe.android.Logger r6 = r6.logger
            java.lang.String r7 = "Canceling source '"
            java.lang.String r8 = "' for '"
            java.lang.StringBuilder r7 = i0.d.a.a.a.T0(r7, r5, r8)
            java.lang.Class r8 = r13.getClass()
            java.lang.String r8 = r8.getSimpleName()
            r7.append(r8)
            r8 = 39
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            r6.debug(r7)
            com.stripe.android.payments.PaymentFlowResultProcessor r6 = r12.this$0
            r12.L$0 = r4
            r7 = 0
            r12.L$1 = r7
            r12.label = r3
            java.lang.Object r13 = r6.cancelStripeIntent(r13, r1, r5, r12)
            if (r13 != r0) goto L_0x00b3
            return r0
        L_0x00b3:
            r0 = r4
        L_0x00b4:
            if (r13 == 0) goto L_0x00ba
            com.stripe.android.model.StripeIntent r13 = (com.stripe.android.model.StripeIntent) r13
            r4 = r0
            goto L_0x00c4
        L_0x00ba:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r2.toString()
            r13.<init>(r0)
            throw r13
        L_0x00c4:
            com.stripe.android.payments.PaymentFlowResultProcessor r0 = r12.this$0
            int r1 = r4.getFlowOutcome$payments_core_release()
            com.stripe.android.payments.PaymentFlowResultProcessor r2 = r12.this$0
            com.stripe.android.payments.PaymentFlowFailureMessageFactory r2 = r2.failureMessageFactory
            int r3 = r4.getFlowOutcome$payments_core_release()
            java.lang.String r2 = r2.create(r13, r3)
            com.stripe.android.StripeIntentResult r13 = r0.createStripeIntentResult(r13, r1, r2)
            return r13
        L_0x00dd:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r2.toString()
            r13.<init>(r0)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.payments.PaymentFlowResultProcessor$processResult$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
