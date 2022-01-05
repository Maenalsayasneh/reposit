package com.stripe.android.payments;

import com.stripe.android.exception.StripeException;
import com.stripe.android.model.Source;
import com.stripe.android.payments.PaymentFlowResult;
import com.stripe.android.stripe3ds2.transaction.ChallengeFlowOutcome;
import i0.j.f.p.h;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import m0.n.b.f;
import n0.a.f0;

@c(c = "com.stripe.android.payments.DefaultStripeChallengeStatusReceiver$startCompletionActivity$2", f = "DefaultStripeChallengeStatusReceiver.kt", l = {}, m = "invokeSuspend")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ln0/a/f0;", "Lm0/i;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: DefaultStripeChallengeStatusReceiver.kt */
public final class DefaultStripeChallengeStatusReceiver$startCompletionActivity$2 extends SuspendLambda implements p<f0, m0.l.c<? super i>, Object> {
    public final /* synthetic */ ChallengeFlowOutcome $flowOutcome;
    public int label;
    public final /* synthetic */ DefaultStripeChallengeStatusReceiver this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DefaultStripeChallengeStatusReceiver$startCompletionActivity$2(DefaultStripeChallengeStatusReceiver defaultStripeChallengeStatusReceiver, ChallengeFlowOutcome challengeFlowOutcome, m0.l.c cVar) {
        super(2, cVar);
        this.this$0 = defaultStripeChallengeStatusReceiver;
        this.$flowOutcome = challengeFlowOutcome;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        m0.n.b.i.e(cVar, "completion");
        return new DefaultStripeChallengeStatusReceiver$startCompletionActivity$2(this.this$0, this.$flowOutcome, cVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((DefaultStripeChallengeStatusReceiver$startCompletionActivity$2) create(obj, (m0.l.c) obj2)).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            h.d4(obj);
            this.this$0.onEndChallenge.invoke();
            Stripe3ds2CompletionStarter access$getStripe3ds2CompletionStarter$p = this.this$0.stripe3ds2CompletionStarter;
            String clientSecret = this.this$0.stripeIntent.getClientSecret();
            if (clientSecret == null) {
                clientSecret = "";
            }
            String str = clientSecret;
            String stripeAccount$payments_core_release = this.this$0.requestOptions.getStripeAccount$payments_core_release();
            int ordinal = this.$flowOutcome.ordinal();
            int i = 4;
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        i = 3;
                    } else if (ordinal != 3) {
                        if (!(ordinal == 4 || ordinal == 5)) {
                            i = 0;
                        }
                    }
                }
                i = 2;
            } else {
                i = 1;
            }
            access$getStripe3ds2CompletionStarter$p.start(new PaymentFlowResult.Unvalidated(str, i, (StripeException) null, false, (String) null, (Source) null, stripeAccount$payments_core_release, 60, (f) null));
            return i.a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
