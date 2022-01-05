package com.stripe.android;

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
import m0.n.a.l;
import m0.n.b.f;

@c(c = "com.stripe.android.Stripe$retrieveSetupIntent$1", f = "Stripe.kt", l = {988}, m = "invokeSuspend")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H@¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/stripe/android/model/SetupIntent;", "invoke", "(Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: Stripe.kt */
public final class Stripe$retrieveSetupIntent$1 extends SuspendLambda implements l<m0.l.c<? super SetupIntent>, Object> {
    public final /* synthetic */ String $clientSecret;
    public final /* synthetic */ String $stripeAccountId;
    public int label;
    public final /* synthetic */ Stripe this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Stripe$retrieveSetupIntent$1(Stripe stripe, String str, String str2, m0.l.c cVar) {
        super(1, cVar);
        this.this$0 = stripe;
        this.$clientSecret = str;
        this.$stripeAccountId = str2;
    }

    public final m0.l.c<i> create(m0.l.c<?> cVar) {
        m0.n.b.i.e(cVar, "completion");
        return new Stripe$retrieveSetupIntent$1(this.this$0, this.$clientSecret, this.$stripeAccountId, cVar);
    }

    public final Object invoke(Object obj) {
        return ((Stripe$retrieveSetupIntent$1) create((m0.l.c) obj)).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            h.d4(obj);
            StripeRepository stripeRepository$payments_core_release = this.this$0.getStripeRepository$payments_core_release();
            String str = this.$clientSecret;
            ApiRequest.Options options = new ApiRequest.Options(this.this$0.getPublishableKey$payments_core_release(), this.$stripeAccountId, (String) null, 4, (f) null);
            this.label = 1;
            obj = StripeRepository.DefaultImpls.retrieveSetupIntent$default(stripeRepository$payments_core_release, str, options, (List) null, this, 4, (Object) null);
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
