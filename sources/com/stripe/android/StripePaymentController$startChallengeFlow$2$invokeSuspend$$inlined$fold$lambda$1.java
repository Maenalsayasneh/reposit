package com.stripe.android;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.a;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Lm0/i;", "invoke", "()V", "com/stripe/android/StripePaymentController$startChallengeFlow$2$2$1", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: StripePaymentController.kt */
public final class StripePaymentController$startChallengeFlow$2$invokeSuspend$$inlined$fold$lambda$1 extends Lambda implements a<i> {
    public final /* synthetic */ StripePaymentController$startChallengeFlow$2 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StripePaymentController$startChallengeFlow$2$invokeSuspend$$inlined$fold$lambda$1(StripePaymentController$startChallengeFlow$2 stripePaymentController$startChallengeFlow$2) {
        super(0);
        this.this$0 = stripePaymentController$startChallengeFlow$2;
    }

    public final void invoke() {
        this.this$0.$transaction.close();
    }
}
