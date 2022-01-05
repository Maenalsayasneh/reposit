package com.stripe.android.stripe3ds2.views;

import com.stripe.android.stripe3ds2.transaction.ChallengeStatusReceiver;
import com.stripe.android.stripe3ds2.transaction.ChallengeStatusReceiverProvider;
import i0.j.f.p.h;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.jvm.internal.Lambda;
import m0.n.a.a;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/Result;", "Lcom/stripe/android/stripe3ds2/transaction/ChallengeStatusReceiver;", "invoke", "()Lkotlin/Result;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: ChallengeActivity.kt */
public final class ChallengeActivity$challengeStatusReceiverResult$2 extends Lambda implements a<Result<? extends ChallengeStatusReceiver>> {
    public final /* synthetic */ ChallengeActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChallengeActivity$challengeStatusReceiverResult$2(ChallengeActivity challengeActivity) {
        super(0);
        this.this$0 = challengeActivity;
    }

    public final Result<? extends ChallengeStatusReceiver> invoke() {
        Object obj;
        try {
            obj = ChallengeStatusReceiverProvider.Default.INSTANCE.get(this.this$0.getSdkTransactionId());
        } catch (Throwable th) {
            obj = h.l0(th);
        }
        Throwable a = Result.a(obj);
        if (a != null) {
            this.this$0.getErrorReporter().reportError(a);
        }
        return new Result<>(obj);
    }
}
