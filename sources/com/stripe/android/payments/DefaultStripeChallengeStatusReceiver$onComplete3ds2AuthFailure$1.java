package com.stripe.android.payments;

import com.stripe.android.stripe3ds2.transaction.ChallengeFlowOutcome;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m0.l.f.a.c;

@c(c = "com.stripe.android.payments.DefaultStripeChallengeStatusReceiver", f = "DefaultStripeChallengeStatusReceiver.kt", l = {195, 211}, m = "onComplete3ds2AuthFailure")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H@¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/ChallengeFlowOutcome;", "flowOutcome", "", "remainingRetries", "", "error", "Lm0/l/c;", "Lm0/i;", "continuation", "", "onComplete3ds2AuthFailure", "(Lcom/stripe/android/stripe3ds2/transaction/ChallengeFlowOutcome;ILjava/lang/Throwable;Lm0/l/c;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 2})
/* compiled from: DefaultStripeChallengeStatusReceiver.kt */
public final class DefaultStripeChallengeStatusReceiver$onComplete3ds2AuthFailure$1 extends ContinuationImpl {
    public int I$0;
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ DefaultStripeChallengeStatusReceiver this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DefaultStripeChallengeStatusReceiver$onComplete3ds2AuthFailure$1(DefaultStripeChallengeStatusReceiver defaultStripeChallengeStatusReceiver, m0.l.c cVar) {
        super(cVar);
        this.this$0 = defaultStripeChallengeStatusReceiver;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.onComplete3ds2AuthFailure((ChallengeFlowOutcome) null, 0, (Throwable) null, this);
    }
}
