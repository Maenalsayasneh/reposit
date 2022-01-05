package com.stripe.android.stripe3ds2.transaction;

import com.stripe.android.stripe3ds2.init.ui.StripeUiCustomization;
import com.stripe.android.stripe3ds2.transaction.ChallengeRequestExecutor;
import com.stripe.android.stripe3ds2.transactions.ChallengeRequestData;
import com.stripe.android.stripe3ds2.transactions.ChallengeResponseData;
import i0.j.f.p.h;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import n0.a.f0;

@c(c = "com.stripe.android.stripe3ds2.transaction.StripeTransaction$handleChallengeResponse$2", f = "StripeTransaction.kt", l = {}, m = "invokeSuspend")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ln0/a/f0;", "Lm0/i;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: StripeTransaction.kt */
public final class StripeTransaction$handleChallengeResponse$2 extends SuspendLambda implements p<f0, m0.l.c<? super i>, Object> {
    public final /* synthetic */ ChallengeRequestData $creqData;
    public final /* synthetic */ ChallengeRequestExecutor.Config $creqExecutorConfig;
    public final /* synthetic */ ChallengeResponseData $cresData;
    public final /* synthetic */ Stripe3ds2ActivityStarterHost $host;
    public final /* synthetic */ int $timeoutMins;
    public final /* synthetic */ StripeUiCustomization $uiCustomization;
    public int label;
    public final /* synthetic */ StripeTransaction this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StripeTransaction$handleChallengeResponse$2(StripeTransaction stripeTransaction, ChallengeResponseData challengeResponseData, Stripe3ds2ActivityStarterHost stripe3ds2ActivityStarterHost, ChallengeRequestData challengeRequestData, StripeUiCustomization stripeUiCustomization, ChallengeRequestExecutor.Config config, int i, m0.l.c cVar) {
        super(2, cVar);
        this.this$0 = stripeTransaction;
        this.$cresData = challengeResponseData;
        this.$host = stripe3ds2ActivityStarterHost;
        this.$creqData = challengeRequestData;
        this.$uiCustomization = stripeUiCustomization;
        this.$creqExecutorConfig = config;
        this.$timeoutMins = i;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        m0.n.b.i.e(cVar, "completion");
        return new StripeTransaction$handleChallengeResponse$2(this.this$0, this.$cresData, this.$host, this.$creqData, this.$uiCustomization, this.$creqExecutorConfig, this.$timeoutMins, cVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((StripeTransaction$handleChallengeResponse$2) create(obj, (m0.l.c) obj2)).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            h.d4(obj);
            StripeTransaction stripeTransaction = this.this$0;
            ChallengeResponseData.UiType uiType = this.$cresData.getUiType();
            stripeTransaction.setInitialChallengeUiType(uiType != null ? uiType.getCode() : null);
            new ChallengeStarter(this.$host, this.$creqData, this.$cresData, this.$uiCustomization, this.$creqExecutorConfig, this.$timeoutMins).start();
            return i.a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
