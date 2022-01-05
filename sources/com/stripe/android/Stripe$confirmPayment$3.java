package com.stripe.android;

import androidx.fragment.app.Fragment;
import com.stripe.android.model.ConfirmPaymentIntentParams;
import com.stripe.android.networking.ApiRequest;
import com.stripe.android.view.AuthActivityStarter;
import i0.j.f.p.h;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import m0.n.b.f;
import n0.a.f0;

@c(c = "com.stripe.android.Stripe$confirmPayment$3", f = "Stripe.kt", l = {339}, m = "invokeSuspend")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ln0/a/f0;", "Lm0/i;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: Stripe.kt */
public final class Stripe$confirmPayment$3 extends SuspendLambda implements p<f0, m0.l.c<? super i>, Object> {
    public final /* synthetic */ ConfirmPaymentIntentParams $confirmPaymentIntentParams;
    public final /* synthetic */ Fragment $fragment;
    public final /* synthetic */ String $stripeAccountId;
    public int label;
    public final /* synthetic */ Stripe this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Stripe$confirmPayment$3(Stripe stripe, Fragment fragment, ConfirmPaymentIntentParams confirmPaymentIntentParams, String str, m0.l.c cVar) {
        super(2, cVar);
        this.this$0 = stripe;
        this.$fragment = fragment;
        this.$confirmPaymentIntentParams = confirmPaymentIntentParams;
        this.$stripeAccountId = str;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        m0.n.b.i.e(cVar, "completion");
        return new Stripe$confirmPayment$3(this.this$0, this.$fragment, this.$confirmPaymentIntentParams, this.$stripeAccountId, cVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((Stripe$confirmPayment$3) create(obj, (m0.l.c) obj2)).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            h.d4(obj);
            PaymentController paymentController$payments_core_release = this.this$0.getPaymentController$payments_core_release();
            AuthActivityStarter.Host create$payments_core_release = AuthActivityStarter.Host.Companion.create$payments_core_release(this.$fragment);
            ConfirmPaymentIntentParams confirmPaymentIntentParams = this.$confirmPaymentIntentParams;
            ApiRequest.Options options = new ApiRequest.Options(this.this$0.getPublishableKey$payments_core_release(), this.$stripeAccountId, (String) null, 4, (f) null);
            this.label = 1;
            if (paymentController$payments_core_release.startConfirmAndAuth(create$payments_core_release, confirmPaymentIntentParams, options, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            h.d4(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return i.a;
    }
}
