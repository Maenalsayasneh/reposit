package com.stripe.android;

import com.stripe.android.model.ConfirmPaymentIntentParams;
import com.stripe.android.model.WeChatPayNextAction;
import com.stripe.android.networking.ApiRequest;
import i0.j.f.p.h;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;
import m0.n.b.f;

@c(c = "com.stripe.android.Stripe$confirmWeChatPayPayment$1", f = "Stripe.kt", l = {295}, m = "invokeSuspend")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H@¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/stripe/android/model/WeChatPayNextAction;", "invoke", "(Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: Stripe.kt */
public final class Stripe$confirmWeChatPayPayment$1 extends SuspendLambda implements l<m0.l.c<? super WeChatPayNextAction>, Object> {
    public final /* synthetic */ ConfirmPaymentIntentParams $confirmPaymentIntentParams;
    public final /* synthetic */ String $stripeAccountId;
    public int label;
    public final /* synthetic */ Stripe this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Stripe$confirmWeChatPayPayment$1(Stripe stripe, ConfirmPaymentIntentParams confirmPaymentIntentParams, String str, m0.l.c cVar) {
        super(1, cVar);
        this.this$0 = stripe;
        this.$confirmPaymentIntentParams = confirmPaymentIntentParams;
        this.$stripeAccountId = str;
    }

    public final m0.l.c<i> create(m0.l.c<?> cVar) {
        m0.n.b.i.e(cVar, "completion");
        return new Stripe$confirmWeChatPayPayment$1(this.this$0, this.$confirmPaymentIntentParams, this.$stripeAccountId, cVar);
    }

    public final Object invoke(Object obj) {
        return ((Stripe$confirmWeChatPayPayment$1) create((m0.l.c) obj)).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            h.d4(obj);
            PaymentController paymentController$payments_core_release = this.this$0.getPaymentController$payments_core_release();
            ConfirmPaymentIntentParams confirmPaymentIntentParams = this.$confirmPaymentIntentParams;
            ApiRequest.Options options = new ApiRequest.Options(this.this$0.getPublishableKey$payments_core_release(), this.$stripeAccountId, (String) null, 4, (f) null);
            this.label = 1;
            obj = paymentController$payments_core_release.confirmWeChatPay(confirmPaymentIntentParams, options, this);
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
