package com.stripe.android.stripe3ds2.transaction;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m0.i;
import m0.l.f.a.c;

@c(c = "com.stripe.android.stripe3ds2.transaction.StripeTransaction", f = "StripeTransaction.kt", l = {107, 115}, m = "doChallenge")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH@¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/Stripe3ds2ActivityStarterHost;", "host", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeParameters;", "challengeParameters", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeStatusReceiver;", "challengeStatusReceiver", "", "timeoutMins", "Lm0/l/c;", "Lm0/i;", "continuation", "", "doChallenge", "(Lcom/stripe/android/stripe3ds2/transaction/Stripe3ds2ActivityStarterHost;Lcom/stripe/android/stripe3ds2/transaction/ChallengeParameters;Lcom/stripe/android/stripe3ds2/transaction/ChallengeStatusReceiver;ILm0/l/c;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 2})
/* compiled from: StripeTransaction.kt */
public final class StripeTransaction$doChallenge$2 extends ContinuationImpl {
    public int I$0;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ StripeTransaction this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StripeTransaction$doChallenge$2(StripeTransaction stripeTransaction, m0.l.c cVar) {
        super(cVar);
        this.this$0 = stripeTransaction;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.doChallenge((Stripe3ds2ActivityStarterHost) null, (ChallengeParameters) null, (ChallengeStatusReceiver) null, 0, (m0.l.c<? super i>) this);
    }
}
