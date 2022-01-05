package com.stripe.android;

import com.stripe.android.model.Source;
import com.stripe.android.model.SourceParams;
import com.stripe.android.networking.ApiRequest;
import com.stripe.android.networking.StripeRepository;
import i0.j.f.p.h;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;

@c(c = "com.stripe.android.Stripe$createSource$1", f = "Stripe.kt", l = {1280}, m = "invokeSuspend")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H@¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/stripe/android/model/Source;", "invoke", "(Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: Stripe.kt */
public final class Stripe$createSource$1 extends SuspendLambda implements l<m0.l.c<? super Source>, Object> {
    public final /* synthetic */ String $idempotencyKey;
    public final /* synthetic */ SourceParams $sourceParams;
    public final /* synthetic */ String $stripeAccountId;
    public int label;
    public final /* synthetic */ Stripe this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Stripe$createSource$1(Stripe stripe, SourceParams sourceParams, String str, String str2, m0.l.c cVar) {
        super(1, cVar);
        this.this$0 = stripe;
        this.$sourceParams = sourceParams;
        this.$stripeAccountId = str;
        this.$idempotencyKey = str2;
    }

    public final m0.l.c<i> create(m0.l.c<?> cVar) {
        m0.n.b.i.e(cVar, "completion");
        return new Stripe$createSource$1(this.this$0, this.$sourceParams, this.$stripeAccountId, this.$idempotencyKey, cVar);
    }

    public final Object invoke(Object obj) {
        return ((Stripe$createSource$1) create((m0.l.c) obj)).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            h.d4(obj);
            StripeRepository stripeRepository$payments_core_release = this.this$0.getStripeRepository$payments_core_release();
            SourceParams sourceParams = this.$sourceParams;
            ApiRequest.Options options = new ApiRequest.Options(this.this$0.getPublishableKey$payments_core_release(), this.$stripeAccountId, this.$idempotencyKey);
            this.label = 1;
            obj = stripeRepository$payments_core_release.createSource(sourceParams, options, this);
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
