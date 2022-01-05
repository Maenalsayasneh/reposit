package com.stripe.android.stripe3ds2.views;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m0.n.a.a;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/stripe/android/stripe3ds2/views/ChallengeSubmitDialogFactory;", "invoke", "()Lcom/stripe/android/stripe3ds2/views/ChallengeSubmitDialogFactory;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: ChallengeActivity.kt */
public final class ChallengeActivity$progressDialogFactory$2 extends Lambda implements a<ChallengeSubmitDialogFactory> {
    public final /* synthetic */ ChallengeActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChallengeActivity$progressDialogFactory$2(ChallengeActivity challengeActivity) {
        super(0);
        this.this$0 = challengeActivity;
    }

    public final ChallengeSubmitDialogFactory invoke() {
        ChallengeActivity challengeActivity = this.this$0;
        return new ChallengeSubmitDialogFactory(challengeActivity, challengeActivity.getViewArgs().getUiCustomization());
    }
}
