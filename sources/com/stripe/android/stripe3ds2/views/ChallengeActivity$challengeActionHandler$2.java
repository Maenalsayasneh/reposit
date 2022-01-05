package com.stripe.android.stripe3ds2.views;

import com.stripe.android.stripe3ds2.transaction.ChallengeActionHandler;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m0.n.a.a;
import n0.a.m0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/ChallengeActionHandler$Default;", "invoke", "()Lcom/stripe/android/stripe3ds2/transaction/ChallengeActionHandler$Default;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: ChallengeActivity.kt */
public final class ChallengeActivity$challengeActionHandler$2 extends Lambda implements a<ChallengeActionHandler.Default> {
    public final /* synthetic */ ChallengeActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChallengeActivity$challengeActionHandler$2(ChallengeActivity challengeActivity) {
        super(0);
        this.this$0 = challengeActivity;
    }

    public final ChallengeActionHandler.Default invoke() {
        return new ChallengeActionHandler.Default(this.this$0.getViewArgs().getCreqData(), this.this$0.getErrorReporter(), this.this$0.getViewArgs().getCreqExecutorFactory(), this.this$0.getViewArgs().getCreqExecutorConfig(), m0.c);
    }
}
