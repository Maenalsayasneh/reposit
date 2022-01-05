package com.stripe.android.stripe3ds2.views;

import com.stripe.android.stripe3ds2.transaction.ChallengeStatusReceiver;
import com.stripe.android.stripe3ds2.transaction.ImmediateTimeoutTransactionTimer;
import com.stripe.android.stripe3ds2.transaction.TransactionTimer;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.jvm.internal.Lambda;
import m0.n.a.a;
import n0.a.m0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/TransactionTimer;", "invoke", "()Lcom/stripe/android/stripe3ds2/transaction/TransactionTimer;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: ChallengeActivity.kt */
public final class ChallengeActivity$transactionTimer$2 extends Lambda implements a<TransactionTimer> {
    public final /* synthetic */ ChallengeActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChallengeActivity$transactionTimer$2(ChallengeActivity challengeActivity) {
        super(0);
        this.this$0 = challengeActivity;
    }

    public final TransactionTimer invoke() {
        Object r02 = this.this$0.m48getChallengeStatusReceiverResultd1pmJ48();
        if (Result.a(r02) != null) {
            return new ImmediateTimeoutTransactionTimer();
        }
        ChallengeStatusReceiver challengeStatusReceiver = (ChallengeStatusReceiver) r02;
        return new TransactionTimer.Default(this.this$0.getChallengeStatusReceiver(), this.this$0.getViewArgs().getTimeoutMins(), this.this$0.getErrorRequestExecutor(), this.this$0.getViewArgs().getCreqData(), m0.c);
    }
}
