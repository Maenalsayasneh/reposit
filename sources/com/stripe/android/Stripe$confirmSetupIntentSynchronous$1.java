package com.stripe.android;

import com.stripe.android.model.ConfirmSetupIntentParams;
import com.stripe.android.model.SetupIntent;
import com.stripe.android.networking.ApiRequest;
import com.stripe.android.networking.StripeRepository;
import i0.j.f.p.h;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import n0.a.f0;

@c(c = "com.stripe.android.Stripe$confirmSetupIntentSynchronous$1", f = "Stripe.kt", l = {1059}, m = "invokeSuspend")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ln0/a/f0;", "Lcom/stripe/android/model/SetupIntent;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: Stripe.kt */
public final class Stripe$confirmSetupIntentSynchronous$1 extends SuspendLambda implements p<f0, m0.l.c<? super SetupIntent>, Object> {
    public final /* synthetic */ ConfirmSetupIntentParams $confirmSetupIntentParams;
    public final /* synthetic */ String $idempotencyKey;
    public int label;
    public final /* synthetic */ Stripe this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Stripe$confirmSetupIntentSynchronous$1(Stripe stripe, ConfirmSetupIntentParams confirmSetupIntentParams, String str, m0.l.c cVar) {
        super(2, cVar);
        this.this$0 = stripe;
        this.$confirmSetupIntentParams = confirmSetupIntentParams;
        this.$idempotencyKey = str;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        m0.n.b.i.e(cVar, "completion");
        return new Stripe$confirmSetupIntentSynchronous$1(this.this$0, this.$confirmSetupIntentParams, this.$idempotencyKey, cVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((Stripe$confirmSetupIntentSynchronous$1) create(obj, (m0.l.c) obj2)).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            h.d4(obj);
            StripeRepository stripeRepository$payments_core_release = this.this$0.getStripeRepository$payments_core_release();
            ConfirmSetupIntentParams confirmSetupIntentParams = this.$confirmSetupIntentParams;
            ApiRequest.Options options = new ApiRequest.Options(this.this$0.getPublishableKey$payments_core_release(), this.this$0.getStripeAccountId$payments_core_release(), this.$idempotencyKey);
            this.label = 1;
            obj = StripeRepository.DefaultImpls.confirmSetupIntent$default(stripeRepository$payments_core_release, confirmSetupIntentParams, options, (List) null, this, 4, (Object) null);
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
