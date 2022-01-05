package com.stripe.android.paymentsheet.repositories;

import com.stripe.android.model.StripeIntent;
import com.stripe.android.paymentsheet.model.ClientSecret;
import com.stripe.android.paymentsheet.repositories.StripeIntentRepository;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import n0.a.f0;

@c(c = "com.stripe.android.paymentsheet.repositories.StripeIntentRepository$Api$get$2", f = "StripeIntentRepository.kt", l = {40, 50}, m = "invokeSuspend")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ln0/a/f0;", "Lcom/stripe/android/model/StripeIntent;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: StripeIntentRepository.kt */
public final class StripeIntentRepository$Api$get$2 extends SuspendLambda implements p<f0, m0.l.c<? super StripeIntent>, Object> {
    public final /* synthetic */ ClientSecret $clientSecret;
    public int label;
    public final /* synthetic */ StripeIntentRepository.Api this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StripeIntentRepository$Api$get$2(StripeIntentRepository.Api api, ClientSecret clientSecret, m0.l.c cVar) {
        super(2, cVar);
        this.this$0 = api;
        this.$clientSecret = clientSecret;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        m0.n.b.i.e(cVar, "completion");
        return new StripeIntentRepository$Api$get$2(this.this$0, this.$clientSecret, cVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((StripeIntentRepository$Api$get$2) create(obj, (m0.l.c) obj2)).invokeSuspend(i.a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x007f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r5.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x001c
            if (r1 == r3) goto L_0x0018
            if (r1 != r2) goto L_0x0010
            i0.j.f.p.h.d4(r6)
            goto L_0x007a
        L_0x0010:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0018:
            i0.j.f.p.h.d4(r6)
            goto L_0x0046
        L_0x001c:
            i0.j.f.p.h.d4(r6)
            com.stripe.android.paymentsheet.model.ClientSecret r6 = r5.$clientSecret
            boolean r1 = r6 instanceof com.stripe.android.paymentsheet.model.PaymentIntentClientSecret
            java.lang.String r4 = "payment_method"
            if (r1 == 0) goto L_0x0057
            com.stripe.android.paymentsheet.repositories.StripeIntentRepository$Api r6 = r5.this$0
            com.stripe.android.networking.StripeRepository r6 = r6.stripeRepository
            com.stripe.android.paymentsheet.model.ClientSecret r1 = r5.$clientSecret
            java.lang.String r1 = r1.getValue()
            com.stripe.android.paymentsheet.repositories.StripeIntentRepository$Api r2 = r5.this$0
            com.stripe.android.networking.ApiRequest$Options r2 = r2.requestOptions
            java.util.List r4 = i0.j.f.p.h.L2(r4)
            r5.label = r3
            java.lang.Object r6 = r6.retrievePaymentIntent(r1, r2, r4, r5)
            if (r6 != r0) goto L_0x0046
            return r0
        L_0x0046:
            com.stripe.android.model.PaymentIntent r6 = (com.stripe.android.model.PaymentIntent) r6
            if (r6 == 0) goto L_0x004b
            goto L_0x007e
        L_0x004b:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Could not parse PaymentIntent."
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        L_0x0057:
            boolean r6 = r6 instanceof com.stripe.android.paymentsheet.model.SetupIntentClientSecret
            if (r6 == 0) goto L_0x008b
            com.stripe.android.paymentsheet.repositories.StripeIntentRepository$Api r6 = r5.this$0
            com.stripe.android.networking.StripeRepository r6 = r6.stripeRepository
            com.stripe.android.paymentsheet.model.ClientSecret r1 = r5.$clientSecret
            java.lang.String r1 = r1.getValue()
            com.stripe.android.paymentsheet.repositories.StripeIntentRepository$Api r3 = r5.this$0
            com.stripe.android.networking.ApiRequest$Options r3 = r3.requestOptions
            java.util.List r4 = i0.j.f.p.h.L2(r4)
            r5.label = r2
            java.lang.Object r6 = r6.retrieveSetupIntent(r1, r3, r4, r5)
            if (r6 != r0) goto L_0x007a
            return r0
        L_0x007a:
            com.stripe.android.model.SetupIntent r6 = (com.stripe.android.model.SetupIntent) r6
            if (r6 == 0) goto L_0x007f
        L_0x007e:
            return r6
        L_0x007f:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Could not parse SetupIntent."
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        L_0x008b:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.repositories.StripeIntentRepository$Api$get$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
