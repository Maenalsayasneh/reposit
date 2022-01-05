package com.stripe.android;

import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.networking.ApiRequest;
import com.stripe.android.networking.StripeRepository;
import i0.j.f.p.h;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import n0.a.f0;

@c(c = "com.stripe.android.Stripe$createPaymentMethodSynchronous$1", f = "Stripe.kt", l = {1134}, m = "invokeSuspend")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ln0/a/f0;", "Lcom/stripe/android/model/PaymentMethod;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: Stripe.kt */
public final class Stripe$createPaymentMethodSynchronous$1 extends SuspendLambda implements p<f0, m0.l.c<? super PaymentMethod>, Object> {
    public final /* synthetic */ String $idempotencyKey;
    public final /* synthetic */ PaymentMethodCreateParams $paymentMethodCreateParams;
    public final /* synthetic */ String $stripeAccountId;
    public int label;
    public final /* synthetic */ Stripe this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Stripe$createPaymentMethodSynchronous$1(Stripe stripe, PaymentMethodCreateParams paymentMethodCreateParams, String str, String str2, m0.l.c cVar) {
        super(2, cVar);
        this.this$0 = stripe;
        this.$paymentMethodCreateParams = paymentMethodCreateParams;
        this.$stripeAccountId = str;
        this.$idempotencyKey = str2;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        m0.n.b.i.e(cVar, "completion");
        return new Stripe$createPaymentMethodSynchronous$1(this.this$0, this.$paymentMethodCreateParams, this.$stripeAccountId, this.$idempotencyKey, cVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((Stripe$createPaymentMethodSynchronous$1) create(obj, (m0.l.c) obj2)).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            h.d4(obj);
            StripeRepository stripeRepository$payments_core_release = this.this$0.getStripeRepository$payments_core_release();
            PaymentMethodCreateParams paymentMethodCreateParams = this.$paymentMethodCreateParams;
            ApiRequest.Options options = new ApiRequest.Options(this.this$0.getPublishableKey$payments_core_release(), this.$stripeAccountId, this.$idempotencyKey);
            this.label = 1;
            obj = stripeRepository$payments_core_release.createPaymentMethod(paymentMethodCreateParams, options, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            h.d4(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }
}
