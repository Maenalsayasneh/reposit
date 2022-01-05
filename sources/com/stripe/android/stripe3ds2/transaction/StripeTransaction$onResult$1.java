package com.stripe.android.stripe3ds2.transaction;

import com.stripe.android.stripe3ds2.transaction.ChallengeRequestExecutor;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m0.l.f.a.c;

@c(c = "com.stripe.android.stripe3ds2.transaction.StripeTransaction", f = "StripeTransaction.kt", l = {139}, m = "onResult")
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH@¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResult;", "result", "Lcom/stripe/android/stripe3ds2/transaction/Stripe3ds2ActivityStarterHost;", "host", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;", "creqExecutorConfig", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeStatusReceiver;", "challengeStatusReceiver", "Lcom/stripe/android/stripe3ds2/transaction/ErrorRequestExecutor;", "errorRequestExecutor", "", "timeoutMins", "Lm0/l/c;", "Lm0/i;", "continuation", "", "onResult", "(Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestResult;Lcom/stripe/android/stripe3ds2/transaction/Stripe3ds2ActivityStarterHost;Lcom/stripe/android/stripe3ds2/transaction/ChallengeRequestExecutor$Config;Lcom/stripe/android/stripe3ds2/transaction/ChallengeStatusReceiver;Lcom/stripe/android/stripe3ds2/transaction/ErrorRequestExecutor;ILm0/l/c;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 2})
/* compiled from: StripeTransaction.kt */
public final class StripeTransaction$onResult$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ StripeTransaction this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StripeTransaction$onResult$1(StripeTransaction stripeTransaction, m0.l.c cVar) {
        super(cVar);
        this.this$0 = stripeTransaction;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.onResult((ChallengeRequestResult) null, (Stripe3ds2ActivityStarterHost) null, (ChallengeRequestExecutor.Config) null, (ChallengeStatusReceiver) null, (ErrorRequestExecutor) null, 0, this);
    }
}
