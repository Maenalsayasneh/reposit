package com.stripe.android.payments;

import com.stripe.android.Logger;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.stripe.android.networking.ApiRequest;
import com.stripe.android.networking.StripeRepository;
import com.stripe.android.payments.DefaultStripeChallengeStatusReceiver;
import com.stripe.android.stripe3ds2.transaction.ChallengeFlowOutcome;
import i0.j.f.p.h;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import n0.a.f0;

@c(c = "com.stripe.android.payments.DefaultStripeChallengeStatusReceiver$complete3ds2Auth$1", f = "DefaultStripeChallengeStatusReceiver.kt", l = {148, 157, 161}, m = "invokeSuspend")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ln0/a/f0;", "Lm0/i;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: DefaultStripeChallengeStatusReceiver.kt */
public final class DefaultStripeChallengeStatusReceiver$complete3ds2Auth$1 extends SuspendLambda implements p<f0, m0.l.c<? super i>, Object> {
    public final /* synthetic */ ChallengeFlowOutcome $flowOutcome;
    public final /* synthetic */ int $remainingRetries;
    private /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ DefaultStripeChallengeStatusReceiver this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DefaultStripeChallengeStatusReceiver$complete3ds2Auth$1(DefaultStripeChallengeStatusReceiver defaultStripeChallengeStatusReceiver, int i, ChallengeFlowOutcome challengeFlowOutcome, m0.l.c cVar) {
        super(2, cVar);
        this.this$0 = defaultStripeChallengeStatusReceiver;
        this.$remainingRetries = i;
        this.$flowOutcome = challengeFlowOutcome;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        m0.n.b.i.e(cVar, "completion");
        DefaultStripeChallengeStatusReceiver$complete3ds2Auth$1 defaultStripeChallengeStatusReceiver$complete3ds2Auth$1 = new DefaultStripeChallengeStatusReceiver$complete3ds2Auth$1(this.this$0, this.$remainingRetries, this.$flowOutcome, cVar);
        defaultStripeChallengeStatusReceiver$complete3ds2Auth$1.L$0 = obj;
        return defaultStripeChallengeStatusReceiver$complete3ds2Auth$1;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((DefaultStripeChallengeStatusReceiver$complete3ds2Auth$1) create(obj, (m0.l.c) obj2)).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            h.d4(obj);
            f0 f0Var = (f0) this.L$0;
            StripeRepository access$getStripeRepository$p = this.this$0.stripeRepository;
            String access$getSourceId$p = this.this$0.sourceId;
            ApiRequest.Options access$getRequestOptions$p = this.this$0.requestOptions;
            this.label = 1;
            obj = access$getStripeRepository$p.complete3ds2Auth(access$getSourceId$p, access$getRequestOptions$p, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            try {
                h.d4(obj);
            } catch (Throwable th) {
                obj2 = h.l0(th);
            }
        } else if (i == 2 || i == 3) {
            h.d4(obj);
            return i.a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        obj2 = (Stripe3ds2AuthResult) obj;
        Throwable a = Result.a(obj2);
        if (a == null) {
            Stripe3ds2AuthResult stripe3ds2AuthResult = (Stripe3ds2AuthResult) obj2;
            DefaultStripeChallengeStatusReceiver.Companion unused = DefaultStripeChallengeStatusReceiver.Companion;
            int i2 = 3 - this.$remainingRetries;
            Logger access$getLogger$p = this.this$0.logger;
            access$getLogger$p.debug("3DS2 challenge completion request was successful. " + i2 + " retries attempted.");
            DefaultStripeChallengeStatusReceiver defaultStripeChallengeStatusReceiver = this.this$0;
            ChallengeFlowOutcome challengeFlowOutcome = this.$flowOutcome;
            this.label = 2;
            if (defaultStripeChallengeStatusReceiver.startCompletionActivity(challengeFlowOutcome, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            DefaultStripeChallengeStatusReceiver defaultStripeChallengeStatusReceiver2 = this.this$0;
            ChallengeFlowOutcome challengeFlowOutcome2 = this.$flowOutcome;
            int i3 = this.$remainingRetries;
            this.label = 3;
            if (defaultStripeChallengeStatusReceiver2.onComplete3ds2AuthFailure(challengeFlowOutcome2, i3, a, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return i.a;
    }
}
